/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Model for collection of notificationSettings.
 */
@JsonFlatten
public class NotificationSettingsCollectionInner extends ProxyResource {
    /**
     * Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private String notificationSettingId;

    /**
     * The name of the resource.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String notificationSettingName;

    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or
     * Microsoft.Storage/storageAccounts.
     */
    @JsonProperty(value = "properties.type", access = JsonProperty.Access.WRITE_ONLY)
    private String notificationSettingType;

    /**
     * List of action group resource ids to be notified.
     */
    @JsonProperty(value = "properties.properties.actionGroupResourceIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actionGroupResourceIds;

    /**
     * Get fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     *
     * @return the notificationSettingId value
     */
    public String notificationSettingId() {
        return this.notificationSettingId;
    }

    /**
     * Get the name of the resource.
     *
     * @return the notificationSettingName value
     */
    public String notificationSettingName() {
        return this.notificationSettingName;
    }

    /**
     * Get the type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     *
     * @return the notificationSettingType value
     */
    public String notificationSettingType() {
        return this.notificationSettingType;
    }

    /**
     * Get list of action group resource ids to be notified.
     *
     * @return the actionGroupResourceIds value
     */
    public List<String> actionGroupResourceIds() {
        return this.actionGroupResourceIds;
    }

}
