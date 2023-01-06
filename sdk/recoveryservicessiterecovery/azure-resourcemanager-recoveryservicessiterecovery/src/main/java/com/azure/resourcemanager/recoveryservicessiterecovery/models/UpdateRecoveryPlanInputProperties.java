// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Recovery plan update properties. */
@Fluent
public final class UpdateRecoveryPlanInputProperties {
    /*
     * The recovery plan groups.
     */
    @JsonProperty(value = "groups")
    private List<RecoveryPlanGroup> groups;

    /** Creates an instance of UpdateRecoveryPlanInputProperties class. */
    public UpdateRecoveryPlanInputProperties() {
    }

    /**
     * Get the groups property: The recovery plan groups.
     *
     * @return the groups value.
     */
    public List<RecoveryPlanGroup> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The recovery plan groups.
     *
     * @param groups the groups value to set.
     * @return the UpdateRecoveryPlanInputProperties object itself.
     */
    public UpdateRecoveryPlanInputProperties withGroups(List<RecoveryPlanGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
    }
}