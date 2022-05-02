// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IsCustomizable. */
public final class IsCustomizable extends ExpandableStringEnum<IsCustomizable> {
    /** Static value false for IsCustomizable. */
    public static final IsCustomizable FALSE = fromString("false");

    /** Static value true for IsCustomizable. */
    public static final IsCustomizable TRUE = fromString("true");

    /**
     * Creates or finds a IsCustomizable from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IsCustomizable.
     */
    @JsonCreator
    public static IsCustomizable fromString(String name) {
        return fromString(name, IsCustomizable.class);
    }

    /**
     * Gets known IsCustomizable values.
     *
     * @return known IsCustomizable values.
     */
    public static Collection<IsCustomizable> values() {
        return values(IsCustomizable.class);
    }
}