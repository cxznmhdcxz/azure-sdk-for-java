// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for XMsDeleteSnapshots.
 */
public final class XMsDeleteSnapshots extends ExpandableStringEnum<XMsDeleteSnapshots> {
    /**
     * Static value true for XMsDeleteSnapshots.
     */
    public static final XMsDeleteSnapshots TRUE = fromString("true");

    /**
     * Static value false for XMsDeleteSnapshots.
     */
    public static final XMsDeleteSnapshots FALSE = fromString("false");

    /**
     * Creates a new instance of XMsDeleteSnapshots value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public XMsDeleteSnapshots() {
    }

    /**
     * Creates or finds a XMsDeleteSnapshots from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding XMsDeleteSnapshots.
     */
    @JsonCreator
    public static XMsDeleteSnapshots fromString(String name) {
        return fromString(name, XMsDeleteSnapshots.class);
    }

    /**
     * Gets known XMsDeleteSnapshots values.
     * 
     * @return known XMsDeleteSnapshots values.
     */
    public static Collection<XMsDeleteSnapshots> values() {
        return values(XMsDeleteSnapshots.class);
    }
}
