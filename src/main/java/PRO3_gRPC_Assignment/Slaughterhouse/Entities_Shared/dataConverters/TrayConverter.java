package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import dk.via.slaughterhouse.TrayData;
import dk.via.slaughterhouse.AnimalPartData;

import java.util.List;
import java.util.stream.Collectors;

public class TrayConverter {
    public static TrayData convertToGrpcTrayData(Tray tray) {


        return TrayData.newBuilder()
                .setTrayId(tray.getTrayId())
                .setPartType(tray.getPartTypeId()) // Assuming you add a part type field in Tray
                .build();
    }

    public static Tray convertToTray(TrayData trayData) {


        return new Tray(trayData.getTrayId(), trayData.getPartType(), trayData.getMaxWeight());
    }

    public static List<Tray> convertToTrayList(List<TrayData> trayDataList) {
        return trayDataList.stream()
                .map(TrayConverter::convertToTray)
                .collect(Collectors.toList());
    }
}
