package integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import persistence.model.Product;
import service.ProductService;

import java.util.List;

@MessageEndpoint
public class ProductServiceActivator {

    @Autowired
    private ProductService productService;

    @ServiceActivator
    public void callService(List<Product> products) {
        for (Product p : products) {
            productService.printProducts(p);
        }
    }
}
