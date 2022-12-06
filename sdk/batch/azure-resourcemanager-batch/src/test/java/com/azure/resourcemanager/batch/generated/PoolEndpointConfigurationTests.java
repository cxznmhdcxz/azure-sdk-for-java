// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.InboundEndpointProtocol;
import com.azure.resourcemanager.batch.models.InboundNatPool;
import com.azure.resourcemanager.batch.models.PoolEndpointConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PoolEndpointConfigurationTests {
    @Test
    public void testDeserialize() {
        PoolEndpointConfiguration model =
            BinaryData
                .fromString(
                    "{\"inboundNatPools\":[{\"name\":\"koievseo\",\"protocol\":\"UDP\",\"backendPort\":143823433,\"frontendPortRangeStart\":1813369281,\"frontendPortRangeEnd\":209864806,\"networkSecurityGroupRules\":[]},{\"name\":\"muwlauwzizxbm\",\"protocol\":\"TCP\",\"backendPort\":2123049773,\"frontendPortRangeStart\":1983379457,\"frontendPortRangeEnd\":904231635,\"networkSecurityGroupRules\":[]},{\"name\":\"zmuvpbttdumorppx\",\"protocol\":\"UDP\",\"backendPort\":964392835,\"frontendPortRangeStart\":1702938248,\"frontendPortRangeEnd\":1538567031,\"networkSecurityGroupRules\":[]}]}")
                .toObject(PoolEndpointConfiguration.class);
        Assertions.assertEquals("koievseo", model.inboundNatPools().get(0).name());
        Assertions.assertEquals(InboundEndpointProtocol.UDP, model.inboundNatPools().get(0).protocol());
        Assertions.assertEquals(143823433, model.inboundNatPools().get(0).backendPort());
        Assertions.assertEquals(1813369281, model.inboundNatPools().get(0).frontendPortRangeStart());
        Assertions.assertEquals(209864806, model.inboundNatPools().get(0).frontendPortRangeEnd());
    }

    @Test
    public void testSerialize() {
        PoolEndpointConfiguration model =
            new PoolEndpointConfiguration()
                .withInboundNatPools(
                    Arrays
                        .asList(
                            new InboundNatPool()
                                .withName("koievseo")
                                .withProtocol(InboundEndpointProtocol.UDP)
                                .withBackendPort(143823433)
                                .withFrontendPortRangeStart(1813369281)
                                .withFrontendPortRangeEnd(209864806)
                                .withNetworkSecurityGroupRules(Arrays.asList()),
                            new InboundNatPool()
                                .withName("muwlauwzizxbm")
                                .withProtocol(InboundEndpointProtocol.TCP)
                                .withBackendPort(2123049773)
                                .withFrontendPortRangeStart(1983379457)
                                .withFrontendPortRangeEnd(904231635)
                                .withNetworkSecurityGroupRules(Arrays.asList()),
                            new InboundNatPool()
                                .withName("zmuvpbttdumorppx")
                                .withProtocol(InboundEndpointProtocol.UDP)
                                .withBackendPort(964392835)
                                .withFrontendPortRangeStart(1702938248)
                                .withFrontendPortRangeEnd(1538567031)
                                .withNetworkSecurityGroupRules(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(PoolEndpointConfiguration.class);
        Assertions.assertEquals("koievseo", model.inboundNatPools().get(0).name());
        Assertions.assertEquals(InboundEndpointProtocol.UDP, model.inboundNatPools().get(0).protocol());
        Assertions.assertEquals(143823433, model.inboundNatPools().get(0).backendPort());
        Assertions.assertEquals(1813369281, model.inboundNatPools().get(0).frontendPortRangeStart());
        Assertions.assertEquals(209864806, model.inboundNatPools().get(0).frontendPortRangeEnd());
    }
}