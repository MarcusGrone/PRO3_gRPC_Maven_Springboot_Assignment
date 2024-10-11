package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

import java.math.BigDecimal;

public class Animal {
  private String registrationId;
  private double weight;

  public Animal(String registrationId, double weight) {
    this.registrationId = registrationId;
    this.weight = weight;
  }


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


}