// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Migrate provider specific input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = MigrateProviderSpecificInput.class)
@JsonTypeName("MigrateProviderSpecificInput")
@JsonSubTypes({@JsonSubTypes.Type(name = "VMwareCbt", value = VMwareCbtMigrateInput.class)})
@Immutable
public class MigrateProviderSpecificInput {
    /** Creates an instance of MigrateProviderSpecificInput class. */
    public MigrateProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}