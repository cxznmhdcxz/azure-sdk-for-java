// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.SqlPoolTableListResult;

public final class SqlPoolTableListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlPoolTableListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"durgkakmokz\",\"name\":\"jjklff\",\"type\":\"mouwqlgzrfzeey\"},{\"id\":\"bizikayuhq\",\"name\":\"bjbsybb\",\"type\":\"wrv\"},{\"id\":\"ldgmfpgvmpip\",\"name\":\"slthaq\",\"type\":\"x\"}],\"nextLink\":\"mwutwbdsre\"}")
                .toObject(SqlPoolTableListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlPoolTableListResult model = new SqlPoolTableListResult();
        model = BinaryData.fromObject(model).toObject(SqlPoolTableListResult.class);
    }
}
