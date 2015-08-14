package product;

import http.rest.RestService;
import integration.ProductGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductJob {

    @Autowired
    private RestService restService;

    @Autowired
    private ProductGateway productGateway;

    @Scheduled(fixedRate = Long.MAX_VALUE)
    public void handleProducts() {
        String xmlProducts = restService.makeRestCall("http://localhost:8080/productList");
        productGateway.collectProducts(xmlProducts);

    }

}
