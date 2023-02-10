// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for SqlPoolWorkloadGroup Delete. */
public final class SqlPoolWorkloadGroupDeleteSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/DeleteSqlPoolWorkloadGroup.json
     */
    /**
     * Sample code: Delete a workload group of a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void deleteAWorkloadGroupOfASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolWorkloadGroups()
            .delete(
                "sqlcrudtest-6852",
                "sqlcrudtest-2080",
                "sqlcrudtest-9187",
                "wlm_workloadgroup",
                com.azure.core.util.Context.NONE);
    }
}
