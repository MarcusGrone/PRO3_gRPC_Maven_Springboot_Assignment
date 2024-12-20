package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO
{
  Product create(Product product) throws SQLException;
  ArrayList<Product> getAllProducts() throws SQLException;
  ArrayList<Product> getAllProductsFromAnimal(String animalId)
      throws SQLException;
  ArrayList<Product> getProductsContainingAnimal(String animalId) throws SQLException;

  Product getProductFromAnimalPartId(String animalPartId) throws SQLException;
}