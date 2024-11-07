package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Animal
{
  private String registrationId;
  private double weight;
  private LocalDate date;
  private String origin;

  public Animal(String registrationId, double weight)
  {
    this.registrationId = registrationId;
    this.weight = weight;

  }

  public Animal(String registrationId, double weight, LocalDate date,
      String origin)
  {
    this.registrationId = registrationId;
    this.weight = weight;
    this.date = date;
    this.origin = origin;
  }

  public Animal() {
  }

  public String getRegistrationId()
  {
    return registrationId;
  }

  public double getWeight()
  {
    return weight;
  }

  public LocalDate getDate()
  {
    return date;
  }

  public String getOrigin()
  {
    return origin;
  }
}