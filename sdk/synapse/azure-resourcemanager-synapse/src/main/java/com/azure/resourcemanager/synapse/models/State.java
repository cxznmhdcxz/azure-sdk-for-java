// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the resource. */
public final class State extends ExpandableStringEnum<State> {
    /** Static value Creating for State. */
    public static final State CREATING = fromString("Creating");

    /** Static value Unavailable for State. */
    public static final State UNAVAILABLE = fromString("Unavailable");

    /** Static value Running for State. */
    public static final State RUNNING = fromString("Running");

    /** Static value Deleting for State. */
    public static final State DELETING = fromString("Deleting");

    /** Static value Deleted for State. */
    public static final State DELETED = fromString("Deleted");

    /** Static value Stopping for State. */
    public static final State STOPPING = fromString("Stopping");

    /** Static value Stopped for State. */
    public static final State STOPPED = fromString("Stopped");

    /** Static value Starting for State. */
    public static final State STARTING = fromString("Starting");

    /** Static value Updating for State. */
    public static final State UPDATING = fromString("Updating");

    /**
     * Creates a new instance of State value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public State() {
    }

    /**
     * Creates or finds a State from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /**
     * Gets known State values.
     *
     * @return known State values.
     */
    public static Collection<State> values() {
        return values(State.class);
    }
}
