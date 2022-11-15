// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A class represent the compliance category. */
@Immutable
public final class Category {
    /*
     * The name of the compliance category. e.g. "Operational Security"
     */
    @JsonProperty(value = "categoryName", access = JsonProperty.Access.WRITE_ONLY)
    private String categoryName;

    /*
     * The category type
     */
    @JsonProperty(value = "categoryType", access = JsonProperty.Access.WRITE_ONLY)
    private CategoryType categoryType;

    /*
     * Category status.
     */
    @JsonProperty(value = "categoryStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CategoryStatus categoryStatus;

    /*
     * List of control families.
     */
    @JsonProperty(value = "controlFamilies", access = JsonProperty.Access.WRITE_ONLY)
    private List<ControlFamily> controlFamilies;

    /** Creates an instance of Category class. */
    public Category() {
    }

    /**
     * Get the categoryName property: The name of the compliance category. e.g. "Operational Security".
     *
     * @return the categoryName value.
     */
    public String categoryName() {
        return this.categoryName;
    }

    /**
     * Get the categoryType property: The category type.
     *
     * @return the categoryType value.
     */
    public CategoryType categoryType() {
        return this.categoryType;
    }

    /**
     * Get the categoryStatus property: Category status.
     *
     * @return the categoryStatus value.
     */
    public CategoryStatus categoryStatus() {
        return this.categoryStatus;
    }

    /**
     * Get the controlFamilies property: List of control families.
     *
     * @return the controlFamilies value.
     */
    public List<ControlFamily> controlFamilies() {
        return this.controlFamilies;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlFamilies() != null) {
            controlFamilies().forEach(e -> e.validate());
        }
    }
}