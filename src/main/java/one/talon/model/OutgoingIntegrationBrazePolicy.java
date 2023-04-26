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
 * OutgoingIntegrationBrazePolicy
 */

public class OutgoingIntegrationBrazePolicy {
  public static final String SERIALIZED_NAME_BASE_URL = "baseUrl";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private String baseUrl;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;


  public OutgoingIntegrationBrazePolicy baseUrl(String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The base URL of your Braze deployment.
   * @return baseUrl
  **/
  @ApiModelProperty(example = "your-braze-url.com", required = true, value = "The base URL of your Braze deployment.")

  public String getBaseUrl() {
    return baseUrl;
  }


  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public OutgoingIntegrationBrazePolicy apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API key of your Braze deployment.
   * @return apiKey
  **/
  @ApiModelProperty(example = "Your-REST-API-Key", required = true, value = "The API key of your Braze deployment.")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingIntegrationBrazePolicy outgoingIntegrationBrazePolicy = (OutgoingIntegrationBrazePolicy) o;
    return Objects.equals(this.baseUrl, outgoingIntegrationBrazePolicy.baseUrl) &&
        Objects.equals(this.apiKey, outgoingIntegrationBrazePolicy.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, apiKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingIntegrationBrazePolicy {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

