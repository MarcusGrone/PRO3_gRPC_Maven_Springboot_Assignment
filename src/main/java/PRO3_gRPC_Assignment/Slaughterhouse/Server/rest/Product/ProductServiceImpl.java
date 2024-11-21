package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product createProduct(Product product) {
        try {
            return productDAO.create(product);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating product", e);
        }
    }

    @Override
    public List<Product> getAllProducts() {
        try {
            return productDAO.getAllProducts();
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all products", e);
        }
    }

    @Override
    public List<Product> getProductsByAnimal(String animalId) {
        try {
            return productDAO.getAllProductsFromAnimal(animalId);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving products for animal ID: " + animalId, e);
        }
    }
}
