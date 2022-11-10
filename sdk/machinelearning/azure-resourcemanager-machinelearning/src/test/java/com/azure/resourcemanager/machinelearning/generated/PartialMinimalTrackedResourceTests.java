// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PartialMinimalTrackedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PartialMinimalTrackedResourceTests {
    @Test
    public void testDeserialize() {
        PartialMinimalTrackedResource model =
            BinaryData
                .fromString("{\"tags\":{\"wbwo\":\"expbtg\",\"kcnqxwbpo\":\"nwashrtd\",\"aasipqi\":\"ulpiuj\"}}")
                .toObject(PartialMinimalTrackedResource.class);
        Assertions.assertEquals("expbtg", model.tags().get("wbwo"));
    }

    @Test
    public void testSerialize() {
        PartialMinimalTrackedResource model =
            new PartialMinimalTrackedResource()
                .withTags(mapOf("wbwo", "expbtg", "kcnqxwbpo", "nwashrtd", "aasipqi", "ulpiuj"));
        model = BinaryData.fromObject(model).toObject(PartialMinimalTrackedResource.class);
        Assertions.assertEquals("expbtg", model.tags().get("wbwo"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}