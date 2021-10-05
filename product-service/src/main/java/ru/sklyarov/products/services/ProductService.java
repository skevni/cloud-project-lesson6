package ru.sklyarov.products.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sklyarov.products.entities.Product;
import ru.sklyarov.products.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}
