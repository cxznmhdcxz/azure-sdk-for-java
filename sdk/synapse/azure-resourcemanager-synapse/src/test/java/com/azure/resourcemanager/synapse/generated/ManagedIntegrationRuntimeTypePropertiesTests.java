// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIntegrationRuntimeTypeProperties;
import com.azure.resourcemanager.synapse.models.CustomSetupBase;
import com.azure.resourcemanager.synapse.models.DataFlowComputeType;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeComputeProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeCustomSetupScriptProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeDataFlowProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeDataProxyProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeEdition;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeLicenseType;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeSsisCatalogInfo;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeSsisCatalogPricingTier;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeSsisProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeVNetProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedIntegrationRuntimeTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIntegrationRuntimeTypeProperties model =
            BinaryData
                .fromString(
                    "{\"computeProperties\":{\"location\":\"hqsycljselp\",\"nodeSize\":\"bafvafhlbylcc\",\"numberOfNodes\":1015294496,\"maxParallelExecutionsPerNode\":1495868863,\"dataFlowProperties\":{\"computeType\":\"ComputeOptimized\",\"coreCount\":1737850278,\"timeToLive\":1616798113,\"cleanup\":false,\"\":{\"airrhvhfnracw\":\"dataltdb\"}},\"vNetProperties\":{\"vNetId\":\"igtuu\",\"subnet\":\"ouhdawsigrb\",\"publicIPs\":[\"sjybvitv\",\"kjyaznumtg\",\"m\"],\"subnetId\":\"dchozfnkfexl\",\"\":{\"naqln\":\"dataoakizvoai\",\"phvxz\":\"datawiguyxlyk\"}},\"\":{\"vkcqhr\":\"datahmpejtlkexaonw\",\"ubyqj\":\"datahxknlccrmmkyupi\",\"em\":\"datakakfqfr\"}},\"ssisProperties\":{\"catalogInfo\":{\"catalogServerEndpoint\":\"udxjascowv\",\"catalogAdminUserName\":\"jkpdxphlkksnm\",\"catalogPricingTier\":\"Premium\",\"\":{\"zuqnwsithuqo\":\"datajd\"}},\"licenseType\":\"BasePrice\",\"customSetupScriptProperties\":{\"blobContainerUri\":\"uqwqulsutrjbhxyk\"},\"dataProxyProperties\":{\"path\":\"vqqugdrftbcv\"},\"edition\":\"Enterprise\",\"expressCustomSetupProperties\":[{\"type\":\"CustomSetupBase\"},{\"type\":\"CustomSetupBase\"},{\"type\":\"CustomSetupBase\"},{\"type\":\"CustomSetupBase\"}],\"\":{\"reagkhyxvrqt\":\"dataowtljvfw\",\"s\":\"databczsulmdgglmepjp\",\"fpgylkve\":\"dataykgsangpszng\",\"edmzrgjfoknub\":\"datajujcngoad\"}}}")
                .toObject(ManagedIntegrationRuntimeTypeProperties.class);
        Assertions.assertEquals("hqsycljselp", model.computeProperties().location());
        Assertions.assertEquals("bafvafhlbylcc", model.computeProperties().nodeSize());
        Assertions.assertEquals(1015294496, model.computeProperties().numberOfNodes());
        Assertions.assertEquals(1495868863, model.computeProperties().maxParallelExecutionsPerNode());
        Assertions
            .assertEquals(
                DataFlowComputeType.COMPUTE_OPTIMIZED, model.computeProperties().dataFlowProperties().computeType());
        Assertions.assertEquals(1737850278, model.computeProperties().dataFlowProperties().coreCount());
        Assertions.assertEquals(1616798113, model.computeProperties().dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.computeProperties().dataFlowProperties().cleanup());
        Assertions.assertEquals("igtuu", model.computeProperties().vNetProperties().vNetId());
        Assertions.assertEquals("ouhdawsigrb", model.computeProperties().vNetProperties().subnet());
        Assertions.assertEquals("sjybvitv", model.computeProperties().vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("dchozfnkfexl", model.computeProperties().vNetProperties().subnetId());
        Assertions.assertEquals("udxjascowv", model.ssisProperties().catalogInfo().catalogServerEndpoint());
        Assertions.assertEquals("jkpdxphlkksnm", model.ssisProperties().catalogInfo().catalogAdminUsername());
        Assertions
            .assertEquals(
                IntegrationRuntimeSsisCatalogPricingTier.PREMIUM,
                model.ssisProperties().catalogInfo().catalogPricingTier());
        Assertions.assertEquals(IntegrationRuntimeLicenseType.BASE_PRICE, model.ssisProperties().licenseType());
        Assertions
            .assertEquals("uqwqulsutrjbhxyk", model.ssisProperties().customSetupScriptProperties().blobContainerUri());
        Assertions.assertEquals("vqqugdrftbcv", model.ssisProperties().dataProxyProperties().path());
        Assertions.assertEquals(IntegrationRuntimeEdition.ENTERPRISE, model.ssisProperties().edition());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIntegrationRuntimeTypeProperties model =
            new ManagedIntegrationRuntimeTypeProperties()
                .withComputeProperties(
                    new IntegrationRuntimeComputeProperties()
                        .withLocation("hqsycljselp")
                        .withNodeSize("bafvafhlbylcc")
                        .withNumberOfNodes(1015294496)
                        .withMaxParallelExecutionsPerNode(1495868863)
                        .withDataFlowProperties(
                            new IntegrationRuntimeDataFlowProperties()
                                .withComputeType(DataFlowComputeType.COMPUTE_OPTIMIZED)
                                .withCoreCount(1737850278)
                                .withTimeToLive(1616798113)
                                .withCleanup(false)
                                .withAdditionalProperties(mapOf()))
                        .withVNetProperties(
                            new IntegrationRuntimeVNetProperties()
                                .withVNetId("igtuu")
                                .withSubnet("ouhdawsigrb")
                                .withPublicIPs(Arrays.asList("sjybvitv", "kjyaznumtg", "m"))
                                .withSubnetId("dchozfnkfexl")
                                .withAdditionalProperties(mapOf()))
                        .withAdditionalProperties(mapOf()))
                .withSsisProperties(
                    new IntegrationRuntimeSsisProperties()
                        .withCatalogInfo(
                            new IntegrationRuntimeSsisCatalogInfo()
                                .withCatalogServerEndpoint("udxjascowv")
                                .withCatalogAdminUsername("jkpdxphlkksnm")
                                .withCatalogPricingTier(IntegrationRuntimeSsisCatalogPricingTier.PREMIUM)
                                .withAdditionalProperties(mapOf()))
                        .withLicenseType(IntegrationRuntimeLicenseType.BASE_PRICE)
                        .withCustomSetupScriptProperties(
                            new IntegrationRuntimeCustomSetupScriptProperties()
                                .withBlobContainerUri("uqwqulsutrjbhxyk"))
                        .withDataProxyProperties(new IntegrationRuntimeDataProxyProperties().withPath("vqqugdrftbcv"))
                        .withEdition(IntegrationRuntimeEdition.ENTERPRISE)
                        .withExpressCustomSetupProperties(
                            Arrays
                                .asList(
                                    new CustomSetupBase(),
                                    new CustomSetupBase(),
                                    new CustomSetupBase(),
                                    new CustomSetupBase()))
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ManagedIntegrationRuntimeTypeProperties.class);
        Assertions.assertEquals("hqsycljselp", model.computeProperties().location());
        Assertions.assertEquals("bafvafhlbylcc", model.computeProperties().nodeSize());
        Assertions.assertEquals(1015294496, model.computeProperties().numberOfNodes());
        Assertions.assertEquals(1495868863, model.computeProperties().maxParallelExecutionsPerNode());
        Assertions
            .assertEquals(
                DataFlowComputeType.COMPUTE_OPTIMIZED, model.computeProperties().dataFlowProperties().computeType());
        Assertions.assertEquals(1737850278, model.computeProperties().dataFlowProperties().coreCount());
        Assertions.assertEquals(1616798113, model.computeProperties().dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.computeProperties().dataFlowProperties().cleanup());
        Assertions.assertEquals("igtuu", model.computeProperties().vNetProperties().vNetId());
        Assertions.assertEquals("ouhdawsigrb", model.computeProperties().vNetProperties().subnet());
        Assertions.assertEquals("sjybvitv", model.computeProperties().vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("dchozfnkfexl", model.computeProperties().vNetProperties().subnetId());
        Assertions.assertEquals("udxjascowv", model.ssisProperties().catalogInfo().catalogServerEndpoint());
        Assertions.assertEquals("jkpdxphlkksnm", model.ssisProperties().catalogInfo().catalogAdminUsername());
        Assertions
            .assertEquals(
                IntegrationRuntimeSsisCatalogPricingTier.PREMIUM,
                model.ssisProperties().catalogInfo().catalogPricingTier());
        Assertions.assertEquals(IntegrationRuntimeLicenseType.BASE_PRICE, model.ssisProperties().licenseType());
        Assertions
            .assertEquals("uqwqulsutrjbhxyk", model.ssisProperties().customSetupScriptProperties().blobContainerUri());
        Assertions.assertEquals("vqqugdrftbcv", model.ssisProperties().dataProxyProperties().path());
        Assertions.assertEquals(IntegrationRuntimeEdition.ENTERPRISE, model.ssisProperties().edition());
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
