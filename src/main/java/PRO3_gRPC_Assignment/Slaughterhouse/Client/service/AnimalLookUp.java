package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;

import PRO3_gRPC_Assignment.Slaughterhouse.Client.interfaces.IAnimalLookUp;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.ProductConverter;
import dk.via.slaughterhouse.AnimalsData;
import dk.via.slaughterhouse.ProductsData;
import dk.via.slaughterhouse.AnimalLookUpServiceGrpc;
import io.grpc.ManagedChannel;

import java.util.List;

public class AnimalLookUp extends Client implements IAnimalLookUp {
    public AnimalLookUp(String host, int port) {
        super(host, port);
    }


    @Override
    public List<Animal> getAnimalsFromProductId(String productId) {
        ManagedChannel channel = channel();

        try {
            AnimalLookUpServiceGrpc.AnimalLookUpServiceBlockingStub stub = AnimalLookUpServiceGrpc.newBlockingStub(channel);

            AnimalsData animalsData = stub.getAnimalsFromProductId(ProductConverter.convertTogRPCProductId(productId));

            return AnimalConverter.convertToAnimalList(animalsData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            channel.shutdown();
        }

    }

    @Override
    public List<Product> getProductsFromAnimalId(String animalId) {
        ManagedChannel channel = channel();

        try {
            AnimalLookUpServiceGrpc.AnimalLookUpServiceBlockingStub stub = AnimalLookUpServiceGrpc.newBlockingStub(channel);

            ProductsData productsData = stub.getProductFromAnimalId(AnimalConverter.convertToGrpcAnimalId(animalId));

            return ProductConverter.convertToProductList(productsData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            channel.shutdown();
        }
    }
}
