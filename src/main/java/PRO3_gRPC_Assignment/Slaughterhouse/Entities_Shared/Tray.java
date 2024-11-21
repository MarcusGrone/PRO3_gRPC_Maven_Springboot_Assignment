package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

import java.util.List;

public class Tray {

    private String trayId;
    private String partTypeId;
    private double maxWeight;

  public Tray(String trayId, String partTypeId, double maxWeight) {
    this.trayId = trayId;
    this.partTypeId = partTypeId;
    this.maxWeight = maxWeight;
  }

  public String getTrayId() {
    return trayId;
  }

  public void setTrayId(String trayId) {
    this.trayId = trayId;
  }

  public String getPartTypeId() {
    return partTypeId;
  }

  public void setPartTypeId(String partTypeId) {
    this.partTypeId = partTypeId;
  }

  public double getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(double maxWeight) {
    this.maxWeight = maxWeight;
  }
}
