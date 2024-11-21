package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Tray;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Tray.TrayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TrayServiceImpl implements TrayService {
    private final TrayDAO trayDAO;

    @Autowired
    public TrayServiceImpl(TrayDAO trayDAO) {
        this.trayDAO = trayDAO;
    }

    @Override
    public Tray createTray(Tray tray) {
        try {
            return trayDAO.create(tray);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating tray", e);
        }
    }

    @Override
    public List<Tray> getAllTrays() {
        try {
            return trayDAO.getAllTrays();
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all trays", e);
        }
    }

    @Override
    public Tray getTrayByAnimalPartId(String animalPartId) {
        try {
            return trayDAO.getTrayFromAnimalPartId(animalPartId);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving tray for animal part ID: " + animalPartId, e);
        }
    }
}