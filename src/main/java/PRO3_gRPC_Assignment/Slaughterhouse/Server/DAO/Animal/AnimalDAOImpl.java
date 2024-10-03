package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
@Repository
public class AnimalDAOImpl
{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AnimalDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
