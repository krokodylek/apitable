/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FieldKindSO
 */
@JsonAdapter(FieldKindSO.Adapter.class)
public enum FieldKindSO {
  
  NOTSUPPORT("NotSupport"),
  
  TEXT("Text"),
  
  NUMBER("Number"),
  
  SINGLESELECT("SingleSelect"),
  
  MULTISELECT("MultiSelect"),
  
  DATETIME("DateTime"),
  
  ATTACHMENT("Attachment"),
  
  LINK("Link"),
  
  URL("URL"),
  
  EMAIL("Email"),
  
  PHONE("Phone"),
  
  CHECKBOX("Checkbox"),
  
  RATING("Rating"),
  
  MEMBER("Member"),
  
  LOOKUP("LookUp"),
  
  FORMULA("Formula"),
  
  CURRENCY("Currency"),
  
  PERCENT("Percent"),
  
  SINGLETEXT("SingleText"),
  
  AUTONUMBER("AutoNumber"),
  
  CREATEDTIME("CreatedTime"),
  
  LASTMODIFIEDTIME("LastModifiedTime"),
  
  CREATEDBY("CreatedBy"),
  
  LASTMODIFIEDBY("LastModifiedBy"),
  
  CASCADER("Cascader"),
  
  DENIEDFIELD("DeniedField");

  private String value;

  FieldKindSO(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldKindSO fromValue(String value) {
    for (FieldKindSO b : FieldKindSO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldKindSO> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldKindSO enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldKindSO read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldKindSO.fromValue(value);
    }
  }
}

