/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Edifact message filter for odata query.
 */
public class EdifactMessageFilter {
    /**
     * The message filter type. Possible values include: 'NotSpecified',
     * 'Include', 'Exclude'.
     */
    @JsonProperty(value = "messageFilterType", required = true)
    private MessageFilterType messageFilterType;

    /**
     * Get the message filter type. Possible values include: 'NotSpecified', 'Include', 'Exclude'.
     *
     * @return the messageFilterType value
     */
    public MessageFilterType messageFilterType() {
        return this.messageFilterType;
    }

    /**
     * Set the message filter type. Possible values include: 'NotSpecified', 'Include', 'Exclude'.
     *
     * @param messageFilterType the messageFilterType value to set
     * @return the EdifactMessageFilter object itself.
     */
    public EdifactMessageFilter withMessageFilterType(MessageFilterType messageFilterType) {
        this.messageFilterType = messageFilterType;
        return this;
    }

}
