package com.develmer.erp_lite.infrastructure.persistence.persistence.mongo.document;

import java.math.BigDecimal;
import java.util.List;

/**
 * Free-form metadata bag attached to a {@link CatalogItem}.
 * Not every field applies to every {@link CatalogType} (e.g. {@code fee} only appears
 * on PAYMENT_METHODS items, {@code nextStatuses} only on ORDER_STATUSES items).
 */
public record CatalogItemMetadata(
        String icon,
        String color,
        BigDecimal fee,
        List<String> nextStatuses
) {
}
