package integration;

import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;
import persistence.model.Product;

@MessageEndpoint
public class ProductFilter {

    @Filter
    public boolean accept(Product p) {
        return p.isStock();
    }

}
