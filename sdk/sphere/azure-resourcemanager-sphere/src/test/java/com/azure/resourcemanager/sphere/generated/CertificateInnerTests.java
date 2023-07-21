// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.CertificateInner;

public final class CertificateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"certificate\":\"eotusivyevc\",\"status\":\"Active\",\"subject\":\"hn\",\"thumbprint\":\"ngbwjz\",\"expiryUtc\":\"2020-12-28T13:19:57Z\",\"notBeforeUtc\":\"2021-11-04T09:44:48Z\",\"provisioningState\":\"Failed\"},\"id\":\"spemvtzfk\",\"name\":\"fublj\",\"type\":\"fxqeof\"}")
                .toObject(CertificateInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateInner model = new CertificateInner();
        model = BinaryData.fromObject(model).toObject(CertificateInner.class);
    }
}
