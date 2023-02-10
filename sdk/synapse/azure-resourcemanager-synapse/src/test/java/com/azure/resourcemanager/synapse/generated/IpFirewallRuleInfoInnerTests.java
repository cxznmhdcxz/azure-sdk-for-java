// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.IpFirewallRuleInfoInner;
import org.junit.jupiter.api.Assertions;

public final class IpFirewallRuleInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpFirewallRuleInfoInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"endIpAddress\":\"kuksjtxukcdm\",\"provisioningState\":\"Succeeded\",\"startIpAddress\":\"ryuanzwuxzdxtay\"},\"id\":\"lhmwhfpmrqobm\",\"name\":\"u\",\"type\":\"knryrtihfxtij\"}")
                .toObject(IpFirewallRuleInfoInner.class);
        Assertions.assertEquals("kuksjtxukcdm", model.endIpAddress());
        Assertions.assertEquals("ryuanzwuxzdxtay", model.startIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpFirewallRuleInfoInner model =
            new IpFirewallRuleInfoInner().withEndIpAddress("kuksjtxukcdm").withStartIpAddress("ryuanzwuxzdxtay");
        model = BinaryData.fromObject(model).toObject(IpFirewallRuleInfoInner.class);
        Assertions.assertEquals("kuksjtxukcdm", model.endIpAddress());
        Assertions.assertEquals("ryuanzwuxzdxtay", model.startIpAddress());
    }
}
