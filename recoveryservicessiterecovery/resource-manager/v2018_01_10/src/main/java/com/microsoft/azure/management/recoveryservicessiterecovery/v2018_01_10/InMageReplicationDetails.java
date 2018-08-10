/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMage provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
public class InMageReplicationDetails extends ReplicationProviderSpecificSettings {
    /**
     * The active location of the VM. If the VM is being protected from Azure,
     * this field will take values from { Azure, OnPrem }. If the VM is being
     * protected between two data-centers, this field will be OnPrem always.
     */
    @JsonProperty(value = "activeSiteType")
    private String activeSiteType;

    /**
     * The CPU count of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmCPUCount")
    private Integer sourceVmCPUCount;

    /**
     * The RAM size of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmRAMSizeInMB")
    private Integer sourceVmRAMSizeInMB;

    /**
     * The OS details.
     */
    @JsonProperty(value = "osDetails")
    private OSDiskDetails osDetails;

    /**
     * The protection stage.
     */
    @JsonProperty(value = "protectionStage")
    private String protectionStage;

    /**
     * The virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /**
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /**
     * The resync details of the machine.
     */
    @JsonProperty(value = "resyncDetails")
    private InitialReplicationDetails resyncDetails;

    /**
     * The retention window start time.
     */
    @JsonProperty(value = "retentionWindowStart")
    private DateTime retentionWindowStart;

    /**
     * The retention window end time.
     */
    @JsonProperty(value = "retentionWindowEnd")
    private DateTime retentionWindowEnd;

    /**
     * The compressed data change rate in MB.
     */
    @JsonProperty(value = "compressedDataRateInMB")
    private Double compressedDataRateInMB;

    /**
     * The uncompressed data change rate in MB.
     */
    @JsonProperty(value = "uncompressedDataRateInMB")
    private Double uncompressedDataRateInMB;

    /**
     * The RPO in seconds.
     */
    @JsonProperty(value = "rpoInSeconds")
    private Long rpoInSeconds;

    /**
     * The list of protected disks.
     */
    @JsonProperty(value = "protectedDisks")
    private List<InMageProtectedDiskDetails> protectedDisks;

    /**
     * The source IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The last heartbeat received from the source server.
     */
    @JsonProperty(value = "lastHeartbeat")
    private DateTime lastHeartbeat;

    /**
     * The process server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /**
     * The master target Id.
     */
    @JsonProperty(value = "masterTargetId")
    private String masterTargetId;

    /**
     * The collection of Consistency points.
     */
    @JsonProperty(value = "consistencyPoints")
    private Map<String, DateTime> consistencyPoints;

    /**
     * A value indicating whether any disk is resized for this VM.
     */
    @JsonProperty(value = "diskResized")
    private String diskResized;

    /**
     * A value indicating whether the source server requires a restart after
     * update.
     */
    @JsonProperty(value = "rebootAfterUpdateStatus")
    private String rebootAfterUpdateStatus;

    /**
     * The multi vm group Id, if any.
     */
    @JsonProperty(value = "multiVmGroupId")
    private String multiVmGroupId;

    /**
     * The multi vm group name, if any.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /**
     * A value indicating whether the multi vm sync is enabled or disabled.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private String multiVmSyncStatus;

    /**
     * The agent details.
     */
    @JsonProperty(value = "agentDetails")
    private InMageAgentDetails agentDetails;

    /**
     * The vCenter infrastructure Id.
     */
    @JsonProperty(value = "vCenterInfrastructureId")
    private String vCenterInfrastructureId;

    /**
     * The infrastructure VM Id.
     */
    @JsonProperty(value = "infrastructureVmId")
    private String infrastructureVmId;

    /**
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

    /**
     * A value indicating the discovery type of the machine.
     */
    @JsonProperty(value = "discoveryType")
    private String discoveryType;

    /**
     * A value indicating the underlying Azure storage account. If the VM is
     * not running in Azure, this value shall be set to null.
     */
    @JsonProperty(value = "azureStorageAccountId")
    private String azureStorageAccountId;

    /**
     * The datastores of the on-premise machine Value can be list of strings
     * that contain datastore names.
     */
    @JsonProperty(value = "datastores")
    private List<String> datastores;

    /**
     * The validation errors of the on-premise machine Value can be list of
     * validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /**
     * The last RPO calculated time.
     */
    @JsonProperty(value = "lastRpoCalculatedTime")
    private DateTime lastRpoCalculatedTime;

    /**
     * The last update time received from on-prem components.
     */
    @JsonProperty(value = "lastUpdateReceivedTime")
    private DateTime lastUpdateReceivedTime;

    /**
     * The replica id of the protected item.
     */
    @JsonProperty(value = "replicaId")
    private String replicaId;

    /**
     * The OS Version of the protected item.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Get the active location of the VM. If the VM is being protected from Azure, this field will take values from { Azure, OnPrem }. If the VM is being protected between two data-centers, this field will be OnPrem always.
     *
     * @return the activeSiteType value
     */
    public String activeSiteType() {
        return this.activeSiteType;
    }

    /**
     * Set the active location of the VM. If the VM is being protected from Azure, this field will take values from { Azure, OnPrem }. If the VM is being protected between two data-centers, this field will be OnPrem always.
     *
     * @param activeSiteType the activeSiteType value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withActiveSiteType(String activeSiteType) {
        this.activeSiteType = activeSiteType;
        return this;
    }

    /**
     * Get the CPU count of the VM on the primary side.
     *
     * @return the sourceVmCPUCount value
     */
    public Integer sourceVmCPUCount() {
        return this.sourceVmCPUCount;
    }

    /**
     * Set the CPU count of the VM on the primary side.
     *
     * @param sourceVmCPUCount the sourceVmCPUCount value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withSourceVmCPUCount(Integer sourceVmCPUCount) {
        this.sourceVmCPUCount = sourceVmCPUCount;
        return this;
    }

    /**
     * Get the RAM size of the VM on the primary side.
     *
     * @return the sourceVmRAMSizeInMB value
     */
    public Integer sourceVmRAMSizeInMB() {
        return this.sourceVmRAMSizeInMB;
    }

    /**
     * Set the RAM size of the VM on the primary side.
     *
     * @param sourceVmRAMSizeInMB the sourceVmRAMSizeInMB value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withSourceVmRAMSizeInMB(Integer sourceVmRAMSizeInMB) {
        this.sourceVmRAMSizeInMB = sourceVmRAMSizeInMB;
        return this;
    }

    /**
     * Get the OS details.
     *
     * @return the osDetails value
     */
    public OSDiskDetails osDetails() {
        return this.osDetails;
    }

    /**
     * Set the OS details.
     *
     * @param osDetails the osDetails value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withOsDetails(OSDiskDetails osDetails) {
        this.osDetails = osDetails;
        return this;
    }

    /**
     * Get the protection stage.
     *
     * @return the protectionStage value
     */
    public String protectionStage() {
        return this.protectionStage;
    }

    /**
     * Set the protection stage.
     *
     * @param protectionStage the protectionStage value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withProtectionStage(String protectionStage) {
        this.protectionStage = protectionStage;
        return this;
    }

    /**
     * Get the virtual machine Id.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the virtual machine Id.
     *
     * @param vmId the vmId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the protection state for the vm.
     *
     * @return the vmProtectionState value
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get the resync details of the machine.
     *
     * @return the resyncDetails value
     */
    public InitialReplicationDetails resyncDetails() {
        return this.resyncDetails;
    }

    /**
     * Set the resync details of the machine.
     *
     * @param resyncDetails the resyncDetails value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withResyncDetails(InitialReplicationDetails resyncDetails) {
        this.resyncDetails = resyncDetails;
        return this;
    }

    /**
     * Get the retention window start time.
     *
     * @return the retentionWindowStart value
     */
    public DateTime retentionWindowStart() {
        return this.retentionWindowStart;
    }

    /**
     * Set the retention window start time.
     *
     * @param retentionWindowStart the retentionWindowStart value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRetentionWindowStart(DateTime retentionWindowStart) {
        this.retentionWindowStart = retentionWindowStart;
        return this;
    }

    /**
     * Get the retention window end time.
     *
     * @return the retentionWindowEnd value
     */
    public DateTime retentionWindowEnd() {
        return this.retentionWindowEnd;
    }

    /**
     * Set the retention window end time.
     *
     * @param retentionWindowEnd the retentionWindowEnd value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRetentionWindowEnd(DateTime retentionWindowEnd) {
        this.retentionWindowEnd = retentionWindowEnd;
        return this;
    }

    /**
     * Get the compressed data change rate in MB.
     *
     * @return the compressedDataRateInMB value
     */
    public Double compressedDataRateInMB() {
        return this.compressedDataRateInMB;
    }

    /**
     * Set the compressed data change rate in MB.
     *
     * @param compressedDataRateInMB the compressedDataRateInMB value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withCompressedDataRateInMB(Double compressedDataRateInMB) {
        this.compressedDataRateInMB = compressedDataRateInMB;
        return this;
    }

    /**
     * Get the uncompressed data change rate in MB.
     *
     * @return the uncompressedDataRateInMB value
     */
    public Double uncompressedDataRateInMB() {
        return this.uncompressedDataRateInMB;
    }

    /**
     * Set the uncompressed data change rate in MB.
     *
     * @param uncompressedDataRateInMB the uncompressedDataRateInMB value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withUncompressedDataRateInMB(Double uncompressedDataRateInMB) {
        this.uncompressedDataRateInMB = uncompressedDataRateInMB;
        return this;
    }

    /**
     * Get the RPO in seconds.
     *
     * @return the rpoInSeconds value
     */
    public Long rpoInSeconds() {
        return this.rpoInSeconds;
    }

    /**
     * Set the RPO in seconds.
     *
     * @param rpoInSeconds the rpoInSeconds value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRpoInSeconds(Long rpoInSeconds) {
        this.rpoInSeconds = rpoInSeconds;
        return this;
    }

    /**
     * Get the list of protected disks.
     *
     * @return the protectedDisks value
     */
    public List<InMageProtectedDiskDetails> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Set the list of protected disks.
     *
     * @param protectedDisks the protectedDisks value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withProtectedDisks(List<InMageProtectedDiskDetails> protectedDisks) {
        this.protectedDisks = protectedDisks;
        return this;
    }

    /**
     * Get the source IP address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the source IP address.
     *
     * @param ipAddress the ipAddress value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the last heartbeat received from the source server.
     *
     * @return the lastHeartbeat value
     */
    public DateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the last heartbeat received from the source server.
     *
     * @param lastHeartbeat the lastHeartbeat value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withLastHeartbeat(DateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get the process server Id.
     *
     * @return the processServerId value
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the process server Id.
     *
     * @param processServerId the processServerId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the master target Id.
     *
     * @return the masterTargetId value
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the master target Id.
     *
     * @param masterTargetId the masterTargetId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the collection of Consistency points.
     *
     * @return the consistencyPoints value
     */
    public Map<String, DateTime> consistencyPoints() {
        return this.consistencyPoints;
    }

    /**
     * Set the collection of Consistency points.
     *
     * @param consistencyPoints the consistencyPoints value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withConsistencyPoints(Map<String, DateTime> consistencyPoints) {
        this.consistencyPoints = consistencyPoints;
        return this;
    }

    /**
     * Get a value indicating whether any disk is resized for this VM.
     *
     * @return the diskResized value
     */
    public String diskResized() {
        return this.diskResized;
    }

    /**
     * Set a value indicating whether any disk is resized for this VM.
     *
     * @param diskResized the diskResized value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withDiskResized(String diskResized) {
        this.diskResized = diskResized;
        return this;
    }

    /**
     * Get a value indicating whether the source server requires a restart after update.
     *
     * @return the rebootAfterUpdateStatus value
     */
    public String rebootAfterUpdateStatus() {
        return this.rebootAfterUpdateStatus;
    }

    /**
     * Set a value indicating whether the source server requires a restart after update.
     *
     * @param rebootAfterUpdateStatus the rebootAfterUpdateStatus value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRebootAfterUpdateStatus(String rebootAfterUpdateStatus) {
        this.rebootAfterUpdateStatus = rebootAfterUpdateStatus;
        return this;
    }

    /**
     * Get the multi vm group Id, if any.
     *
     * @return the multiVmGroupId value
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multi vm group Id, if any.
     *
     * @param multiVmGroupId the multiVmGroupId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the multi vm group name, if any.
     *
     * @return the multiVmGroupName value
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multi vm group name, if any.
     *
     * @param multiVmGroupName the multiVmGroupName value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get a value indicating whether the multi vm sync is enabled or disabled.
     *
     * @return the multiVmSyncStatus value
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set a value indicating whether the multi vm sync is enabled or disabled.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the agent details.
     *
     * @return the agentDetails value
     */
    public InMageAgentDetails agentDetails() {
        return this.agentDetails;
    }

    /**
     * Set the agent details.
     *
     * @param agentDetails the agentDetails value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withAgentDetails(InMageAgentDetails agentDetails) {
        this.agentDetails = agentDetails;
        return this;
    }

    /**
     * Get the vCenter infrastructure Id.
     *
     * @return the vCenterInfrastructureId value
     */
    public String vCenterInfrastructureId() {
        return this.vCenterInfrastructureId;
    }

    /**
     * Set the vCenter infrastructure Id.
     *
     * @param vCenterInfrastructureId the vCenterInfrastructureId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVCenterInfrastructureId(String vCenterInfrastructureId) {
        this.vCenterInfrastructureId = vCenterInfrastructureId;
        return this;
    }

    /**
     * Get the infrastructure VM Id.
     *
     * @return the infrastructureVmId value
     */
    public String infrastructureVmId() {
        return this.infrastructureVmId;
    }

    /**
     * Set the infrastructure VM Id.
     *
     * @param infrastructureVmId the infrastructureVmId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withInfrastructureVmId(String infrastructureVmId) {
        this.infrastructureVmId = infrastructureVmId;
        return this;
    }

    /**
     * Get the PE Network details.
     *
     * @return the vmNics value
     */
    public List<VMNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the PE Network details.
     *
     * @param vmNics the vmNics value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get a value indicating the discovery type of the machine.
     *
     * @return the discoveryType value
     */
    public String discoveryType() {
        return this.discoveryType;
    }

    /**
     * Set a value indicating the discovery type of the machine.
     *
     * @param discoveryType the discoveryType value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withDiscoveryType(String discoveryType) {
        this.discoveryType = discoveryType;
        return this;
    }

    /**
     * Get a value indicating the underlying Azure storage account. If the VM is not running in Azure, this value shall be set to null.
     *
     * @return the azureStorageAccountId value
     */
    public String azureStorageAccountId() {
        return this.azureStorageAccountId;
    }

    /**
     * Set a value indicating the underlying Azure storage account. If the VM is not running in Azure, this value shall be set to null.
     *
     * @param azureStorageAccountId the azureStorageAccountId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withAzureStorageAccountId(String azureStorageAccountId) {
        this.azureStorageAccountId = azureStorageAccountId;
        return this;
    }

    /**
     * Get the datastores of the on-premise machine Value can be list of strings that contain datastore names.
     *
     * @return the datastores value
     */
    public List<String> datastores() {
        return this.datastores;
    }

    /**
     * Set the datastores of the on-premise machine Value can be list of strings that contain datastore names.
     *
     * @param datastores the datastores value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withDatastores(List<String> datastores) {
        this.datastores = datastores;
        return this;
    }

    /**
     * Get the validation errors of the on-premise machine Value can be list of validation errors.
     *
     * @return the validationErrors value
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validation errors of the on-premise machine Value can be list of validation errors.
     *
     * @param validationErrors the validationErrors value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get the last RPO calculated time.
     *
     * @return the lastRpoCalculatedTime value
     */
    public DateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Set the last RPO calculated time.
     *
     * @param lastRpoCalculatedTime the lastRpoCalculatedTime value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withLastRpoCalculatedTime(DateTime lastRpoCalculatedTime) {
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        return this;
    }

    /**
     * Get the last update time received from on-prem components.
     *
     * @return the lastUpdateReceivedTime value
     */
    public DateTime lastUpdateReceivedTime() {
        return this.lastUpdateReceivedTime;
    }

    /**
     * Set the last update time received from on-prem components.
     *
     * @param lastUpdateReceivedTime the lastUpdateReceivedTime value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withLastUpdateReceivedTime(DateTime lastUpdateReceivedTime) {
        this.lastUpdateReceivedTime = lastUpdateReceivedTime;
        return this;
    }

    /**
     * Get the replica id of the protected item.
     *
     * @return the replicaId value
     */
    public String replicaId() {
        return this.replicaId;
    }

    /**
     * Set the replica id of the protected item.
     *
     * @param replicaId the replicaId value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

    /**
     * Get the OS Version of the protected item.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the OS Version of the protected item.
     *
     * @param osVersion the osVersion value to set
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

}
