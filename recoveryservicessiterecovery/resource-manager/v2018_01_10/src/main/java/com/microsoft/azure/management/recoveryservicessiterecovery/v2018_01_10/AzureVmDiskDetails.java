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
 * Disk details for E2A provider.
 */
public class AzureVmDiskDetails {
    /**
     * VHD type.
     */
    @JsonProperty(value = "vhdType")
    private String vhdType;

    /**
     * The VHD id.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /**
     * VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /**
     * Max side in MB.
     */
    @JsonProperty(value = "maxSizeMB")
    private String maxSizeMB;

    /**
     * Blob uri of the Azure disk.
     */
    @JsonProperty(value = "targetDiskLocation")
    private String targetDiskLocation;

    /**
     * The target Azure disk name.
     */
    @JsonProperty(value = "targetDiskName")
    private String targetDiskName;

    /**
     * Ordinal\LunId of the disk for the Azure VM.
     */
    @JsonProperty(value = "lunId")
    private String lunId;

    /**
     * Get vHD type.
     *
     * @return the vhdType value
     */
    public String vhdType() {
        return this.vhdType;
    }

    /**
     * Set vHD type.
     *
     * @param vhdType the vhdType value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdType(String vhdType) {
        this.vhdType = vhdType;
        return this;
    }

    /**
     * Get the VHD id.
     *
     * @return the vhdId value
     */
    public String vhdId() {
        return this.vhdId;
    }

    /**
     * Set the VHD id.
     *
     * @param vhdId the vhdId value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get vHD name.
     *
     * @return the vhdName value
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set vHD name.
     *
     * @param vhdName the vhdName value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
        return this;
    }

    /**
     * Get max side in MB.
     *
     * @return the maxSizeMB value
     */
    public String maxSizeMB() {
        return this.maxSizeMB;
    }

    /**
     * Set max side in MB.
     *
     * @param maxSizeMB the maxSizeMB value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withMaxSizeMB(String maxSizeMB) {
        this.maxSizeMB = maxSizeMB;
        return this;
    }

    /**
     * Get blob uri of the Azure disk.
     *
     * @return the targetDiskLocation value
     */
    public String targetDiskLocation() {
        return this.targetDiskLocation;
    }

    /**
     * Set blob uri of the Azure disk.
     *
     * @param targetDiskLocation the targetDiskLocation value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withTargetDiskLocation(String targetDiskLocation) {
        this.targetDiskLocation = targetDiskLocation;
        return this;
    }

    /**
     * Get the target Azure disk name.
     *
     * @return the targetDiskName value
     */
    public String targetDiskName() {
        return this.targetDiskName;
    }

    /**
     * Set the target Azure disk name.
     *
     * @param targetDiskName the targetDiskName value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withTargetDiskName(String targetDiskName) {
        this.targetDiskName = targetDiskName;
        return this;
    }

    /**
     * Get ordinal\LunId of the disk for the Azure VM.
     *
     * @return the lunId value
     */
    public String lunId() {
        return this.lunId;
    }

    /**
     * Set ordinal\LunId of the disk for the Azure VM.
     *
     * @param lunId the lunId value to set
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withLunId(String lunId) {
        this.lunId = lunId;
        return this;
    }

}
