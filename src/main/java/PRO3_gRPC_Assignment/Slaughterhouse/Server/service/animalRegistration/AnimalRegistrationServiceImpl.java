package PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalRegistration;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal.AnimalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Service
public class AnimalRegistrationServiceImpl implements IAnimalRegistrationService {

    private final AnimalDAO animalDAO;

    @Autowired
    public AnimalRegistrationServiceImpl(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    @Override
    public Animal registerAnimal(Animal animal) {
        try {
            Animal newAnimal = animalDAO.create(animal);

            return newAnimal;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
