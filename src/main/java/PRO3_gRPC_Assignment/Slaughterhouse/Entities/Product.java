package PRO3_gRPC_Assignment.Slaughterhouse.Entities;

import java.util.List;

public class Product
{
  private String productId;
  private List<Part> parts;
  private List<Tray> trays;

  public Product(String productId, List<Part> parts, List<Tray> trays)
  {
    this.productId = productId;
    this.parts = parts;
    this.trays = trays;
  }

  public String getProductId()
  {
    return productId;
  }

  public void setProductId(String productId)
  {
    this.productId = productId;
  }

  public List<Part> getParts()
  {
    return parts;
  }

  public void setParts(List<Part> parts)
  {
    this.parts = parts;
  }

  public List<Tray> getTrays()
  {
    return trays;
  }

  public void setTrays(List<Tray> trays)
  {
    this.trays = trays;
  }
}
