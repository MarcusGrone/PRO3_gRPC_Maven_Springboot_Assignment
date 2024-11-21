package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Tray;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;

import java.util.List;

public interface TrayService {
    Tray createTray(Tray tray);

    List<Tray> getAllTrays();

    Tray getTrayByAnimalPartId(String animalPartId);
}
