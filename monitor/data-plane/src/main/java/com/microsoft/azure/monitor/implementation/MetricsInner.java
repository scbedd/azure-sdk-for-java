/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.monitor.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.monitor.AzureMetricsDocument;
import com.microsoft.azure.monitor.AzureMetricsResultInnerException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Metrics.
 */
public class MetricsInner {
    /** The Retrofit service to perform REST calls. */
    private MetricsService service;
    /** The service client containing this operation class. */
    private AzureMetricsClientImpl client;

    /**
     * Initializes an instance of MetricsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricsInner(Retrofit retrofit, AzureMetricsClientImpl client) {
        this.service = retrofit.create(MetricsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Metrics to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.monitor.Metrics create" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProvider}/{resourceTypeName}/{resourceName}/metrics")
        Observable<Response<ResponseBody>> create(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceProvider") String resourceProvider, @Path("resourceTypeName") String resourceTypeName, @Path("resourceName") String resourceName, @Header("Content-Type") String contentType, @Header("Content-Length") Integer contentLength, @Body AzureMetricsDocument body, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws AzureMetricsResultInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AzureMetricsResultInner object if successful.
     */
    public AzureMetricsResultInner create(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body) {
        return createWithServiceResponseAsync(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, body).toBlocking().single().body();
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AzureMetricsResultInner> createAsync(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body, final ServiceCallback<AzureMetricsResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, body), serviceCallback);
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AzureMetricsResultInner object
     */
    public Observable<AzureMetricsResultInner> createAsync(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body) {
        return createWithServiceResponseAsync(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, body).map(new Func1<ServiceResponse<AzureMetricsResultInner>, AzureMetricsResultInner>() {
            @Override
            public AzureMetricsResultInner call(ServiceResponse<AzureMetricsResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AzureMetricsResultInner object
     */
    public Observable<ServiceResponse<AzureMetricsResultInner>> createWithServiceResponseAsync(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceProvider == null) {
            throw new IllegalArgumentException("Parameter resourceProvider is required and cannot be null.");
        }
        if (resourceTypeName == null) {
            throw new IllegalArgumentException("Parameter resourceTypeName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (body == null) {
            throw new IllegalArgumentException("Parameter body is required and cannot be null.");
        }
        Validator.validate(body);
        final String contentType = null;
        final Integer contentLength = null;
        return service.create(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, contentType, contentLength, body, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AzureMetricsResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AzureMetricsResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AzureMetricsResultInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @param contentType Supports application/json and application/x-ndjson
     * @param contentLength Content length of the payload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws AzureMetricsResultInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AzureMetricsResultInner object if successful.
     */
    public AzureMetricsResultInner create(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body, String contentType, Integer contentLength) {
        return createWithServiceResponseAsync(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, body, contentType, contentLength).toBlocking().single().body();
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @param contentType Supports application/json and application/x-ndjson
     * @param contentLength Content length of the payload
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AzureMetricsResultInner> createAsync(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body, String contentType, Integer contentLength, final ServiceCallback<AzureMetricsResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, body, contentType, contentLength), serviceCallback);
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @param contentType Supports application/json and application/x-ndjson
     * @param contentLength Content length of the payload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AzureMetricsResultInner object
     */
    public Observable<AzureMetricsResultInner> createAsync(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body, String contentType, Integer contentLength) {
        return createWithServiceResponseAsync(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, body, contentType, contentLength).map(new Func1<ServiceResponse<AzureMetricsResultInner>, AzureMetricsResultInner>() {
            @Override
            public AzureMetricsResultInner call(ServiceResponse<AzureMetricsResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Post the metric values for a resource**.
     *
     * @param subscriptionId The azure subscription id
     * @param resourceGroupName The ARM resource group name
     * @param resourceProvider The ARM resource provider name
     * @param resourceTypeName The ARM resource type name
     * @param resourceName The ARM resource name
     * @param body The Azure metrics document json payload
     * @param contentType Supports application/json and application/x-ndjson
     * @param contentLength Content length of the payload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AzureMetricsResultInner object
     */
    public Observable<ServiceResponse<AzureMetricsResultInner>> createWithServiceResponseAsync(String subscriptionId, String resourceGroupName, String resourceProvider, String resourceTypeName, String resourceName, AzureMetricsDocument body, String contentType, Integer contentLength) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceProvider == null) {
            throw new IllegalArgumentException("Parameter resourceProvider is required and cannot be null.");
        }
        if (resourceTypeName == null) {
            throw new IllegalArgumentException("Parameter resourceTypeName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (body == null) {
            throw new IllegalArgumentException("Parameter body is required and cannot be null.");
        }
        Validator.validate(body);
        return service.create(subscriptionId, resourceGroupName, resourceProvider, resourceTypeName, resourceName, contentType, contentLength, body, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AzureMetricsResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AzureMetricsResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AzureMetricsResultInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AzureMetricsResultInner> createDelegate(Response<ResponseBody> response) throws AzureMetricsResultInnerException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AzureMetricsResultInner, AzureMetricsResultInnerException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AzureMetricsResultInner>() { }.getType())
                .registerError(AzureMetricsResultInnerException.class)
                .build(response);
    }

}
