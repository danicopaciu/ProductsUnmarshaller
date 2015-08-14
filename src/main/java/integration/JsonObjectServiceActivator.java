package integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import service.ProductService;

@MessageEndpoint
public class JsonObjectServiceActivator {

    @Autowired
    private ProductService productService;

    @ServiceActivator
    public void printObject(String json) {
        productService.printProducts(json);
    }
}
