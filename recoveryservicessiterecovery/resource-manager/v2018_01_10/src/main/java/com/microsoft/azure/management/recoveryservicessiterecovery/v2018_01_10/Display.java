/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the localized display information for this particular operation /
 * action. These value will be used by several clients for (1) custom role
 * definitions for RBAC; (2) complex query filters for the event service; and
 * (3) audit history / records for management operations.
 */
public class Display {
    /**
     * The provider. The localized friendly form of the resource provider name
     * – it is expected to also include the publisher/company responsible. It
     * should use Title Casing and begin with "Microsoft" for 1st party
     * services. e.g. "Microsoft Monitoring Insights" or "Microsoft Compute.".
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The resource. The localized friendly form of the resource related to
     * this action/operation – it should match the public documentation for the
     * resource provider. It should use Title Casing. This value should be
     * unique for a particular URL type (e.g. nested types should *not* reuse
     * their parent’s display.resource field). e.g. "Virtual Machines" or
     * "Scheduler Job Collections", or "Virtual Machine VM Sizes" or "Scheduler
     * Jobs".
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The operation. The localized friendly name for the operation, as it
     * should be shown to the user. It should be concise (to fit in drop downs)
     * but clear (i.e. self-documenting). It should use Title Casing.
     * Prescriptive guidance: Read Create or Update Delete 'ActionName'.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The description. The localized friendly description for the operation,
     * as it should be shown to the user. It should be thorough, yet concise –
     * it will be used in tool tips and detailed views. Prescriptive guidance
     * for namespaces: Read any 'display.provider' resource Create or Update
     * any 'display.provider' resource Delete any 'display.provider' resource
     * Perform any other action on any 'display.provider' resource Prescriptive
     * guidance for namespaces: Read any 'display.resource' Create or Update
     * any 'display.resource' Delete any 'display.resource' 'ActionName' any
     * 'display.resources'.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider. The localized friendly form of the resource provider name – it is expected to also include the publisher/company responsible. It should use Title Casing and begin with "Microsoft" for 1st party services. e.g. "Microsoft Monitoring Insights" or "Microsoft Compute.".
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider. The localized friendly form of the resource provider name – it is expected to also include the publisher/company responsible. It should use Title Casing and begin with "Microsoft" for 1st party services. e.g. "Microsoft Monitoring Insights" or "Microsoft Compute.".
     *
     * @param provider the provider value to set
     * @return the Display object itself.
     */
    public Display withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource. The localized friendly form of the resource related to this action/operation – it should match the public documentation for the resource provider. It should use Title Casing. This value should be unique for a particular URL type (e.g. nested types should *not* reuse their parent’s display.resource field). e.g. "Virtual Machines" or "Scheduler Job Collections", or "Virtual Machine VM Sizes" or "Scheduler Jobs".
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource. The localized friendly form of the resource related to this action/operation – it should match the public documentation for the resource provider. It should use Title Casing. This value should be unique for a particular URL type (e.g. nested types should *not* reuse their parent’s display.resource field). e.g. "Virtual Machines" or "Scheduler Job Collections", or "Virtual Machine VM Sizes" or "Scheduler Jobs".
     *
     * @param resource the resource value to set
     * @return the Display object itself.
     */
    public Display withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation. The localized friendly name for the operation, as it should be shown to the user. It should be concise (to fit in drop downs) but clear (i.e. self-documenting). It should use Title Casing. Prescriptive guidance: Read Create or Update Delete 'ActionName'.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation. The localized friendly name for the operation, as it should be shown to the user. It should be concise (to fit in drop downs) but clear (i.e. self-documenting). It should use Title Casing. Prescriptive guidance: Read Create or Update Delete 'ActionName'.
     *
     * @param operation the operation value to set
     * @return the Display object itself.
     */
    public Display withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description. The localized friendly description for the operation, as it should be shown to the user. It should be thorough, yet concise – it will be used in tool tips and detailed views. Prescriptive guidance for namespaces: Read any 'display.provider' resource Create or Update any 'display.provider' resource Delete any 'display.provider' resource Perform any other action on any 'display.provider' resource Prescriptive guidance for namespaces: Read any 'display.resource' Create or Update any 'display.resource' Delete any 'display.resource' 'ActionName' any 'display.resources'.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description. The localized friendly description for the operation, as it should be shown to the user. It should be thorough, yet concise – it will be used in tool tips and detailed views. Prescriptive guidance for namespaces: Read any 'display.provider' resource Create or Update any 'display.provider' resource Delete any 'display.provider' resource Perform any other action on any 'display.provider' resource Prescriptive guidance for namespaces: Read any 'display.resource' Create or Update any 'display.resource' Delete any 'display.resource' 'ActionName' any 'display.resources'.
     *
     * @param description the description value to set
     * @return the Display object itself.
     */
    public Display withDescription(String description) {
        this.description = description;
        return this;
    }

}
