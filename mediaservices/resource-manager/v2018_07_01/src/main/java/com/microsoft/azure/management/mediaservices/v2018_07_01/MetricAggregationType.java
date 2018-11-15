/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricAggregationType.
 */
public final class MetricAggregationType extends ExpandableStringEnum<MetricAggregationType> {
    /** Static value Average for MetricAggregationType. */
    public static final MetricAggregationType AVERAGE = fromString("Average");

    /** Static value Count for MetricAggregationType. */
    public static final MetricAggregationType COUNT = fromString("Count");

    /** Static value Total for MetricAggregationType. */
    public static final MetricAggregationType TOTAL = fromString("Total");

    /**
     * Creates or finds a MetricAggregationType from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricAggregationType
     */
    @JsonCreator
    public static MetricAggregationType fromString(String name) {
        return fromString(name, MetricAggregationType.class);
    }

    /**
     * @return known MetricAggregationType values
     */
    public static Collection<MetricAggregationType> values() {
        return values(MetricAggregationType.class);
    }
}
