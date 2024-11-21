package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.AnimalPart;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.AnimalPart.AnimalPartDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AnimalPartServiceImpl implements AnimalPartService {
    private final AnimalPartDAO animalPartDAO;

    @Autowired
    public AnimalPartServiceImpl(AnimalPartDAO animalPartDAO) {
        this.animalPartDAO = animalPartDAO;
    }

    @Override
    public AnimalPart createAnimalPart(AnimalPart animalPart) {
        try {
            return animalPartDAO.create(animalPart);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating animal part", e);
        }
    }

    @Override
    public List<AnimalPart> getAllAnimalParts() {
        try {
            return animalPartDAO.getAllAnimalParts();
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all animal parts", e);
        }
    }

    @Override
    public List<AnimalPart> getAnimalPartsByProductId(String productId) {
        try {
            return animalPartDAO.getALlAnimalPartsFromProductID(productId);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving animal parts for product ID: " + productId, e);
        }
    }

    @Override
    public List<AnimalPart> getAnimalPartsByTrayId(String trayId) {
        try {
            return animalPartDAO.getALlAnimalPartsFromTrayID(trayId);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving animal parts for tray ID: " + trayId, e);
        }
    }

    @Override
    public List<AnimalPart> getAnimalPartsByAnimalId(String animalId) {
        try {
            return animalPartDAO.getALlAnimalPartsFromAnimalID(animalId);
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving animal parts for animal ID: " + animalId, e);
        }
    }
}
