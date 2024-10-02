package PRO3_gRPC_Assignment.Slaughterhouse.Server.service.animalRegistration;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;

public interface IAnimalRegistrationService {
    Animal registerAnimal(Animal animal);
}
