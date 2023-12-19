// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of the replication.
 */
public final class MirrorState extends ExpandableStringEnum<MirrorState> {
    /**
     * Static value Uninitialized for MirrorState.
     */
    public static final MirrorState UNINITIALIZED = fromString("Uninitialized");

    /**
     * Static value Mirrored for MirrorState.
     */
    public static final MirrorState MIRRORED = fromString("Mirrored");

    /**
     * Static value Broken for MirrorState.
     */
    public static final MirrorState BROKEN = fromString("Broken");

    /**
     * Creates a new instance of MirrorState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MirrorState() {
    }

    /**
     * Creates or finds a MirrorState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MirrorState.
     */
    @JsonCreator
    public static MirrorState fromString(String name) {
        return fromString(name, MirrorState.class);
    }

    /**
     * Gets known MirrorState values.
     * 
     * @return known MirrorState values.
     */
    public static Collection<MirrorState> values() {
        return values(MirrorState.class);
    }
}
