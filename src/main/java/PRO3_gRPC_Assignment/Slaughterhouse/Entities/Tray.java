package PRO3_gRPC_Assignment.Slaughterhouse.Entities;

import java.util.List;

public class Tray
{
  private String trayId;
  private String partType;
  private List<Part> parts;
  private double maxWeight;

  public Tray(String trayId, String partType, List<Part> parts, double maxWeight) {
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

  public List<Part> getParts()
  {
    return parts;
  }

  public void setParts(List<Part> parts)
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
