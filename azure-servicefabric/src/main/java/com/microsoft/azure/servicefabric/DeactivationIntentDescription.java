/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the intent or reason for deactivating the node.
 */
public class DeactivationIntentDescription {
    /**
     * Describes the intent or reason for deactivating the node. The possible
     * values are following.
     * . Possible values include: 'Pause', 'Restart', 'RemoveData'.
     */
    @JsonProperty(value = "DeactivationIntent")
    private DeactivationIntent deactivationIntent;

    /**
     * Get describes the intent or reason for deactivating the node. The possible values are following.
     . Possible values include: 'Pause', 'Restart', 'RemoveData'.
     *
     * @return the deactivationIntent value
     */
    public DeactivationIntent deactivationIntent() {
        return this.deactivationIntent;
    }

    /**
     * Set describes the intent or reason for deactivating the node. The possible values are following.
     . Possible values include: 'Pause', 'Restart', 'RemoveData'.
     *
     * @param deactivationIntent the deactivationIntent value to set
     * @return the DeactivationIntentDescription object itself.
     */
    public DeactivationIntentDescription withDeactivationIntent(DeactivationIntent deactivationIntent) {
        this.deactivationIntent = deactivationIntent;
        return this;
    }

}
