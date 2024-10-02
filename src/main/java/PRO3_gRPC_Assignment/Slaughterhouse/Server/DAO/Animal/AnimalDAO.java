package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities.Animal;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AnimalDAO {
  Animal create(double weightKilogram) throws SQLException;
  Animal read(int animalId) throws SQLException;
  ArrayList<Animal> getAllAnimals() throws SQLException;
}