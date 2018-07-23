/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The proprties of an alert.
 */
public class AlertProperties {
    /**
     * A value indicating whether to send email to subscription administrator.
     */
    @JsonProperty(value = "sendToOwners")
    private String sendToOwners;

    /**
     * The custom email address for sending emails.
     */
    @JsonProperty(value = "customEmailAddresses")
    private List<String> customEmailAddresses;

    /**
     * The locale for the email notification.
     */
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * Get a value indicating whether to send email to subscription administrator.
     *
     * @return the sendToOwners value
     */
    public String sendToOwners() {
        return this.sendToOwners;
    }

    /**
     * Set a value indicating whether to send email to subscription administrator.
     *
     * @param sendToOwners the sendToOwners value to set
     * @return the AlertProperties object itself.
     */
    public AlertProperties withSendToOwners(String sendToOwners) {
        this.sendToOwners = sendToOwners;
        return this;
    }

    /**
     * Get the custom email address for sending emails.
     *
     * @return the customEmailAddresses value
     */
    public List<String> customEmailAddresses() {
        return this.customEmailAddresses;
    }

    /**
     * Set the custom email address for sending emails.
     *
     * @param customEmailAddresses the customEmailAddresses value to set
     * @return the AlertProperties object itself.
     */
    public AlertProperties withCustomEmailAddresses(List<String> customEmailAddresses) {
        this.customEmailAddresses = customEmailAddresses;
        return this;
    }

    /**
     * Get the locale for the email notification.
     *
     * @return the locale value
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale for the email notification.
     *
     * @param locale the locale value to set
     * @return the AlertProperties object itself.
     */
    public AlertProperties withLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
