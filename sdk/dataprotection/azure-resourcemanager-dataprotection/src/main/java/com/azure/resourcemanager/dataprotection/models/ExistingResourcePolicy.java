// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets or sets the Conflict Policy property. This property sets policy during conflict of resources during restore. */
public final class ExistingResourcePolicy extends ExpandableStringEnum<ExistingResourcePolicy> {
    /** Static value Skip for ExistingResourcePolicy. */
    public static final ExistingResourcePolicy SKIP = fromString("Skip");

    /** Static value Patch for ExistingResourcePolicy. */
    public static final ExistingResourcePolicy PATCH = fromString("Patch");

    /**
     * Creates a new instance of ExistingResourcePolicy value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExistingResourcePolicy() {
    }

    /**
     * Creates or finds a ExistingResourcePolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExistingResourcePolicy.
     */
    @JsonCreator
    public static ExistingResourcePolicy fromString(String name) {
        return fromString(name, ExistingResourcePolicy.class);
    }

    /**
     * Gets known ExistingResourcePolicy values.
     *
     * @return known ExistingResourcePolicy values.
     */
    public static Collection<ExistingResourcePolicy> values() {
        return values(ExistingResourcePolicy.class);
    }
}
