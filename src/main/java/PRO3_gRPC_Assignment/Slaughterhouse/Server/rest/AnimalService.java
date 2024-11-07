package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;

import java.time.LocalDate;
import java.util.List;

public interface AnimalService {
  Animal registerAnimal(Animal animal);
  Animal getAnimalByRegistrationNumber(String registrationId);
  List<Animal> getAnimalsByDate(LocalDate date);
  List<Animal> getAnimalsByOrigin(String origin);
  List<Animal> getAllAnimals();
}
