package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.repositories;

import com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document.AuditLogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditLogRepository extends MongoRepository<AuditLogDocument, String> {
}
