package com.etherofgodd.productservice.service;

import com.etherofgodd.productservice.dto.ProductRequest;
import com.etherofgodd.productservice.dto.ProductResponse;
import com.etherofgodd.productservice.entity.Product;
import com.etherofgodd.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .description(productRequest.getDescription())
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product with id {} has been saved", product.getProductId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .productId(product.getProductId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
