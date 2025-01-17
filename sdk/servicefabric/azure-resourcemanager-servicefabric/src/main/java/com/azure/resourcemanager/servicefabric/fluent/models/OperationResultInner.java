// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicefabric.models.AvailableOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Available operation list result. */
@Fluent
public final class OperationResultInner {
    /*
     * The name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private AvailableOperationDisplay display;

    /*
     * Origin result
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of OperationResultInner class. */
    public OperationResultInner() {
    }

    /**
     * Get the name property: The name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the operation.
     *
     * @param name the name value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is a data action.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    public AvailableOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The object that represents the operation.
     *
     * @param display the display value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withDisplay(AvailableOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin result.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin result.
     *
     * @param origin the origin value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
