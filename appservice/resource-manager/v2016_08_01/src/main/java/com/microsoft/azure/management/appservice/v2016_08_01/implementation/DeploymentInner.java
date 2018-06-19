/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_08_01.ProxyOnlyResource;

/**
 * User crendentials used for publishing activity.
 */
@JsonFlatten
public class DeploymentInner extends ProxyOnlyResource {
    /**
     * Identifier for deployment.
     */
    @JsonProperty(value = "properties.id")
    private String deploymentId;

    /**
     * Deployment status.
     */
    @JsonProperty(value = "properties.status")
    private Integer status;

    /**
     * Details about deployment status.
     */
    @JsonProperty(value = "properties.message")
    private String message;

    /**
     * Who authored the deployment.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * Who performed the deployment.
     */
    @JsonProperty(value = "properties.deployer")
    private String deployer;

    /**
     * Author email.
     */
    @JsonProperty(value = "properties.authorEmail")
    private String authorEmail;

    /**
     * Start time.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * End time.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * True if deployment is currently active, false if completed and null if
     * not started.
     */
    @JsonProperty(value = "properties.active")
    private Boolean active;

    /**
     * Details on deployment.
     */
    @JsonProperty(value = "properties.details")
    private String details;

    /**
     * Get identifier for deployment.
     *
     * @return the deploymentId value
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * Set identifier for deployment.
     *
     * @param deploymentId the deploymentId value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Get deployment status.
     *
     * @return the status value
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set deployment status.
     *
     * @param status the status value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get details about deployment status.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set details about deployment status.
     *
     * @param message the message value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get who authored the deployment.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set who authored the deployment.
     *
     * @param author the author value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get who performed the deployment.
     *
     * @return the deployer value
     */
    public String deployer() {
        return this.deployer;
    }

    /**
     * Set who performed the deployment.
     *
     * @param deployer the deployer value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withDeployer(String deployer) {
        this.deployer = deployer;
        return this;
    }

    /**
     * Get author email.
     *
     * @return the authorEmail value
     */
    public String authorEmail() {
        return this.authorEmail;
    }

    /**
     * Set author email.
     *
     * @param authorEmail the authorEmail value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * Get start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time.
     *
     * @param startTime the startTime value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set end time.
     *
     * @param endTime the endTime value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get true if deployment is currently active, false if completed and null if not started.
     *
     * @return the active value
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Set true if deployment is currently active, false if completed and null if not started.
     *
     * @param active the active value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get details on deployment.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set details on deployment.
     *
     * @param details the details value to set
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withDetails(String details) {
        this.details = details;
        return this;
    }

}
