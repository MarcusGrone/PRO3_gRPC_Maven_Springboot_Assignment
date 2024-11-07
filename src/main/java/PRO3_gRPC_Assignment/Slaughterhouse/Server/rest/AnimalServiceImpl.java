package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal.AnimalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService
{
  private final AnimalDAO animalDAO;

@Autowired
  public AnimalServiceImpl(AnimalDAO animalDAO) {
    this.animalDAO = animalDAO;
  }

  @Override
  public Animal registerAnimal(Animal animal) {
    try {
      return animalDAO.create(animal);
    } catch (Exception e) {
      throw new RuntimeException("Error registering animal", e);
    }
  }

  @Override
  public Animal getAnimalByRegistrationNumber(String registrationId) {
    try {
      return animalDAO.read(registrationId);
    } catch (Exception e) {
      throw new RuntimeException("Animal not found for registration ID: " + registrationId, e);
    }
  }

  @Override
  public List<Animal> getAllAnimals() {
    try {
      return animalDAO.getAllAnimals();
    } catch (Exception e) {
      throw new RuntimeException("Error retrieving all animals", e);
    }
  }

  @Override
  public List<Animal> getAnimalsByDate(LocalDate date) {
    try
    {
      return animalDAO.findAllByDate(date);
    }
    catch (SQLException e)
    {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<Animal> getAnimalsByOrigin(String origin) {
    try
    {
      return animalDAO.findAllByOrigin(origin);
    }
    catch (SQLException e)
    {
      throw new RuntimeException(e);
    }
  }
}