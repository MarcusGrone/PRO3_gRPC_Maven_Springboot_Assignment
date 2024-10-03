package PRO3_gRPC_Assignment.Slaughterhouse.Server.gRPC;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.ProductConverter;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalLookUp.IAnimalLookUpService;
import dk.via.slaughterhouse.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class GRPCAnimalLookUp extends SlaughterhouseServiceGrpc.SlaughterhouseServiceImplBase {

    private final IAnimalLookUpService animalLookUpService;

    public GRPCAnimalLookUp(IAnimalLookUpService animalLookUpService) {
        super();
        this.animalLookUpService = animalLookUpService;
    }

    @Override
    public void getAnimalsFromProductId(ProductId request, StreamObserver<AnimalsData> responseObserver)
    {
        try {
            String productId = request.getProductId();

            List<Animal> animals = animalLookUpService.getAnimalsFromProductId(productId);

            AnimalsData data = AnimalConverter.convertToGrpcAnimalsData(animals);

            responseObserver.onNext(data);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getProductFromAnimalId(AnimalId request, StreamObserver<ProductsData> responseObserver)
    {
        try {
            String animalId = request.getRegistrationId();

            List<Product> products = animalLookUpService.getProductsFromAnimalId(animalId);

            ProductsData data = ProductConverter.convertToGrpcProductsData(products);

            responseObserver.onNext(data);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            responseObserver.onError(e);
        }
    }
}
