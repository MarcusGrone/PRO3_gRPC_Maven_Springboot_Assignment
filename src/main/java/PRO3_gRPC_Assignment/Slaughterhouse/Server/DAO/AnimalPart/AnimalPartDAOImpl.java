package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.AnimalPart;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalPartDAOImpl implements AnimalPartDAO {
  private final JdbcTemplate jdbcTemplate;

  public AnimalPartDAOImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public AnimalPart create(AnimalPart animalPart) throws SQLException {
    String sql = """
                INSERT INTO AnimalPart (weight_kilogram, animal_id, type_id, tray_id, product_id)
                VALUES (?, ?, ?, ?, ?) RETURNING part_id
            """;
    String id = jdbcTemplate.queryForObject(sql, String.class,
            animalPart.getWeight(),
            Integer.parseInt(animalPart.getAnimalId()),
            Integer.parseInt(animalPart.getPartTypeId()),
            Integer.parseInt(animalPart.getTrayId()),
            Integer.parseInt(animalPart.getProductId())
    );
    animalPart.setPartId(id);
    return animalPart;
  }

  @Override
  public ArrayList<AnimalPart> getAllAnimalParts() throws SQLException {
    String sql = "SELECT * FROM AnimalPart";
    List<AnimalPart> parts = jdbcTemplate.query(sql, animalPartRowMapper());
    return new ArrayList<>(parts);
  }

  @Override
  public ArrayList<AnimalPart> getALlAnimalPartsFromProductID(String productId) throws SQLException {
    String sql = "SELECT * FROM AnimalPart WHERE product_id = ?";
    int productIdInt = Integer.parseInt(productId); // Convert to Integer
    List<AnimalPart> parts = jdbcTemplate.query(sql, animalPartRowMapper(), productIdInt);
    return new ArrayList<>(parts);
  }

  @Override
  public ArrayList<AnimalPart> getALlAnimalPartsFromTrayID(String trayId) throws SQLException {
    String sql = "SELECT * FROM AnimalPart WHERE tray_id = ?";
    int trayIdInt = Integer.parseInt(trayId); // Convert to Integer
    List<AnimalPart> parts = jdbcTemplate.query(sql, animalPartRowMapper(), trayIdInt);
    return new ArrayList<>(parts);
  }

  @Override
  public ArrayList<AnimalPart> getALlAnimalPartsFromAnimalID(String animalId) {
    String sql = "SELECT * FROM AnimalPart WHERE animal_id = ?";
    int animalIdInt = Integer.parseInt(animalId); // Convert to Integer
    List<AnimalPart> parts = jdbcTemplate.query(sql, animalPartRowMapper(), animalIdInt);
    return new ArrayList<>(parts);
  }

  private RowMapper<AnimalPart> animalPartRowMapper() {
    return (rs, rowNum) -> new AnimalPart(
            rs.getString("part_id"),
            rs.getString("animal_id"),
            rs.getDouble("weight_kilogram"),
            rs.getString("type_id"),
            rs.getString("product_id"),
            rs.getString("tray_id")
    );
  }
}
