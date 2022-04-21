// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The role management policy rule. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = RoleManagementPolicyRule.class)
@JsonTypeName("RoleManagementPolicyRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RoleManagementPolicyApprovalRule", value = RoleManagementPolicyApprovalRule.class),
    @JsonSubTypes.Type(
        name = "RoleManagementPolicyAuthenticationContextRule",
        value = RoleManagementPolicyAuthenticationContextRule.class),
    @JsonSubTypes.Type(name = "RoleManagementPolicyEnablementRule", value = RoleManagementPolicyEnablementRule.class),
    @JsonSubTypes.Type(name = "RoleManagementPolicyExpirationRule", value = RoleManagementPolicyExpirationRule.class),
    @JsonSubTypes.Type(
        name = "RoleManagementPolicyNotificationRule",
        value = RoleManagementPolicyNotificationRule.class)
})
@Fluent
public class RoleManagementPolicyRule {
    /*
     * The id of the rule.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The target of the current rule.
     */
    @JsonProperty(value = "target")
    private RoleManagementPolicyRuleTarget target;

    /**
     * Get the id property: The id of the rule.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the rule.
     *
     * @param id the id value to set.
     * @return the RoleManagementPolicyRule object itself.
     */
    public RoleManagementPolicyRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the target property: The target of the current rule.
     *
     * @return the target value.
     */
    public RoleManagementPolicyRuleTarget target() {
        return this.target;
    }

    /**
     * Set the target property: The target of the current rule.
     *
     * @param target the target value to set.
     * @return the RoleManagementPolicyRule object itself.
     */
    public RoleManagementPolicyRule withTarget(RoleManagementPolicyRuleTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() != null) {
            target().validate();
        }
    }
}