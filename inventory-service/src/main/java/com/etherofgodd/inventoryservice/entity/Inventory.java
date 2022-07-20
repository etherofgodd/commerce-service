package com.etherofgodd.inventoryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "inventory_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    @Column(name = "inventory_id", columnDefinition = "BINARY(16)")
    @GeneratedValue
    private UUID inventoryId;
    private String skuCode;
    private Integer quantity;
}
