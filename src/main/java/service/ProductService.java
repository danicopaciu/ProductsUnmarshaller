package service;

import org.springframework.stereotype.Service;
import persistence.model.Product;

@Service
public class ProductService {

    public void printProducts(Product product) {
        System.out.println(product.toString());
    }
}
