package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.AnimalPart;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;

import java.util.List;

public interface AnimalPartService {
    AnimalPart createAnimalPart(AnimalPart animalPart);

    List<AnimalPart> getAllAnimalParts();

    List<AnimalPart> getAnimalPartsByProductId(String productId);

    List<AnimalPart> getAnimalPartsByTrayId(String trayId);

    List<AnimalPart> getAnimalPartsByAnimalId(String animalId);
}
