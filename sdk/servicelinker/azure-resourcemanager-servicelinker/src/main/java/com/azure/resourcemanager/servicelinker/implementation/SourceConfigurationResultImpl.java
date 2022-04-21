// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.implementation;

import com.azure.resourcemanager.servicelinker.fluent.models.SourceConfigurationResultInner;
import com.azure.resourcemanager.servicelinker.models.SourceConfiguration;
import com.azure.resourcemanager.servicelinker.models.SourceConfigurationResult;
import java.util.Collections;
import java.util.List;

public final class SourceConfigurationResultImpl implements SourceConfigurationResult {
    private SourceConfigurationResultInner innerObject;

    private final com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager;

    SourceConfigurationResultImpl(
        SourceConfigurationResultInner innerObject,
        com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SourceConfiguration> configurations() {
        List<SourceConfiguration> inner = this.innerModel().configurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SourceConfigurationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager() {
        return this.serviceManager;
    }
}