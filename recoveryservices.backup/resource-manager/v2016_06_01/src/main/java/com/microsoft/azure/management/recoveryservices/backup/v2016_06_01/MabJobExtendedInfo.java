/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information for the Azure Backup Server workload-specific job.
 */
public class MabJobExtendedInfo {
    /**
     * List of tasks for this job.
     */
    @JsonProperty(value = "tasksList")
    private List<MabJobTaskDetails> tasksList;

    /**
     * The job properties.
     */
    @JsonProperty(value = "propertyBag")
    private Map<String, String> propertyBag;

    /**
     * Non-localized error message specific to this job.
     */
    @JsonProperty(value = "dynamicErrorMessage")
    private String dynamicErrorMessage;

    /**
     * Get list of tasks for this job.
     *
     * @return the tasksList value
     */
    public List<MabJobTaskDetails> tasksList() {
        return this.tasksList;
    }

    /**
     * Set list of tasks for this job.
     *
     * @param tasksList the tasksList value to set
     * @return the MabJobExtendedInfo object itself.
     */
    public MabJobExtendedInfo withTasksList(List<MabJobTaskDetails> tasksList) {
        this.tasksList = tasksList;
        return this;
    }

    /**
     * Get the job properties.
     *
     * @return the propertyBag value
     */
    public Map<String, String> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Set the job properties.
     *
     * @param propertyBag the propertyBag value to set
     * @return the MabJobExtendedInfo object itself.
     */
    public MabJobExtendedInfo withPropertyBag(Map<String, String> propertyBag) {
        this.propertyBag = propertyBag;
        return this;
    }

    /**
     * Get non-localized error message specific to this job.
     *
     * @return the dynamicErrorMessage value
     */
    public String dynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    /**
     * Set non-localized error message specific to this job.
     *
     * @param dynamicErrorMessage the dynamicErrorMessage value to set
     * @return the MabJobExtendedInfo object itself.
     */
    public MabJobExtendedInfo withDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }

}
