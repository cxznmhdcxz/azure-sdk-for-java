// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** What is this?. */
@Fluent
public final class OperationMetaServiceSpecification {
    /*
     * Service metric specifications
     */
    @JsonProperty(value = "metricSpecifications")
    private List<OperationMetaMetricSpecification> metricSpecifications;

    /*
     * Service log specifications
     */
    @JsonProperty(value = "logSpecifications")
    private List<OperationMetaLogSpecification> logSpecifications;

    /** Creates an instance of OperationMetaServiceSpecification class. */
    public OperationMetaServiceSpecification() {
    }

    /**
     * Get the metricSpecifications property: Service metric specifications.
     *
     * @return the metricSpecifications value.
     */
    public List<OperationMetaMetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Service metric specifications.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the OperationMetaServiceSpecification object itself.
     */
    public OperationMetaServiceSpecification withMetricSpecifications(
        List<OperationMetaMetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications property: Service log specifications.
     *
     * @return the logSpecifications value.
     */
    public List<OperationMetaLogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Service log specifications.
     *
     * @param logSpecifications the logSpecifications value to set.
     * @return the OperationMetaServiceSpecification object itself.
     */
    public OperationMetaServiceSpecification withLogSpecifications(
        List<OperationMetaLogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }
}
