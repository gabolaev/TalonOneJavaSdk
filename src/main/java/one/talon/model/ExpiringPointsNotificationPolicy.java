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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.ExpiringPointsNotificationTrigger;

/**
 * ExpiringPointsNotificationPolicy
 */

public class ExpiringPointsNotificationPolicy {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRIGGERS = "triggers";
  @SerializedName(SERIALIZED_NAME_TRIGGERS)
  private List<ExpiringPointsNotificationTrigger> triggers = new ArrayList<ExpiringPointsNotificationTrigger>();


  public ExpiringPointsNotificationPolicy name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Notification name.
   * @return name
  **/
  @ApiModelProperty(example = "notification to google.", required = true, value = "Notification name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExpiringPointsNotificationPolicy triggers(List<ExpiringPointsNotificationTrigger> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public ExpiringPointsNotificationPolicy addTriggersItem(ExpiringPointsNotificationTrigger triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ExpiringPointsNotificationTrigger> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<ExpiringPointsNotificationTrigger> triggers) {
    this.triggers = triggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpiringPointsNotificationPolicy expiringPointsNotificationPolicy = (ExpiringPointsNotificationPolicy) o;
    return Objects.equals(this.name, expiringPointsNotificationPolicy.name) &&
        Objects.equals(this.triggers, expiringPointsNotificationPolicy.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, triggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpiringPointsNotificationPolicy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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

