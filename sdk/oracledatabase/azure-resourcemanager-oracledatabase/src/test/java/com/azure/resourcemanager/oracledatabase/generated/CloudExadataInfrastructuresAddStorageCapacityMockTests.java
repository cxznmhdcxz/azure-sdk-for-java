// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructure;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekName;
import com.azure.resourcemanager.oracledatabase.models.MonthName;
import com.azure.resourcemanager.oracledatabase.models.PatchingMode;
import com.azure.resourcemanager.oracledatabase.models.Preference;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CloudExadataInfrastructuresAddStorageCapacityMockTests {
    @Test
    public void testAddStorageCapacity() throws Exception {
        String responseStr
            = "{\"properties\":{\"ocid\":\"ethwwnpjhlfz\",\"computeCount\":1188676468,\"storageCount\":286029516,\"totalStorageSizeInGbs\":1831008288,\"availableStorageSizeInGbs\":443480039,\"timeCreated\":\"ousnfepgfewe\",\"lifecycleDetails\":\"l\",\"maintenanceWindow\":{\"preference\":\"CustomPreference\",\"months\":[{\"name\":\"October\"},{\"name\":\"March\"}],\"weeksOfMonth\":[1693425826,1841615082,31870038],\"daysOfWeek\":[{\"name\":\"Saturday\"},{\"name\":\"Monday\"}],\"hoursOfDay\":[122728116,205471182,156651258],\"leadTimeInWeeks\":507931039,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":2111689562,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":2099566654,\"estimatedNetworkSwitchesPatchingTime\":398428257,\"estimatedStorageServerPatchingTime\":1212582847,\"totalEstimatedPatchingTime\":1356255115},\"customerContacts\":[{\"email\":\"qscjavftjuh\"},{\"email\":\"qaz\"}],\"provisioningState\":\"Succeeded\",\"lifecycleState\":\"MaintenanceInProgress\",\"shape\":\"uwpijr\",\"ociUrl\":\"civmmg\",\"cpuCount\":434258979,\"maxCpuCount\":1851539206,\"memorySizeInGbs\":1456716709,\"maxMemoryInGbs\":781484750,\"dbNodeStorageSizeInGbs\":671950548,\"maxDbNodeStorageSizeInGbs\":1596697892,\"dataStorageSizeInTbs\":71.94014292925087,\"maxDataStorageInTbs\":68.88861707633018,\"dbServerVersion\":\"dfvpg\",\"storageServerVersion\":\"oxgsgbpfgzdjtx\",\"activatedStorageCount\":2030623139,\"additionalStorageCount\":1717283486,\"displayName\":\"q\",\"lastMaintenanceRunId\":\"aqvlgafcqusr\",\"nextMaintenanceRunId\":\"etnwsdtutnw\",\"monthlyDbServerVersion\":\"uycvuzhyrmewip\",\"monthlyStorageServerVersion\":\"ekdxuku\"},\"zones\":[\"sjjxundxgketw\"],\"location\":\"hzjhf\",\"tags\":{\"gpmuneqsxvmhfbuz\":\"vvmu\",\"ms\":\"yihsasbhudypohyu\",\"ttymsjny\":\"ynsqyrpfoobr\"},\"id\":\"qdnfwqzdz\",\"name\":\"tilaxh\",\"type\":\"fhqlyvi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CloudExadataInfrastructure response = manager.cloudExadataInfrastructures()
            .addStorageCapacity("oaimlnw", "aaomylweazu", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hzjhf", response.location());
        Assertions.assertEquals("vvmu", response.tags().get("gpmuneqsxvmhfbuz"));
        Assertions.assertEquals(1188676468, response.properties().computeCount());
        Assertions.assertEquals(286029516, response.properties().storageCount());
        Assertions.assertEquals(Preference.CUSTOM_PREFERENCE, response.properties().maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.OCTOBER, response.properties().maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(1693425826, response.properties().maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.SATURDAY,
            response.properties().maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(122728116, response.properties().maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(507931039, response.properties().maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING, response.properties().maintenanceWindow().patchingMode());
        Assertions.assertEquals(2111689562, response.properties().maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(true, response.properties().maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false, response.properties().maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("qscjavftjuh", response.properties().customerContacts().get(0).email());
        Assertions.assertEquals("uwpijr", response.properties().shape());
        Assertions.assertEquals("q", response.properties().displayName());
        Assertions.assertEquals("sjjxundxgketw", response.zones().get(0));
    }
}
