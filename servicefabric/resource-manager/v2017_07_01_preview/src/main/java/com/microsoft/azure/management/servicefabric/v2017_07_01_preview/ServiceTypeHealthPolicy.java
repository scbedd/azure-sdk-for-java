/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health policy used to evaluate the health of services
 * belonging to a service type.
 */
public class ServiceTypeHealthPolicy {
    /**
     * The maximum allowed percentage of unhealthy partitions per service.
     * Allowed values are Byte values from zero to 100
     *
     * The percentage represents the maximum tolerated percentage of partitions
     * that can be unhealthy before the service is considered in error.
     * If the percentage is respected but there is at least one unhealthy
     * partition, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy
     * partitions over the total number of partitions in the service.
     * The computation rounds up to tolerate one failure on small numbers of
     * partitions. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyPartitionsPerService")
    private Integer maxPercentUnhealthyPartitionsPerService;

    /**
     * The maximum allowed percentage of unhealthy replicas per partition.
     * Allowed values are Byte values from zero to 100.
     *
     * The percentage represents the maximum tolerated percentage of replicas
     * that can be unhealthy before the partition is considered in error.
     * If the percentage is respected but there is at least one unhealthy
     * replica, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy
     * replicas over the total number of replicas in the partition.
     * The computation rounds up to tolerate one failure on small numbers of
     * replicas. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyReplicasPerPartition")
    private Integer maxPercentUnhealthyReplicasPerPartition;

    /**
     * The maximum maximum allowed percentage of unhealthy services. Allowed
     * values are Byte values from zero to 100.
     *
     * The percentage represents the maximum tolerated percentage of services
     * that can be unhealthy before the application is considered in error.
     * If the percentage is respected but there is at least one unhealthy
     * service, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy services of the
     * specific service type over the total number of services of the specific
     * service type.
     * The computation rounds up to tolerate one failure on small numbers of
     * services. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyServices")
    private Integer maxPercentUnhealthyServices;

    /**
     * Get the maximum allowed percentage of unhealthy partitions per service. Allowed values are Byte values from zero to 100
     The percentage represents the maximum tolerated percentage of partitions that can be unhealthy before the service is considered in error.
     If the percentage is respected but there is at least one unhealthy partition, the health is evaluated as Warning.
     The percentage is calculated by dividing the number of unhealthy partitions over the total number of partitions in the service.
     The computation rounds up to tolerate one failure on small numbers of partitions. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyPartitionsPerService value
     */
    public Integer maxPercentUnhealthyPartitionsPerService() {
        return this.maxPercentUnhealthyPartitionsPerService;
    }

    /**
     * Set the maximum allowed percentage of unhealthy partitions per service. Allowed values are Byte values from zero to 100
     The percentage represents the maximum tolerated percentage of partitions that can be unhealthy before the service is considered in error.
     If the percentage is respected but there is at least one unhealthy partition, the health is evaluated as Warning.
     The percentage is calculated by dividing the number of unhealthy partitions over the total number of partitions in the service.
     The computation rounds up to tolerate one failure on small numbers of partitions. Default percentage is zero.
     *
     * @param maxPercentUnhealthyPartitionsPerService the maxPercentUnhealthyPartitionsPerService value to set
     * @return the ServiceTypeHealthPolicy object itself.
     */
    public ServiceTypeHealthPolicy withMaxPercentUnhealthyPartitionsPerService(Integer maxPercentUnhealthyPartitionsPerService) {
        this.maxPercentUnhealthyPartitionsPerService = maxPercentUnhealthyPartitionsPerService;
        return this;
    }

    /**
     * Get the maximum allowed percentage of unhealthy replicas per partition. Allowed values are Byte values from zero to 100.
     The percentage represents the maximum tolerated percentage of replicas that can be unhealthy before the partition is considered in error.
     If the percentage is respected but there is at least one unhealthy replica, the health is evaluated as Warning.
     The percentage is calculated by dividing the number of unhealthy replicas over the total number of replicas in the partition.
     The computation rounds up to tolerate one failure on small numbers of replicas. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyReplicasPerPartition value
     */
    public Integer maxPercentUnhealthyReplicasPerPartition() {
        return this.maxPercentUnhealthyReplicasPerPartition;
    }

    /**
     * Set the maximum allowed percentage of unhealthy replicas per partition. Allowed values are Byte values from zero to 100.
     The percentage represents the maximum tolerated percentage of replicas that can be unhealthy before the partition is considered in error.
     If the percentage is respected but there is at least one unhealthy replica, the health is evaluated as Warning.
     The percentage is calculated by dividing the number of unhealthy replicas over the total number of replicas in the partition.
     The computation rounds up to tolerate one failure on small numbers of replicas. Default percentage is zero.
     *
     * @param maxPercentUnhealthyReplicasPerPartition the maxPercentUnhealthyReplicasPerPartition value to set
     * @return the ServiceTypeHealthPolicy object itself.
     */
    public ServiceTypeHealthPolicy withMaxPercentUnhealthyReplicasPerPartition(Integer maxPercentUnhealthyReplicasPerPartition) {
        this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition;
        return this;
    }

    /**
     * Get the maximum maximum allowed percentage of unhealthy services. Allowed values are Byte values from zero to 100.
     The percentage represents the maximum tolerated percentage of services that can be unhealthy before the application is considered in error.
     If the percentage is respected but there is at least one unhealthy service, the health is evaluated as Warning.
     This is calculated by dividing the number of unhealthy services of the specific service type over the total number of services of the specific service type.
     The computation rounds up to tolerate one failure on small numbers of services. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyServices value
     */
    public Integer maxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices;
    }

    /**
     * Set the maximum maximum allowed percentage of unhealthy services. Allowed values are Byte values from zero to 100.
     The percentage represents the maximum tolerated percentage of services that can be unhealthy before the application is considered in error.
     If the percentage is respected but there is at least one unhealthy service, the health is evaluated as Warning.
     This is calculated by dividing the number of unhealthy services of the specific service type over the total number of services of the specific service type.
     The computation rounds up to tolerate one failure on small numbers of services. Default percentage is zero.
     *
     * @param maxPercentUnhealthyServices the maxPercentUnhealthyServices value to set
     * @return the ServiceTypeHealthPolicy object itself.
     */
    public ServiceTypeHealthPolicy withMaxPercentUnhealthyServices(Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
        return this;
    }

}
