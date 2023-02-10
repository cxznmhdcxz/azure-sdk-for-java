// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.DynamicExecutorAllocation;
import org.junit.jupiter.api.Assertions;

public final class DynamicExecutorAllocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DynamicExecutorAllocation model =
            BinaryData
                .fromString("{\"enabled\":true,\"minExecutors\":1923322437,\"maxExecutors\":55870102}")
                .toObject(DynamicExecutorAllocation.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals(1923322437, model.minExecutors());
        Assertions.assertEquals(55870102, model.maxExecutors());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DynamicExecutorAllocation model =
            new DynamicExecutorAllocation().withEnabled(true).withMinExecutors(1923322437).withMaxExecutors(55870102);
        model = BinaryData.fromObject(model).toObject(DynamicExecutorAllocation.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals(1923322437, model.minExecutors());
        Assertions.assertEquals(55870102, model.maxExecutors());
    }
}
