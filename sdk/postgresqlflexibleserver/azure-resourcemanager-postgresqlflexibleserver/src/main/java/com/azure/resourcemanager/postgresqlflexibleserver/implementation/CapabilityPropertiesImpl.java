// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.CapabilityPropertiesInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CapabilityProperties;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FastProvisioningEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HyperscaleNodeEditionCapability;
import java.util.Collections;
import java.util.List;

public final class CapabilityPropertiesImpl implements CapabilityProperties {
    private CapabilityPropertiesInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    CapabilityPropertiesImpl(
        CapabilityPropertiesInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String zone() {
        return this.innerModel().zone();
    }

    public List<String> supportedHAMode() {
        List<String> inner = this.innerModel().supportedHAMode();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean geoBackupSupported() {
        return this.innerModel().geoBackupSupported();
    }

    public Boolean zoneRedundantHaSupported() {
        return this.innerModel().zoneRedundantHaSupported();
    }

    public Boolean zoneRedundantHaAndGeoBackupSupported() {
        return this.innerModel().zoneRedundantHaAndGeoBackupSupported();
    }

    public List<FlexibleServerEditionCapability> supportedFlexibleServerEditions() {
        List<FlexibleServerEditionCapability> inner = this.innerModel().supportedFlexibleServerEditions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<HyperscaleNodeEditionCapability> supportedHyperscaleNodeEditions() {
        List<HyperscaleNodeEditionCapability> inner = this.innerModel().supportedHyperscaleNodeEditions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean fastProvisioningSupported() {
        return this.innerModel().fastProvisioningSupported();
    }

    public List<FastProvisioningEditionCapability> supportedFastProvisioningEditions() {
        List<FastProvisioningEditionCapability> inner = this.innerModel().supportedFastProvisioningEditions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String status() {
        return this.innerModel().status();
    }

    public CapabilityPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
