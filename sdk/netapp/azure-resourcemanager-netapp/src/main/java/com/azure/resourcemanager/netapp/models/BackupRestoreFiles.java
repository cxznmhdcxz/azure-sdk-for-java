// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Restore payload for Single File Backup Restore.
 */
@Fluent
public final class BackupRestoreFiles {
    /*
     * List of files to be restored
     */
    @JsonProperty(value = "fileList", required = true)
    private List<String> fileList;

    /*
     * Destination folder where the files will be restored. The path name should start with a forward slash. If it is
     * omitted from request then restore is done at the root folder of the destination volume by default
     */
    @JsonProperty(value = "restoreFilePath")
    private String restoreFilePath;

    /*
     * Resource Id of the destination volume on which the files need to be restored
     */
    @JsonProperty(value = "destinationVolumeId", required = true)
    private String destinationVolumeId;

    /**
     * Creates an instance of BackupRestoreFiles class.
     */
    public BackupRestoreFiles() {
    }

    /**
     * Get the fileList property: List of files to be restored.
     * 
     * @return the fileList value.
     */
    public List<String> fileList() {
        return this.fileList;
    }

    /**
     * Set the fileList property: List of files to be restored.
     * 
     * @param fileList the fileList value to set.
     * @return the BackupRestoreFiles object itself.
     */
    public BackupRestoreFiles withFileList(List<String> fileList) {
        this.fileList = fileList;
        return this;
    }

    /**
     * Get the restoreFilePath property: Destination folder where the files will be restored. The path name should
     * start with a forward slash. If it is omitted from request then restore is done at the root folder of the
     * destination volume by default.
     * 
     * @return the restoreFilePath value.
     */
    public String restoreFilePath() {
        return this.restoreFilePath;
    }

    /**
     * Set the restoreFilePath property: Destination folder where the files will be restored. The path name should
     * start with a forward slash. If it is omitted from request then restore is done at the root folder of the
     * destination volume by default.
     * 
     * @param restoreFilePath the restoreFilePath value to set.
     * @return the BackupRestoreFiles object itself.
     */
    public BackupRestoreFiles withRestoreFilePath(String restoreFilePath) {
        this.restoreFilePath = restoreFilePath;
        return this;
    }

    /**
     * Get the destinationVolumeId property: Resource Id of the destination volume on which the files need to be
     * restored.
     * 
     * @return the destinationVolumeId value.
     */
    public String destinationVolumeId() {
        return this.destinationVolumeId;
    }

    /**
     * Set the destinationVolumeId property: Resource Id of the destination volume on which the files need to be
     * restored.
     * 
     * @param destinationVolumeId the destinationVolumeId value to set.
     * @return the BackupRestoreFiles object itself.
     */
    public BackupRestoreFiles withDestinationVolumeId(String destinationVolumeId) {
        this.destinationVolumeId = destinationVolumeId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fileList() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property fileList in model BackupRestoreFiles"));
        }
        if (destinationVolumeId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property destinationVolumeId in model BackupRestoreFiles"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupRestoreFiles.class);
}
