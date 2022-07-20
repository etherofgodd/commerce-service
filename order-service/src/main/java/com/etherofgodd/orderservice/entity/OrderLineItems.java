package com.etherofgodd.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "order_line_items_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @Column(name = "order_line_id", columnDefinition = "BINARY(16)")
    @GeneratedValue
    private UUID orderLineId;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
