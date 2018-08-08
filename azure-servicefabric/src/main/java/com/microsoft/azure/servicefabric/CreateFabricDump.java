/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CreateFabricDump.
 */
public final class CreateFabricDump extends ExpandableStringEnum<CreateFabricDump> {
    /** Static value False for CreateFabricDump. */
    public static final CreateFabricDump FALSE = fromString("False");

    /** Static value True for CreateFabricDump. */
    public static final CreateFabricDump TRUE = fromString("True");

    /**
     * Creates or finds a CreateFabricDump from its string representation.
     * @param name a name to look for
     * @return the corresponding CreateFabricDump
     */
    @JsonCreator
    public static CreateFabricDump fromString(String name) {
        return fromString(name, CreateFabricDump.class);
    }

    /**
     * @return known CreateFabricDump values
     */
    public static Collection<CreateFabricDump> values() {
        return values(CreateFabricDump.class);
    }
}
