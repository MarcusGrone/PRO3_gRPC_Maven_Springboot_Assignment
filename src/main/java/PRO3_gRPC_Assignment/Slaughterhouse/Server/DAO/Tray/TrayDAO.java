package PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Tray;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;

import java.sql.SQLException;
import java.util.ArrayList;

public interface TrayDAO {
  Tray create(Tray tray) throws SQLException;
  ArrayList<Tray> getAllTrays() throws SQLException;
}