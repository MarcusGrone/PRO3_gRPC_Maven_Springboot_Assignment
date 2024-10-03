package PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalLookUp;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal.AnimalDAO;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product.ProductDAO;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AnimalLookUpServiceImpl implements IAnimalLookUpService {

    private final AnimalDAO animalDAO;
    private final ProductDAO productDAO;

    @Autowired
    public AnimalLookUpServiceImpl(AnimalDAO animalDAO, ProductDAO productDAO) {
        this.animalDAO = animalDAO;
        this.productDAO = productDAO;
    }

    @Override
    public List<Animal> getAnimalsFromProductId(String productId) {
        try {
            return animalDAO.getAnimalsFromProduct(productId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> getProductsFromAnimalId(String animalId) {
        try {
            return productDAO.getAllProductsFromAnimal(animalId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
