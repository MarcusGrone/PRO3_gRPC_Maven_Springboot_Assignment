package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> getAllProducts();

    List<Product> getProductsByAnimal(String animalId);
}
