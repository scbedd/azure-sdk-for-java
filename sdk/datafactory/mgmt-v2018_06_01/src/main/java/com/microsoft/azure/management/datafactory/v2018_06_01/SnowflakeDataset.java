/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The snowflake dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SnowflakeDataset.class)
@JsonTypeName("SnowflakeTable")
@JsonFlatten
public class SnowflakeDataset extends DatasetInner {
    /**
     * The schema name of the Snowflake database. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object snowflakeDatasetSchema;

    /**
     * The table name of the Snowflake database. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * Get the schema name of the Snowflake database. Type: string (or Expression with resultType string).
     *
     * @return the snowflakeDatasetSchema value
     */
    public Object snowflakeDatasetSchema() {
        return this.snowflakeDatasetSchema;
    }

    /**
     * Set the schema name of the Snowflake database. Type: string (or Expression with resultType string).
     *
     * @param snowflakeDatasetSchema the snowflakeDatasetSchema value to set
     * @return the SnowflakeDataset object itself.
     */
    public SnowflakeDataset withSnowflakeDatasetSchema(Object snowflakeDatasetSchema) {
        this.snowflakeDatasetSchema = snowflakeDatasetSchema;
        return this;
    }

    /**
     * Get the table name of the Snowflake database. Type: string (or Expression with resultType string).
     *
     * @return the table value
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table name of the Snowflake database. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set
     * @return the SnowflakeDataset object itself.
     */
    public SnowflakeDataset withTable(Object table) {
        this.table = table;
        return this;
    }

}
