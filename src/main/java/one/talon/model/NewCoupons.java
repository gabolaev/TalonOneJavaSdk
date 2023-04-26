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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewCoupons {
  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_DISCOUNT_LIMIT = "discountLimit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIMIT)
  private BigDecimal discountLimit;

  public static final String SERIALIZED_NAME_RESERVATION_LIMIT = "reservationLimit";
  @SerializedName(SERIALIZED_NAME_RESERVATION_LIMIT)
  private Integer reservationLimit;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LimitConfig> limits = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_COUPONS = "numberOfCoupons";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_COUPONS)
  private Integer numberOfCoupons;

  public static final String SERIALIZED_NAME_UNIQUE_PREFIX = "uniquePrefix";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PREFIX)
  private String uniquePrefix;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;

  public static final String SERIALIZED_NAME_VALID_CHARACTERS = "validCharacters";
  @SerializedName(SERIALIZED_NAME_VALID_CHARACTERS)
  private List<String> validCharacters = null;

  public static final String SERIALIZED_NAME_COUPON_PATTERN = "couponPattern";
  @SerializedName(SERIALIZED_NAME_COUPON_PATTERN)
  private String couponPattern;

  public static final String SERIALIZED_NAME_IS_RESERVATION_MANDATORY = "isReservationMandatory";
  @SerializedName(SERIALIZED_NAME_IS_RESERVATION_MANDATORY)
  private Boolean isReservationMandatory = true;


  public NewCoupons usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(example = "100", required = true, value = "The number of times the coupon code can be redeemed. `0` means unlimited redemptions but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public NewCoupons discountLimit(BigDecimal discountLimit) {
    
    this.discountLimit = discountLimit;
    return this;
  }

   /**
   * The total discount value that the code can give. Typically used to represent a gift card value. 
   * minimum: 0
   * maximum: 999999
   * @return discountLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.0", value = "The total discount value that the code can give. Typically used to represent a gift card value. ")

  public BigDecimal getDiscountLimit() {
    return discountLimit;
  }


  public void setDiscountLimit(BigDecimal discountLimit) {
    this.discountLimit = discountLimit;
  }


  public NewCoupons reservationLimit(Integer reservationLimit) {
    
    this.reservationLimit = reservationLimit;
    return this;
  }

   /**
   * The number of reservations that can be made with this coupon code. 
   * minimum: 0
   * maximum: 999999
   * @return reservationLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45", value = "The number of reservations that can be made with this coupon code. ")

  public Integer getReservationLimit() {
    return reservationLimit;
  }


  public void setReservationLimit(Integer reservationLimit) {
    this.reservationLimit = reservationLimit;
  }


  public NewCoupons startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the coupon becomes valid.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-24T14:15:22Z", value = "Timestamp at which point the coupon becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public NewCoupons expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiration date of the coupon. Coupon never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-24T14:15:22Z", value = "Expiration date of the coupon. Coupon never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public NewCoupons limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public NewCoupons addLimitsItem(LimitConfig limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<LimitConfig>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured. 
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured. ")

  public List<LimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }


  public NewCoupons numberOfCoupons(Integer numberOfCoupons) {
    
    this.numberOfCoupons = numberOfCoupons;
    return this;
  }

   /**
   * The number of new coupon codes to generate for the campaign. Must be at least 1.
   * @return numberOfCoupons
  **/
  @ApiModelProperty(example = "1", required = true, value = "The number of new coupon codes to generate for the campaign. Must be at least 1.")

  public Integer getNumberOfCoupons() {
    return numberOfCoupons;
  }


  public void setNumberOfCoupons(Integer numberOfCoupons) {
    this.numberOfCoupons = numberOfCoupons;
  }


  public NewCoupons uniquePrefix(String uniquePrefix) {
    
    this.uniquePrefix = uniquePrefix;
    return this;
  }

   /**
   * **DEPRECATED** To create more than 20,000 coupons in one request, use [Create coupons asynchronously](https://docs.talon.one/management-api#operation/createCouponsAsync) endpoint. 
   * @return uniquePrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "**DEPRECATED** To create more than 20,000 coupons in one request, use [Create coupons asynchronously](https://docs.talon.one/management-api#operation/createCouponsAsync) endpoint. ")

  public String getUniquePrefix() {
    return uniquePrefix;
  }


  public void setUniquePrefix(String uniquePrefix) {
    this.uniquePrefix = uniquePrefix;
  }


  public NewCoupons attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"venueId\":12}", value = "Arbitrary properties associated with this item.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public NewCoupons recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The integration ID for this coupon&#39;s beneficiary&#39;s profile.
   * @return recipientIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "The integration ID for this coupon's beneficiary's profile.")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  public NewCoupons validCharacters(List<String> validCharacters) {
    
    this.validCharacters = validCharacters;
    return this;
  }

  public NewCoupons addValidCharactersItem(String validCharactersItem) {
    if (this.validCharacters == null) {
      this.validCharacters = new ArrayList<String>();
    }
    this.validCharacters.add(validCharactersItem);
    return this;
  }

   /**
   * List of characters used to generate the random parts of a code. By default, the list of characters is equivalent to the &#x60;[A-Z, 0-9]&#x60; regular expression. 
   * @return validCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[A, B, G, Y]", value = "List of characters used to generate the random parts of a code. By default, the list of characters is equivalent to the `[A-Z, 0-9]` regular expression. ")

  public List<String> getValidCharacters() {
    return validCharacters;
  }


  public void setValidCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
  }


  public NewCoupons couponPattern(String couponPattern) {
    
    this.couponPattern = couponPattern;
    return this;
  }

   /**
   * The pattern used to generate coupon codes. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUMMER-#####", value = "The pattern used to generate coupon codes. The character `#` is a placeholder and is replaced by a random character from the `validCharacters` set. ")

  public String getCouponPattern() {
    return couponPattern;
  }


  public void setCouponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
  }


  public NewCoupons isReservationMandatory(Boolean isReservationMandatory) {
    
    this.isReservationMandatory = isReservationMandatory;
    return this;
  }

   /**
   * Whether the reservation effect actually created a new reservation.
   * @return isReservationMandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the reservation effect actually created a new reservation.")

  public Boolean getIsReservationMandatory() {
    return isReservationMandatory;
  }


  public void setIsReservationMandatory(Boolean isReservationMandatory) {
    this.isReservationMandatory = isReservationMandatory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCoupons newCoupons = (NewCoupons) o;
    return Objects.equals(this.usageLimit, newCoupons.usageLimit) &&
        Objects.equals(this.discountLimit, newCoupons.discountLimit) &&
        Objects.equals(this.reservationLimit, newCoupons.reservationLimit) &&
        Objects.equals(this.startDate, newCoupons.startDate) &&
        Objects.equals(this.expiryDate, newCoupons.expiryDate) &&
        Objects.equals(this.limits, newCoupons.limits) &&
        Objects.equals(this.numberOfCoupons, newCoupons.numberOfCoupons) &&
        Objects.equals(this.uniquePrefix, newCoupons.uniquePrefix) &&
        Objects.equals(this.attributes, newCoupons.attributes) &&
        Objects.equals(this.recipientIntegrationId, newCoupons.recipientIntegrationId) &&
        Objects.equals(this.validCharacters, newCoupons.validCharacters) &&
        Objects.equals(this.couponPattern, newCoupons.couponPattern) &&
        Objects.equals(this.isReservationMandatory, newCoupons.isReservationMandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, discountLimit, reservationLimit, startDate, expiryDate, limits, numberOfCoupons, uniquePrefix, attributes, recipientIntegrationId, validCharacters, couponPattern, isReservationMandatory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCoupons {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    reservationLimit: ").append(toIndentedString(reservationLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    numberOfCoupons: ").append(toIndentedString(numberOfCoupons)).append("\n");
    sb.append("    uniquePrefix: ").append(toIndentedString(uniquePrefix)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    couponPattern: ").append(toIndentedString(couponPattern)).append("\n");
    sb.append("    isReservationMandatory: ").append(toIndentedString(isReservationMandatory)).append("\n");
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

