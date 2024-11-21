package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.AnimalPart;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animalPart")
public class AnimalPartRestController {
    private final AnimalPartService animalPartService;

    @Autowired
    public AnimalPartRestController(AnimalPartService animalPartService) {
        this.animalPartService = animalPartService;
    }

    @PostMapping
    public ResponseEntity<AnimalPart> createAnimalPart(@RequestBody AnimalPart animalPart) {
        AnimalPart createdAnimalPart = animalPartService.createAnimalPart(animalPart);
        return new ResponseEntity<>(createdAnimalPart, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AnimalPart>> getAllAnimalParts() {
        List<AnimalPart> animalParts = animalPartService.getAllAnimalParts();
        return ResponseEntity.ok(animalParts);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<AnimalPart>> getAnimalPartsByProduct(@PathVariable String productId) {
        List<AnimalPart> animalParts = animalPartService.getAnimalPartsByProductId(productId);
        return ResponseEntity.ok(animalParts);
    }

    @GetMapping("/tray/{trayId}")
    public ResponseEntity<List<AnimalPart>> getAnimalPartsByTray(@PathVariable String trayId) {
        List<AnimalPart> animalParts = animalPartService.getAnimalPartsByTrayId(trayId);
        return ResponseEntity.ok(animalParts);
    }

    @GetMapping("/animal/{animalId}")
    public ResponseEntity<List<AnimalPart>> getAnimalPartsByAnimal(@PathVariable String animalId) {
        List<AnimalPart> animalParts = animalPartService.getAnimalPartsByAnimalId(animalId);
        return ResponseEntity.ok(animalParts);
    }
}
