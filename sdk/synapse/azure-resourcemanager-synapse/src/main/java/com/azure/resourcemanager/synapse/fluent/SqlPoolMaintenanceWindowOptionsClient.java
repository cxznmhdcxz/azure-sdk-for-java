// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowOptionsInner;

/** An instance of this class provides access to all the operations defined in SqlPoolMaintenanceWindowOptionsClient. */
public interface SqlPoolMaintenanceWindowOptionsClient {
    /**
     * SQL pool's available maintenance windows.
     *
     * <p>Get list of SQL pool's available maintenance windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param maintenanceWindowOptionsName Maintenance window options name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool's available maintenance windows along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceWindowOptionsInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String maintenanceWindowOptionsName,
        Context context);

    /**
     * SQL pool's available maintenance windows.
     *
     * <p>Get list of SQL pool's available maintenance windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param maintenanceWindowOptionsName Maintenance window options name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool's available maintenance windows.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceWindowOptionsInner get(
        String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowOptionsName);
}
