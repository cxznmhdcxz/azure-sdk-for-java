// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.models.CapabilityType;
import com.azure.resourcemanager.sphere.models.GenerateCapabilityImageRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GenerateCapabilityImageRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenerateCapabilityImageRequest model =
            BinaryData
                .fromString("{\"capabilities\":[\"ApplicationDevelopment\"]}")
                .toObject(GenerateCapabilityImageRequest.class);
        Assertions.assertEquals(CapabilityType.APPLICATION_DEVELOPMENT, model.capabilities().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenerateCapabilityImageRequest model =
            new GenerateCapabilityImageRequest()
                .withCapabilities(Arrays.asList(CapabilityType.APPLICATION_DEVELOPMENT));
        model = BinaryData.fromObject(model).toObject(GenerateCapabilityImageRequest.class);
        Assertions.assertEquals(CapabilityType.APPLICATION_DEVELOPMENT, model.capabilities().get(0));
    }
}
