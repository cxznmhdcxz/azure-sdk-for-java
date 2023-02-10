// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIntegrationRuntimeManagedVirtualNetworkReference;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIntegrationRuntimeTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Managed integration runtime, including managed elastic and managed dedicated integration runtimes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Managed")
@Fluent
public final class ManagedIntegrationRuntime extends IntegrationRuntime {
    /*
     * Integration runtime state, only valid for managed dedicated integration runtime.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeState state;

    /*
     * Managed integration runtime properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ManagedIntegrationRuntimeTypeProperties innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();

    /*
     * Managed integration runtime managed virtual network.
     */
    @JsonProperty(value = "managedVirtualNetwork")
    private ManagedIntegrationRuntimeManagedVirtualNetworkReference innerManagedVirtualNetwork;

    /** Creates an instance of ManagedIntegrationRuntime class. */
    public ManagedIntegrationRuntime() {
    }

    /**
     * Get the state property: Integration runtime state, only valid for managed dedicated integration runtime.
     *
     * @return the state value.
     */
    public IntegrationRuntimeState state() {
        return this.state;
    }

    /**
     * Get the innerTypeProperties property: Managed integration runtime properties.
     *
     * @return the innerTypeProperties value.
     */
    private ManagedIntegrationRuntimeTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the innerManagedVirtualNetwork property: Managed integration runtime managed virtual network.
     *
     * @return the innerManagedVirtualNetwork value.
     */
    private ManagedIntegrationRuntimeManagedVirtualNetworkReference innerManagedVirtualNetwork() {
        return this.innerManagedVirtualNetwork;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedIntegrationRuntime withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Get the computeProperties property: The compute resource for managed integration runtime.
     *
     * @return the computeProperties value.
     */
    public IntegrationRuntimeComputeProperties computeProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().computeProperties();
    }

    /**
     * Set the computeProperties property: The compute resource for managed integration runtime.
     *
     * @param computeProperties the computeProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withComputeProperties(IntegrationRuntimeComputeProperties computeProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withComputeProperties(computeProperties);
        return this;
    }

    /**
     * Get the ssisProperties property: SSIS properties for managed integration runtime.
     *
     * @return the ssisProperties value.
     */
    public IntegrationRuntimeSsisProperties ssisProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().ssisProperties();
    }

    /**
     * Set the ssisProperties property: SSIS properties for managed integration runtime.
     *
     * @param ssisProperties the ssisProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withSsisProperties(IntegrationRuntimeSsisProperties ssisProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withSsisProperties(ssisProperties);
        return this;
    }

    /**
     * Get the referenceName property: The reference name of the managed virtual network.
     *
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.innerManagedVirtualNetwork() == null ? null : this.innerManagedVirtualNetwork().referenceName();
    }

    /**
     * Set the referenceName property: The reference name of the managed virtual network.
     *
     * @param referenceName the referenceName value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withReferenceName(String referenceName) {
        if (this.innerManagedVirtualNetwork() == null) {
            this.innerManagedVirtualNetwork = new ManagedIntegrationRuntimeManagedVirtualNetworkReference();
        }
        this.innerManagedVirtualNetwork().withReferenceName(referenceName);
        return this;
    }

    /**
     * Get the type property: The type of the managed virtual network.
     *
     * @return the type value.
     */
    public String typeManagedVirtualNetworkType() {
        return this.innerManagedVirtualNetwork() == null ? null : this.innerManagedVirtualNetwork().type();
    }

    /**
     * Set the type property: The type of the managed virtual network.
     *
     * @param type the type value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withTypeManagedVirtualNetworkType(String type) {
        if (this.innerManagedVirtualNetwork() == null) {
            this.innerManagedVirtualNetwork = new ManagedIntegrationRuntimeManagedVirtualNetworkReference();
        }
        this.innerManagedVirtualNetwork().withType(type);
        return this;
    }

    /**
     * Get the id property: The id of the managed virtual network.
     *
     * @return the id value.
     */
    public String id() {
        return this.innerManagedVirtualNetwork() == null ? null : this.innerManagedVirtualNetwork().id();
    }

    /**
     * Set the id property: The id of the managed virtual network.
     *
     * @param id the id value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withId(String id) {
        if (this.innerManagedVirtualNetwork() == null) {
            this.innerManagedVirtualNetwork = new ManagedIntegrationRuntimeManagedVirtualNetworkReference();
        }
        this.innerManagedVirtualNetwork().withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model ManagedIntegrationRuntime"));
        } else {
            innerTypeProperties().validate();
        }
        if (innerManagedVirtualNetwork() != null) {
            innerManagedVirtualNetwork().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedIntegrationRuntime.class);
}
