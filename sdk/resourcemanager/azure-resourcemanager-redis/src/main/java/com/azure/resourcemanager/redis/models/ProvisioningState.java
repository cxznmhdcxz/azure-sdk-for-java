// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Redis instance provisioning status. */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /** Static value Creating for ProvisioningState. */
    public static final ProvisioningState CREATING = fromString("Creating");

    /** Static value Deleting for ProvisioningState. */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /** Static value Disabled for ProvisioningState. */
    public static final ProvisioningState DISABLED = fromString("Disabled");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = fromString("Failed");

    /** Static value Linking for ProvisioningState. */
    public static final ProvisioningState LINKING = fromString("Linking");

    /** Static value Provisioning for ProvisioningState. */
    public static final ProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value RecoveringScaleFailure for ProvisioningState. */
    public static final ProvisioningState RECOVERING_SCALE_FAILURE = fromString("RecoveringScaleFailure");

    /** Static value Scaling for ProvisioningState. */
    public static final ProvisioningState SCALING = fromString("Scaling");

    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Unlinking for ProvisioningState. */
    public static final ProvisioningState UNLINKING = fromString("Unlinking");

    /** Static value Unprovisioning for ProvisioningState. */
    public static final ProvisioningState UNPROVISIONING = fromString("Unprovisioning");

    /** Static value Updating for ProvisioningState. */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningState() {
    }

    /**
     * Creates or finds a ProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    @JsonCreator
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * Gets known ProvisioningState values.
     *
     * @return known ProvisioningState values.
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
