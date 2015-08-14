package service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void printProducts(Object product) {
        System.out.println(product.toString());
    }
}
