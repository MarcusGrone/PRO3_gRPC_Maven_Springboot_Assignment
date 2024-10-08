package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

public class AnimalPart
{
  private String partId;
  private String animalId;
  private double weight;
  private String partType;

  public AnimalPart(String partId, String animalId, double weight, String partType) {
    this.partId = partId;
    this.animalId = animalId;
    this.weight = weight;
    this.partType = partType;
  }

  public String getPartId()
  {
    return partId;
  }

  public void setPartId(String partId)
  {
    this.partId = partId;
  }

  public String getAnimalId()
  {
    return animalId;
  }

  public void setAnimalId(String animalId)
  {
    this.animalId = animalId;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public String getPartType()
  {
    return partType;
  }

  public void setPartType(String partType)
  {
    this.partType = partType;
  }
}
