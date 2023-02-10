// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.SparkConfigurationResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of SparkConfiguration resources. */
@Fluent
public final class SparkConfigurationListResponse {
    /*
     * List of SparkConfiguration.
     */
    @JsonProperty(value = "value", required = true)
    private List<SparkConfigurationResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of SparkConfigurationListResponse class. */
    public SparkConfigurationListResponse() {
    }

    /**
     * Get the value property: List of SparkConfiguration.
     *
     * @return the value value.
     */
    public List<SparkConfigurationResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of SparkConfiguration.
     *
     * @param value the value value to set.
     * @return the SparkConfigurationListResponse object itself.
     */
    public SparkConfigurationListResponse withValue(List<SparkConfigurationResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the SparkConfigurationListResponse object itself.
     */
    public SparkConfigurationListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model SparkConfigurationListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SparkConfigurationListResponse.class);
}
