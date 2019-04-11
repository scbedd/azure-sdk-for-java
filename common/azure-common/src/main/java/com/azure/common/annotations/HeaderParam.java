// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Replaces the header with the value of its target. The value specified here replaces headers specified statically in
 * the {@link Headers}. If the parameter this annotation is attached to is a Map type, then this will be treated as a
 * header collection. In that case each of the entries in the argument's map will be individual header values that use
 * the value of this annotation as a prefix to their key/header name.
 *
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * {@code @PUT("{functionId}")}
 * {@code Mono<RestResponseBase<Headers, Body>>} createOrReplace(@PathParam("functionId", encoded = true) String functionId, @BodyParam FunctionInner function, @HeaderParam("If-Match") String ifMatch);</pre>
 *
 * <p>"If-Match: user passed value" will show up as one of the headers.</p>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * {@code @}GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceBus/namespaces")
 * {@code Mono<RestResponseBase<Headers, Body>>} list(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);</pre>
 *
 * <p>"accept-language" generated by the HTTP client will be overwritten by the user passed value.</p>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * {@code @GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceBus/namespaces")}
 * {@code Mono<RestResponseBase<Headers, Body>>} list(@Path("subscriptionId") String subscriptionId, @Header("Authorization") String token);</pre>
 *
 * <p>The token parameter will replace the effect of any credentials in the HTTP pipeline.</p>
 *
 * <p><strong>Example 4:</strong></p>
 *
 * <pre>
 * {@code @PUT("{containerName}/{blob}")}
 * {@code @ExpectedResponses({200})}
 * {@code Mono<RestResponseBase<BlobSetMetadataHeaders, Void>> setMetadata(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") String ifModifiedSince, @HeaderParam("If-Unmodified-Since") String ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatches, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp);}</pre>
 *
 * <p>The metadata parameter will be expanded out so that each entry becomes
 * "x-ms-meta-{@literal <entryKey>}: {@literal <entryValue>}".</p>
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface HeaderParam {
    /**
     * The name of the variable in the endpoint uri template which will be replaced with the value
     * of the parameter annotated with this annotation.
     * @return The name of the variable in the endpoint uri template which will be replaced with the
     *      value of the parameter annotated with this annotation.
     */
    String value();
}
