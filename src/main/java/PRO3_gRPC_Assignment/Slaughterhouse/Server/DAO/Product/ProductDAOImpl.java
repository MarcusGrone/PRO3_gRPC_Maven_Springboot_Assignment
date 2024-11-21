package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
  private final JdbcTemplate jdbcTemplate;

  public ProductDAOImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Product create(Product product) throws SQLException {
    String sql = "INSERT INTO Product DEFAULT VALUES RETURNING product_id";
    String productId = jdbcTemplate.queryForObject(sql, String.class);
    product.setProductId(productId);
    return product;
  }

  @Override
  public ArrayList<Product> getAllProducts() throws SQLException {
    String sql = "SELECT * FROM Product";
    List<Product> products = jdbcTemplate.query(sql, productRowMapper());
    return new ArrayList<>(products);
  }

  @Override
  public ArrayList<Product> getAllProductsFromAnimal(String animalId) throws SQLException {
    String sql = """
            SELECT DISTINCT p.* FROM Product p
            JOIN AnimalPart ap ON p.product_id = ap.product_id
            WHERE ap.animal_id = ?
        """;
    List<Product> products = jdbcTemplate.query(sql, productRowMapper(), animalId);
    return new ArrayList<>(products);
  }

  @Override
  public ArrayList<Product> getProductsContainingAnimal(String animalId) throws SQLException {
    String sql = """
            SELECT DISTINCT p.* FROM Product p
            JOIN AnimalPart ap ON p.product_id = ap.product_id
            WHERE ap.animal_id = ?
        """;
    List<Product> products = jdbcTemplate.query(sql, productRowMapper(), animalId);
    return new ArrayList<>(products);
  }

  @Override
  public Product getProductFromAnimalPartId(String animalPartId) throws SQLException {
    String sql = """
            SELECT p.* FROM Product p
            JOIN AnimalPart ap ON p.product_id = ap.product_id
            WHERE ap.part_id = ?
        """;
    return jdbcTemplate.queryForObject(sql, productRowMapper(), animalPartId);
  }

  private RowMapper<Product> productRowMapper() {
    return (rs, rowNum) -> new Product(
        rs.getString("product_id")
    );
  }
}
