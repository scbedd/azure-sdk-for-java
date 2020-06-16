// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides parameter values to a tag scoring function.
 */
@Fluent
public final class TagScoringParameters {
    /*
     * The name of the parameter passed in search queries to specify the list
     * of tags to compare against the target field.
     */
    @JsonProperty(value = "tagsParameter", required = true)
    private String tagsParameter;

    /**
     * Get the tagsParameter property: The name of the parameter passed in
     * search queries to specify the list of tags to compare against the target
     * field.
     *
     * @return the tagsParameter value.
     */
    public String getTagsParameter() {
        return this.tagsParameter;
    }

    /**
     * Set the tagsParameter property: The name of the parameter passed in
     * search queries to specify the list of tags to compare against the target
     * field.
     *
     * @param tagsParameter the tagsParameter value to set.
     * @return the TagScoringParameters object itself.
     */
    public TagScoringParameters setTagsParameter(String tagsParameter) {
        this.tagsParameter = tagsParameter;
        return this;
    }
}
