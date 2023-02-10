// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.FollowerDatabaseDefinitionInner;

/** Resource collection API of KustoPools. */
public interface KustoPools {
    /**
     * Lists eligible SKUs for Kusto Pool resource.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the SKU descriptions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuDescription> list();

    /**
     * Lists eligible SKUs for Kusto Pool resource.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the SKU descriptions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuDescription> list(Context context);

    /**
     * Checks that the kusto pool name is valid and is not already in use.
     *
     * @param location The name of Azure region.
     * @param kustoPoolName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String location, KustoPoolCheckNameRequest kustoPoolName, Context context);

    /**
     * Checks that the kusto pool name is valid and is not already in use.
     *
     * @param location The name of Azure region.
     * @param kustoPoolName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    CheckNameResult checkNameAvailability(String location, KustoPoolCheckNameRequest kustoPoolName);

    /**
     * List Kusto pools
     *
     * <p>List all Kusto pools.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto pools operation response along with {@link Response}.
     */
    Response<KustoPoolListResult> listByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * List Kusto pools
     *
     * <p>List all Kusto pools.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto pools operation response.
     */
    KustoPoolListResult listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool along with {@link Response}.
     */
    Response<KustoPool> getWithResponse(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Gets a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool.
     */
    KustoPool get(String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Deletes a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kustoPoolName The name of the Kusto pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String workspaceName, String resourceGroupName, String kustoPoolName);

    /**
     * Deletes a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kustoPoolName The name of the Kusto pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String workspaceName, String resourceGroupName, String kustoPoolName, Context context);

    /**
     * Stops a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Stops a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Starts a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Starts a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Returns the SKUs available for the provided resource.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available SKUs for a Kusto Pool as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureResourceSku> listSkusByResource(
        String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Returns the SKUs available for the provided resource.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of available SKUs for a Kusto Pool as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureResourceSku> listSkusByResource(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of language extension objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LanguageExtension> listLanguageExtensions(
        String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Returns a list of language extensions that can run within KQL queries.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of language extension objects as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LanguageExtension> listLanguageExtensions(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param languageExtensionsToAdd The language extensions to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addLanguageExtensions(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        LanguageExtensionsList languageExtensionsToAdd);

    /**
     * Add a list of language extensions that can run within KQL queries.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param languageExtensionsToAdd The language extensions to add.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addLanguageExtensions(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        LanguageExtensionsList languageExtensionsToAdd,
        Context context);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param languageExtensionsToRemove The language extensions to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLanguageExtensions(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        LanguageExtensionsList languageExtensionsToRemove);

    /**
     * Remove a list of language extensions that can run within KQL queries.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param languageExtensionsToRemove The language extensions to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLanguageExtensions(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        LanguageExtensionsList languageExtensionsToRemove,
        Context context);

    /**
     * Returns a list of databases that are owned by this Kusto Pool and were followed by another Kusto Pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principals operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(
        String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Returns a list of databases that are owned by this Kusto Pool and were followed by another Kusto Pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principals operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Detaches all followers of a database owned by this Kusto Pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachFollowerDatabases(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        FollowerDatabaseDefinitionInner followerDatabaseToRemove);

    /**
     * Detaches all followers of a database owned by this Kusto Pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param followerDatabaseToRemove The follower databases properties to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachFollowerDatabases(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        FollowerDatabaseDefinitionInner followerDatabaseToRemove,
        Context context);

    /**
     * Gets a Kusto pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool along with {@link Response}.
     */
    KustoPool getById(String id);

    /**
     * Gets a Kusto pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool along with {@link Response}.
     */
    Response<KustoPool> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Kusto pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Kusto pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new KustoPool resource.
     *
     * @param name resource name.
     * @return the first stage of the new KustoPool definition.
     */
    KustoPool.DefinitionStages.Blank define(String name);
}
