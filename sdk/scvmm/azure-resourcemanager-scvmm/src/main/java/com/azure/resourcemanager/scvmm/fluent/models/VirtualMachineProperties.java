// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.scvmm.models.AvailabilitySetListItem;
import com.azure.resourcemanager.scvmm.models.Checkpoint;
import com.azure.resourcemanager.scvmm.models.HardwareProfile;
import com.azure.resourcemanager.scvmm.models.NetworkProfile;
import com.azure.resourcemanager.scvmm.models.OsProfile;
import com.azure.resourcemanager.scvmm.models.StorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the resource properties. */
@Fluent
public final class VirtualMachineProperties {
    /*
     * Gets or sets the inventory Item ID for the resource.
     */
    @JsonProperty(value = "inventoryItemId")
    private String inventoryItemId;

    /*
     * ARM Id of the vmmServer resource in which this resource resides.
     */
    @JsonProperty(value = "vmmServerId")
    private String vmmServerId;

    /*
     * ARM Id of the cloud resource to use for deploying the vm.
     */
    @JsonProperty(value = "cloudId")
    private String cloudId;

    /*
     * ARM Id of the template resource to use for deploying the vm.
     */
    @JsonProperty(value = "templateId")
    private String templateId;

    /*
     * Type of checkpoint supported for the vm.
     */
    @JsonProperty(value = "checkpointType")
    private String checkpointType;

    /*
     * Checkpoints in the vm.
     */
    @JsonProperty(value = "checkpoints")
    private List<Checkpoint> checkpoints;

    /*
     * Availability Sets in vm.
     */
    @JsonProperty(value = "availabilitySets")
    private List<AvailabilitySetListItem> availabilitySets;

    /*
     * OS properties.
     */
    @JsonProperty(value = "osProfile")
    private OsProfile osProfile;

    /*
     * Hardware properties.
     */
    @JsonProperty(value = "hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Network properties.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Storage properties.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * VMName is the name of VM on the SCVMM server.
     */
    @JsonProperty(value = "vmName")
    private String vmName;

    /*
     * Unique ID of the virtual machine.
     */
    @JsonProperty(value = "uuid")
    private String uuid;

    /*
     * Gets or sets the generation for the vm.
     */
    @JsonProperty(value = "generation")
    private Integer generation;

    /*
     * Gets the power state of the virtual machine.
     */
    @JsonProperty(value = "powerState", access = JsonProperty.Access.WRITE_ONLY)
    private String powerState;

    /*
     * Gets or sets the provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the inventoryItemId property: Gets or sets the inventory Item ID for the resource.
     *
     * @return the inventoryItemId value.
     */
    public String inventoryItemId() {
        return this.inventoryItemId;
    }

    /**
     * Set the inventoryItemId property: Gets or sets the inventory Item ID for the resource.
     *
     * @param inventoryItemId the inventoryItemId value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    /**
     * Get the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     *
     * @return the vmmServerId value.
     */
    public String vmmServerId() {
        return this.vmmServerId;
    }

    /**
     * Set the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     *
     * @param vmmServerId the vmmServerId value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withVmmServerId(String vmmServerId) {
        this.vmmServerId = vmmServerId;
        return this;
    }

    /**
     * Get the cloudId property: ARM Id of the cloud resource to use for deploying the vm.
     *
     * @return the cloudId value.
     */
    public String cloudId() {
        return this.cloudId;
    }

    /**
     * Set the cloudId property: ARM Id of the cloud resource to use for deploying the vm.
     *
     * @param cloudId the cloudId value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * Get the templateId property: ARM Id of the template resource to use for deploying the vm.
     *
     * @return the templateId value.
     */
    public String templateId() {
        return this.templateId;
    }

    /**
     * Set the templateId property: ARM Id of the template resource to use for deploying the vm.
     *
     * @param templateId the templateId value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Get the checkpointType property: Type of checkpoint supported for the vm.
     *
     * @return the checkpointType value.
     */
    public String checkpointType() {
        return this.checkpointType;
    }

    /**
     * Set the checkpointType property: Type of checkpoint supported for the vm.
     *
     * @param checkpointType the checkpointType value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withCheckpointType(String checkpointType) {
        this.checkpointType = checkpointType;
        return this;
    }

    /**
     * Get the checkpoints property: Checkpoints in the vm.
     *
     * @return the checkpoints value.
     */
    public List<Checkpoint> checkpoints() {
        return this.checkpoints;
    }

    /**
     * Set the checkpoints property: Checkpoints in the vm.
     *
     * @param checkpoints the checkpoints value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withCheckpoints(List<Checkpoint> checkpoints) {
        this.checkpoints = checkpoints;
        return this;
    }

    /**
     * Get the availabilitySets property: Availability Sets in vm.
     *
     * @return the availabilitySets value.
     */
    public List<AvailabilitySetListItem> availabilitySets() {
        return this.availabilitySets;
    }

    /**
     * Set the availabilitySets property: Availability Sets in vm.
     *
     * @param availabilitySets the availabilitySets value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withAvailabilitySets(List<AvailabilitySetListItem> availabilitySets) {
        this.availabilitySets = availabilitySets;
        return this;
    }

    /**
     * Get the osProfile property: OS properties.
     *
     * @return the osProfile value.
     */
    public OsProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: OS properties.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withOsProfile(OsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the hardwareProfile property: Hardware properties.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Hardware properties.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Network properties.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Network properties.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Storage properties.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Storage properties.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the vmName property: VMName is the name of VM on the SCVMM server.
     *
     * @return the vmName value.
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Set the vmName property: VMName is the name of VM on the SCVMM server.
     *
     * @param vmName the vmName value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

    /**
     * Get the uuid property: Unique ID of the virtual machine.
     *
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: Unique ID of the virtual machine.
     *
     * @param uuid the uuid value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get the generation property: Gets or sets the generation for the vm.
     *
     * @return the generation value.
     */
    public Integer generation() {
        return this.generation;
    }

    /**
     * Set the generation property: Gets or sets the generation for the vm.
     *
     * @param generation the generation value to set.
     * @return the VirtualMachineProperties object itself.
     */
    public VirtualMachineProperties withGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }

    /**
     * Get the powerState property: Gets the power state of the virtual machine.
     *
     * @return the powerState value.
     */
    public String powerState() {
        return this.powerState;
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (checkpoints() != null) {
            checkpoints().forEach(e -> e.validate());
        }
        if (availabilitySets() != null) {
            availabilitySets().forEach(e -> e.validate());
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }
}