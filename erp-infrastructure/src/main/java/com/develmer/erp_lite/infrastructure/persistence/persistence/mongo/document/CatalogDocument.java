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

import java.time.Instant;
import java.util.List;

@Document(collection = "catalogs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class CatalogDocument {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private boolean active;

    private CatalogType catalogType;

    private Instant createdAt;

    private String description;

    private List<CatalogItem> items;

    private String name;

    private Instant updatedAt;
}
