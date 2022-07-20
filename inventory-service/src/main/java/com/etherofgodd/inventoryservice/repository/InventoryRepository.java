package com.etherofgodd.inventoryservice.repository;

import com.etherofgodd.inventoryservice.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {
    Optional<Inventory> findInventoriesBySkuCode(String skuCode);
}
