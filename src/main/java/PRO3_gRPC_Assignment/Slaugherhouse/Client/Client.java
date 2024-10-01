import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import dk.via.slaughterhouse.Animal;
import dk.via.slaughterhouse.SlaughterhouseServiceGrpc;

public class Client {
  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();

    SlaughterhouseServiceGrpc.SlaughterhouseServiceBlockingStub stub = SlaughterhouseServiceGrpc.newBlockingStub(channel);

    // Create and send an animal
    Animal animal = Animal.newBuilder()
        .setRegistrationId("A123")
        .setWeight(250.0)
        .build();

    Animal response = stub.registerAnimal(animal);
    System.out.println("Registered animal with ID: " + response.getRegistrationId());

    channel.shutdown();
  }
}
