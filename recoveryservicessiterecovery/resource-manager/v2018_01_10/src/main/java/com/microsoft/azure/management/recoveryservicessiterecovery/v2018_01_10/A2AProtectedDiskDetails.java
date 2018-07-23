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
 * A2A protected disk details.
 */
public class A2AProtectedDiskDetails {
    /**
     * The disk uri.
     */
    @JsonProperty(value = "diskUri")
    private String diskUri;

    /**
     * The recovery disk storage account.
     */
    @JsonProperty(value = "recoveryAzureStorageAccountId")
    private String recoveryAzureStorageAccountId;

    /**
     * The primary disk storage account.
     */
    @JsonProperty(value = "primaryDiskAzureStorageAccountId")
    private String primaryDiskAzureStorageAccountId;

    /**
     * Recovery disk uri.
     */
    @JsonProperty(value = "recoveryDiskUri")
    private String recoveryDiskUri;

    /**
     * The disk name.
     */
    @JsonProperty(value = "diskName")
    private String diskName;

    /**
     * The disk capacity in bytes.
     */
    @JsonProperty(value = "diskCapacityInBytes")
    private Long diskCapacityInBytes;

    /**
     * The primary staging storage account.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId")
    private String primaryStagingAzureStorageAccountId;

    /**
     * The type of disk.
     */
    @JsonProperty(value = "diskType")
    private String diskType;

    /**
     * A value indicating whether resync is required for this disk.
     */
    @JsonProperty(value = "resyncRequired")
    private Boolean resyncRequired;

    /**
     * The percentage of the monitoring job. The type of the monitoring job is
     * defined by MonitoringJobType property.
     */
    @JsonProperty(value = "monitoringPercentageCompletion")
    private Integer monitoringPercentageCompletion;

    /**
     * The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     */
    @JsonProperty(value = "monitoringJobType")
    private String monitoringJobType;

    /**
     * The data pending for replication in MB at staging account.
     */
    @JsonProperty(value = "dataPendingInStagingStorageAccountInMB")
    private Double dataPendingInStagingStorageAccountInMB;

    /**
     * The data pending at source virtual machine in MB.
     */
    @JsonProperty(value = "dataPendingAtSourceAgentInMB")
    private Double dataPendingAtSourceAgentInMB;

    /**
     * Get the disk uri.
     *
     * @return the diskUri value
     */
    public String diskUri() {
        return this.diskUri;
    }

    /**
     * Set the disk uri.
     *
     * @param diskUri the diskUri value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskUri(String diskUri) {
        this.diskUri = diskUri;
        return this;
    }

    /**
     * Get the recovery disk storage account.
     *
     * @return the recoveryAzureStorageAccountId value
     */
    public String recoveryAzureStorageAccountId() {
        return this.recoveryAzureStorageAccountId;
    }

    /**
     * Set the recovery disk storage account.
     *
     * @param recoveryAzureStorageAccountId the recoveryAzureStorageAccountId value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withRecoveryAzureStorageAccountId(String recoveryAzureStorageAccountId) {
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
        return this;
    }

    /**
     * Get the primary disk storage account.
     *
     * @return the primaryDiskAzureStorageAccountId value
     */
    public String primaryDiskAzureStorageAccountId() {
        return this.primaryDiskAzureStorageAccountId;
    }

    /**
     * Set the primary disk storage account.
     *
     * @param primaryDiskAzureStorageAccountId the primaryDiskAzureStorageAccountId value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withPrimaryDiskAzureStorageAccountId(String primaryDiskAzureStorageAccountId) {
        this.primaryDiskAzureStorageAccountId = primaryDiskAzureStorageAccountId;
        return this;
    }

    /**
     * Get recovery disk uri.
     *
     * @return the recoveryDiskUri value
     */
    public String recoveryDiskUri() {
        return this.recoveryDiskUri;
    }

    /**
     * Set recovery disk uri.
     *
     * @param recoveryDiskUri the recoveryDiskUri value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withRecoveryDiskUri(String recoveryDiskUri) {
        this.recoveryDiskUri = recoveryDiskUri;
        return this;
    }

    /**
     * Get the disk name.
     *
     * @return the diskName value
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Set the disk name.
     *
     * @param diskName the diskName value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * Get the disk capacity in bytes.
     *
     * @return the diskCapacityInBytes value
     */
    public Long diskCapacityInBytes() {
        return this.diskCapacityInBytes;
    }

    /**
     * Set the disk capacity in bytes.
     *
     * @param diskCapacityInBytes the diskCapacityInBytes value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskCapacityInBytes(Long diskCapacityInBytes) {
        this.diskCapacityInBytes = diskCapacityInBytes;
        return this;
    }

    /**
     * Get the primary staging storage account.
     *
     * @return the primaryStagingAzureStorageAccountId value
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primary staging storage account.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withPrimaryStagingAzureStorageAccountId(String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

    /**
     * Get the type of disk.
     *
     * @return the diskType value
     */
    public String diskType() {
        return this.diskType;
    }

    /**
     * Set the type of disk.
     *
     * @param diskType the diskType value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get a value indicating whether resync is required for this disk.
     *
     * @return the resyncRequired value
     */
    public Boolean resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Set a value indicating whether resync is required for this disk.
     *
     * @param resyncRequired the resyncRequired value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withResyncRequired(Boolean resyncRequired) {
        this.resyncRequired = resyncRequired;
        return this;
    }

    /**
     * Get the percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     *
     * @return the monitoringPercentageCompletion value
     */
    public Integer monitoringPercentageCompletion() {
        return this.monitoringPercentageCompletion;
    }

    /**
     * Set the percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     *
     * @param monitoringPercentageCompletion the monitoringPercentageCompletion value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withMonitoringPercentageCompletion(Integer monitoringPercentageCompletion) {
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        return this;
    }

    /**
     * Get the type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     *
     * @return the monitoringJobType value
     */
    public String monitoringJobType() {
        return this.monitoringJobType;
    }

    /**
     * Set the type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     *
     * @param monitoringJobType the monitoringJobType value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withMonitoringJobType(String monitoringJobType) {
        this.monitoringJobType = monitoringJobType;
        return this;
    }

    /**
     * Get the data pending for replication in MB at staging account.
     *
     * @return the dataPendingInStagingStorageAccountInMB value
     */
    public Double dataPendingInStagingStorageAccountInMB() {
        return this.dataPendingInStagingStorageAccountInMB;
    }

    /**
     * Set the data pending for replication in MB at staging account.
     *
     * @param dataPendingInStagingStorageAccountInMB the dataPendingInStagingStorageAccountInMB value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDataPendingInStagingStorageAccountInMB(Double dataPendingInStagingStorageAccountInMB) {
        this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
        return this;
    }

    /**
     * Get the data pending at source virtual machine in MB.
     *
     * @return the dataPendingAtSourceAgentInMB value
     */
    public Double dataPendingAtSourceAgentInMB() {
        return this.dataPendingAtSourceAgentInMB;
    }

    /**
     * Set the data pending at source virtual machine in MB.
     *
     * @param dataPendingAtSourceAgentInMB the dataPendingAtSourceAgentInMB value to set
     * @return the A2AProtectedDiskDetails object itself.
     */
    public A2AProtectedDiskDetails withDataPendingAtSourceAgentInMB(Double dataPendingAtSourceAgentInMB) {
        this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
        return this;
    }

}
