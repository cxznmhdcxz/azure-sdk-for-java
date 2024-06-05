// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The body of the JWT used for the PolicyCertificates APIs.
 */
@Fluent
public final class AttestationCertificateManagementBody
    implements JsonSerializable<AttestationCertificateManagementBody> {
    /*
     * RFC 7517 Json Web Key describing the certificate.
     */
    private JsonWebKey policyCertificate;

    /**
     * Creates an instance of AttestationCertificateManagementBody class.
     */
    public AttestationCertificateManagementBody() {
    }

    /**
     * Get the policyCertificate property: RFC 7517 Json Web Key describing the certificate.
     * 
     * @return the policyCertificate value.
     */
    public JsonWebKey getPolicyCertificate() {
        return this.policyCertificate;
    }

    /**
     * Set the policyCertificate property: RFC 7517 Json Web Key describing the certificate.
     * 
     * @param policyCertificate the policyCertificate value to set.
     * @return the AttestationCertificateManagementBody object itself.
     */
    public AttestationCertificateManagementBody setPolicyCertificate(JsonWebKey policyCertificate) {
        this.policyCertificate = policyCertificate;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPolicyCertificate() != null) {
            getPolicyCertificate().validate();
        }
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("policyCertificate", this.policyCertificate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AttestationCertificateManagementBody from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AttestationCertificateManagementBody if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AttestationCertificateManagementBody.
     */
    public static AttestationCertificateManagementBody fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AttestationCertificateManagementBody deserializedAttestationCertificateManagementBody
                = new AttestationCertificateManagementBody();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("policyCertificate".equals(fieldName)) {
                    deserializedAttestationCertificateManagementBody.policyCertificate = JsonWebKey.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAttestationCertificateManagementBody;
        });
    }
}
