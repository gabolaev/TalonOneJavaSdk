/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
 * NewInternalAudience
 */

public class NewInternalAudience {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public NewInternalAudience name(String name) {
    
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


  public NewInternalAudience sandbox(Boolean sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Indicates if this is a live or sandbox Application.
   * @return sandbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if this is a live or sandbox Application.")

  public Boolean getSandbox() {
    return sandbox;
  }


  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public NewInternalAudience description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the audience.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Travel audience 18-25", value = "A description of the audience.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewInternalAudience newInternalAudience = (NewInternalAudience) o;
    return Objects.equals(this.name, newInternalAudience.name) &&
        Objects.equals(this.sandbox, newInternalAudience.sandbox) &&
        Objects.equals(this.description, newInternalAudience.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sandbox, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewInternalAudience {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

