// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.fluent.models.BackupStatusInner;
import com.azure.resourcemanager.netapp.fluent.models.RestoreStatusInner;
import com.azure.resourcemanager.netapp.models.BackupPatch;

/**
 * An instance of this class provides access to all the operations defined in BackupsClient.
 */
public interface BackupsClient {
    /**
     * Get the latest backup status of a volume
     * 
     * Get the latest status of the backup for a volume.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the latest status of the backup for a volume along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackupStatusInner> getLatestStatusWithResponse(String resourceGroupName, String accountName,
        String poolName, String volumeName, Context context);

    /**
     * Get the latest backup status of a volume
     * 
     * Get the latest status of the backup for a volume.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the latest status of the backup for a volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupStatusInner getLatestStatus(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Get volume's restore status
     * 
     * Get the status of the restore for a volume.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the restore for a volume along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RestoreStatusInner> getVolumeRestoreStatusWithResponse(String resourceGroupName, String accountName,
        String poolName, String volumeName, Context context);

    /**
     * Get volume's restore status
     * 
     * Get the status of the restore for a volume.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the restore for a volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestoreStatusInner getVolumeRestoreStatus(String resourceGroupName, String accountName, String poolName,
        String volumeName);

    /**
     * List Backups
     * 
     * List all backups Under a Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Backups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupInner> listByVault(String resourceGroupName, String accountName, String backupVaultName);

    /**
     * List Backups
     * 
     * List all backups Under a Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param filter An option to specify the VolumeResourceId. If present, then only returns the backups under the
     * specified volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Backups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupInner> listByVault(String resourceGroupName, String accountName, String backupVaultName,
        String filter, Context context);

    /**
     * Describe the Backup under Backup Vault
     * 
     * Get the specified Backup under Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Backup under Backup Vault along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackupInner> getWithResponse(String resourceGroupName, String accountName, String backupVaultName,
        String backupName, Context context);

    /**
     * Describe the Backup under Backup Vault
     * 
     * Get the specified Backup under Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Backup under Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner get(String resourceGroupName, String accountName, String backupVaultName, String backupName);

    /**
     * Create a backup
     * 
     * Create a backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginCreate(String resourceGroupName, String accountName,
        String backupVaultName, String backupName, BackupInner body);

    /**
     * Create a backup
     * 
     * Create a backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginCreate(String resourceGroupName, String accountName,
        String backupVaultName, String backupName, BackupInner body, Context context);

    /**
     * Create a backup
     * 
     * Create a backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner create(String resourceGroupName, String accountName, String backupVaultName, String backupName,
        BackupInner body);

    /**
     * Create a backup
     * 
     * Create a backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner create(String resourceGroupName, String accountName, String backupVaultName, String backupName,
        BackupInner body, Context context);

    /**
     * Patch a backup
     * 
     * Patch a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginUpdate(String resourceGroupName, String accountName,
        String backupVaultName, String backupName);

    /**
     * Patch a backup
     * 
     * Patch a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginUpdate(String resourceGroupName, String accountName,
        String backupVaultName, String backupName, BackupPatch body, Context context);

    /**
     * Patch a backup
     * 
     * Patch a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner update(String resourceGroupName, String accountName, String backupVaultName, String backupName);

    /**
     * Patch a backup
     * 
     * Patch a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup under a Backup Vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner update(String resourceGroupName, String accountName, String backupVaultName, String backupName,
        BackupPatch body, Context context);

    /**
     * Delete backup
     * 
     * Delete a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String backupVaultName,
        String backupName);

    /**
     * Delete backup
     * 
     * Delete a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String backupVaultName,
        String backupName, Context context);

    /**
     * Delete backup
     * 
     * Delete a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String backupVaultName, String backupName);

    /**
     * Delete backup
     * 
     * Delete a Backup under the Backup Vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param backupVaultName The name of the Backup Vault.
     * @param backupName The name of the backup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String backupVaultName, String backupName,
        Context context);
}
