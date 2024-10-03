package PRO3_gRPC_Assignment.Slaughterhouse.Server.gRPC;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalRegistration.IAnimalRegistrationService;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.AnimalsData;
import dk.via.slaughterhouse.ProductId;
import dk.via.slaughterhouse.SlaughterhouseServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GRPCAnimalRegistration extends SlaughterhouseServiceGrpc.SlaughterhouseServiceImplBase {
    private final IAnimalRegistrationService animalRegistrationService;

    public GRPCAnimalRegistration(IAnimalRegistrationService animalRegistrationService) {
        super();
        this.animalRegistrationService = animalRegistrationService;
    }

    @Override
    public void registerAnimal(AnimalData request, StreamObserver<AnimalData> responseObserver)
    {
        Animal receivedAnimal = AnimalConverter.convertToAnimal(request);

        Animal createdAnimal = animalRegistrationService.registerAnimal(receivedAnimal);

        AnimalData response = AnimalConverter.convertToGrpcAnimalData(createdAnimal);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
