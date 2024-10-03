package PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalLookUp;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;

import java.util.List;

public interface IAnimalLookUpService {
    List<Animal> getAnimalsFromProductId(String productId);
    List<Product> getProductsFromAnimalId(String animalId);
}
