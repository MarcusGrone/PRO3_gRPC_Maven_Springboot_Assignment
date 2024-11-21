package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Animal.AnimalDAO;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.DAO.Product.ProductDAO;
import PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalLookUp.AnimalLookUpServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AnimalLookUpTest {

  @Mock
  private AnimalDAO animalDAO;

  @Mock
  private ProductDAO productDAO;

  @InjectMocks
  private AnimalLookUpServiceImpl animalLookUpService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testGetAnimalsFromProductId() throws SQLException {
    String productId = "product123";
    ArrayList<Animal> expectedAnimals = new ArrayList<>();
    expectedAnimals.add(new Animal("1",100));
    expectedAnimals.add(new Animal("2",200));


    when(animalDAO.getAnimalsFromProduct(productId)).thenReturn(
   expectedAnimals);

    List<Animal> actualAnimals = animalLookUpService.getAnimalsFromProductId(productId);


    assertEquals(expectedAnimals, actualAnimals);
  }

  @Test
  void testGetProductsFromAnimalId() throws SQLException {
    String animalId = "animal123";

    ArrayList<AnimalPart> animalPartsForTray = new ArrayList<>();
    animalPartsForTray.add(new AnimalPart("1", "1", 2.5, "leg"));
    animalPartsForTray.add(new AnimalPart("2", "1", 3.0, "shoulder"));

    ArrayList<Tray> trays = new ArrayList<>();
    trays.add(new Tray("1", "leg", 2.0));  // Corrected instantiation
    trays.add(new Tray("2", "shoulder", 3.0));

    ArrayList<Product> expectedProducts = new ArrayList<>();
    expectedProducts.add(new Product("1"));
    expectedProducts.add(new Product("2"));


    when(productDAO.getAllProductsFromAnimal(animalId)).thenReturn(expectedProducts);


    List<Product> actualProducts = animalLookUpService.getProductsFromAnimalId(animalId);


    assertEquals(expectedProducts, actualProducts);
  }
}