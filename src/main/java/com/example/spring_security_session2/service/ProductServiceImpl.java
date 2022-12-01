package com.example.spring_security_session2.service;

import com.example.spring_security_session2.entities.Product;
import com.example.spring_security_session2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl {
    private ProductRepository productRepository;

    private List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    private void saveProduct(Product product){
        productRepository.save(product);
    }

    private Product findByIdProduct(Long id){
        return productRepository.getById(id);
    }

    private void deleteByIdProduct(Long id){
        productRepository.deleteById(id);
    }
}
