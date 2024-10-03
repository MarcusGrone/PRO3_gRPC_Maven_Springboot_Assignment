package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.AnimalId;
import dk.via.slaughterhouse.AnimalsData;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalConverter {
    public static AnimalData convertToGrpcAnimalData(Animal animal) {
        return AnimalData.newBuilder()
                .setRegistrationId(animal.getRegistrationId()) // Added registrationId field
                .setWeight(animal.getWeight())
                .build();
    }

    public static Animal convertToAnimal(AnimalData animalData) {
        if (animalData == null) {
            return null;
        }

        String id = animalData.getRegistrationId();
        double weight = animalData.getWeight();

        return new Animal(id, weight);
    }

    public static List<Animal> convertToAnimalList(AnimalsData data) {
        return data.getAnimalsList().stream()
                .map(AnimalConverter::convertToAnimal)
                .collect(Collectors.toList());
    }

    public static AnimalsData convertToGrpcAnimalsData(List<Animal> animals) {
        List<AnimalData> animalsDataList = animals.stream()
                .map(AnimalConverter::convertToGrpcAnimalData)
                .collect(Collectors.toList());

        return AnimalsData.newBuilder().addAllAnimals(animalsDataList).build();
    }

    public static AnimalId convertToGrpcAnimalId(String animalId) {
        if (animalId == null) {
            return null;
        }

        return AnimalId.newBuilder().setRegistrationId(animalId).build();
    }
}
