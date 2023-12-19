// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupVaultInner;
import com.azure.resourcemanager.netapp.models.BackupVaultsList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupVaultsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVaultsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"bajlka\"},\"location\":\"wxyiopidkqq\",\"tags\":{\"dmligovibrxk\":\"vscx\",\"cbgoor\":\"mloazuru\",\"ybfhjxa\":\"te\",\"il\":\"vvjgslor\"},\"id\":\"yw\",\"name\":\"t\",\"type\":\"gkxnyedabg\"},{\"properties\":{\"provisioningState\":\"dtj\"},\"location\":\"wbcihxuuwh\",\"tags\":{\"akkud\":\"xccybvpa\",\"wjplma\":\"px\"},\"id\":\"stcyohpfkyrkdbd\",\"name\":\"iogsjkmnwq\",\"type\":\"nobaiyhddviacegf\"}],\"nextLink\":\"ntfpmvmemfnc\"}")
            .toObject(BackupVaultsList.class);
        Assertions.assertEquals("wxyiopidkqq", model.value().get(0).location());
        Assertions.assertEquals("vscx", model.value().get(0).tags().get("dmligovibrxk"));
        Assertions.assertEquals("ntfpmvmemfnc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVaultsList model = new BackupVaultsList()
            .withValue(Arrays.asList(
                new BackupVaultInner().withLocation("wxyiopidkqq")
                    .withTags(mapOf("dmligovibrxk", "vscx", "cbgoor", "mloazuru", "ybfhjxa", "te", "il", "vvjgslor")),
                new BackupVaultInner().withLocation("wbcihxuuwh").withTags(mapOf("akkud", "xccybvpa", "wjplma", "px"))))
            .withNextLink("ntfpmvmemfnc");
        model = BinaryData.fromObject(model).toObject(BackupVaultsList.class);
        Assertions.assertEquals("wxyiopidkqq", model.value().get(0).location());
        Assertions.assertEquals("vscx", model.value().get(0).tags().get("dmligovibrxk"));
        Assertions.assertEquals("ntfpmvmemfnc", model.nextLink());
    }

    // Use "Map.of" if available
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
