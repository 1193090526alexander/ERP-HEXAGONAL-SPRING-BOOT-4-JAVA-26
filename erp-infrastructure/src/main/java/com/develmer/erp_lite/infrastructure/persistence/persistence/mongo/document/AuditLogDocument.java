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

@Document(collection = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class AuditLogDocument {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String className;

    private String endpoint;

    private String errorMessage;

    private Long executionTimeMs;

    private String ipAddress;

    private String methodName;

    private boolean success;

    private Instant timestamp;

    private String userId;
}
