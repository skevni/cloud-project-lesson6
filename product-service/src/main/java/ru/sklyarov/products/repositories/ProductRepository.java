package ru.sklyarov.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sklyarov.products.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
