/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 1.0.0
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
import one.talon.custom.JsonNullable;
import one.talon.custom.NullableAdapterFactory;

/**
 * 
 */
@ApiModel(description = "")
@JsonAdapter(NullableAdapterFactory.class)
public class NewEvent {
  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  /*allow Serializing null for this field */
  @JsonNullable
  private Object attributes;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;


  public NewEvent profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId. 
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId. ")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public NewEvent type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A string representing the event. Must not be a reserved event name.
   * @return type
  **/
  @ApiModelProperty(example = "pageViews", required = true, value = "A string representing the event. Must not be a reserved event name.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public NewEvent attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary additional JSON data associated with the event.
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"myAttribute\":\"myValue\"}", required = true, value = "Arbitrary additional JSON data associated with the event.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public NewEvent sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The ID of the session that this event occurred in.
   * @return sessionId
  **/
  @ApiModelProperty(example = "175KJPS947296", required = true, value = "The ID of the session that this event occurred in.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewEvent newEvent = (NewEvent) o;
    return Objects.equals(this.profileId, newEvent.profileId) &&
        Objects.equals(this.type, newEvent.type) &&
        Objects.equals(this.attributes, newEvent.attributes) &&
        Objects.equals(this.sessionId, newEvent.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, type, attributes, sessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewEvent {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

