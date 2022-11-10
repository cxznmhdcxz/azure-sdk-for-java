// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BlockedTransformers;
import com.azure.resourcemanager.machinelearning.models.Classification;
import com.azure.resourcemanager.machinelearning.models.ClassificationModels;
import com.azure.resourcemanager.machinelearning.models.ClassificationPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.ClassificationTrainingSettings;
import com.azure.resourcemanager.machinelearning.models.FeaturizationMode;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.NCrossValidations;
import com.azure.resourcemanager.machinelearning.models.StackEnsembleSettings;
import com.azure.resourcemanager.machinelearning.models.StackMetaLearnerType;
import com.azure.resourcemanager.machinelearning.models.TableVerticalFeaturizationSettings;
import com.azure.resourcemanager.machinelearning.models.TableVerticalLimitSettings;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClassificationTests {
    @Test
    public void testDeserialize() {
        Classification model =
            BinaryData
                .fromString(
                    "{\"taskType\":\"Classification\",\"positiveLabel\":\"z\",\"primaryMetric\":\"Accuracy\",\"trainingSettings\":{\"allowedTrainingAlgorithms\":[\"BernoulliNaiveBayes\",\"KNN\",\"LogisticRegression\",\"DecisionTree\"],\"blockedTrainingAlgorithms\":[\"SGD\",\"LightGBM\",\"SVM\"],\"enableDnnTraining\":true,\"enableModelExplainability\":true,\"enableOnnxCompatibleModels\":true,\"enableStackEnsemble\":false,\"enableVoteEnsemble\":false,\"ensembleModelDownloadTimeout\":\"PT239H29M50S\",\"stackEnsembleSettings\":{\"stackMetaLearnerKWargs\":\"dataclvdjjukyrdnqod\",\"stackMetaLearnerTrainPercentage\":30.06941234013376,\"stackMetaLearnerType\":\"LightGBMClassifier\"}},\"cvSplitColumnNames\":[\"aqnvzoqgyipemchg\",\"v\"],\"featurizationSettings\":{\"blockedTransformers\":[\"WoETargetEncoder\",\"WordEmbedding\",\"LabelEncoder\"],\"columnNameAndTypes\":{\"iuh\":\"ptlghwzhomewjjst\",\"ia\":\"awmo\",\"vodrrslblxydkxr\":\"cz\"},\"enableDnnFeaturization\":true,\"mode\":\"Off\",\"transformerParams\":{\"g\":[],\"qljnqkhychoco\":[],\"lehu\":[]},\"datasetLanguage\":\"lrqff\"},\"limitSettings\":{\"enableEarlyTermination\":false,\"exitScore\":50.27087572372039,\"maxConcurrentTrials\":450328402,\"maxCoresPerTrial\":1075829949,\"maxTrials\":662993818,\"timeout\":\"PT194H12M11S\",\"trialTimeout\":\"PT236H50M57S\"},\"nCrossValidations\":{\"mode\":\"NCrossValidations\"},\"testData\":{\"jobInputType\":\"mltable\",\"mode\":\"Direct\",\"uri\":\"rxmrgchbapx\",\"description\":\"y\"},\"testDataSize\":1.7164995710023723,\"validationData\":{\"jobInputType\":\"mltable\",\"mode\":\"EvalMount\",\"uri\":\"buscgduus\",\"description\":\"ycblevpmcl\"},\"validationDataSize\":38.79068857320828,\"weightColumnName\":\"yxlzgs\",\"logVerbosity\":\"Info\",\"targetColumnName\":\"zltafhbzffovwm\",\"trainingData\":{\"jobInputType\":\"mltable\",\"mode\":\"ReadWriteMount\",\"uri\":\"zqs\",\"description\":\"pgvdwnapfdqw\"}}")
                .toObject(Classification.class);
        Assertions.assertEquals(LogVerbosity.INFO, model.logVerbosity());
        Assertions.assertEquals("zltafhbzffovwm", model.targetColumnName());
        Assertions.assertEquals("pgvdwnapfdqw", model.trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("zqs", model.trainingData().uri());
        Assertions.assertEquals("z", model.positiveLabel());
        Assertions.assertEquals(ClassificationPrimaryMetrics.ACCURACY, model.primaryMetric());
        Assertions.assertEquals(true, model.trainingSettings().enableDnnTraining());
        Assertions.assertEquals(true, model.trainingSettings().enableModelExplainability());
        Assertions.assertEquals(true, model.trainingSettings().enableOnnxCompatibleModels());
        Assertions.assertEquals(false, model.trainingSettings().enableStackEnsemble());
        Assertions.assertEquals(false, model.trainingSettings().enableVoteEnsemble());
        Assertions
            .assertEquals(Duration.parse("PT239H29M50S"), model.trainingSettings().ensembleModelDownloadTimeout());
        Assertions
            .assertEquals(
                30.06941234013376D, model.trainingSettings().stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions
            .assertEquals(
                StackMetaLearnerType.LIGHT_GBMCLASSIFIER,
                model.trainingSettings().stackEnsembleSettings().stackMetaLearnerType());
        Assertions
            .assertEquals(
                ClassificationModels.BERNOULLI_NAIVE_BAYES,
                model.trainingSettings().allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(ClassificationModels.SGD, model.trainingSettings().blockedTrainingAlgorithms().get(0));
        Assertions.assertEquals("aqnvzoqgyipemchg", model.cvSplitColumnNames().get(0));
        Assertions.assertEquals("lrqff", model.featurizationSettings().datasetLanguage());
        Assertions
            .assertEquals(
                BlockedTransformers.WO_ETARGET_ENCODER, model.featurizationSettings().blockedTransformers().get(0));
        Assertions.assertEquals("ptlghwzhomewjjst", model.featurizationSettings().columnNameAndTypes().get("iuh"));
        Assertions.assertEquals(true, model.featurizationSettings().enableDnnFeaturization());
        Assertions.assertEquals(FeaturizationMode.OFF, model.featurizationSettings().mode());
        Assertions.assertEquals(false, model.limitSettings().enableEarlyTermination());
        Assertions.assertEquals(50.27087572372039D, model.limitSettings().exitScore());
        Assertions.assertEquals(450328402, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(1075829949, model.limitSettings().maxCoresPerTrial());
        Assertions.assertEquals(662993818, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT194H12M11S"), model.limitSettings().timeout());
        Assertions.assertEquals(Duration.parse("PT236H50M57S"), model.limitSettings().trialTimeout());
        Assertions.assertEquals("y", model.testData().description());
        Assertions.assertEquals(InputDeliveryMode.DIRECT, model.testData().mode());
        Assertions.assertEquals("rxmrgchbapx", model.testData().uri());
        Assertions.assertEquals(1.7164995710023723D, model.testDataSize());
        Assertions.assertEquals("ycblevpmcl", model.validationData().description());
        Assertions.assertEquals(InputDeliveryMode.EVAL_MOUNT, model.validationData().mode());
        Assertions.assertEquals("buscgduus", model.validationData().uri());
        Assertions.assertEquals(38.79068857320828D, model.validationDataSize());
        Assertions.assertEquals("yxlzgs", model.weightColumnName());
    }

    @Test
    public void testSerialize() {
        Classification model =
            new Classification()
                .withLogVerbosity(LogVerbosity.INFO)
                .withTargetColumnName("zltafhbzffovwm")
                .withTrainingData(
                    new MLTableJobInput()
                        .withDescription("pgvdwnapfdqw")
                        .withMode(InputDeliveryMode.READ_WRITE_MOUNT)
                        .withUri("zqs"))
                .withPositiveLabel("z")
                .withPrimaryMetric(ClassificationPrimaryMetrics.ACCURACY)
                .withTrainingSettings(
                    new ClassificationTrainingSettings()
                        .withEnableDnnTraining(true)
                        .withEnableModelExplainability(true)
                        .withEnableOnnxCompatibleModels(true)
                        .withEnableStackEnsemble(false)
                        .withEnableVoteEnsemble(false)
                        .withEnsembleModelDownloadTimeout(Duration.parse("PT239H29M50S"))
                        .withStackEnsembleSettings(
                            new StackEnsembleSettings()
                                .withStackMetaLearnerKWargs("dataclvdjjukyrdnqod")
                                .withStackMetaLearnerTrainPercentage(30.06941234013376D)
                                .withStackMetaLearnerType(StackMetaLearnerType.LIGHT_GBMCLASSIFIER))
                        .withAllowedTrainingAlgorithms(
                            Arrays
                                .asList(
                                    ClassificationModels.BERNOULLI_NAIVE_BAYES,
                                    ClassificationModels.KNN,
                                    ClassificationModels.LOGISTIC_REGRESSION,
                                    ClassificationModels.DECISION_TREE))
                        .withBlockedTrainingAlgorithms(
                            Arrays
                                .asList(
                                    ClassificationModels.SGD,
                                    ClassificationModels.LIGHT_GBM,
                                    ClassificationModels.SVM)))
                .withCvSplitColumnNames(Arrays.asList("aqnvzoqgyipemchg", "v"))
                .withFeaturizationSettings(
                    new TableVerticalFeaturizationSettings()
                        .withDatasetLanguage("lrqff")
                        .withBlockedTransformers(
                            Arrays
                                .asList(
                                    BlockedTransformers.WO_ETARGET_ENCODER,
                                    BlockedTransformers.WORD_EMBEDDING,
                                    BlockedTransformers.LABEL_ENCODER))
                        .withColumnNameAndTypes(mapOf("iuh", "ptlghwzhomewjjst", "ia", "awmo", "vodrrslblxydkxr", "cz"))
                        .withEnableDnnFeaturization(true)
                        .withMode(FeaturizationMode.OFF)
                        .withTransformerParams(
                            mapOf("g", Arrays.asList(), "qljnqkhychoco", Arrays.asList(), "lehu", Arrays.asList())))
                .withLimitSettings(
                    new TableVerticalLimitSettings()
                        .withEnableEarlyTermination(false)
                        .withExitScore(50.27087572372039D)
                        .withMaxConcurrentTrials(450328402)
                        .withMaxCoresPerTrial(1075829949)
                        .withMaxTrials(662993818)
                        .withTimeout(Duration.parse("PT194H12M11S"))
                        .withTrialTimeout(Duration.parse("PT236H50M57S")))
                .withNCrossValidations(new NCrossValidations())
                .withTestData(
                    new MLTableJobInput()
                        .withDescription("y")
                        .withMode(InputDeliveryMode.DIRECT)
                        .withUri("rxmrgchbapx"))
                .withTestDataSize(1.7164995710023723D)
                .withValidationData(
                    new MLTableJobInput()
                        .withDescription("ycblevpmcl")
                        .withMode(InputDeliveryMode.EVAL_MOUNT)
                        .withUri("buscgduus"))
                .withValidationDataSize(38.79068857320828D)
                .withWeightColumnName("yxlzgs");
        model = BinaryData.fromObject(model).toObject(Classification.class);
        Assertions.assertEquals(LogVerbosity.INFO, model.logVerbosity());
        Assertions.assertEquals("zltafhbzffovwm", model.targetColumnName());
        Assertions.assertEquals("pgvdwnapfdqw", model.trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("zqs", model.trainingData().uri());
        Assertions.assertEquals("z", model.positiveLabel());
        Assertions.assertEquals(ClassificationPrimaryMetrics.ACCURACY, model.primaryMetric());
        Assertions.assertEquals(true, model.trainingSettings().enableDnnTraining());
        Assertions.assertEquals(true, model.trainingSettings().enableModelExplainability());
        Assertions.assertEquals(true, model.trainingSettings().enableOnnxCompatibleModels());
        Assertions.assertEquals(false, model.trainingSettings().enableStackEnsemble());
        Assertions.assertEquals(false, model.trainingSettings().enableVoteEnsemble());
        Assertions
            .assertEquals(Duration.parse("PT239H29M50S"), model.trainingSettings().ensembleModelDownloadTimeout());
        Assertions
            .assertEquals(
                30.06941234013376D, model.trainingSettings().stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions
            .assertEquals(
                StackMetaLearnerType.LIGHT_GBMCLASSIFIER,
                model.trainingSettings().stackEnsembleSettings().stackMetaLearnerType());
        Assertions
            .assertEquals(
                ClassificationModels.BERNOULLI_NAIVE_BAYES,
                model.trainingSettings().allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(ClassificationModels.SGD, model.trainingSettings().blockedTrainingAlgorithms().get(0));
        Assertions.assertEquals("aqnvzoqgyipemchg", model.cvSplitColumnNames().get(0));
        Assertions.assertEquals("lrqff", model.featurizationSettings().datasetLanguage());
        Assertions
            .assertEquals(
                BlockedTransformers.WO_ETARGET_ENCODER, model.featurizationSettings().blockedTransformers().get(0));
        Assertions.assertEquals("ptlghwzhomewjjst", model.featurizationSettings().columnNameAndTypes().get("iuh"));
        Assertions.assertEquals(true, model.featurizationSettings().enableDnnFeaturization());
        Assertions.assertEquals(FeaturizationMode.OFF, model.featurizationSettings().mode());
        Assertions.assertEquals(false, model.limitSettings().enableEarlyTermination());
        Assertions.assertEquals(50.27087572372039D, model.limitSettings().exitScore());
        Assertions.assertEquals(450328402, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(1075829949, model.limitSettings().maxCoresPerTrial());
        Assertions.assertEquals(662993818, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT194H12M11S"), model.limitSettings().timeout());
        Assertions.assertEquals(Duration.parse("PT236H50M57S"), model.limitSettings().trialTimeout());
        Assertions.assertEquals("y", model.testData().description());
        Assertions.assertEquals(InputDeliveryMode.DIRECT, model.testData().mode());
        Assertions.assertEquals("rxmrgchbapx", model.testData().uri());
        Assertions.assertEquals(1.7164995710023723D, model.testDataSize());
        Assertions.assertEquals("ycblevpmcl", model.validationData().description());
        Assertions.assertEquals(InputDeliveryMode.EVAL_MOUNT, model.validationData().mode());
        Assertions.assertEquals("buscgduus", model.validationData().uri());
        Assertions.assertEquals(38.79068857320828D, model.validationDataSize());
        Assertions.assertEquals("yxlzgs", model.weightColumnName());
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