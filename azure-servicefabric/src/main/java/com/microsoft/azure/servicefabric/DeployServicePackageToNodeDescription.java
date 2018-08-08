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
 * Defines description for downloading packages associated with a service
 * manifest to image cache on a Service Fabric node.
 */
public class DeployServicePackageToNodeDescription {
    /**
     * The name of service manifest whose packages need to be downloaded.
     */
    @JsonProperty(value = "ServiceManifestName", required = true)
    private String serviceManifestName;

    /**
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /**
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /**
     * List of package sharing policy information.
     */
    @JsonProperty(value = "PackageSharingPolicy")
    private List<PackageSharingPolicyInfo> packageSharingPolicy;

    /**
     * Get the name of service manifest whose packages need to be downloaded.
     *
     * @return the serviceManifestName value
     */
    public String serviceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the name of service manifest whose packages need to be downloaded.
     *
     * @param serviceManifestName the serviceManifestName value to set
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription withServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the application type name as defined in the application manifest.
     *
     * @return the applicationTypeName value
     */
    public String applicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the application type name as defined in the application manifest.
     *
     * @param applicationTypeName the applicationTypeName value to set
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription withApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the version of the application type as defined in the application manifest.
     *
     * @return the applicationTypeVersion value
     */
    public String applicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the version of the application type as defined in the application manifest.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription withApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

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
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get list of package sharing policy information.
     *
     * @return the packageSharingPolicy value
     */
    public List<PackageSharingPolicyInfo> packageSharingPolicy() {
        return this.packageSharingPolicy;
    }

    /**
     * Set list of package sharing policy information.
     *
     * @param packageSharingPolicy the packageSharingPolicy value to set
     * @return the DeployServicePackageToNodeDescription object itself.
     */
    public DeployServicePackageToNodeDescription withPackageSharingPolicy(List<PackageSharingPolicyInfo> packageSharingPolicy) {
        this.packageSharingPolicy = packageSharingPolicy;
        return this;
    }

}
