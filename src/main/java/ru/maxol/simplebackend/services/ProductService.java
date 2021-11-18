package ru.maxol.simplebackend.services;

import org.springframework.stereotype.Service;
import ru.maxol.simplebackend.data.Product;
import ru.maxol.simplebackend.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct(){
        return productRepository.getAllProducts();
    }

    public void delById(Long id) {
        productRepository.delById(id);
    }
}
