// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The endpoint configuration for the compute node.
 */
public class ComputeNodeEndpointConfiguration {
    /**
     * The list of inbound endpoints that are accessible on the compute node.
     */
    @JsonProperty(value = "inboundEndpoints", required = true)
    private List<InboundEndpoint> inboundEndpoints;

    /**
     * Get the inboundEndpoints value.
     *
     * @return the inboundEndpoints value
     */
    public List<InboundEndpoint> inboundEndpoints() {
        return this.inboundEndpoints;
    }

    /**
     * Set the inboundEndpoints value.
     *
     * @param inboundEndpoints the inboundEndpoints value to set
     * @return the ComputeNodeEndpointConfiguration object itself.
     */
    public ComputeNodeEndpointConfiguration withInboundEndpoints(List<InboundEndpoint> inboundEndpoints) {
        this.inboundEndpoints = inboundEndpoints;
        return this;
    }

}
