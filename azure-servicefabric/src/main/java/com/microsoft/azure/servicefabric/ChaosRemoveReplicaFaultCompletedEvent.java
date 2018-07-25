/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ReplicaEventInner;

/**
 * Chaos Remove Replica Fault Completed event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosRemoveReplicaFaultCompleted")
public class ChaosRemoveReplicaFaultCompletedEvent extends ReplicaEventInner {
    /**
     * Id of fault group.
     */
    @JsonProperty(value = "FaultGroupId", required = true)
    private UUID faultGroupId;

    /**
     * Id of fault.
     */
    @JsonProperty(value = "FaultId", required = true)
    private UUID faultId;

    /**
     * Service name.
     */
    @JsonProperty(value = "ServiceUri", required = true)
    private String serviceUri;

    /**
     * Get id of fault group.
     *
     * @return the faultGroupId value
     */
    public UUID faultGroupId() {
        return this.faultGroupId;
    }

    /**
     * Set id of fault group.
     *
     * @param faultGroupId the faultGroupId value to set
     * @return the ChaosRemoveReplicaFaultCompletedEvent object itself.
     */
    public ChaosRemoveReplicaFaultCompletedEvent withFaultGroupId(UUID faultGroupId) {
        this.faultGroupId = faultGroupId;
        return this;
    }

    /**
     * Get id of fault.
     *
     * @return the faultId value
     */
    public UUID faultId() {
        return this.faultId;
    }

    /**
     * Set id of fault.
     *
     * @param faultId the faultId value to set
     * @return the ChaosRemoveReplicaFaultCompletedEvent object itself.
     */
    public ChaosRemoveReplicaFaultCompletedEvent withFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

    /**
     * Get service name.
     *
     * @return the serviceUri value
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set service name.
     *
     * @param serviceUri the serviceUri value to set
     * @return the ChaosRemoveReplicaFaultCompletedEvent object itself.
     */
    public ChaosRemoveReplicaFaultCompletedEvent withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

}
