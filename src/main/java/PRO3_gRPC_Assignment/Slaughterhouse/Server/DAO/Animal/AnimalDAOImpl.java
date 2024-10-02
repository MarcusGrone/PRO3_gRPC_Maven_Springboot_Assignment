package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
@Repository
public class AnimalDAOImpl
{

    private final JbdcTemplate

    @Autowired //Todo: find out why JbdcTemplate isn't recognized
    public AnimalDAOImpl() {
    }
}
