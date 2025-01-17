// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.healthcareapis.models.Kind;
import com.azure.resourcemanager.healthcareapis.models.ServicesProperties;
import com.azure.resourcemanager.healthcareapis.models.ServicesResource;
import com.azure.resourcemanager.healthcareapis.models.ServicesResourceIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The description of the service. */
@Fluent
public final class ServicesDescriptionInner extends ServicesResource {
    /*
     * The common properties of a service.
     */
    @JsonProperty(value = "properties")
    private ServicesProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: The common properties of a service.
     *
     * @return the properties value.
     */
    public ServicesProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The common properties of a service.
     *
     * @param properties the properties value to set.
     * @return the ServicesDescriptionInner object itself.
     */
    public ServicesDescriptionInner withProperties(ServicesProperties properties) {
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

    /** {@inheritDoc} */
    @Override
    public ServicesDescriptionInner withKind(Kind kind) {
        super.withKind(kind);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServicesDescriptionInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServicesDescriptionInner withIdentity(ServicesResourceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServicesDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServicesDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
