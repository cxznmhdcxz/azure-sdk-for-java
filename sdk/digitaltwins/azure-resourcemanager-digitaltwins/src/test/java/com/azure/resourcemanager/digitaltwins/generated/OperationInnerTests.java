// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.fluent.models.OperationInner;
import com.azure.resourcemanager.digitaltwins.models.OperationDisplay;
import org.junit.jupiter.api.Test;

public final class OperationInnerTests {
    @Test
    public void testDeserialize() {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"attpngjcrcczsq\",\"display\":{\"provider\":\"vmdajvnysou\",\"resource\":\"e\",\"operation\":\"noae\",\"description\":\"fhyhltrpmopjmcma\"},\"origin\":\"okth\",\"isDataAction\":false,\"properties\":{\"zydagfuaxbezyiuo\":\"dataodsfcpkvxodpuozm\",\"dxwzywqsmbsurexi\":\"dataktwh\",\"yocf\":\"datao\"}}")
                .toObject(OperationInner.class);
    }

    @Test
    public void testSerialize() {
        OperationInner model = new OperationInner().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
    }
}