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
 * Certificate renewal input.
 */
public class RenewCertificateInput {
    /**
     * Renew certificate input properties.
     */
    @JsonProperty(value = "properties")
    private RenewCertificateInputProperties properties;

    /**
     * Get renew certificate input properties.
     *
     * @return the properties value
     */
    public RenewCertificateInputProperties properties() {
        return this.properties;
    }

    /**
     * Set renew certificate input properties.
     *
     * @param properties the properties value to set
     * @return the RenewCertificateInput object itself.
     */
    public RenewCertificateInput withProperties(RenewCertificateInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
