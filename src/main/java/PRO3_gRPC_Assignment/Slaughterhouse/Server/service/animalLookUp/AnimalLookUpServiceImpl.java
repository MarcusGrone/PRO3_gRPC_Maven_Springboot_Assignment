package PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalLookUp;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalLookUpServiceImpl implements IAnimalLookUpService {
    @Override
    public List<Animal> getAnimalsFromProductId(String productId) {
        return null;
    }

    @Override
    public List<Product> getProductsFromAnimalId(String animalId) {
        return null;
    }
}
