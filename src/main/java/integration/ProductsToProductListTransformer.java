package integration;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;
import persistence.model.Product;
import persistence.model.ProductRepo;

import java.util.List;

@MessageEndpoint
public class ProductsToProductListTransformer {

    @Transformer
    public List<Product> getProductlist(ProductRepo productRepo) {
        return productRepo.getProductList();
    }
}
