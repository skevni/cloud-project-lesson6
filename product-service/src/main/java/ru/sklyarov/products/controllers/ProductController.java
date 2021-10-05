package ru.sklyarov.products.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sklyarov.common.dtos.ProductDto;
import ru.sklyarov.products.exceptions.ResourceNotFoundException;
import ru.sklyarov.products.services.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;

    @RequestMapping
    public List<ProductDto> findAllProducts(){
        return productService.findAllProducts().stream().map(p -> new ProductDto(p.getId(), p.getTitle(), p.getPrice())).collect(Collectors.toList());
    }

    @RequestMapping("/{productId}")
    public ProductDto findProductById(@PathVariable Long productId){
        return productService.findById(productId).map(p->new ProductDto(p.getId(), p.getTitle(),p.getPrice())).orElseThrow(() ->new ResourceNotFoundException("Product with id: " + productId + " not found"));
    }
}
