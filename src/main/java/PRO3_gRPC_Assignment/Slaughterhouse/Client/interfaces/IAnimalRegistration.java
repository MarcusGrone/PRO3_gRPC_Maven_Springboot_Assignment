package PRO3_gRPC_Assignment.Slaughterhouse.Client.interfaces;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities.Animal;

public interface IAnimalRegistration {
    Animal registerNewAnimal (double weightInKg);
}
