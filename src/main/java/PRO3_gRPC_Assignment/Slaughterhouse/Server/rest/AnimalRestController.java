package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalRestController
{
  private final AnimalService animalService;

  @Autowired
  public AnimalRestController(AnimalService animalService)
  {
    this.animalService = animalService;
  }

  @PostMapping
  public ResponseEntity<Animal> registerAnimal(@RequestBody Animal animal) {
    Animal savedAnimal = animalService.registerAnimal(animal);
    return new ResponseEntity<>(savedAnimal, HttpStatus.CREATED);
  }


  @GetMapping({"/date/{date}", "/origin/{origin}"})
  public ResponseEntity<List<Animal>> getAnimalsByDateOrOrigin(
      @PathVariable(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
      @PathVariable(required = false) String origin) {

    List<Animal> animals;
    if (date != null) {
      animals = animalService.getAnimalsByDate(date);
    } else if (origin != null) {
      animals = animalService.getAnimalsByOrigin(origin);
    } else {
      animals = animalService.getAllAnimals();
    }
    return ResponseEntity.ok(animals);
  }
}



