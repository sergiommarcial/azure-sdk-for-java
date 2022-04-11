// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An access policy entry. */
@Fluent
public final class FhirServiceAccessPolicyEntry {
    /*
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR
     * service.
     */
    @JsonProperty(value = "objectId", required = true)
    private String objectId;

    /**
     * Get the objectId property: An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     *
     * @param objectId the objectId value to set.
     * @return the FhirServiceAccessPolicyEntry object itself.
     */
    public FhirServiceAccessPolicyEntry withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (objectId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property objectId in model FhirServiceAccessPolicyEntry"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FhirServiceAccessPolicyEntry.class);
}