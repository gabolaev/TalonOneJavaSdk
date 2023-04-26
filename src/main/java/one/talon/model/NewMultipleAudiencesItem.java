/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you access the Campaign Manager at `https://yourbaseurl.talon.one/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://yourbaseurl.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.model;

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
 * 
 */
@ApiModel(description = "")

public class NewMultipleAudiencesItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;


  public NewMultipleAudiencesItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The human-friendly display name for this audience.
   * @return name
  **/
  @ApiModelProperty(example = "Travel audience", required = true, value = "The human-friendly display name for this audience.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewMultipleAudiencesItem integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of this audience in the third-party integration.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "382370BKDB946", value = "The ID of this audience in the third-party integration.")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewMultipleAudiencesItem newMultipleAudiencesItem = (NewMultipleAudiencesItem) o;
    return Objects.equals(this.name, newMultipleAudiencesItem.name) &&
        Objects.equals(this.integrationId, newMultipleAudiencesItem.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, integrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewMultipleAudiencesItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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

