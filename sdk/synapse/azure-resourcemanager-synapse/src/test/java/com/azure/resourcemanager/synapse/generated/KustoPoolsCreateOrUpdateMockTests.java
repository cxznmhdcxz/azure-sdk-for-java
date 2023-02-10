// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.KustoPool;
import com.azure.resourcemanager.synapse.models.OptimizedAutoscale;
import com.azure.resourcemanager.synapse.models.SkuName;
import com.azure.resourcemanager.synapse.models.SkuSize;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class KustoPoolsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"Storage optimized\",\"capacity\":1921573518,\"size\":\"Extra"
                + " small\"},\"properties\":{\"state\":\"Running\",\"provisioningState\":\"Succeeded\",\"uri\":\"gzb\",\"dataIngestionUri\":\"qfbifo\",\"stateReason\":\"jxdwdrpazqjkr\",\"optimizedAutoscale\":{\"version\":1166812452,\"isEnabled\":false,\"minimum\":1534601140,\"maximum\":178824260},\"enableStreamingIngest\":false,\"enablePurge\":true,\"languageExtensions\":{\"value\":[]},\"workspaceUID\":\"jigpgayiawohfmh\"},\"etag\":\"zmecjjkmqenhai\",\"location\":\"rpvsgloiovs\",\"tags\":{\"suvw\":\"v\",\"i\":\"enbg\",\"oa\":\"pkhc\"},\"id\":\"xukuicjuftekio\",\"name\":\"anduew\",\"type\":\"hvpxjhxz\"}";

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

        SynapseManager manager =
            SynapseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        KustoPool response =
            manager
                .kustoPools()
                .define("kwopswnyinxupr")
                .withRegion("gvp")
                .withExistingWorkspace("pjwkosnyxigf", "ujjcxgdqmrlhn")
                .withSku(
                    new AzureSku().withName(SkuName.STORAGE_OPTIMIZED).withCapacity(1081669809).withSize(SkuSize.LARGE))
                .withTags(
                    mapOf(
                        "ulwkq",
                        "gjjktfinfhoksmm",
                        "okr",
                        "cru",
                        "tqpqsdoctpzpujzf",
                        "flsgaoj",
                        "lu",
                        "mcdsgxcelujisw"))
                .withOptimizedAutoscale(
                    new OptimizedAutoscale()
                        .withVersion(918352946)
                        .withIsEnabled(false)
                        .withMinimum(482333072)
                        .withMaximum(1912292720))
                .withEnableStreamingIngest(true)
                .withEnablePurge(true)
                .withWorkspaceUid("m")
                .withIfMatch("yt")
                .withIfNoneMatch("pdz")
                .create();

        Assertions.assertEquals("rpvsgloiovs", response.location());
        Assertions.assertEquals("v", response.tags().get("suvw"));
        Assertions.assertEquals(SkuName.STORAGE_OPTIMIZED, response.sku().name());
        Assertions.assertEquals(1921573518, response.sku().capacity());
        Assertions.assertEquals(SkuSize.EXTRA_SMALL, response.sku().size());
        Assertions.assertEquals(1166812452, response.optimizedAutoscale().version());
        Assertions.assertEquals(false, response.optimizedAutoscale().isEnabled());
        Assertions.assertEquals(1534601140, response.optimizedAutoscale().minimum());
        Assertions.assertEquals(178824260, response.optimizedAutoscale().maximum());
        Assertions.assertEquals(false, response.enableStreamingIngest());
        Assertions.assertEquals(true, response.enablePurge());
        Assertions.assertEquals("jigpgayiawohfmh", response.workspaceUid());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
