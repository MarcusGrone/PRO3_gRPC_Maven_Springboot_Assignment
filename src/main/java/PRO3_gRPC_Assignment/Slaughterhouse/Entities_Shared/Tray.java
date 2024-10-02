package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

import java.util.List;

public class Tray {

    private String trayId;
    private String partType;
    private List<AnimalPart> parts;
    private double maxWeight;

    public Tray(String trayId, String partType, List<AnimalPart> parts, double maxWeight) {
      this.trayId = trayId;
      this.partType = partType;
      this.parts = parts;
      this.maxWeight = maxWeight;
    }

  public String getTrayId()
  {
    return trayId;
  }

  public void setTrayId(String trayId)
  {
    this.trayId = trayId;
  }

  public String getPartType()
  {
    return partType;
  }

  public void setPartType(String partType)
  {
    this.partType = partType;
  }

  public List<AnimalPart> getParts()
  {
    return parts;
  }

  public void setParts(List<AnimalPart> parts)
  {
    this.parts = parts;
  }

  public double getMaxWeight()
  {
    return maxWeight;
  }

  public void setMaxWeight(double maxWeight)
  {
    this.maxWeight = maxWeight;
  }
}
