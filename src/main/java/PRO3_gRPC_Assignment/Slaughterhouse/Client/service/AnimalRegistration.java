package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;

import PRO3_gRPC_Assignment.Slaughterhouse.Client.interfaces.IAnimalRegistration;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.SlaughterhouseServiceGrpc;
import io.grpc.ManagedChannel;

public class AnimalRegistration extends Client implements IAnimalRegistration {


    public AnimalRegistration(String host, int port) {
        super(host, port);
    }

    @Override
    public Animal registerNewAnimal(double weightInKg) {
        ManagedChannel channel = channel();

        try {
            SlaughterhouseServiceGrpc.SlaughterhouseServiceBlockingStub stub = SlaughterhouseServiceGrpc.newBlockingStub(channel);

            AnimalData data = AnimalConverter.convertToGrpcAnimalData(new Animal("0", weightInKg));

            AnimalData createdAnimal = stub.registerAnimal(data);

            return AnimalConverter.convertToAnimal(createdAnimal);

        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            channel.shutdown();
        }
    }
}
