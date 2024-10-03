package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import dk.via.slaughterhouse.AnimalPartData;
import dk.via.slaughterhouse.AnimalPartId;
import dk.via.slaughterhouse.AnimalPartsData;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalPartConverter {
    public static AnimalPartData convertToGrpcAnimalPartData(AnimalPart animalPart) {
        return AnimalPartData.newBuilder()
                .setAnimalPartId(animalPart.getPartId())
                .setAnimalId(animalPart.getAnimalId())
                .setPartWeight(String.valueOf(animalPart.getWeight()))
                .setPartTypeId(animalPart.getPartType())
                .build();
    }

    public static AnimalPart convertToAnimalPart(AnimalPartData animalPartData) {
        if (animalPartData == null) {
            return null;
        }

        String id = animalPartData.getAnimalPartId();
        String animalId = animalPartData.getAnimalId();
        double weight = Double.parseDouble(animalPartData.getPartWeight());
        String partType = animalPartData.getPartTypeId();

        return new AnimalPart(id, animalId, weight, partType);
    }

    public static List<AnimalPart> convertToAnimalPartList(AnimalPartsData data) {
        return data.getAnimalPartsList().stream()
                .map(AnimalPartConverter::convertToAnimalPart)
                .collect(Collectors.toList());
    }

    public static AnimalPartsData convertToGrpcAnimalPartsData(List<AnimalPart> animalParts) {
        List<AnimalPartData> animalPartDataList = animalParts.stream()
                .map(AnimalPartConverter::convertToGrpcAnimalPartData)
                .collect(Collectors.toList());

        return AnimalPartsData.newBuilder().addAllAnimalParts(animalPartDataList).build();
    }

    public static AnimalPartId convertToGrpcAnimalPartId(String animalPartId) {
        if (animalPartId == null) {
            return null;
        }

        return AnimalPartId.newBuilder().setAnimalPartId(animalPartId).build();
    }
}
