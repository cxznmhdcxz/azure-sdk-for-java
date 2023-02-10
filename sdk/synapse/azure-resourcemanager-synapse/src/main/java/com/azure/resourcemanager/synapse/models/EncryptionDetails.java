// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the encryption associated with the workspace. */
@Fluent
public final class EncryptionDetails {
    /*
     * Double Encryption enabled
     */
    @JsonProperty(value = "doubleEncryptionEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean doubleEncryptionEnabled;

    /*
     * Customer Managed Key Details
     */
    @JsonProperty(value = "cmk")
    private CustomerManagedKeyDetails cmk;

    /** Creates an instance of EncryptionDetails class. */
    public EncryptionDetails() {
    }

    /**
     * Get the doubleEncryptionEnabled property: Double Encryption enabled.
     *
     * @return the doubleEncryptionEnabled value.
     */
    public Boolean doubleEncryptionEnabled() {
        return this.doubleEncryptionEnabled;
    }

    /**
     * Get the cmk property: Customer Managed Key Details.
     *
     * @return the cmk value.
     */
    public CustomerManagedKeyDetails cmk() {
        return this.cmk;
    }

    /**
     * Set the cmk property: Customer Managed Key Details.
     *
     * @param cmk the cmk value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withCmk(CustomerManagedKeyDetails cmk) {
        this.cmk = cmk;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cmk() != null) {
            cmk().validate();
        }
    }
}
