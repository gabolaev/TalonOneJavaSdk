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
import org.threeten.bp.OffsetDateTime;

/**
 * Updates current user&#39;s latest seen notifications timestamp.
 */
@ApiModel(description = "Updates current user's latest seen notifications timestamp.")

public class UpdateUserLatestFeedTimestamp {
  public static final String SERIALIZED_NAME_NEW_LATEST_FEED_TIMESTAMP = "newLatestFeedTimestamp";
  @SerializedName(SERIALIZED_NAME_NEW_LATEST_FEED_TIMESTAMP)
  private OffsetDateTime newLatestFeedTimestamp;


  public UpdateUserLatestFeedTimestamp newLatestFeedTimestamp(OffsetDateTime newLatestFeedTimestamp) {
    
    this.newLatestFeedTimestamp = newLatestFeedTimestamp;
    return this;
  }

   /**
   * New timestamp to update for the current user.
   * @return newLatestFeedTimestamp
  **/
  @ApiModelProperty(required = true, value = "New timestamp to update for the current user.")

  public OffsetDateTime getNewLatestFeedTimestamp() {
    return newLatestFeedTimestamp;
  }


  public void setNewLatestFeedTimestamp(OffsetDateTime newLatestFeedTimestamp) {
    this.newLatestFeedTimestamp = newLatestFeedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserLatestFeedTimestamp updateUserLatestFeedTimestamp = (UpdateUserLatestFeedTimestamp) o;
    return Objects.equals(this.newLatestFeedTimestamp, updateUserLatestFeedTimestamp.newLatestFeedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newLatestFeedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserLatestFeedTimestamp {\n");
    sb.append("    newLatestFeedTimestamp: ").append(toIndentedString(newLatestFeedTimestamp)).append("\n");
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

