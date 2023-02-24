// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptPackageInner;

public final class ScriptPackageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptPackageInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"gmhrskdsnfdsdoak\",\"version\":\"dlmkkzevdl\",\"company\":\"wpusdsttwvogv\",\"uri\":\"ejdcngqqmoakuf\"},\"id\":\"m\",\"name\":\"zr\",\"type\":\"rdgrtw\"}")
                .toObject(ScriptPackageInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptPackageInner model = new ScriptPackageInner();
        model = BinaryData.fromObject(model).toObject(ScriptPackageInner.class);
    }
}
