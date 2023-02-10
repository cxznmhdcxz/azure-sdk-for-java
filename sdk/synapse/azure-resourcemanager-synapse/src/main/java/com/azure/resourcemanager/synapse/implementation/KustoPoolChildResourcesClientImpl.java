// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.KustoPoolChildResourcesClient;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.synapse.models.DatabaseCheckNameRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in KustoPoolChildResourcesClient. */
public final class KustoPoolChildResourcesClientImpl implements KustoPoolChildResourcesClient {
    /** The proxy service used to perform REST calls. */
    private final KustoPoolChildResourcesService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of KustoPoolChildResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    KustoPoolChildResourcesClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(KustoPoolChildResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientKustoPoolChildResources to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface KustoPoolChildResourcesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/kustoPools/{kustoPoolName}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameResultInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("kustoPoolName") String kustoPoolName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DatabaseCheckNameRequest resourceName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks that the Kusto Pool child resource name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Kusto Pool child resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameResultInner>> checkNameAvailabilityWithResponseAsync(
        String workspaceName, String kustoPoolName, String resourceGroupName, DatabaseCheckNameRequest resourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (kustoPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter kustoPoolName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        } else {
            resourceName.validate();
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            workspaceName,
                            kustoPoolName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            apiVersion,
                            resourceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks that the Kusto Pool child resource name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Kusto Pool child resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameResultInner>> checkNameAvailabilityWithResponseAsync(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        DatabaseCheckNameRequest resourceName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (kustoPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter kustoPoolName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        } else {
            resourceName.validate();
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                workspaceName,
                kustoPoolName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                apiVersion,
                resourceName,
                accept,
                context);
    }

    /**
     * Checks that the Kusto Pool child resource name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Kusto Pool child resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameResultInner> checkNameAvailabilityAsync(
        String workspaceName, String kustoPoolName, String resourceGroupName, DatabaseCheckNameRequest resourceName) {
        return checkNameAvailabilityWithResponseAsync(workspaceName, kustoPoolName, resourceGroupName, resourceName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks that the Kusto Pool child resource name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Kusto Pool child resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        DatabaseCheckNameRequest resourceName,
        Context context) {
        return checkNameAvailabilityWithResponseAsync(
                workspaceName, kustoPoolName, resourceGroupName, resourceName, context)
            .block();
    }

    /**
     * Checks that the Kusto Pool child resource name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Kusto Pool child resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameResultInner checkNameAvailability(
        String workspaceName, String kustoPoolName, String resourceGroupName, DatabaseCheckNameRequest resourceName) {
        return checkNameAvailabilityWithResponse(
                workspaceName, kustoPoolName, resourceGroupName, resourceName, Context.NONE)
            .getValue();
    }
}
