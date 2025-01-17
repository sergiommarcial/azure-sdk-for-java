// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.OperationInner;
import com.azure.resourcemanager.netapp.models.OperationDisplay;
import com.azure.resourcemanager.netapp.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"display\":{\"provider\":\"zopbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"origin\":\"ownoizhw\",\"properties\":{}},{\"name\":\"bqsoqijg\",\"display\":{\"provider\":\"bpazlobcufpdzn\",\"resource\":\"t\",\"operation\":\"qjnqglhqgnufoooj\",\"description\":\"ifsqesaagdfmg\"},\"origin\":\"lhjxr\",\"properties\":{}},{\"name\":\"mrvktsizntoc\",\"display\":{\"provider\":\"ouajpsqucmpoyf\",\"resource\":\"fogknygjofjdde\",\"operation\":\"rd\",\"description\":\"pewnw\"},\"origin\":\"itjz\",\"properties\":{}}]}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals("ownoizhw", model.value().get(0).origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("quvgjxpybczme")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("zopbsphrupidgs")
                                        .withResource("bejhphoycmsxa")
                                        .withOperation("hdxbmtqio")
                                        .withDescription("zehtbmu"))
                                .withOrigin("ownoizhw"),
                            new OperationInner()
                                .withName("bqsoqijg")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("bpazlobcufpdzn")
                                        .withResource("t")
                                        .withOperation("qjnqglhqgnufoooj")
                                        .withDescription("ifsqesaagdfmg"))
                                .withOrigin("lhjxr"),
                            new OperationInner()
                                .withName("mrvktsizntoc")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("ouajpsqucmpoyf")
                                        .withResource("fogknygjofjdde")
                                        .withOperation("rd")
                                        .withDescription("pewnw"))
                                .withOrigin("itjz")));
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals("ownoizhw", model.value().get(0).origin());
    }
}
