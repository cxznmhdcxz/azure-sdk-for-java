// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeNodeMonitoringData;
import java.util.HashMap;
import java.util.Map;

public final class IntegrationRuntimeNodeMonitoringDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeNodeMonitoringData model =
            BinaryData
                .fromString(
                    "{\"nodeName\":\"vmfqhppubo\",\"availableMemoryInMB\":1380428673,\"cpuUtilization\":1908236647,\"concurrentJobsLimit\":61402651,\"concurrentJobsRunning\":58075104,\"maxConcurrentJobs\":342947659,\"sentBytes\":99.36763,\"receivedBytes\":14.429962,\"\":{\"kauxof\":\"datatcjuahokqto\",\"ywhslwkojpllndnp\":\"datahfphwpnulaiywze\"}}")
                .toObject(IntegrationRuntimeNodeMonitoringData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeNodeMonitoringData model =
            new IntegrationRuntimeNodeMonitoringData()
                .withAdditionalProperties(
                    mapOf(
                        "nodeName",
                        "vmfqhppubo",
                        "cpuUtilization",
                        1908236647,
                        "receivedBytes",
                        14.429962f,
                        "concurrentJobsLimit",
                        61402651,
                        "concurrentJobsRunning",
                        58075104,
                        "maxConcurrentJobs",
                        342947659,
                        "availableMemoryInMB",
                        1380428673,
                        "sentBytes",
                        99.36763f));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeNodeMonitoringData.class);
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
