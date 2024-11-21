package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.AnimalPart;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AnimalPartDAO
{
  AnimalPart create(AnimalPart animalPart) throws SQLException;
  ArrayList<AnimalPart> getAllAnimalParts() throws SQLException;
  ArrayList<AnimalPart> getALlAnimalPartsFromProductID(String productId)
      throws SQLException;
  ArrayList<AnimalPart> getALlAnimalPartsFromTrayID(String trayId)
      throws SQLException;
  ArrayList<AnimalPart> getALlAnimalPartsFromAnimalID(String animalId);
}
