/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about a node that was targeted by a user-induced
 * operation.
 */
public class NodeResult {
    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /**
     * The node instance id.
     */
    @JsonProperty(value = "NodeInstanceId")
    private String nodeInstanceId;

    /**
     * Get the name of a Service Fabric node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set
     * @return the NodeResult object itself.
     */
    public NodeResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the node instance id.
     *
     * @return the nodeInstanceId value
     */
    public String nodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set the node instance id.
     *
     * @param nodeInstanceId the nodeInstanceId value to set
     * @return the NodeResult object itself.
     */
    public NodeResult withNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

}
