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
 * Protection profile custom data details.
 */
public class PolicyProperties {
    /**
     * The FriendlyName.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The ReplicationChannelSetting.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private PolicyProviderSpecificDetails providerSpecificDetails;

    /**
     * Get the FriendlyName.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the FriendlyName.
     *
     * @param friendlyName the friendlyName value to set
     * @return the PolicyProperties object itself.
     */
    public PolicyProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the ReplicationChannelSetting.
     *
     * @return the providerSpecificDetails value
     */
    public PolicyProviderSpecificDetails providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the ReplicationChannelSetting.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the PolicyProperties object itself.
     */
    public PolicyProperties withProviderSpecificDetails(PolicyProviderSpecificDetails providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}
