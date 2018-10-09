/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow trigger history filter.
 */
public class WorkflowTriggerHistoryFilter {
    /**
     * The status of workflow trigger history. Possible values include:
     * 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped',
     * 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted',
     * 'Ignored'.
     */
    @JsonProperty(value = "status")
    private WorkflowStatus status;

    /**
     * Get the status of workflow trigger history. Possible values include: 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Set the status of workflow trigger history. Possible values include: 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     *
     * @param status the status value to set
     * @return the WorkflowTriggerHistoryFilter object itself.
     */
    public WorkflowTriggerHistoryFilter withStatus(WorkflowStatus status) {
        this.status = status;
        return this;
    }

}
