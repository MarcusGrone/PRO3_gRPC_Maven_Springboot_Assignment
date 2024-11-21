package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

public class AnimalPart {
  private String partId;
  private String animalId;
  private double weight;
  private String partTypeId;
  private String productId;
  private String trayId;

  public AnimalPart(String partId, String animalId, double weight, String partTypeId, String productId, String trayId) {
    this.partId = partId;
    this.animalId = animalId;
    this.weight = weight;
    this.partTypeId = partTypeId;
    this.productId = productId;
    this.trayId = trayId;
  }

  public AnimalPart(String partId, String animalId, double weight, String partTypeId) {
    this.partId = partId;
    this.animalId = animalId;
    this.weight = weight;
    this.partTypeId = partTypeId;
  }

  public String getPartId() {
    return partId;
  }

  public void setPartId(String partId) {
    this.partId = partId;
  }

  public String getAnimalId() {
    return animalId;
  }

  public void setAnimalId(String animalId) {
    this.animalId = animalId;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getPartTypeId() {
    return partTypeId;
  }

  public void setPartTypeId(String partTypeId) {
    this.partTypeId = partTypeId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getTrayId() {
    return trayId;
  }

  public void setTrayId(String trayId) {
    this.trayId = trayId;
  }
}


