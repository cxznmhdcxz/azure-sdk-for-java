// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.VirtualMachineSizeListResultInner;
import com.azure.resourcemanager.machinelearning.models.BillingCurrency;
import com.azure.resourcemanager.machinelearning.models.EstimatedVMPrices;
import com.azure.resourcemanager.machinelearning.models.UnitOfMeasure;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSize;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualMachineSizeListResultInnerTests {
    @Test
    public void testDeserialize() {
        VirtualMachineSizeListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"tgrhpdjpjumas\",\"family\":\"zj\",\"vCPUs\":1063088657,\"gpus\":973371108,\"osVhdSizeMB\":1267309720,\"maxResourceVolumeMB\":285130790,\"memoryGB\":62.19358841158077,\"lowPriorityCapable\":false,\"premiumIO\":false,\"estimatedVMPrices\":{\"billingCurrency\":\"USD\",\"unitOfMeasure\":\"OneHour\",\"values\":[]},\"supportedComputeTypes\":[\"dgwdslfhot\",\"mcy\",\"pwlbjnpg\"]},{\"name\":\"ftadehxnltyfs\",\"family\":\"pusuesn\",\"vCPUs\":1828932864,\"gpus\":317621756,\"osVhdSizeMB\":600821678,\"maxResourceVolumeMB\":1696341054,\"memoryGB\":51.36310108881028,\"lowPriorityCapable\":false,\"premiumIO\":true,\"estimatedVMPrices\":{\"billingCurrency\":\"USD\",\"unitOfMeasure\":\"OneHour\",\"values\":[]},\"supportedComputeTypes\":[\"udwxdndnvowguj\",\"ugw\"]},{\"name\":\"cglhslazjdyggdt\",\"family\":\"xhbkuofq\",\"vCPUs\":358956997,\"gpus\":1965159297,\"osVhdSizeMB\":1807410645,\"maxResourceVolumeMB\":1520793095,\"memoryGB\":45.72291424975317,\"lowPriorityCapable\":false,\"premiumIO\":false,\"estimatedVMPrices\":{\"billingCurrency\":\"USD\",\"unitOfMeasure\":\"OneHour\",\"values\":[]},\"supportedComputeTypes\":[\"bvyvdcsity\"]}]}")
                .toObject(VirtualMachineSizeListResultInner.class);
        Assertions.assertEquals(BillingCurrency.USD, model.value().get(0).estimatedVMPrices().billingCurrency());
        Assertions.assertEquals(UnitOfMeasure.ONE_HOUR, model.value().get(0).estimatedVMPrices().unitOfMeasure());
        Assertions.assertEquals("dgwdslfhot", model.value().get(0).supportedComputeTypes().get(0));
    }

    @Test
    public void testSerialize() {
        VirtualMachineSizeListResultInner model =
            new VirtualMachineSizeListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new VirtualMachineSize()
                                .withEstimatedVMPrices(
                                    new EstimatedVMPrices()
                                        .withBillingCurrency(BillingCurrency.USD)
                                        .withUnitOfMeasure(UnitOfMeasure.ONE_HOUR)
                                        .withValues(Arrays.asList()))
                                .withSupportedComputeTypes(Arrays.asList("dgwdslfhot", "mcy", "pwlbjnpg")),
                            new VirtualMachineSize()
                                .withEstimatedVMPrices(
                                    new EstimatedVMPrices()
                                        .withBillingCurrency(BillingCurrency.USD)
                                        .withUnitOfMeasure(UnitOfMeasure.ONE_HOUR)
                                        .withValues(Arrays.asList()))
                                .withSupportedComputeTypes(Arrays.asList("udwxdndnvowguj", "ugw")),
                            new VirtualMachineSize()
                                .withEstimatedVMPrices(
                                    new EstimatedVMPrices()
                                        .withBillingCurrency(BillingCurrency.USD)
                                        .withUnitOfMeasure(UnitOfMeasure.ONE_HOUR)
                                        .withValues(Arrays.asList()))
                                .withSupportedComputeTypes(Arrays.asList("bvyvdcsity"))));
        model = BinaryData.fromObject(model).toObject(VirtualMachineSizeListResultInner.class);
        Assertions.assertEquals(BillingCurrency.USD, model.value().get(0).estimatedVMPrices().billingCurrency());
        Assertions.assertEquals(UnitOfMeasure.ONE_HOUR, model.value().get(0).estimatedVMPrices().unitOfMeasure());
        Assertions.assertEquals("dgwdslfhot", model.value().get(0).supportedComputeTypes().get(0));
    }
}