package ru.maxol.simplebackend.repositories;

import org.springframework.stereotype.Component;
import ru.maxol.simplebackend.data.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>(List.of(
           new Product(1L, "Milk", 50L),
           new Product(2L, "Meat", 80L),
           new Product(3L, "Bread", 20L),
           new Product(4L, "Avocado", 40L),
           new Product(5L, "Banana", 70L)
        ));
    }

    public List<Product> getAllProducts(){
        return Collections.unmodifiableList(products);
    }

    public void delById(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
