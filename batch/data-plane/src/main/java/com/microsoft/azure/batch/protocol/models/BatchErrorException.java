// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.microsoft.rest.RestException;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with BatchError information.
 */
public class BatchErrorException extends RestException {
    /**
     * Initializes a new instance of the BatchErrorException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public BatchErrorException(final String message, final Response<ResponseBody> response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the BatchErrorException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public BatchErrorException(final String message, final Response<ResponseBody> response, final BatchError body) {
        super(message, response, body);
    }

    @Override
    public BatchError body() {
        return (BatchError) super.body();
    }
}
