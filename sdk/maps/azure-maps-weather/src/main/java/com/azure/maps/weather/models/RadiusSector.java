// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Bearing 0–90 = NE quadrant; 90–180 = SE quadrant; 180–270 = SW quadrant; 270–360 = NW quadrant. */
@Fluent
public final class RadiusSector {
    /*
     * Bearing, in degrees, of the beginning of the quadrant.
     */
    @JsonProperty(value = "beginBearing")
    private Double beginBearing;

    /*
     * Bearing, in degrees, of the end of the quadrant.
     */
    @JsonProperty(value = "endBearing")
    private Double endBearing;

    /*
     * The radius of the quadrant, in nautical miles.
     */
    @JsonProperty(value = "range")
    private Double radius;

    /** Set default RadiusSector constructor to private */
    private RadiusSector() {}

    /**
     * Get the beginBearing property: Bearing, in degrees, of the beginning of the quadrant.
     *
     * @return the beginBearing value.
     */
    public Double getBeginBearing() {
        return this.beginBearing;
    }

    /**
     * Get the endBearing property: Bearing, in degrees, of the end of the quadrant.
     *
     * @return the endBearing value.
     */
    public Double getEndBearing() {
        return this.endBearing;
    }

    /**
     * Get the radius property: The radius of the quadrant, in nautical miles.
     *
     * @return the radius value.
     */
    public Double getRadius() {
        return this.radius;
    }
}