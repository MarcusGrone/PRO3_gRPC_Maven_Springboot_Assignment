package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;


public class AnimalRestService {
  private final Client client;
  private final ObjectMapper objectMapper;

  public AnimalRestService(Client client) {
    this.client = client;
    this.objectMapper = new ObjectMapper();
  }

  public String registerAnimal(Animal animal) throws Exception {
    String requestBody = objectMapper.writeValueAsString(animal);
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(client.getRestBaseUrl() + "/animals"))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(requestBody))
        .build();

    HttpResponse<String> response = client.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    return response.statusCode() == 201 ? "Animal registered successfully." :
        "Failed to register animal. Status code: " + response.statusCode();
  }


  public Animal getAnimalByRegistrationId(String registrationId) throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(client.getRestBaseUrl() + "/animals/" + registrationId))
        .GET()
        .build();

    HttpResponse<String> response = client.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    return response.statusCode() == 200 ?
        objectMapper.readValue(response.body(), Animal.class) : null;
  }


  public ArrayList<Animal> listAllAnimals() throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(client.getRestBaseUrl() + "/animals"))
        .GET()
        .build();

    HttpResponse<String> response = client.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    return response.statusCode() == 200 ?
        objectMapper.readValue(response.body(),
            objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Animal.class)) :
        new ArrayList<>();
  }

  public ArrayList<Animal> listAnimalsByDate(String date) throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(client.getRestBaseUrl() + "/animals?date=" + date))
        .GET()
        .build();

    HttpResponse<String> response = client.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    return response.statusCode() == 200 ?
        objectMapper.readValue(response.body(),
            objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Animal.class)) :
        new ArrayList<>();
  }

  public ArrayList<Animal> listAnimalsByOrigin(String origin) throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI(client.getRestBaseUrl() + "/animals?origin=" + origin))
        .GET()
        .build();

    HttpResponse<String> response = client.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    return response.statusCode() == 200 ?
        objectMapper.readValue(response.body(),
            objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Animal.class)) :
        new ArrayList<>();
  }
}
