// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.healthcareapis.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.healthcareapis.models.WorkspacePatchResource;

/** An instance of this class provides access to all the operations defined in WorkspacesClient. */
public interface WorkspacesClient {
    /**
     * Lists all the available workspaces under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list();

    /**
     * Lists all the available workspaces under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list(Context context);

    /**
     * Lists all the available workspaces under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the available workspaces under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Gets the properties of the specified workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Creates or updates a workspace resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspace The parameters for creating or updating a healthcare workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner workspace);

    /**
     * Creates or updates a workspace resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspace The parameters for creating or updating a healthcare workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner workspace, Context context);

    /**
     * Creates or updates a workspace resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspace The parameters for creating or updating a healthcare workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(String resourceGroupName, String workspaceName, WorkspaceInner workspace);

    /**
     * Creates or updates a workspace resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspace The parameters for creating or updating a healthcare workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner workspace, Context context);

    /**
     * Patch workspace details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspacePatchResource The parameters for updating a specified workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginUpdate(
        String resourceGroupName, String workspaceName, WorkspacePatchResource workspacePatchResource);

    /**
     * Patch workspace details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspacePatchResource The parameters for updating a specified workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginUpdate(
        String resourceGroupName, String workspaceName, WorkspacePatchResource workspacePatchResource, Context context);

    /**
     * Patch workspace details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspacePatchResource The parameters for updating a specified workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(
        String resourceGroupName, String workspaceName, WorkspacePatchResource workspacePatchResource);

    /**
     * Patch workspace details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param workspacePatchResource The parameters for updating a specified workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(
        String resourceGroupName, String workspaceName, WorkspacePatchResource workspacePatchResource, Context context);

    /**
     * Deletes a specified workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a specified workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Deletes a specified workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a specified workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, Context context);
}