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
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateUser
 */

public class UpdateUser {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  /**
   * New state (\&quot;deactivated\&quot; or \&quot;active\&quot;) for the user. Only usable by admins for the user.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    DEACTIVATED("deactivated"),
    
    ACTIVE("active");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Integer> roles = null;

  public static final String SERIALIZED_NAME_APPLICATION_NOTIFICATION_SUBSCRIPTIONS = "applicationNotificationSubscriptions";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NOTIFICATION_SUBSCRIPTIONS)
  private Object applicationNotificationSubscriptions;


  public UpdateUser name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The user name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "The user name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateUser policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * The &#x60;Access Control List&#x60; json defining the role of the user. This represents the access control on the user level.
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "The `Access Control List` json defining the role of the user. This represents the access control on the user level.")

  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public UpdateUser state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * New state (\&quot;deactivated\&quot; or \&quot;active\&quot;) for the user. Only usable by admins for the user.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "deactivated", value = "New state (\"deactivated\" or \"active\") for the user. Only usable by admins for the user.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public UpdateUser roles(List<Integer> roles) {
    
    this.roles = roles;
    return this;
  }

  public UpdateUser addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Integer>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of roles to assign to the user.
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 3]", value = "List of roles to assign to the user.")

  public List<Integer> getRoles() {
    return roles;
  }


  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }


  public UpdateUser applicationNotificationSubscriptions(Object applicationNotificationSubscriptions) {
    
    this.applicationNotificationSubscriptions = applicationNotificationSubscriptions;
    return this;
  }

   /**
   * Get applicationNotificationSubscriptions
   * @return applicationNotificationSubscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getApplicationNotificationSubscriptions() {
    return applicationNotificationSubscriptions;
  }


  public void setApplicationNotificationSubscriptions(Object applicationNotificationSubscriptions) {
    this.applicationNotificationSubscriptions = applicationNotificationSubscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUser updateUser = (UpdateUser) o;
    return Objects.equals(this.name, updateUser.name) &&
        Objects.equals(this.policy, updateUser.policy) &&
        Objects.equals(this.state, updateUser.state) &&
        Objects.equals(this.roles, updateUser.roles) &&
        Objects.equals(this.applicationNotificationSubscriptions, updateUser.applicationNotificationSubscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, policy, state, roles, applicationNotificationSubscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUser {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    applicationNotificationSubscriptions: ").append(toIndentedString(applicationNotificationSubscriptions)).append("\n");
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

