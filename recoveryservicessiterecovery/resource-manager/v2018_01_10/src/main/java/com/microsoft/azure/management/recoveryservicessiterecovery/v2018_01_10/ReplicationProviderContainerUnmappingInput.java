/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provider specific input for unpairing operations.
 */
public class ReplicationProviderContainerUnmappingInput {
    /**
     * The class type.
     */
    @JsonProperty(value = "instanceType")
    private String instanceType;

    /**
     * Get the class type.
     *
     * @return the instanceType value
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Set the class type.
     *
     * @param instanceType the instanceType value to set
     * @return the ReplicationProviderContainerUnmappingInput object itself.
     */
    public ReplicationProviderContainerUnmappingInput withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

}
