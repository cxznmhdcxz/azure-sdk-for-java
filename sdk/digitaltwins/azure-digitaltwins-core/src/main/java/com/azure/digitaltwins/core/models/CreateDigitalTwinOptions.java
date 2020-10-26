// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The optional parameters for
 * {@link com.azure.digitaltwins.core.DigitalTwinsClient#createOrReplaceDigitalTwinWithResponse(String, Object, Class, CreateDigitalTwinOptions, Context)} and
 * {@link com.azure.digitaltwins.core.DigitalTwinsAsyncClient#createOrReplaceDigitalTwinWithResponse(String, Object, Class, CreateDigitalTwinOptions)}
 */
@Fluent
public final class CreateDigitalTwinOptions {
    /*
     * Identifies the request in a distributed tracing system.
     */
    @JsonProperty(value = "traceparent")
    private String traceparent;

    /*
     * Provides vendor-specific trace identification information and is a
     * companion to traceparent.
     */
    @JsonProperty(value = "tracestate")
    private String tracestate;

    /*
     * If-Non-Match header that makes the request method conditional on a recipient cache or origin server either not having any current representation of the target resource.
     * Acceptable values are null or "*".
     * If IfNonMatch option is null the service will replace the existing entity with the new entity.
     * If IfNonMatch option is "*" the service will reject the request if the entity already exists.
     */
    @JsonProperty(value = "If-None-Match")
    private String ifNoneMatch;

    /**
     * Get the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @return the traceparent value.
     */
    public String getTraceParent() {
        return this.traceparent;
    }

    /**
     * Get the ifNoneMatch property
     *
     * If-Non-Match header makes the request method conditional on a recipient cache or origin server either not having any current representation of the target resource.
     * Acceptable values are null or "*".
     * If IfNonMatch option is null the service will replace the existing entity with the new entity.
     * If IfNonMatch option is "*" the service will reject the request if the entity already exists.
     *
     * @return the ifNoneMatch value.
     */
    public String getIfNoneMatch() {
        return this.ifNoneMatch;
    }

    /**
     * Set the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @param traceparent the traceparent value to set.
     * @return the CreateDigitalTwinOptions object itself.
     */
    public CreateDigitalTwinOptions setTraceParent(String traceparent) {
        this.traceparent = traceparent;
        return this;
    }

    /**
     * Get the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @return the tracestate value.
     */
    public String getTraceState() {
        return this.tracestate;
    }

    /**
     * Set the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @param tracestate the tracestate value to set.
     * @return the CreateDigitalTwinOptions object itself.
     */
    public CreateDigitalTwinOptions setTraceState(String tracestate) {
        this.tracestate = tracestate;
        return this;
    }

    /**
     * Set the ifNoneMatch property.
     *
     * If-Non-Match header makes the request method conditional on a recipient cache or origin server either not having any current representation of the target resource.
     * Acceptable values are null or "*".
     * If IfNonMatch option is null the service will replace the existing entity with the new entity.
     * If IfNonMatch option is "*" the service will reject the request if the entity already exists.
     *
     * @param ifNoneMatch the ifNoneMatch value to set.
     * @return the CreateRelationshipOptions object itself.
     */
    public CreateDigitalTwinOptions setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}
