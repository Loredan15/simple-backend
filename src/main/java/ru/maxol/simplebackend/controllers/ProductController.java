package ru.maxol.simplebackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.maxol.simplebackend.data.Product;
import ru.maxol.simplebackend.services.ProductService;

import java.util.List;

/*
Контроллер -> Сервис -> Репозиторий
@RestController тоже самое что @Controller + @ResponseBody для всех методов
@GetMapping - указываем эндпоинт
@RequestParam - в запросе передаем параметр
@PathVariable - в адресной строке передаем параметр
 */
@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("/products/delete/{id}")
    public void delById(@PathVariable Long id){
        productService.delById(id);
    }
}
