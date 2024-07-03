// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.DbServerInner;
import com.azure.resourcemanager.oracledatabase.models.DbServerProperties;

public final class DbServerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbServerInner model = BinaryData.fromString(
            "{\"properties\":{\"ocid\":\"bt\",\"displayName\":\"flsjc\",\"compartmentId\":\"szfjvfbgofelja\",\"exadataInfrastructureId\":\"qmqhldvriii\",\"cpuCoreCount\":1756672367,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":664044730,\"patchingStatus\":\"Scheduled\",\"timePatchingEnded\":\"2021-12-10T23:56:18Z\",\"timePatchingStarted\":\"2021-04-04T08:27:15Z\"},\"maxMemoryInGbs\":477043409,\"dbNodeStorageSizeInGbs\":1376433367,\"vmClusterIds\":[\"ueluqhhahhxvrhmz\",\"wpjgwws\",\"ughftqsx\",\"qxujxukndxd\"],\"dbNodeIds\":[\"jguufzdm\",\"yqtfihwh\",\"otzi\",\"gamv\"],\"lifecycleDetails\":\"ho\",\"lifecycleState\":\"Available\",\"maxCpuCount\":1534302042,\"autonomousVmClusterIds\":[\"hqamvdkf\",\"ynwcvtbv\",\"ayhmtnvyqiatkz\",\"pcnp\"],\"autonomousVirtualMachineIds\":[\"jaesgvvsccya\",\"g\",\"qfhwyg\"],\"maxDbNodeStorageInGbs\":376601626,\"memorySizeInGbs\":307379599,\"shape\":\"fxusemdwzr\",\"timeCreated\":\"2021-04-25T19:47:04Z\",\"provisioningState\":\"Succeeded\"},\"id\":\"cqdpsqxqvpsvuoym\",\"name\":\"ccelve\",\"type\":\"rypqlmfeo\"}")
            .toObject(DbServerInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbServerInner model = new DbServerInner().withProperties(new DbServerProperties());
        model = BinaryData.fromObject(model).toObject(DbServerInner.class);
    }
}
