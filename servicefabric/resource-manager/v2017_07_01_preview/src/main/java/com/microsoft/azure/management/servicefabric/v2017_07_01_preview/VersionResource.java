/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.VersionResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.ServiceFabricManager;
import java.util.List;

/**
 * Type representing VersionResource.
 */
public interface VersionResource extends HasInner<VersionResourceInner>, Indexable, Refreshable<VersionResource>, Updatable<VersionResource.Update>, HasManager<ServiceFabricManager> {
    /**
     * @return the appPackageUrl value.
     */
    String appPackageUrl();

    /**
     * @return the defaultParameterList value.
     */
    List<ApplicationParameter> defaultParameterList();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the VersionResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApplicationType, DefinitionStages.WithApiVersion, DefinitionStages.WithAppPackageUrl, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VersionResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VersionResource definition.
         */
        interface Blank extends WithApplicationType {
        }

        /**
         * The stage of the versionresource definition allowing to specify ApplicationType.
         */
        interface WithApplicationType {
           /**
            * Specifies subscriptionId, resourceGroupName, clusterName, applicationTypeName.
            * @param subscriptionId The customer subscription identifier
            * @param resourceGroupName The name of the resource group
            * @param clusterName The name of the cluster resource
            * @param applicationTypeName The name of the application type name resource
            * @return the next definition stage
            */
            WithApiVersion withExistingApplicationType(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName);
        }

        /**
         * The stage of the versionresource definition allowing to specify ApiVersion.
         */
        interface WithApiVersion {
           /**
            * Specifies apiVersion.
            * @param apiVersion The version of the API
            * @return the next definition stage
            */
            WithAppPackageUrl withApiVersion(String apiVersion);
        }

        /**
         * The stage of the versionresource definition allowing to specify AppPackageUrl.
         */
        interface WithAppPackageUrl {
           /**
            * Specifies appPackageUrl.
            * @param appPackageUrl The URL to the application package
            * @return the next definition stage
            */
            WithLocation withAppPackageUrl(String appPackageUrl);
        }

        /**
         * The stage of the versionresource definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VersionResource> {
        }
    }
    /**
     * The template for a VersionResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VersionResource>, UpdateStages.WithApiVersion {
    }

    /**
     * Grouping of VersionResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the versionresource update allowing to specify ApiVersion.
         */
        interface WithApiVersion {
            /**
             * Specifies apiVersion.
             * @param apiVersion The version of the API
             * @return the next update stage
             */
            Update withApiVersion(String apiVersion);
        }

    }
}
