package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalDAOImpl implements AnimalDAO {
  private final JdbcTemplate jdbcTemplate;

  public AnimalDAOImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Animal create(Animal animal) throws SQLException {
    String sql = "INSERT INTO Animal (weight_kilogram, origin, arrival_date) VALUES (?, ?, ?) RETURNING animal_id";
    String id = jdbcTemplate.queryForObject(sql, String.class, animal.getWeight(), animal.getOrigin(), animal.getDate());
    animal = new Animal(id, animal.getWeight(), animal.getDate(), animal.getOrigin());
    return animal;
  }

  @Override
  public Animal read(String animalId) throws SQLException {
    String sql = "SELECT * FROM Animal WHERE animal_id = ?";
    return jdbcTemplate.queryForObject(sql, animalRowMapper(), animalId);
  }

  @Override
  public ArrayList<Animal> getAllAnimals() throws SQLException {
    String sql = "SELECT * FROM Animal";
    List<Animal> animals = jdbcTemplate.query(sql, animalRowMapper());
    return new ArrayList<>(animals);
  }

  @Override
  public ArrayList<Animal> getAnimalsFromProduct(String productId) throws SQLException {
    String sql = """
            SELECT DISTINCT a.* FROM Animal a
            JOIN AnimalPart ap ON a.registration_id = ap.animal_id
            WHERE ap.product_id = ?
        """;
    int productIdInt = Integer.parseInt(productId); // Convert to Integer
    List<Animal> animals = jdbcTemplate.query(sql, animalRowMapper(), productIdInt);
    return new ArrayList<>(animals);
  }

  @Override
  public ArrayList<Animal> findAllByDate(LocalDate date) throws SQLException {
    String sql = "SELECT * FROM Animal WHERE arrival_date = ?";
    List<Animal> animals = jdbcTemplate.query(sql, animalRowMapper(), date);
    return new ArrayList<>(animals);
  }

  @Override
  public ArrayList<Animal> findAllByOrigin(String origin) throws SQLException {
    String sql = "SELECT * FROM Animal WHERE origin = ?";
    List<Animal> animals = jdbcTemplate.query(sql, animalRowMapper(), origin);
    return new ArrayList<>(animals);
  }

  private RowMapper<Animal> animalRowMapper() {
    return (rs, rowNum) -> new Animal(
        rs.getString("animal_id"),
        rs.getDouble("weight_kilogram"),
        rs.getDate("arrival_date").toLocalDate(),
        rs.getString("origin")
    );
  }
}
