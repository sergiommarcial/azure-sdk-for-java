// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for PortalRevision CreateOrUpdate. */
public final class PortalRevisionCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementCreatePortalRevision.json
     */
    /**
     * Sample code: ApiManagementCreatePortalRevision.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreatePortalRevision(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .portalRevisions()
            .define("20201112101010")
            .withExistingService("rg1", "apimService1")
            .withDescription("portal revision 1")
            .withIsCurrent(true)
            .create();
    }
}