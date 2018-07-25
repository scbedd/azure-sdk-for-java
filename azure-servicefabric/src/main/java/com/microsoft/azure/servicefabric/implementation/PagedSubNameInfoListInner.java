/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A paged list of Service Fabric names. The list is paged when all of the
 * results cannot fit in a single message. The next set of results can be
 * obtained by executing the same query with the continuation token provided in
 * this list.
 */
public class PagedSubNameInfoListInner {
    /**
     * The continuation token parameter is used to obtain next set of results.
     * The continuation token is included in the response of the API when the
     * results from the system do not fit in a single response. When this value
     * is passed to the next API call, the API returns next set of results. If
     * there are no further results, then the continuation token is not
     * included in the response.
     */
    @JsonProperty(value = "ContinuationToken")
    private String continuationToken;

    /**
     * Indicates whether any name under the given name has been modified during
     * the enumeration. If there was a modification, this property value is
     * false.
     */
    @JsonProperty(value = "IsConsistent")
    private Boolean isConsistent;

    /**
     * List of the child names.
     */
    @JsonProperty(value = "SubNames")
    private List<String> subNames;

    /**
     * Get the continuation token parameter is used to obtain next set of results. The continuation token is included in the response of the API when the results from the system do not fit in a single response. When this value is passed to the next API call, the API returns next set of results. If there are no further results, then the continuation token is not included in the response.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuation token parameter is used to obtain next set of results. The continuation token is included in the response of the API when the results from the system do not fit in a single response. When this value is passed to the next API call, the API returns next set of results. If there are no further results, then the continuation token is not included in the response.
     *
     * @param continuationToken the continuationToken value to set
     * @return the PagedSubNameInfoListInner object itself.
     */
    public PagedSubNameInfoListInner withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get indicates whether any name under the given name has been modified during the enumeration. If there was a modification, this property value is false.
     *
     * @return the isConsistent value
     */
    public Boolean isConsistent() {
        return this.isConsistent;
    }

    /**
     * Set indicates whether any name under the given name has been modified during the enumeration. If there was a modification, this property value is false.
     *
     * @param isConsistent the isConsistent value to set
     * @return the PagedSubNameInfoListInner object itself.
     */
    public PagedSubNameInfoListInner withIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
        return this;
    }

    /**
     * Get list of the child names.
     *
     * @return the subNames value
     */
    public List<String> subNames() {
        return this.subNames;
    }

    /**
     * Set list of the child names.
     *
     * @param subNames the subNames value to set
     * @return the PagedSubNameInfoListInner object itself.
     */
    public PagedSubNameInfoListInner withSubNames(List<String> subNames) {
        this.subNames = subNames;
        return this;
    }

}
