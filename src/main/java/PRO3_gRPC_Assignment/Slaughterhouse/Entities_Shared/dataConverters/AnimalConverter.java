package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.AnimalId;
import dk.via.slaughterhouse.AnimalsData;

import java.util.List;

public class AnimalConverter {
    public static AnimalData convertTogRPCAnimalData (Animal animal)
    {
        return AnimalData.newBuilder().setWeight(animal.getWeight()).build();
    }

    public static Animal convertToAnimal(AnimalData animalData)
    {
        if (animalData == null)
        {
            return null;
        }

        String id = animalData.getRegistrationId();
        double weight = animalData.getWeight();

        return new Animal(id, weight);
    }

    public static List<Animal> convertToAnimalList(AnimalsData data)
    {
        return data.getAnimalsList().stream().map(AnimalConverter::convertToAnimal).toList();
    }

    public static AnimalsData convertTogRPCAnimalsData(List<Animal> animals)
    {
        List<AnimalData> animalsDataList = animals.stream().map(AnimalConverter::convertTogRPCAnimalData).toList();

        return AnimalsData.newBuilder().addAllAnimals(animalsDataList).build();
    }

    public static AnimalId convertTogRPCAnimalId(String animalId)
    {
        if (animalId == null)
        {
            return null;
        }

        return AnimalId.newBuilder().setRegistrationId(animalId).build();
    }


}
