package PRO3_gRPC_Assignment.Slaughterhouse.Client.interfaces;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;

import java.util.List;

public interface IAnimalLookUp {
    List<Animal> getAnimalsFromProductId(String productId);
    List<Product> getProductsFromAnimalId(String animalId);
}
