package product.model;

import persistence.model.ProductRepo;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public static ProductRepo createProducts() {
        return new ProductRepo();
    }
}
