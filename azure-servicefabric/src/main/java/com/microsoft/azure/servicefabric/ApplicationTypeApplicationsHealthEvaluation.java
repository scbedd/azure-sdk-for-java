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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents health evaluation for applications of a particular application
 * type. The application type applications evaluation can be returned when
 * cluster health evaluation returns unhealthy aggregated health state, either
 * Error or Warning. It contains health evaluations for each unhealthy
 * application of the included application type that impacted current
 * aggregated health state.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationTypeApplications")
public class ApplicationTypeApplicationsHealthEvaluation extends HealthEvaluation {
    /**
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeName")
    private String applicationTypeName;

    /**
     * Maximum allowed percentage of unhealthy applications for the application
     * type, specified as an entry in ApplicationTypeHealthPolicyMap.
     */
    @JsonProperty(value = "MaxPercentUnhealthyApplications")
    private Integer maxPercentUnhealthyApplications;

    /**
     * Total number of applications of the application type found in the health
     * store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /**
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation of this
     * application type that impacted the aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

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
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation withApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get maximum allowed percentage of unhealthy applications for the application type, specified as an entry in ApplicationTypeHealthPolicyMap.
     *
     * @return the maxPercentUnhealthyApplications value
     */
    public Integer maxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications;
    }

    /**
     * Set maximum allowed percentage of unhealthy applications for the application type, specified as an entry in ApplicationTypeHealthPolicyMap.
     *
     * @param maxPercentUnhealthyApplications the maxPercentUnhealthyApplications value to set
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation withMaxPercentUnhealthyApplications(Integer maxPercentUnhealthyApplications) {
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        return this;
    }

    /**
     * Get total number of applications of the application type found in the health store.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set total number of applications of the application type found in the health store.
     *
     * @param totalCount the totalCount value to set
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get list of unhealthy evaluations that led to the aggregated health state. Includes all the unhealthy ApplicationHealthEvaluation of this application type that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of unhealthy evaluations that led to the aggregated health state. Includes all the unhealthy ApplicationHealthEvaluation of this application type that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}
