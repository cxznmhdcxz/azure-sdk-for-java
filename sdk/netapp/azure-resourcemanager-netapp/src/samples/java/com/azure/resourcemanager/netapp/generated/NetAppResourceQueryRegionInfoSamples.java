// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for NetAppResource QueryRegionInfo.
 */
public final class NetAppResourceQueryRegionInfoSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/preview/2023-05-01-preview/examples/RegionInfo.json
     */
    /**
     * Sample code: RegionInfo_Query.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void regionInfoQuery(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.netAppResources().queryRegionInfoWithResponse("eastus", com.azure.core.util.Context.NONE);
    }
}
