// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Spark pool auto-scaling properties
 *
 * <p>Auto-scaling properties of a Big Data pool powered by Apache Spark.
 */
@Fluent
public final class AutoScaleProperties {
    /*
     * The minimum number of nodes the Big Data pool can support.
     */
    @JsonProperty(value = "minNodeCount")
    private Integer minNodeCount;

    /*
     * Whether automatic scaling is enabled for the Big Data pool.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The maximum number of nodes the Big Data pool can support.
     */
    @JsonProperty(value = "maxNodeCount")
    private Integer maxNodeCount;

    /** Creates an instance of AutoScaleProperties class. */
    public AutoScaleProperties() {
    }

    /**
     * Get the minNodeCount property: The minimum number of nodes the Big Data pool can support.
     *
     * @return the minNodeCount value.
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    /**
     * Set the minNodeCount property: The minimum number of nodes the Big Data pool can support.
     *
     * @param minNodeCount the minNodeCount value to set.
     * @return the AutoScaleProperties object itself.
     */
    public AutoScaleProperties withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    /**
     * Get the enabled property: Whether automatic scaling is enabled for the Big Data pool.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether automatic scaling is enabled for the Big Data pool.
     *
     * @param enabled the enabled value to set.
     * @return the AutoScaleProperties object itself.
     */
    public AutoScaleProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the maxNodeCount property: The maximum number of nodes the Big Data pool can support.
     *
     * @return the maxNodeCount value.
     */
    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Set the maxNodeCount property: The maximum number of nodes the Big Data pool can support.
     *
     * @param maxNodeCount the maxNodeCount value to set.
     * @return the AutoScaleProperties object itself.
     */
    public AutoScaleProperties withMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
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
