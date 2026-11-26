package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document;

public record ProductSpecifications(
        String processor,
        String ram,
        String storage,
        String display,
        String weight
) {
}
