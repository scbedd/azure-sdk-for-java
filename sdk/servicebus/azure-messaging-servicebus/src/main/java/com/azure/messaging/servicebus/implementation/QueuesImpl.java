// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.messaging.servicebus.implementation.models.ServiceBusManagementErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Queues. */
public final class QueuesImpl {
    /** The proxy service used to perform REST calls. */
    private final QueuesService service;

    /** The service client containing this operation class. */
    private final ServiceBusManagementClientImpl client;

    /**
     * Initializes an instance of QueuesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QueuesImpl(ServiceBusManagementClientImpl client) {
        this.service = RestProxy.create(QueuesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceBusManagementClientQueues to be used by the proxy service to
     * perform REST calls.
     */
    @Host("https://{endpoint}")
    @ServiceInterface(name = "ServiceBusManagement")
    private interface QueuesService {
        @Get("/{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ServiceBusManagementErrorException.class)
        Mono<Response<Object>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("queueName") String queueName,
                @QueryParam("enrich") Boolean enrich,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Put("/{queueName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ServiceBusManagementErrorException.class)
        Mono<Response<Object>> put(
                @HostParam("endpoint") String endpoint,
                @PathParam("queueName") String queueName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("If-Match") String ifMatch,
                @BodyParam("application/xml") Object requestBody,
                Context context);

        @Delete("/{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ServiceBusManagementErrorException.class)
        Mono<Response<Object>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("queueName") String queueName,
                @QueryParam("api-version") String apiVersion,
                Context context);
    }

    /**
     * Get the details about the Queue with the given queueName.
     *
     * @param queueName The name of the queue relative to the Service Bus namespace.
     * @param enrich A query parameter that sets enrich to true or false.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Queue with the given queueName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getWithResponseAsync(String queueName, Boolean enrich, Context context) {
        return service.get(this.client.getEndpoint(), queueName, enrich, this.client.getApiVersion(), context);
    }

    /**
     * Create or update a queue at the provided queuePath.
     *
     * @param queueName The name of the queue relative to the Service Bus namespace.
     * @param requestBody Any object.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a replace will be performed if an
     *     existing entity is found.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> putWithResponseAsync(
            String queueName, Object requestBody, String ifMatch, Context context) {
        return service.put(
                this.client.getEndpoint(), queueName, this.client.getApiVersion(), ifMatch, requestBody, context);
    }

    /**
     * Delete the Queue with the given queueName.
     *
     * @param queueName The name of the queue relative to the Service Bus namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> deleteWithResponseAsync(String queueName, Context context) {
        return service.delete(this.client.getEndpoint(), queueName, this.client.getApiVersion(), context);
    }
}
