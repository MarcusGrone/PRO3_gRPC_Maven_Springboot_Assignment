package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.AnimalRegistrationServiceGrpc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AnimalRegistrationTest {

  @Mock
  private AnimalConverter animalConverter;

  @Mock
  private AnimalRegistration mockAnimalRegistration;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.initMocks(this);


    when(mockAnimalRegistration.registerNewAnimal(anyDouble()))
        .thenAnswer(invocation -> {
          double weight = invocation.getArgument(0);
          AnimalData expectedAnimalData = AnimalData.newBuilder()
              .setRegistrationId("2")
              .setWeight(weight)
              .build();
          return AnimalConverter.convertToAnimal(expectedAnimalData);
        });
  }

  @Test
  void registerNewAnimal() {

    double weight = 100.0;


    Animal registeredAnimal = mockAnimalRegistration.registerNewAnimal(weight);


    verify(mockAnimalRegistration).registerNewAnimal(weight);


    assertEquals("2", registeredAnimal.getRegistrationId());
    assertEquals(weight, registeredAnimal.getWeight());
  }
}