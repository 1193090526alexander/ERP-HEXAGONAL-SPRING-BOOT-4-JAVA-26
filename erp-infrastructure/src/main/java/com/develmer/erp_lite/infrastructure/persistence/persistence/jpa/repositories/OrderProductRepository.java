package com.develmer.erp_lite.infrastructure.persistence.persistence.jpa.repositories;

import com.develmer.erp_lite.infrastructure.persistence.persistence.jpa.entity.OrderProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity, UUID> {
}
