/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServicePlanInner;

/**
 * Type representing AppServicePlan.
 */
public interface AppServicePlan extends HasInner<AppServicePlanInner>, Resource, GroupableResourceCore<CertificateRegistrationManager, AppServicePlanInner>, HasResourceGroup, Refreshable<AppServicePlan>, Updatable<AppServicePlan.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the adminSiteName value.
     */
    String adminSiteName();

    /**
     * @return the freeOfferExpirationTime value.
     */
    DateTime freeOfferExpirationTime();

    /**
     * @return the geoRegion value.
     */
    String geoRegion();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the hyperV value.
     */
    Boolean hyperV();

    /**
     * @return the isSpot value.
     */
    Boolean isSpot();

    /**
     * @return the isXenon value.
     */
    Boolean isXenon();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the maximumElasticWorkerCount value.
     */
    Integer maximumElasticWorkerCount();

    /**
     * @return the maximumNumberOfWorkers value.
     */
    Integer maximumNumberOfWorkers();

    /**
     * @return the numberOfSites value.
     */
    Integer numberOfSites();

    /**
     * @return the perSiteScaling value.
     */
    Boolean perSiteScaling();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * @return the spotExpirationTime value.
     */
    DateTime spotExpirationTime();

    /**
     * @return the status value.
     */
    StatusOptions status();

    /**
     * @return the subscription value.
     */
    String subscription();

    /**
     * @return the targetWorkerCount value.
     */
    Integer targetWorkerCount();

    /**
     * @return the targetWorkerSizeId value.
     */
    Integer targetWorkerSizeId();

    /**
     * @return the workerTierName value.
     */
    String workerTierName();

    /**
     * The entirety of the AppServicePlan definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AppServicePlan definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AppServicePlan definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AppServicePlan definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the appserviceplan definition allowing to specify AdminSiteName.
         */
        interface WithAdminSiteName {
            /**
             * Specifies adminSiteName.
             * @param adminSiteName App Service plan administration site
             * @return the next definition stage
             */
            WithCreate withAdminSiteName(String adminSiteName);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify FreeOfferExpirationTime.
         */
        interface WithFreeOfferExpirationTime {
            /**
             * Specifies freeOfferExpirationTime.
             * @param freeOfferExpirationTime The time when the server farm free offer expires
             * @return the next definition stage
             */
            WithCreate withFreeOfferExpirationTime(DateTime freeOfferExpirationTime);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             * @param hostingEnvironmentProfile Specification for the App Service Environment to use for the App Service plan
             * @return the next definition stage
             */
            WithCreate withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify HyperV.
         */
        interface WithHyperV {
            /**
             * Specifies hyperV.
             * @param hyperV If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise
             * @return the next definition stage
             */
            WithCreate withHyperV(Boolean hyperV);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify IsSpot.
         */
        interface WithIsSpot {
            /**
             * Specifies isSpot.
             * @param isSpot If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances
             * @return the next definition stage
             */
            WithCreate withIsSpot(Boolean isSpot);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             * @param isXenon Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise
             * @return the next definition stage
             */
            WithCreate withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify MaximumElasticWorkerCount.
         */
        interface WithMaximumElasticWorkerCount {
            /**
             * Specifies maximumElasticWorkerCount.
             * @param maximumElasticWorkerCount Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
             * @return the next definition stage
             */
            WithCreate withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify PerSiteScaling.
         */
        interface WithPerSiteScaling {
            /**
             * Specifies perSiteScaling.
             * @param perSiteScaling If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
 If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan
             * @return the next definition stage
             */
            WithCreate withPerSiteScaling(Boolean perSiteScaling);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             * @param reserved If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise
             * @return the next definition stage
             */
            WithCreate withReserved(Boolean reserved);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(SkuDescription sku);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify SpotExpirationTime.
         */
        interface WithSpotExpirationTime {
            /**
             * Specifies spotExpirationTime.
             * @param spotExpirationTime The time when the server farm expires. Valid only if it is a spot server farm
             * @return the next definition stage
             */
            WithCreate withSpotExpirationTime(DateTime spotExpirationTime);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify TargetWorkerCount.
         */
        interface WithTargetWorkerCount {
            /**
             * Specifies targetWorkerCount.
             * @param targetWorkerCount Scaling worker count
             * @return the next definition stage
             */
            WithCreate withTargetWorkerCount(Integer targetWorkerCount);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify TargetWorkerSizeId.
         */
        interface WithTargetWorkerSizeId {
            /**
             * Specifies targetWorkerSizeId.
             * @param targetWorkerSizeId Scaling worker size ID
             * @return the next definition stage
             */
            WithCreate withTargetWorkerSizeId(Integer targetWorkerSizeId);
        }

        /**
         * The stage of the appserviceplan definition allowing to specify WorkerTierName.
         */
        interface WithWorkerTierName {
            /**
             * Specifies workerTierName.
             * @param workerTierName Target worker tier assigned to the App Service plan
             * @return the next definition stage
             */
            WithCreate withWorkerTierName(String workerTierName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AppServicePlan>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdminSiteName, DefinitionStages.WithFreeOfferExpirationTime, DefinitionStages.WithHostingEnvironmentProfile, DefinitionStages.WithHyperV, DefinitionStages.WithIsSpot, DefinitionStages.WithIsXenon, DefinitionStages.WithKind, DefinitionStages.WithMaximumElasticWorkerCount, DefinitionStages.WithPerSiteScaling, DefinitionStages.WithReserved, DefinitionStages.WithSku, DefinitionStages.WithSpotExpirationTime, DefinitionStages.WithTargetWorkerCount, DefinitionStages.WithTargetWorkerSizeId, DefinitionStages.WithWorkerTierName {
        }
    }
    /**
     * The template for a AppServicePlan update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AppServicePlan>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdminSiteName, UpdateStages.WithFreeOfferExpirationTime, UpdateStages.WithHostingEnvironmentProfile, UpdateStages.WithHyperV, UpdateStages.WithIsSpot, UpdateStages.WithIsXenon, UpdateStages.WithKind, UpdateStages.WithMaximumElasticWorkerCount, UpdateStages.WithPerSiteScaling, UpdateStages.WithReserved, UpdateStages.WithSpotExpirationTime, UpdateStages.WithTargetWorkerCount, UpdateStages.WithTargetWorkerSizeId, UpdateStages.WithWorkerTierName {
    }

    /**
     * Grouping of AppServicePlan update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the appserviceplan update allowing to specify AdminSiteName.
         */
        interface WithAdminSiteName {
            /**
             * Specifies adminSiteName.
             * @param adminSiteName App Service plan administration site
             * @return the next update stage
             */
            Update withAdminSiteName(String adminSiteName);
        }

        /**
         * The stage of the appserviceplan update allowing to specify FreeOfferExpirationTime.
         */
        interface WithFreeOfferExpirationTime {
            /**
             * Specifies freeOfferExpirationTime.
             * @param freeOfferExpirationTime The time when the server farm free offer expires
             * @return the next update stage
             */
            Update withFreeOfferExpirationTime(DateTime freeOfferExpirationTime);
        }

        /**
         * The stage of the appserviceplan update allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             * @param hostingEnvironmentProfile Specification for the App Service Environment to use for the App Service plan
             * @return the next update stage
             */
            Update withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the appserviceplan update allowing to specify HyperV.
         */
        interface WithHyperV {
            /**
             * Specifies hyperV.
             * @param hyperV If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise
             * @return the next update stage
             */
            Update withHyperV(Boolean hyperV);
        }

        /**
         * The stage of the appserviceplan update allowing to specify IsSpot.
         */
        interface WithIsSpot {
            /**
             * Specifies isSpot.
             * @param isSpot If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances
             * @return the next update stage
             */
            Update withIsSpot(Boolean isSpot);
        }

        /**
         * The stage of the appserviceplan update allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             * @param isXenon Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise
             * @return the next update stage
             */
            Update withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the appserviceplan update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the appserviceplan update allowing to specify MaximumElasticWorkerCount.
         */
        interface WithMaximumElasticWorkerCount {
            /**
             * Specifies maximumElasticWorkerCount.
             * @param maximumElasticWorkerCount Maximum number of total workers allowed for this ElasticScaleEnabled App Service Plan
             * @return the next update stage
             */
            Update withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount);
        }

        /**
         * The stage of the appserviceplan update allowing to specify PerSiteScaling.
         */
        interface WithPerSiteScaling {
            /**
             * Specifies perSiteScaling.
             * @param perSiteScaling If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
 If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan
             * @return the next update stage
             */
            Update withPerSiteScaling(Boolean perSiteScaling);
        }

        /**
         * The stage of the appserviceplan update allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             * @param reserved If Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise
             * @return the next update stage
             */
            Update withReserved(Boolean reserved);
        }

        /**
         * The stage of the appserviceplan update allowing to specify SpotExpirationTime.
         */
        interface WithSpotExpirationTime {
            /**
             * Specifies spotExpirationTime.
             * @param spotExpirationTime The time when the server farm expires. Valid only if it is a spot server farm
             * @return the next update stage
             */
            Update withSpotExpirationTime(DateTime spotExpirationTime);
        }

        /**
         * The stage of the appserviceplan update allowing to specify TargetWorkerCount.
         */
        interface WithTargetWorkerCount {
            /**
             * Specifies targetWorkerCount.
             * @param targetWorkerCount Scaling worker count
             * @return the next update stage
             */
            Update withTargetWorkerCount(Integer targetWorkerCount);
        }

        /**
         * The stage of the appserviceplan update allowing to specify TargetWorkerSizeId.
         */
        interface WithTargetWorkerSizeId {
            /**
             * Specifies targetWorkerSizeId.
             * @param targetWorkerSizeId Scaling worker size ID
             * @return the next update stage
             */
            Update withTargetWorkerSizeId(Integer targetWorkerSizeId);
        }

        /**
         * The stage of the appserviceplan update allowing to specify WorkerTierName.
         */
        interface WithWorkerTierName {
            /**
             * Specifies workerTierName.
             * @param workerTierName Target worker tier assigned to the App Service plan
             * @return the next update stage
             */
            Update withWorkerTierName(String workerTierName);
        }

    }
}
