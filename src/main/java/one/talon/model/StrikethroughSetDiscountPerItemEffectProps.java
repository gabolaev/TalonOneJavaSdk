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
 * setDiscountPerItem effect in strikethrough pricing payload.
 */
@ApiModel(description = "setDiscountPerItem effect in strikethrough pricing payload.")

public class StrikethroughSetDiscountPerItemEffectProps {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;


  public StrikethroughSetDiscountPerItemEffectProps name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * effect name.
   * @return name
  **/
  @ApiModelProperty(example = "1EuroOff", required = true, value = "effect name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StrikethroughSetDiscountPerItemEffectProps value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * discount value.
   * @return value
  **/
  @ApiModelProperty(example = "1", required = true, value = "discount value.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrikethroughSetDiscountPerItemEffectProps strikethroughSetDiscountPerItemEffectProps = (StrikethroughSetDiscountPerItemEffectProps) o;
    return Objects.equals(this.name, strikethroughSetDiscountPerItemEffectProps.name) &&
        Objects.equals(this.value, strikethroughSetDiscountPerItemEffectProps.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrikethroughSetDiscountPerItemEffectProps {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

