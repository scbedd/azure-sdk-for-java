/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the application health policy map used to evaluate the health of an
 * application or one of its children entities.
 */
public class ApplicationHealthPolicies {
    /**
     * The wrapper that contains the map with application health policies used
     * to evaluate specific applications in the cluster.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap;

    /**
     * Get the wrapper that contains the map with application health policies used to evaluate specific applications in the cluster.
     *
     * @return the applicationHealthPolicyMap value
     */
    public List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set the wrapper that contains the map with application health policies used to evaluate specific applications in the cluster.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set
     * @return the ApplicationHealthPolicies object itself.
     */
    public ApplicationHealthPolicies withApplicationHealthPolicyMap(List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }

}
