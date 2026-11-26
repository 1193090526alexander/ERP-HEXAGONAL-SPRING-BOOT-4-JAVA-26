package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.repositories;


import com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document.CatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CatalogRepository extends MongoRepository<CatalogDocument, String> {
}
