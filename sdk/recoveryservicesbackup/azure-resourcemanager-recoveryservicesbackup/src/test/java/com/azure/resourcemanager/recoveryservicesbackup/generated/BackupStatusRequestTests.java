// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupStatusRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataSourceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BackupStatusRequestTests {
    @Test
    public void testDeserialize() {
        BackupStatusRequest model =
            BinaryData
                .fromString("{\"resourceType\":\"VM\",\"resourceId\":\"dkfo\",\"poLogicalName\":\"nygj\"}")
                .toObject(BackupStatusRequest.class);
        Assertions.assertEquals(DataSourceType.VM, model.resourceType());
        Assertions.assertEquals("dkfo", model.resourceId());
        Assertions.assertEquals("nygj", model.poLogicalName());
    }

    @Test
    public void testSerialize() {
        BackupStatusRequest model =
            new BackupStatusRequest()
                .withResourceType(DataSourceType.VM)
                .withResourceId("dkfo")
                .withPoLogicalName("nygj");
        model = BinaryData.fromObject(model).toObject(BackupStatusRequest.class);
        Assertions.assertEquals(DataSourceType.VM, model.resourceType());
        Assertions.assertEquals("dkfo", model.resourceId());
        Assertions.assertEquals("nygj", model.poLogicalName());
    }
}