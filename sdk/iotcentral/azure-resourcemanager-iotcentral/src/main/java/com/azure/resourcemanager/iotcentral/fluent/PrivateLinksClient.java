// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iotcentral.fluent.models.PrivateLinkResourceInner;

/** An instance of this class provides access to all the operations defined in PrivateLinksClient. */
public interface PrivateLinksClient {
    /**
     * Get a private link resource of a IoT Central Application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @param groupId The private link resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource of a IoT Central Application.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner get(String resourceGroupName, String resourceName, String groupId);

    /**
     * Get a private link resource of a IoT Central Application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @param groupId The private link resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource of a IoT Central Application along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String resourceName, String groupId, Context context);

    /**
     * Get all private link resources of a IoT Central Application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link resources of a IoT Central Application as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> list(String resourceGroupName, String resourceName);

    /**
     * Get all private link resources of a IoT Central Application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link resources of a IoT Central Application as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> list(String resourceGroupName, String resourceName, Context context);
}