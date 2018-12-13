/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The alert feedback details.
 */
public class AlertFeedbackInner {
    /**
     * The alert level which indicates the severity of the alert.
     */
    @JsonProperty(value = "level")
    private String level;

    /**
     * The alert state which can be either active or resolved with multiple
     * resolution types.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * The alert short name.
     */
    @JsonProperty(value = "shortName")
    private String shortName;

    /**
     * The feedback for the alert which indicates if the customer likes or
     * dislikes the alert.
     */
    @JsonProperty(value = "feedback")
    private String feedback;

    /**
     * Additional comments related to the alert.
     */
    @JsonProperty(value = "comment")
    private String comment;

    /**
     * Indicates if the alert feedback can be shared from product team.
     */
    @JsonProperty(value = "consentedToShare")
    private Boolean consentedToShare;

    /**
     * The server Id of the alert.
     */
    @JsonProperty(value = "serviceMemberId")
    private String serviceMemberId;

    /**
     * The date and time,in UTC,when the alert was created.
     */
    @JsonProperty(value = "createdDate")
    private DateTime createdDate;

    /**
     * Get the alert level which indicates the severity of the alert.
     *
     * @return the level value
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the alert level which indicates the severity of the alert.
     *
     * @param level the level value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the alert state which can be either active or resolved with multiple resolution types.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the alert state which can be either active or resolved with multiple resolution types.
     *
     * @param state the state value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the alert short name.
     *
     * @return the shortName value
     */
    public String shortName() {
        return this.shortName;
    }

    /**
     * Set the alert short name.
     *
     * @param shortName the shortName value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get the feedback for the alert which indicates if the customer likes or dislikes the alert.
     *
     * @return the feedback value
     */
    public String feedback() {
        return this.feedback;
    }

    /**
     * Set the feedback for the alert which indicates if the customer likes or dislikes the alert.
     *
     * @param feedback the feedback value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }

    /**
     * Get additional comments related to the alert.
     *
     * @return the comment value
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Set additional comments related to the alert.
     *
     * @param comment the comment value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get indicates if the alert feedback can be shared from product team.
     *
     * @return the consentedToShare value
     */
    public Boolean consentedToShare() {
        return this.consentedToShare;
    }

    /**
     * Set indicates if the alert feedback can be shared from product team.
     *
     * @param consentedToShare the consentedToShare value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withConsentedToShare(Boolean consentedToShare) {
        this.consentedToShare = consentedToShare;
        return this;
    }

    /**
     * Get the server Id of the alert.
     *
     * @return the serviceMemberId value
     */
    public String serviceMemberId() {
        return this.serviceMemberId;
    }

    /**
     * Set the server Id of the alert.
     *
     * @param serviceMemberId the serviceMemberId value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withServiceMemberId(String serviceMemberId) {
        this.serviceMemberId = serviceMemberId;
        return this;
    }

    /**
     * Get the date and time,in UTC,when the alert was created.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the date and time,in UTC,when the alert was created.
     *
     * @param createdDate the createdDate value to set
     * @return the AlertFeedbackInner object itself.
     */
    public AlertFeedbackInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
