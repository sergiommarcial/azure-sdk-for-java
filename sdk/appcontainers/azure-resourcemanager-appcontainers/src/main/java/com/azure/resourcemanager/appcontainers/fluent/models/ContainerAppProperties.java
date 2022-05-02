// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProvisioningState;
import com.azure.resourcemanager.appcontainers.models.Template;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ContainerApp resource specific properties. */
@Fluent
public final class ContainerAppProperties {
    /*
     * Provisioning state of the Container App.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerAppProvisioningState provisioningState;

    /*
     * Resource ID of the Container App's environment.
     */
    @JsonProperty(value = "managedEnvironmentId")
    private String managedEnvironmentId;

    /*
     * Name of the latest revision of the Container App.
     */
    @JsonProperty(value = "latestRevisionName", access = JsonProperty.Access.WRITE_ONLY)
    private String latestRevisionName;

    /*
     * Fully Qualified Domain Name of the latest revision of the Container App.
     */
    @JsonProperty(value = "latestRevisionFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String latestRevisionFqdn;

    /*
     * Id used to verify domain name ownership
     */
    @JsonProperty(value = "customDomainVerificationId", access = JsonProperty.Access.WRITE_ONLY)
    private String customDomainVerificationId;

    /*
     * Non versioned Container App configuration properties.
     */
    @JsonProperty(value = "configuration")
    private Configuration configuration;

    /*
     * Container App versioned application definition.
     */
    @JsonProperty(value = "template")
    private Template template;

    /*
     * Outbound IP Addresses for container app.
     */
    @JsonProperty(value = "outboundIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> outboundIpAddresses;

    /**
     * Get the provisioningState property: Provisioning state of the Container App.
     *
     * @return the provisioningState value.
     */
    public ContainerAppProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the managedEnvironmentId property: Resource ID of the Container App's environment.
     *
     * @return the managedEnvironmentId value.
     */
    public String managedEnvironmentId() {
        return this.managedEnvironmentId;
    }

    /**
     * Set the managedEnvironmentId property: Resource ID of the Container App's environment.
     *
     * @param managedEnvironmentId the managedEnvironmentId value to set.
     * @return the ContainerAppProperties object itself.
     */
    public ContainerAppProperties withManagedEnvironmentId(String managedEnvironmentId) {
        this.managedEnvironmentId = managedEnvironmentId;
        return this;
    }

    /**
     * Get the latestRevisionName property: Name of the latest revision of the Container App.
     *
     * @return the latestRevisionName value.
     */
    public String latestRevisionName() {
        return this.latestRevisionName;
    }

    /**
     * Get the latestRevisionFqdn property: Fully Qualified Domain Name of the latest revision of the Container App.
     *
     * @return the latestRevisionFqdn value.
     */
    public String latestRevisionFqdn() {
        return this.latestRevisionFqdn;
    }

    /**
     * Get the customDomainVerificationId property: Id used to verify domain name ownership.
     *
     * @return the customDomainVerificationId value.
     */
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }

    /**
     * Get the configuration property: Non versioned Container App configuration properties.
     *
     * @return the configuration value.
     */
    public Configuration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Non versioned Container App configuration properties.
     *
     * @param configuration the configuration value to set.
     * @return the ContainerAppProperties object itself.
     */
    public ContainerAppProperties withConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the template property: Container App versioned application definition.
     *
     * @return the template value.
     */
    public Template template() {
        return this.template;
    }

    /**
     * Set the template property: Container App versioned application definition.
     *
     * @param template the template value to set.
     * @return the ContainerAppProperties object itself.
     */
    public ContainerAppProperties withTemplate(Template template) {
        this.template = template;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: Outbound IP Addresses for container app.
     *
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
        if (template() != null) {
            template().validate();
        }
    }
}