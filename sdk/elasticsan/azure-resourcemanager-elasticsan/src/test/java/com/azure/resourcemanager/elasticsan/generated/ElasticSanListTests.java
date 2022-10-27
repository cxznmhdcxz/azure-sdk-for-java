// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import com.azure.resourcemanager.elasticsan.models.ElasticSanList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ElasticSanListTests {
    @Test
    public void testDeserialize() {
        ElasticSanList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"availabilityZones\":[],\"provisioningState\":\"Canceled\",\"baseSizeTiB\":3184798608963341660,\"extendedCapacitySizeTiB\":7384654236871166867,\"totalVolumeSizeGiB\":1235321626273843425,\"volumeGroupCount\":1798808176540213287,\"totalIops\":548063352355670740,\"totalMBps\":8213986203807393703,\"totalSizeTiB\":2711659806667039097},\"location\":\"oqpsoa\",\"tags\":{\"lahbcryff\":\"azakl\",\"xpaojakhmsbz\":\"fdosyg\"},\"id\":\"hcrzevd\",\"name\":\"hlxaolthqtr\",\"type\":\"qjbpfzfsin\"},{\"properties\":{\"availabilityZones\":[],\"provisioningState\":\"Invalid\",\"baseSizeTiB\":7322937378922398277,\"extendedCapacitySizeTiB\":7992644322804744623,\"totalVolumeSizeGiB\":4223016472097191780,\"volumeGroupCount\":482662408665248434,\"totalIops\":3412970068315160824,\"totalMBps\":1814795871426481160,\"totalSizeTiB\":6619682147047690446},\"location\":\"onpeqfpjkjlxofp\",\"tags\":{\"ininmay\":\"pfxxy\"},\"id\":\"uybbkpodep\",\"name\":\"oginuvamiheognar\",\"type\":\"zxtheotusivyevcc\"},{\"properties\":{\"availabilityZones\":[],\"provisioningState\":\"Invalid\",\"baseSizeTiB\":7067055679809849954,\"extendedCapacitySizeTiB\":1816098000378233348,\"totalVolumeSizeGiB\":5390210945061154066,\"volumeGroupCount\":3639417150615550339,\"totalIops\":7164161557812363211,\"totalMBps\":7935280975021078838,\"totalSizeTiB\":642697020628687872},\"location\":\"mvtzfkufub\",\"tags\":{\"aeqjhqjbasvms\":\"fxqeof\"},\"id\":\"jqul\",\"name\":\"gsntnbybkzgcwr\",\"type\":\"clxxwrljdo\"},{\"properties\":{\"availabilityZones\":[],\"provisioningState\":\"Updating\",\"baseSizeTiB\":5217590058761942441,\"extendedCapacitySizeTiB\":4865478979118542149,\"totalVolumeSizeGiB\":4105956732446438238,\"volumeGroupCount\":4350349194927395278,\"totalIops\":5768373522529510794,\"totalMBps\":104740040232311726,\"totalSizeTiB\":5581291117453536479},\"location\":\"ksqrglssai\",\"tags\":{\"eebvmgxsab\":\"jwnzlljfmp\"},\"id\":\"yqduujit\",\"name\":\"jczdzevndh\",\"type\":\"rwpdappdsbdkvwrw\"}],\"nextLink\":\"eusnhutj\"}")
                .toObject(ElasticSanList.class);
        Assertions.assertEquals("oqpsoa", model.value().get(0).location());
        Assertions.assertEquals("azakl", model.value().get(0).tags().get("lahbcryff"));
        Assertions.assertEquals(3184798608963341660L, model.value().get(0).baseSizeTiB());
        Assertions.assertEquals(7384654236871166867L, model.value().get(0).extendedCapacitySizeTiB());
    }

    @Test
    public void testSerialize() {
        ElasticSanList model =
            new ElasticSanList()
                .withValue(
                    Arrays
                        .asList(
                            new ElasticSanInner()
                                .withLocation("oqpsoa")
                                .withTags(mapOf("lahbcryff", "azakl", "xpaojakhmsbz", "fdosyg"))
                                .withAvailabilityZones(Arrays.asList())
                                .withBaseSizeTiB(3184798608963341660L)
                                .withExtendedCapacitySizeTiB(7384654236871166867L),
                            new ElasticSanInner()
                                .withLocation("onpeqfpjkjlxofp")
                                .withTags(mapOf("ininmay", "pfxxy"))
                                .withAvailabilityZones(Arrays.asList())
                                .withBaseSizeTiB(7322937378922398277L)
                                .withExtendedCapacitySizeTiB(7992644322804744623L),
                            new ElasticSanInner()
                                .withLocation("mvtzfkufub")
                                .withTags(mapOf("aeqjhqjbasvms", "fxqeof"))
                                .withAvailabilityZones(Arrays.asList())
                                .withBaseSizeTiB(7067055679809849954L)
                                .withExtendedCapacitySizeTiB(1816098000378233348L),
                            new ElasticSanInner()
                                .withLocation("ksqrglssai")
                                .withTags(mapOf("eebvmgxsab", "jwnzlljfmp"))
                                .withAvailabilityZones(Arrays.asList())
                                .withBaseSizeTiB(5217590058761942441L)
                                .withExtendedCapacitySizeTiB(4865478979118542149L)));
        model = BinaryData.fromObject(model).toObject(ElasticSanList.class);
        Assertions.assertEquals("oqpsoa", model.value().get(0).location());
        Assertions.assertEquals("azakl", model.value().get(0).tags().get("lahbcryff"));
        Assertions.assertEquals(3184798608963341660L, model.value().get(0).baseSizeTiB());
        Assertions.assertEquals(7384654236871166867L, model.value().get(0).extendedCapacitySizeTiB());
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