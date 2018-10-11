/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.OperationDetail;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final DeploymentManagerManager manager;

    OperationImpl(OperationInner inner,  DeploymentManagerManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DeploymentManagerManager manager() {
        return this.manager;
    }



    @Override
    public OperationDetail display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public Object properties() {
        return this.inner().properties();
    }

}
