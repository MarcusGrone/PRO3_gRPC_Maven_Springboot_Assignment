package PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters;

import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.AnimalPart;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Product;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Tray;
import dk.via.slaughterhouse.*;

import java.util.List;
import java.util.stream.Collectors;

public class ProductConverter {
    public static ProductData convertToGrpcProductData(Product product) {
        List<AnimalPartData> animalPartsData = product.getParts().stream()
                .map(AnimalPartConverter::convertToGrpcAnimalPartData)
                .collect(Collectors.toList());

        List<TrayData> trayDataList = product.getTrays().stream()
                .map(TrayConverter::convertToGrpcTrayData)
                .collect(Collectors.toList());

        return ProductData.newBuilder()
                .setProductId(product.getProductId())
                .addAllAnimalPartsData(animalPartsData)
                .addAllTrayIds(trayDataList)
                .build();
    }

    public static Product convertToProduct(ProductData productData) {
        List<AnimalPart> animalParts = productData.getAnimalPartsDataList().stream()
                .map(AnimalPartConverter::convertToAnimalPart)
                .collect(Collectors.toList());

        List<Tray> trays = productData.getTrayIdsList().stream()
                .map(TrayConverter::convertToTray)
                .collect(Collectors.toList());

        return new Product(productData.getProductId(), animalParts, trays);
    }

    public static List<Product> convertToProductList(ProductsData productsData) {
        return productsData.getProductsList().stream()
                .map(ProductConverter::convertToProduct)
                .collect(Collectors.toList());
    }

    public static ProductsData convertToGrpcProductsData(List<Product> products) {
        List<ProductData> productDataList = products.stream()
                .map(ProductConverter::convertToGrpcProductData)
                .collect(Collectors.toList());

        return ProductsData.newBuilder().addAllProducts(productDataList).build();
    }

    public static ProductId convertTogRPCProductId(String productId) {
        return ProductId.newBuilder().setProductId(productId).build();
    }
}
