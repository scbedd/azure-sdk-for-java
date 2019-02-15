// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AllocationState.
 */
public enum AllocationState {
    /** The pool is not resizing. There are no changes to the number of nodes in the pool in progress. A pool enters this state when it is created and when no operations are being performed on the pool to change the number of nodes. */
    STEADY("steady"),

    /** The pool is resizing; that is, compute nodes are being added to or removed from the pool. */
    RESIZING("resizing"),

    /** The pool was resizing, but the user has requested that the resize be stopped, but the stop request has not yet been completed. */
    STOPPING("stopping");

    /** The actual serialized value for a AllocationState instance. */
    private String value;

    AllocationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AllocationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AllocationState object, or null if unable to parse.
     */
    @JsonCreator
    public static AllocationState fromString(String value) {
        AllocationState[] items = AllocationState.values();
        for (AllocationState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
