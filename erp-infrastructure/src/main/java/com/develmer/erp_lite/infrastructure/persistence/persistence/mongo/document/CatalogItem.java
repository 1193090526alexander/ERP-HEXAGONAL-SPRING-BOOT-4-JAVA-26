package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document;

public record  CatalogItem(
        String id,
        String code,
        String value,
        String description,
        Integer displayOrder,
        CatalogItemMetadata metadata
) {
}
