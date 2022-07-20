package com.etherofgodd.productservice.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "product_tb")
public class Product {
    @Id
    @Column(name = "product_id", columnDefinition = "BINARY(16)")
    @GeneratedValue
    private UUID productId;
    private String name;
    private String description;
    private BigDecimal price;
}
