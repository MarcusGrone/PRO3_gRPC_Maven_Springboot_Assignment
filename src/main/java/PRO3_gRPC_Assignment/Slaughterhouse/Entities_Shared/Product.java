package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared;

import java.util.List;

public class Product
{
  private String productId;

  public Product(String productId) {
    this.productId = productId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }
}
