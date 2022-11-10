// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.JobBase;
import com.azure.resourcemanager.machinelearning.models.ListViewType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"jobType\":\"JobBaseProperties\",\"componentId\":\"tvzjyi\",\"computeId\":\"bqrvvbqv\",\"displayName\":\"mpe\",\"experimentName\":\"xgiqasifubn\",\"identity\":{\"identityType\":\"IdentityConfiguration\"},\"isArchived\":true,\"services\":{},\"status\":\"Completed\",\"description\":\"jnxjkht\",\"properties\":{\"xfwkz\":\"vyouweui\",\"kqytkztadopgfzdg\":\"smsfbevyllznf\"},\"tags\":{\"svloyyhigq\":\"yc\"}},\"id\":\"juqwqajq\",\"name\":\"zxpixhyo\",\"type\":\"pnfdbgsosciene\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JobBase> response =
            manager
                .jobs()
                .list(
                    "hrbkhtmqowi",
                    "asfgqgucyhfaimqv",
                    "ruozkgyfp",
                    "oehgfmqmskkixvlz",
                    "xplhpeva",
                    ListViewType.ALL,
                    Context.NONE);

        Assertions.assertEquals("jnxjkht", response.iterator().next().properties().description());
        Assertions.assertEquals("vyouweui", response.iterator().next().properties().properties().get("xfwkz"));
        Assertions.assertEquals("yc", response.iterator().next().properties().tags().get("svloyyhigq"));
        Assertions.assertEquals("tvzjyi", response.iterator().next().properties().componentId());
        Assertions.assertEquals("bqrvvbqv", response.iterator().next().properties().computeId());
        Assertions.assertEquals("mpe", response.iterator().next().properties().displayName());
        Assertions.assertEquals("xgiqasifubn", response.iterator().next().properties().experimentName());
        Assertions.assertEquals(true, response.iterator().next().properties().isArchived());
    }
}