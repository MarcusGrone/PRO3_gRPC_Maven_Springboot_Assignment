package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.AnimalPart;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities.AnimalPart;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AnimalPartDAO {
  AnimalPart create(double weightKilogram, int animalId, int typeId) throws SQLException;
  ArrayList<AnimalPart> getAllAnimalParts() throws SQLException;
}
