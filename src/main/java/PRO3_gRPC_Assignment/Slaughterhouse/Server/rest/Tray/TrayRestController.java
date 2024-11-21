package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Tray;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tray")
public class TrayRestController {
    private final TrayService trayService;

    @Autowired
    public TrayRestController(TrayService trayService) {
        this.trayService = trayService;
    }

    @PostMapping
    public ResponseEntity<Tray> createTray(@RequestBody Tray tray) {
        Tray createdTray = trayService.createTray(tray);
        return new ResponseEntity<>(createdTray, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Tray>> getAllTrays() {
        List<Tray> trays = trayService.getAllTrays();
        return ResponseEntity.ok(trays);
    }

    @GetMapping("/animalPart/{animalPartId}")
    public ResponseEntity<Tray> getTrayByAnimalPart(@PathVariable String animalPartId) {
        Tray tray = trayService.getTrayByAnimalPartId(animalPartId);
        return ResponseEntity.ok(tray);
    }
}
