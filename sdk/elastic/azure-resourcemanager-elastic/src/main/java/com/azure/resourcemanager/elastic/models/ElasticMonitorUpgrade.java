// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Upgrade elastic monitor version. */
@Fluent
public final class ElasticMonitorUpgrade {
    /*
     * Version to which the elastic monitor should be upgraded to
     */
    @JsonProperty(value = "version")
    private String version;

    /** Creates an instance of ElasticMonitorUpgrade class. */
    public ElasticMonitorUpgrade() {
    }

    /**
     * Get the version property: Version to which the elastic monitor should be upgraded to.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version to which the elastic monitor should be upgraded to.
     *
     * @param version the version value to set.
     * @return the ElasticMonitorUpgrade object itself.
     */
    public ElasticMonitorUpgrade withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}