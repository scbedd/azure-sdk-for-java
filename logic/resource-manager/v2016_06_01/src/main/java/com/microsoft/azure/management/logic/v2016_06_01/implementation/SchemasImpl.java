/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.Schemas;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2016_06_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountSchema;

class SchemasImpl extends WrapperImpl<SchemasInner> implements Schemas {
    private final LogicManager manager;

    SchemasImpl(LogicManager manager) {
        super(manager.inner().schemas());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountSchemaImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountSchemaImpl wrapModel(IntegrationAccountSchemaInner inner) {
        return  new IntegrationAccountSchemaImpl(inner, manager());
    }

    private IntegrationAccountSchemaImpl wrapModel(String name) {
        return new IntegrationAccountSchemaImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String schemaName, GetCallbackUrlParameters listContentCallbackUrl) {
        SchemasInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, schemaName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationAccountSchema> listByIntegrationAccountsAsync(final String resourceGroupName, final String integrationAccountName) {
        SchemasInner client = this.inner();
        return client.listByIntegrationAccountsAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountSchemaInner>, Iterable<IntegrationAccountSchemaInner>>() {
            @Override
            public Iterable<IntegrationAccountSchemaInner> call(Page<IntegrationAccountSchemaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountSchemaInner, IntegrationAccountSchema>() {
            @Override
            public IntegrationAccountSchema call(IntegrationAccountSchemaInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountSchema> getAsync(String resourceGroupName, String integrationAccountName, String schemaName) {
        SchemasInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, schemaName)
        .map(new Func1<IntegrationAccountSchemaInner, IntegrationAccountSchema>() {
            @Override
            public IntegrationAccountSchema call(IntegrationAccountSchemaInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String schemaName) {
        SchemasInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, schemaName).toCompletable();
    }

}
