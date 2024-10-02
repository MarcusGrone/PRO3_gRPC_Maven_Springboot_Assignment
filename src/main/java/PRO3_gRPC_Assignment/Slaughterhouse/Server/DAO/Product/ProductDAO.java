package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
  Product create(int partId) throws SQLException;
  ArrayList<Product> getAllProducts() throws SQLException;
}