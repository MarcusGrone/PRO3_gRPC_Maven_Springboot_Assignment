package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public interface AnimalDAO {
  Animal create(Animal animal) throws SQLException;
  Animal read(int animalId) throws SQLException;
  ArrayList<Animal> getAllAnimals() throws SQLException;
}