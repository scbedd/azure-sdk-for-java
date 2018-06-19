/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The child information of a management group.
 */
public class ManagementGroupChildInfo {
    /**
     * The type of child resource.
     * The fully qualified resource type which includes provider namespace
     * (e.g. /providers/Microsoft.Management/managementGroups). Possible values
     * include: '/providers/Microsoft.Management/managementGroups',
     * '/subscriptions'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The fully qualified ID for the child resource (management group or
     * subscription).  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the child entity.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The friendly name of the child resource.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The roles definitions associated with the management group.
     */
    @JsonProperty(value = "roles")
    private List<String> roles;

    /**
     * The list of children.
     */
    @JsonProperty(value = "children")
    private List<ManagementGroupChildInfo> children;

    /**
     * Get the fully qualified resource type which includes provider namespace (e.g. /providers/Microsoft.Management/managementGroups). Possible values include: '/providers/Microsoft.Management/managementGroups', '/subscriptions'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the fully qualified resource type which includes provider namespace (e.g. /providers/Microsoft.Management/managementGroups). Possible values include: '/providers/Microsoft.Management/managementGroups', '/subscriptions'.
     *
     * @param type the type value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param id the id value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the child entity.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the child entity.
     *
     * @param name the name value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the friendly name of the child resource.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the child resource.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the roles definitions associated with the management group.
     *
     * @return the roles value
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles definitions associated with the management group.
     *
     * @param roles the roles value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the list of children.
     *
     * @return the children value
     */
    public List<ManagementGroupChildInfo> children() {
        return this.children;
    }

    /**
     * Set the list of children.
     *
     * @param children the children value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withChildren(List<ManagementGroupChildInfo> children) {
        this.children = children;
        return this;
    }

}
