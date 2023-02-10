// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabelRank;
import org.junit.jupiter.api.Assertions;

public final class SensitivityLabelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SensitivityLabelInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"schemaName\":\"odko\",\"tableName\":\"bw\",\"columnName\":\"jhemms\",\"labelName\":\"dkcrodt\",\"labelId\":\"nfwjlfltkacjvefk\",\"informationType\":\"foakgg\",\"informationTypeId\":\"pagao\",\"isDisabled\":true,\"rank\":\"None\"},\"managedBy\":\"blylsyxkqjnsj\",\"id\":\"r\",\"name\":\"tiagx\",\"type\":\"dszue\"}")
                .toObject(SensitivityLabelInner.class);
        Assertions.assertEquals("dkcrodt", model.labelName());
        Assertions.assertEquals("nfwjlfltkacjvefk", model.labelId());
        Assertions.assertEquals("foakgg", model.informationType());
        Assertions.assertEquals("pagao", model.informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.NONE, model.rank());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SensitivityLabelInner model =
            new SensitivityLabelInner()
                .withLabelName("dkcrodt")
                .withLabelId("nfwjlfltkacjvefk")
                .withInformationType("foakgg")
                .withInformationTypeId("pagao")
                .withRank(SensitivityLabelRank.NONE);
        model = BinaryData.fromObject(model).toObject(SensitivityLabelInner.class);
        Assertions.assertEquals("dkcrodt", model.labelName());
        Assertions.assertEquals("nfwjlfltkacjvefk", model.labelId());
        Assertions.assertEquals("foakgg", model.informationType());
        Assertions.assertEquals("pagao", model.informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.NONE, model.rank());
    }
}
