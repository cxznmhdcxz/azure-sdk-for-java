// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The JobResourceConfiguration model. */
@Fluent
public final class JobResourceConfiguration extends ResourceConfiguration {
    /*
     * Extra arguments to pass to the Docker run command. This would override any parameters that have already been set
     * by the system, or in this section. This parameter is only supported for Azure ML compute types.
     */
    @JsonProperty(value = "dockerArgs")
    private String dockerArgs;

    /*
     * Size of the docker container's shared memory block. This should be in the format of (number)(unit) where number
     * as to be greater than 0 and the unit can be one of b(bytes), k(kilobytes), m(megabytes), or g(gigabytes).
     */
    @JsonProperty(value = "shmSize")
    private String shmSize;

    /** Creates an instance of JobResourceConfiguration class. */
    public JobResourceConfiguration() {
    }

    /**
     * Get the dockerArgs property: Extra arguments to pass to the Docker run command. This would override any
     * parameters that have already been set by the system, or in this section. This parameter is only supported for
     * Azure ML compute types.
     *
     * @return the dockerArgs value.
     */
    public String dockerArgs() {
        return this.dockerArgs;
    }

    /**
     * Set the dockerArgs property: Extra arguments to pass to the Docker run command. This would override any
     * parameters that have already been set by the system, or in this section. This parameter is only supported for
     * Azure ML compute types.
     *
     * @param dockerArgs the dockerArgs value to set.
     * @return the JobResourceConfiguration object itself.
     */
    public JobResourceConfiguration withDockerArgs(String dockerArgs) {
        this.dockerArgs = dockerArgs;
        return this;
    }

    /**
     * Get the shmSize property: Size of the docker container's shared memory block. This should be in the format of
     * (number)(unit) where number as to be greater than 0 and the unit can be one of b(bytes), k(kilobytes),
     * m(megabytes), or g(gigabytes).
     *
     * @return the shmSize value.
     */
    public String shmSize() {
        return this.shmSize;
    }

    /**
     * Set the shmSize property: Size of the docker container's shared memory block. This should be in the format of
     * (number)(unit) where number as to be greater than 0 and the unit can be one of b(bytes), k(kilobytes),
     * m(megabytes), or g(gigabytes).
     *
     * @param shmSize the shmSize value to set.
     * @return the JobResourceConfiguration object itself.
     */
    public JobResourceConfiguration withShmSize(String shmSize) {
        this.shmSize = shmSize;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceConfiguration withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceConfiguration withInstanceType(String instanceType) {
        super.withInstanceType(instanceType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobResourceConfiguration withProperties(Map<String, Object> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}