/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes an update for a stateful service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
public class StatefulServiceUpdateDescription extends ServiceUpdateDescription {
    /**
     * The target replica set size as a number.
     */
    @JsonProperty(value = "TargetReplicaSetSize")
    private Integer targetReplicaSetSize;

    /**
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "MinReplicaSetSize")
    private Integer minReplicaSetSize;

    /**
     * The duration, in seconds, between when a replica goes down and when a
     * new replica is created.
     */
    @JsonProperty(value = "ReplicaRestartWaitDurationSeconds")
    private String replicaRestartWaitDurationSeconds;

    /**
     * The maximum duration, in seconds, for which a partition is allowed to be
     * in a state of quorum loss.
     */
    @JsonProperty(value = "QuorumLossWaitDurationSeconds")
    private String quorumLossWaitDurationSeconds;

    /**
     * The definition on how long StandBy replicas should be maintained before
     * being removed.
     */
    @JsonProperty(value = "StandByReplicaKeepDurationSeconds")
    private String standByReplicaKeepDurationSeconds;

    /**
     * Get the target replica set size as a number.
     *
     * @return the targetReplicaSetSize value
     */
    public Integer targetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription withTargetReplicaSetSize(Integer targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value
     */
    public Integer minReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription withMinReplicaSetSize(Integer minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the duration, in seconds, between when a replica goes down and when a new replica is created.
     *
     * @return the replicaRestartWaitDurationSeconds value
     */
    public String replicaRestartWaitDurationSeconds() {
        return this.replicaRestartWaitDurationSeconds;
    }

    /**
     * Set the duration, in seconds, between when a replica goes down and when a new replica is created.
     *
     * @param replicaRestartWaitDurationSeconds the replicaRestartWaitDurationSeconds value to set
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription withReplicaRestartWaitDurationSeconds(String replicaRestartWaitDurationSeconds) {
        this.replicaRestartWaitDurationSeconds = replicaRestartWaitDurationSeconds;
        return this;
    }

    /**
     * Get the maximum duration, in seconds, for which a partition is allowed to be in a state of quorum loss.
     *
     * @return the quorumLossWaitDurationSeconds value
     */
    public String quorumLossWaitDurationSeconds() {
        return this.quorumLossWaitDurationSeconds;
    }

    /**
     * Set the maximum duration, in seconds, for which a partition is allowed to be in a state of quorum loss.
     *
     * @param quorumLossWaitDurationSeconds the quorumLossWaitDurationSeconds value to set
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription withQuorumLossWaitDurationSeconds(String quorumLossWaitDurationSeconds) {
        this.quorumLossWaitDurationSeconds = quorumLossWaitDurationSeconds;
        return this;
    }

    /**
     * Get the definition on how long StandBy replicas should be maintained before being removed.
     *
     * @return the standByReplicaKeepDurationSeconds value
     */
    public String standByReplicaKeepDurationSeconds() {
        return this.standByReplicaKeepDurationSeconds;
    }

    /**
     * Set the definition on how long StandBy replicas should be maintained before being removed.
     *
     * @param standByReplicaKeepDurationSeconds the standByReplicaKeepDurationSeconds value to set
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription withStandByReplicaKeepDurationSeconds(String standByReplicaKeepDurationSeconds) {
        this.standByReplicaKeepDurationSeconds = standByReplicaKeepDurationSeconds;
        return this;
    }

}
