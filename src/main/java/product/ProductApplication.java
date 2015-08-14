package product;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductApplication {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/product-context.xml");
    }
}
