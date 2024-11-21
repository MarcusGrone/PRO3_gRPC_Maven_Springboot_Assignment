package PRO3_gRPC_Assignment.Slaughterhouse.Server.rest.Product;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> registerProduct(@RequestBody Product product) {
        Product savedProduct = productService.registerProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping({"/{productId}"})
    public ResponseEntity<Product> getAnimalsByDateOrOrigin(
            @PathVariable String productId
            )
    {
        Product retrievedProduct = productService.getProduct(productId);
        if (retrievedProduct == null)
        {
            throw new NullPointerException();
        }
        return ResponseEntity.ok(retrievedProduct);
    }
}
