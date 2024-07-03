// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.SystemVersionProperties;

public final class SystemVersionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SystemVersionProperties model
            = BinaryData.fromString("{\"systemVersion\":\"dqrhzoymib\"}").toObject(SystemVersionProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SystemVersionProperties model = new SystemVersionProperties();
        model = BinaryData.fromObject(model).toObject(SystemVersionProperties.class);
    }
}
