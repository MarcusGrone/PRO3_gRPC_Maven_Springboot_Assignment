package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import dk.via.slaughterhouse.TrayData;
import dk.via.slaughterhouse.AnimalPartData;

import java.util.List;
import java.util.stream.Collectors;

public class TrayConverter {
    public static TrayData convertToGrpcTrayData(Tray tray) {
        List<AnimalPartData> animalPartDataList = tray.getParts().stream()
                .map(AnimalPartConverter::convertToGrpcAnimalPartData)
                .collect(Collectors.toList());

        return TrayData.newBuilder()
                .setTrayId(tray.getTrayId())
                .setPartType(tray.getPartType()) // Assuming you add a part type field in Tray
                .addAllAnimalPartsData(animalPartDataList)
                .build();
    }

    public static Tray convertToTray(TrayData trayData) {
        List<AnimalPart> parts = trayData.getAnimalPartsDataList().stream()
                .map(AnimalPartConverter::convertToAnimalPart)
                .collect(Collectors.toList());

        return new Tray(trayData.getTrayId(), trayData.getPartType(), parts, trayData.getMaxWeight());
    }

    public static List<Tray> convertToTrayList(List<TrayData> trayDataList) {
        return trayDataList.stream()
                .map(TrayConverter::convertToTray)
                .collect(Collectors.toList());
    }
}
