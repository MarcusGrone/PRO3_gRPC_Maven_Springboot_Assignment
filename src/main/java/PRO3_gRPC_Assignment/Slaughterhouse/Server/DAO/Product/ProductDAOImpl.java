package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository public class ProductDAOImpl implements ProductDAO
{
  private final JdbcTemplate jdbcTemplate;

  @Autowired public ProductDAOImpl(JdbcTemplate jdbcTemplate)
  {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override public Product create(Product product) throws SQLException
  {
    String sql = "INSERT INTO Product (product_id) VALUES (?)";
    jdbcTemplate.update(sql, product.getProductId());
    return product;
  }

  @Override public ArrayList<Product> getAllProducts() throws SQLException
  {
    String sql = "SELECT * FROM Product";
    List<Product> products = jdbcTemplate.query(sql,
        (rs, rowNum) -> new Product(rs.getString("product_id"),
            new ArrayList<>(),
            new ArrayList<>()));
    return new ArrayList<>(products);
  }

  @Override
  public ArrayList<Product> getAllProductsFromAnimal(String animalId) throws SQLException {
    String sql = "SELECT DISTINCT p.product_id " +
        "FROM Product p " +
        "JOIN Product_Tray pt ON p.product_id = pt.product_id " +
        "JOIN Tray t ON pt.tray_id = t.tray_id " +
        "JOIN Tray_AnimalPart tap ON t.tray_id = tap.tray_id " +
        "JOIN AnimalPart ap ON tap.part_id = ap.part_id " +
        "WHERE ap.animal_id = ?";

    List<Product> products = jdbcTemplate.query(sql, new Object[]{animalId},
        (rs, rowNum) -> new Product(
            rs.getString("product_id"),
            new ArrayList<>(),
            new ArrayList<>()
        ));
    return new ArrayList<>(products);
  }
}
