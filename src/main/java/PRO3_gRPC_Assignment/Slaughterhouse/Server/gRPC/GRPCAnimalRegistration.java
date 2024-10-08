package PRO3_gRPC_Assignment.Slaughterhouse.Server.gRPC;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalRegistration.IAnimalRegistrationService;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.AnimalRegistrationServiceGrpc;
import dk.via.slaughterhouse.AnimalsData;
import dk.via.slaughterhouse.ProductId;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GRPCAnimalRegistration extends AnimalRegistrationServiceGrpc.AnimalRegistrationServiceImplBase {
    private final IAnimalRegistrationService animalRegistrationService;

    public GRPCAnimalRegistration(IAnimalRegistrationService animalRegistrationService) {
        super();
        this.animalRegistrationService = animalRegistrationService;
    }

    @Override
    public void registerAnimal(AnimalData request, StreamObserver<AnimalData> responseObserver)
    {
        try {
            Animal receivedAnimal = AnimalConverter.convertToAnimal(request);

            Animal createdAnimal = animalRegistrationService.registerAnimal(receivedAnimal);

            AnimalData response = AnimalConverter.convertToGrpcAnimalData(createdAnimal);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Handle exception and return error
            responseObserver.onError(Status.INTERNAL
                    .withDescription("An error occurred while processing the request.")
                    .augmentDescription(e.getMessage())
                    .asRuntimeException());
        }
    }
}
