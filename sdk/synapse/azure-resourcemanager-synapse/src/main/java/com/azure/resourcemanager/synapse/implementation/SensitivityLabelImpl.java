// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabel;
import com.azure.resourcemanager.synapse.models.SensitivityLabelRank;

public final class SensitivityLabelImpl
    implements SensitivityLabel, SensitivityLabel.Definition, SensitivityLabel.Update {
    private SensitivityLabelInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public String schemaName() {
        return this.innerModel().schemaName();
    }

    public String tableName() {
        return this.innerModel().tableName();
    }

    public String columnName() {
        return this.innerModel().columnName();
    }

    public String labelName() {
        return this.innerModel().labelName();
    }

    public String labelId() {
        return this.innerModel().labelId();
    }

    public String informationType() {
        return this.innerModel().informationType();
    }

    public String informationTypeId() {
        return this.innerModel().informationTypeId();
    }

    public Boolean isDisabled() {
        return this.innerModel().isDisabled();
    }

    public SensitivityLabelRank rank() {
        return this.innerModel().rank();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SensitivityLabelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String sqlPoolName;

    private String schemaName;

    private String tableName;

    private String columnName;

    public SensitivityLabelImpl withExistingColumn(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.sqlPoolName = sqlPoolName;
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.columnName = columnName;
        return this;
    }

    public SensitivityLabel create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPoolSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    workspaceName,
                    sqlPoolName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public SensitivityLabel create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPoolSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    workspaceName,
                    sqlPoolName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    context)
                .getValue();
        return this;
    }

    SensitivityLabelImpl(com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new SensitivityLabelInner();
        this.serviceManager = serviceManager;
    }

    public SensitivityLabelImpl update() {
        return this;
    }

    public SensitivityLabel apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPoolSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    workspaceName,
                    sqlPoolName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public SensitivityLabel apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPoolSensitivityLabels()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    workspaceName,
                    sqlPoolName,
                    schemaName,
                    tableName,
                    columnName,
                    this.innerModel(),
                    context)
                .getValue();
        return this;
    }

    SensitivityLabelImpl(
        SensitivityLabelInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.sqlPoolName = Utils.getValueFromIdByName(innerObject.id(), "sqlPools");
        this.schemaName = Utils.getValueFromIdByName(innerObject.id(), "schemas");
        this.tableName = Utils.getValueFromIdByName(innerObject.id(), "tables");
        this.columnName = Utils.getValueFromIdByName(innerObject.id(), "columns");
    }

    public Response<Void> enableRecommendationWithResponse(Context context) {
        return serviceManager
            .sqlPoolSensitivityLabels()
            .enableRecommendationWithResponse(
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
    }

    public void enableRecommendation() {
        serviceManager
            .sqlPoolSensitivityLabels()
            .enableRecommendation(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName);
    }

    public Response<Void> disableRecommendationWithResponse(Context context) {
        return serviceManager
            .sqlPoolSensitivityLabels()
            .disableRecommendationWithResponse(
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
    }

    public void disableRecommendation() {
        serviceManager
            .sqlPoolSensitivityLabels()
            .disableRecommendation(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName);
    }

    public SensitivityLabelImpl withLabelName(String labelName) {
        this.innerModel().withLabelName(labelName);
        return this;
    }

    public SensitivityLabelImpl withLabelId(String labelId) {
        this.innerModel().withLabelId(labelId);
        return this;
    }

    public SensitivityLabelImpl withInformationType(String informationType) {
        this.innerModel().withInformationType(informationType);
        return this;
    }

    public SensitivityLabelImpl withInformationTypeId(String informationTypeId) {
        this.innerModel().withInformationTypeId(informationTypeId);
        return this;
    }

    public SensitivityLabelImpl withRank(SensitivityLabelRank rank) {
        this.innerModel().withRank(rank);
        return this;
    }
}
