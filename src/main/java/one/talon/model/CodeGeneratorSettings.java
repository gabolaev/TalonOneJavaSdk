/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
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
 * CodeGeneratorSettings
 */

public class CodeGeneratorSettings {
  public static final String SERIALIZED_NAME_VALID_CHARACTERS = "validCharacters";
  @SerializedName(SERIALIZED_NAME_VALID_CHARACTERS)
  private List<String> validCharacters = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COUPON_PATTERN = "couponPattern";
  @SerializedName(SERIALIZED_NAME_COUPON_PATTERN)
  private String couponPattern;

  public CodeGeneratorSettings validCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
    return this;
  }

  public CodeGeneratorSettings addValidCharactersItem(String validCharactersItem) {
    this.validCharacters.add(validCharactersItem);
    return this;
  }

   /**
   * Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).
   * @return validCharacters
  **/
  @ApiModelProperty(required = true, value = "Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).")
  public List<String> getValidCharacters() {
    return validCharacters;
  }

  public void setValidCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
  }

  public CodeGeneratorSettings couponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
    return this;
  }

   /**
   * The pattern that will be used to generate coupon codes. The character &#x60;#&#x60; acts as a placeholder and will be replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @ApiModelProperty(required = true, value = "The pattern that will be used to generate coupon codes. The character `#` acts as a placeholder and will be replaced by a random character from the `validCharacters` set. ")
  public String getCouponPattern() {
    return couponPattern;
  }

  public void setCouponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeGeneratorSettings codeGeneratorSettings = (CodeGeneratorSettings) o;
    return Objects.equals(this.validCharacters, codeGeneratorSettings.validCharacters) &&
        Objects.equals(this.couponPattern, codeGeneratorSettings.couponPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validCharacters, couponPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeGeneratorSettings {\n");
    
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    couponPattern: ").append(toIndentedString(couponPattern)).append("\n");
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
