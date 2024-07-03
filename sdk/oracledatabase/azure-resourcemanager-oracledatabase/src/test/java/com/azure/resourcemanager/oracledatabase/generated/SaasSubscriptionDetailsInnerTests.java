// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.SaasSubscriptionDetailsInner;

public final class SaasSubscriptionDetailsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SaasSubscriptionDetailsInner model = BinaryData.fromString(
            "{\"id\":\"abikns\",\"subscriptionName\":\"gj\",\"timeCreated\":\"2021-10-23T19:23:01Z\",\"offerId\":\"dtlwwrlkd\",\"planId\":\"ncvokotllxdyhg\",\"saasSubscriptionStatus\":\"ocogj\",\"publisherId\":\"dtbnnha\",\"purchaserEmailId\":\"ocrkvcikh\",\"purchaserTenantId\":\"p\",\"termUnit\":\"qgxqquezikyw\",\"isAutoRenew\":false,\"isFreeTrial\":true}")
            .toObject(SaasSubscriptionDetailsInner.class);
    }
}
