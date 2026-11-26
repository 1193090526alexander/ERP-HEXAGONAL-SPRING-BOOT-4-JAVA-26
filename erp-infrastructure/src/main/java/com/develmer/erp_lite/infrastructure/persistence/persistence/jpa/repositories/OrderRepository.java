package com.develmer.erp_lite.infrastructure.persistence.persistence.jpa.repositories;

import com.develmer.erp_lite.infrastructure.persistence.persistence.jpa.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
}
