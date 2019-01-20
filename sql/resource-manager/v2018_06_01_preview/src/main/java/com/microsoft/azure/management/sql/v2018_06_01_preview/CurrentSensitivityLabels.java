/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.SensitivityLabelInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.SqlManager;

/**
 * Type representing CurrentSensitivityLabels.
 */
public interface CurrentSensitivityLabels extends HasInner<SensitivityLabelInner>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the informationType value.
     */
    String informationType();

    /**
     * @return the labelName value.
     */
    String labelName();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
