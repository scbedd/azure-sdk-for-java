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
 * Hyper V VM network input details.
 */
public class VMNicInputDetails {
    /**
     * The nic Id.
     */
    @JsonProperty(value = "nicId")
    private String nicId;

    /**
     * Recovery VM subnet name.
     */
    @JsonProperty(value = "recoveryVMSubnetName")
    private String recoveryVMSubnetName;

    /**
     * Replica nic static IP address.
     */
    @JsonProperty(value = "replicaNicStaticIPAddress")
    private String replicaNicStaticIPAddress;

    /**
     * Selection type for failover.
     */
    @JsonProperty(value = "selectionType")
    private String selectionType;

    /**
     * Get the nic Id.
     *
     * @return the nicId value
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Set the nic Id.
     *
     * @param nicId the nicId value to set
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * Get recovery VM subnet name.
     *
     * @return the recoveryVMSubnetName value
     */
    public String recoveryVMSubnetName() {
        return this.recoveryVMSubnetName;
    }

    /**
     * Set recovery VM subnet name.
     *
     * @param recoveryVMSubnetName the recoveryVMSubnetName value to set
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryVMSubnetName(String recoveryVMSubnetName) {
        this.recoveryVMSubnetName = recoveryVMSubnetName;
        return this;
    }

    /**
     * Get replica nic static IP address.
     *
     * @return the replicaNicStaticIPAddress value
     */
    public String replicaNicStaticIPAddress() {
        return this.replicaNicStaticIPAddress;
    }

    /**
     * Set replica nic static IP address.
     *
     * @param replicaNicStaticIPAddress the replicaNicStaticIPAddress value to set
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withReplicaNicStaticIPAddress(String replicaNicStaticIPAddress) {
        this.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
        return this;
    }

    /**
     * Get selection type for failover.
     *
     * @return the selectionType value
     */
    public String selectionType() {
        return this.selectionType;
    }

    /**
     * Set selection type for failover.
     *
     * @param selectionType the selectionType value to set
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withSelectionType(String selectionType) {
        this.selectionType = selectionType;
        return this;
    }

}
