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
 * CouponsNotificationPolicy
 */

public class CouponsNotificationPolicy {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets scopes
   */
  @JsonAdapter(ScopesEnum.Adapter.class)
  public enum ScopesEnum {
    ALL("all"),
    
    CAMPAIGN_MANAGER("campaign_manager"),
    
    MANAGEMENT_API("management_api"),
    
    RULE_ENGINE("rule_engine");

    private String value;

    ScopesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopesEnum fromValue(String value) {
      for (ScopesEnum b : ScopesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<ScopesEnum> scopes = new ArrayList<ScopesEnum>();


  public CouponsNotificationPolicy name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Notification name.
   * @return name
  **/
  @ApiModelProperty(example = "Christmas Sale", required = true, value = "Notification name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CouponsNotificationPolicy scopes(List<ScopesEnum> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public CouponsNotificationPolicy addScopesItem(ScopesEnum scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ScopesEnum> getScopes() {
    return scopes;
  }


  public void setScopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponsNotificationPolicy couponsNotificationPolicy = (CouponsNotificationPolicy) o;
    return Objects.equals(this.name, couponsNotificationPolicy.name) &&
        Objects.equals(this.scopes, couponsNotificationPolicy.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponsNotificationPolicy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

