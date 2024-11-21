package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Tray;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TrayDAOImpl implements TrayDAO {
  private final JdbcTemplate jdbcTemplate;

  public TrayDAOImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Tray create(Tray tray) throws SQLException {
    String sql = """
                INSERT INTO Tray (type_id, maxWeight)
                VALUES (?, ?) RETURNING tray_id
            """;
    String trayId = jdbcTemplate.queryForObject(sql, String.class,
            Integer.parseInt(tray.getPartTypeId()), // Convert to Integer
            tray.getMaxWeight()
    );
    tray.setTrayId(trayId);
    return tray;
  }

  @Override
  public ArrayList<Tray> getAllTrays() throws SQLException {
    String sql = "SELECT * FROM Tray";
    List<Tray> trays = jdbcTemplate.query(sql, trayRowMapper());
    return new ArrayList<>(trays);
  }

  @Override
  public Tray getTrayFromAnimalPartId(String animalPartId) throws SQLException {
    String sql = """
                SELECT t.* FROM Tray t
                JOIN AnimalPart ap ON t.tray_id = ap.tray_id
                WHERE ap.part_id = ?
            """;
    int animalPartIdInt = Integer.parseInt(animalPartId); // Convert to Integer
    return jdbcTemplate.queryForObject(sql, trayRowMapper(), animalPartIdInt);
  }

  private RowMapper<Tray> trayRowMapper() {
    return (rs, rowNum) -> new Tray(
            rs.getString("tray_id"),
            rs.getString("type_id"),
            rs.getDouble("maxWeight")
    );
  }
}
