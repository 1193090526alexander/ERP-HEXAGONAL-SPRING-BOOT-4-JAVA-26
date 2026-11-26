package com.develmer.erp_lite.infrastructure.persistence.persistence.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.util.UUID;

/** Order detail line — snapshot of a product bought within an {@link OrderEntity}. */
@Entity
@Table(name = "order_products", schema = "public")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"order", "product"})
public class OrderProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_order_products_order"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private OrderEntity order;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_order_products_product"))
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private ProductEntity product;

    /** Snapshot of the product name at order creation time. */
    @Column(name = "product_name", length = 200, nullable = false)
    private String productName;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price", precision = 15, scale = 2, nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "subtotal", precision = 15, scale = 2, nullable = false)
    private BigDecimal subtotal;

    @PrePersist
    void  prePersist()
    {
        if (unitPrice == null && quantity != null && subtotal == null){
            subtotal = unitPrice.multiply(BigDecimal.valueOf(quantity.longValue()));
        }
        if (product != null && (productName == null||productName.isBlank())){
            productName = product.getName();
        }

    }
}
