package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Document(collection = "product_documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class ProductInCatalogDocument {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private boolean active;

    private String categoryId;

    private String categoryName;

    private Instant createdAt;

    private String currency;

    private String description;

    private String imageUrl;

    private String name;

    private BigDecimal price;

    private String sku;

    private ProductSpecifications specifications;

    private Integer stock;

    private List<String> tags;

    private Instant updatedAt;
}
