package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public interface AnimalDAO {
  Animal create(Animal animal) throws SQLException;
  Animal read(String animalId) throws SQLException;
  ArrayList<Animal> getAllAnimals() throws SQLException;
  ArrayList<Animal> getAnimalsFromProduct(String productId) throws SQLException;
  ArrayList<Animal> findAllByDate(LocalDate date) throws SQLException;
  ArrayList<Animal> findAllByOrigin(String origin) throws SQLException;
}