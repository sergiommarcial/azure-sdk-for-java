// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.models.ApiPortalCustomDomainProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Custom domain of the API portal. */
@Fluent
public final class ApiPortalCustomDomainResourceInner extends ProxyResource {
    /*
     * The properties of custom domain for API portal
     */
    @JsonProperty(value = "properties")
    private ApiPortalCustomDomainProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: The properties of custom domain for API portal.
     *
     * @return the properties value.
     */
    public ApiPortalCustomDomainProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of custom domain for API portal.
     *
     * @param properties the properties value to set.
     * @return the ApiPortalCustomDomainResourceInner object itself.
     */
    public ApiPortalCustomDomainResourceInner withProperties(ApiPortalCustomDomainProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}