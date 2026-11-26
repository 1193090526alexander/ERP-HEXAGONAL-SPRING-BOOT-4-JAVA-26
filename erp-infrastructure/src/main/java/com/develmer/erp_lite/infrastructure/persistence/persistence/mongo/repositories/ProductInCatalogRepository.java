package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.repositories;

import com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document.ProductInCatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface    ProductInCatalogRepository extends MongoRepository<ProductInCatalogDocument, String> {
}
