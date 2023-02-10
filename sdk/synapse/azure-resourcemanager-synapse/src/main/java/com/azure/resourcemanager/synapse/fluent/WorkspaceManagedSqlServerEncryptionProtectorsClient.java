// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.EncryptionProtectorInner;
import com.azure.resourcemanager.synapse.models.EncryptionProtectorName;

/**
 * An instance of this class provides access to all the operations defined in
 * WorkspaceManagedSqlServerEncryptionProtectorsClient.
 */
public interface WorkspaceManagedSqlServerEncryptionProtectorsClient {
    /**
     * Get workspace server's encryption protector.
     *
     * <p>Get workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's encryption protector along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EncryptionProtectorInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context);

    /**
     * Get workspace server's encryption protector.
     *
     * <p>Get workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionProtectorInner get(
        String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Updates workspace server's encryption protector.
     *
     * <p>Updates workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EncryptionProtectorInner>, EncryptionProtectorInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates workspace server's encryption protector.
     *
     * <p>Updates workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param parameters The requested encryption protector resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EncryptionProtectorInner>, EncryptionProtectorInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters,
        Context context);

    /**
     * Updates workspace server's encryption protector.
     *
     * <p>Updates workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionProtectorInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters);

    /**
     * Updates workspace server's encryption protector.
     *
     * <p>Updates workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param parameters The requested encryption protector resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EncryptionProtectorInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        EncryptionProtectorInner parameters,
        Context context);

    /**
     * Get list of encryption protectors for the server.
     *
     * <p>Get list of encryption protectors for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption protectors for workspace managed sql server as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EncryptionProtectorInner> list(String resourceGroupName, String workspaceName);

    /**
     * Get list of encryption protectors for the server.
     *
     * <p>Get list of encryption protectors for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption protectors for workspace managed sql server as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EncryptionProtectorInner> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Revalidates server's existing encryption protector.
     *
     * <p>Revalidates workspace managed sql server's existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRevalidate(
        String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates server's existing encryption protector.
     *
     * <p>Revalidates workspace managed sql server's existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRevalidate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context);

    /**
     * Revalidates server's existing encryption protector.
     *
     * <p>Revalidates workspace managed sql server's existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revalidate(String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates server's existing encryption protector.
     *
     * <p>Revalidates workspace managed sql server's existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param encryptionProtectorName The name of the encryption protector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revalidate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context);
}
