package PRO3_gRPC_Assignment.Slaughterhouse.Client.CLI;

import PRO3_gRPC_Assignment.Slaughterhouse.Client.service.Client;
import PRO3_gRPC_Assignment.Slaughterhouse.Client.service.AnimalRestService;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientCLI {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Client client = new Client("localhost", 9090, 8080);
    AnimalRestService restService = new AnimalRestService(client);

    boolean running = true;

    while (running) {
      System.out.println("Animal CLI");
      System.out.println("1. Register Animal");
      System.out.println("2. Get Animal by Registration ID");
      System.out.println("3. List All Animals");
      System.out.println("4. List Animals by Date");
      System.out.println("5. List Animals by Origin");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine();

      try {
        switch (choice) {
          case 1 -> registerAnimal(restService, scanner);
          case 2 -> getAnimalByRegistrationId(restService, scanner);
          case 3 -> listAllAnimals(restService);
          case 4 -> listAnimalsByDate(restService, scanner);
          case 5 -> listAnimalsByOrigin(restService, scanner);
          case 6 -> running = false;
          default -> System.out.println("Invalid choice. Try again.");
        }
      } catch (Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
      }
    }
    scanner.close();
  }

  private static void registerAnimal(AnimalRestService restService, Scanner scanner) throws Exception {
    System.out.print("Enter registration ID: ");
    String registrationId = scanner.nextLine();

    System.out.print("Enter weight: ");
    double weight = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter origin: ");
    String origin = scanner.nextLine();

    Animal animal = new Animal(registrationId, weight, LocalDate.now(), origin);
    String result = restService.registerAnimal(animal);
    System.out.println(result);
  }

  private static void getAnimalByRegistrationId(AnimalRestService restService, Scanner scanner) throws Exception {
    System.out.print("Enter registration ID: ");
    String registrationId = scanner.nextLine();

    Animal animal = restService.getAnimalByRegistrationId(registrationId);
    if (animal != null) {
      System.out.println("Animal found: " + animal);
    } else {
      System.out.println("Animal not found.");
    }
  }

  private static void listAllAnimals(AnimalRestService restService) throws Exception {
    ArrayList<Animal> animals = restService.listAllAnimals();
    System.out.println("Animals:");
    animals.forEach(System.out::println);
  }

  private static void listAnimalsByDate(AnimalRestService restService, Scanner scanner) throws Exception {
    System.out.print("Enter date (YYYY-MM-DD): ");
    String date = scanner.nextLine();

    ArrayList<Animal> animals = restService.listAnimalsByDate(date);
    if (!animals.isEmpty()) {
      System.out.println("Animals found on " + date + ":");
      animals.forEach(System.out::println);
    } else {
      System.out.println("No animals found for this date.");
    }
  }

  private static void listAnimalsByOrigin(AnimalRestService restService, Scanner scanner) throws Exception {
    System.out.print("Enter origin: ");
    String origin = scanner.nextLine();

    ArrayList<Animal> animals = restService.listAnimalsByOrigin(origin);
    if (!animals.isEmpty()) {
      System.out.println("Animals from " + origin + ":");
      animals.forEach(System.out::println);
    } else {
      System.out.println("No animals found for this origin.");
    }
  }
}
