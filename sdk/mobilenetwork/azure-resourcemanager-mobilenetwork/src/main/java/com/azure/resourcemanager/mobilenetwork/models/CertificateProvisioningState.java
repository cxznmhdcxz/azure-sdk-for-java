// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The certificate's provisioning state. */
public final class CertificateProvisioningState extends ExpandableStringEnum<CertificateProvisioningState> {
    /** Static value NotProvisioned for CertificateProvisioningState. */
    public static final CertificateProvisioningState NOT_PROVISIONED = fromString("NotProvisioned");

    /** Static value Provisioned for CertificateProvisioningState. */
    public static final CertificateProvisioningState PROVISIONED = fromString("Provisioned");

    /** Static value Failed for CertificateProvisioningState. */
    public static final CertificateProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a CertificateProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateProvisioningState.
     */
    @JsonCreator
    public static CertificateProvisioningState fromString(String name) {
        return fromString(name, CertificateProvisioningState.class);
    }

    /**
     * Gets known CertificateProvisioningState values.
     *
     * @return known CertificateProvisioningState values.
     */
    public static Collection<CertificateProvisioningState> values() {
        return values(CertificateProvisioningState.class);
    }
}