package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;

public interface ProductService {
    Product registerProduct(Product product);

    Product getProduct(String productId);
}
