package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository public class AnimalDAOImpl implements AnimalDAO
{

  private final JdbcTemplate jdbcTemplate;

  @Autowired public AnimalDAOImpl(JdbcTemplate jdbcTemplate)
  {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override public Animal create(Animal animal) throws SQLException
  {
    String sql = "INSERT INTO animal (weight_kilogram) VALUES (?)";
    jdbcTemplate.update(sql, BigDecimal.valueOf(animal.getWeight()));
    return animal;
  }

  @Override public Animal read(String animalId) throws SQLException
  {
    String sql = "SELECT * FROM Animal WHERE animal_ID = ?";
    return jdbcTemplate.queryForObject(sql, new Object[] {animalId},
        (rs, rowNum) -> new Animal(rs.getString("animal_id"),
            rs.getDouble("weight_kilogram")));
  }

  @Override public ArrayList<Animal> getAllAnimals() throws SQLException
  {
    String sql = "SELECT * FROM Animal";
    List<Animal> animals = jdbcTemplate.query(sql,
        (rs, rowNum) -> new Animal(rs.getString("animal_id"),
            rs.getDouble("weight_kilogram")));
    return new ArrayList<>(animals);
  }

  @Override
  public ArrayList<Animal> getAnimalsFromProduct(String productId) throws SQLException {
    String sql = "SELECT DISTINCT a.animal_id, a.weight_kilogram " +
        "FROM Animal a " +
        "JOIN AnimalPart ap ON a.animal_id = ap.animal_id " +
        "JOIN Product p ON ap.part_id = p.part_id " +
        "JOIN Tray t ON p.product_id = t.product_id " +
        "WHERE p.product_id = ?";

    List<Animal> animals = jdbcTemplate.query(sql, new Object[]{Integer.valueOf(productId)},
        (rs, rowNum) -> new Animal(
            String.valueOf(rs.getInt("animal_id")),
            rs.getDouble("weight_kilogram")
        )
    );

    return new ArrayList<>(animals);
  }

  @Override public ArrayList<Animal> findAllByDate(LocalDate date)
      throws SQLException
  {
    String sql = "SELECT * FROM Animal WHERE arrival_date = ?";
    List<Animal> animals = jdbcTemplate.query(sql, new Object[]{date},
        (rs, rowNum) -> new Animal(
            rs.getString("animal_id"),
            rs.getDouble("weight_kilogram")
        )
    );
    return new ArrayList<>(animals);
  }

  @Override public ArrayList<Animal> findAllByOrigin(String origin)
      throws SQLException
  {
    String sql = "SELECT * FROM Animal WHERE origin = ?";
    List<Animal> animals = jdbcTemplate.query(sql, new Object[]{origin},
        (rs, rowNum) -> new Animal(
            rs.getString("animal_id"),
            rs.getDouble("weight_kilogram")
        )
    );
    return new ArrayList<>(animals);
  }
}
