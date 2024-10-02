package PRO3_gRPC_Assignment.Slaughterhouse.Entities;

import java.util.List;

public class Product {
  private String productId;
  private List<Animal> animals;

  public Product(String productId, List<Animal> animals) {
    this.productId = productId;
    this.animals = animals;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  public void setAnimals(List<Animal> animals) {
    this.animals = animals;
  }
}
