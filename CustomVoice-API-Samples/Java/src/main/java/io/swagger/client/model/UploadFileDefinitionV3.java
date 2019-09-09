/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UploadFileDefinitionV3
 */
public class UploadFileDefinitionV3 {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("fileContent")
  private String fileContent = null;

  public UploadFileDefinitionV3 fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The file name
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "The file name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public UploadFileDefinitionV3 fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

   /**
   * The file content
   * @return fileContent
  **/
  @ApiModelProperty(required = true, value = "The file content")
  public String getFileContent() {
    return fileContent;
  }

  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileDefinitionV3 uploadFileDefinitionV3 = (UploadFileDefinitionV3) o;
    return Objects.equals(this.fileName, uploadFileDefinitionV3.fileName) &&
        Objects.equals(this.fileContent, uploadFileDefinitionV3.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileDefinitionV3 {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

