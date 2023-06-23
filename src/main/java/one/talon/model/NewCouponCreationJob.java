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
import one.talon.model.CodeGeneratorSettings;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewCouponCreationJob {
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

  public static final String SERIALIZED_NAME_NUMBER_OF_COUPONS = "numberOfCoupons";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_COUPONS)
  private Integer numberOfCoupons;

  public static final String SERIALIZED_NAME_COUPON_SETTINGS = "couponSettings";
  @SerializedName(SERIALIZED_NAME_COUPON_SETTINGS)
  private CodeGeneratorSettings couponSettings;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;


  public NewCouponCreationJob usageLimit(Integer usageLimit) {
    
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


  public NewCouponCreationJob discountLimit(BigDecimal discountLimit) {
    
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


  public NewCouponCreationJob reservationLimit(Integer reservationLimit) {
    
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


  public NewCouponCreationJob startDate(OffsetDateTime startDate) {
    
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


  public NewCouponCreationJob expiryDate(OffsetDateTime expiryDate) {
    
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


  public NewCouponCreationJob numberOfCoupons(Integer numberOfCoupons) {
    
    this.numberOfCoupons = numberOfCoupons;
    return this;
  }

   /**
   * The number of new coupon codes to generate for the campaign.
   * minimum: 1
   * maximum: 5000000
   * @return numberOfCoupons
  **/
  @ApiModelProperty(example = "200000", required = true, value = "The number of new coupon codes to generate for the campaign.")

  public Integer getNumberOfCoupons() {
    return numberOfCoupons;
  }


  public void setNumberOfCoupons(Integer numberOfCoupons) {
    this.numberOfCoupons = numberOfCoupons;
  }


  public NewCouponCreationJob couponSettings(CodeGeneratorSettings couponSettings) {
    
    this.couponSettings = couponSettings;
    return this;
  }

   /**
   * Get couponSettings
   * @return couponSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeGeneratorSettings getCouponSettings() {
    return couponSettings;
  }


  public void setCouponSettings(CodeGeneratorSettings couponSettings) {
    this.couponSettings = couponSettings;
  }


  public NewCouponCreationJob attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with coupons.
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "Arbitrary properties associated with coupons.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCouponCreationJob newCouponCreationJob = (NewCouponCreationJob) o;
    return Objects.equals(this.usageLimit, newCouponCreationJob.usageLimit) &&
        Objects.equals(this.discountLimit, newCouponCreationJob.discountLimit) &&
        Objects.equals(this.reservationLimit, newCouponCreationJob.reservationLimit) &&
        Objects.equals(this.startDate, newCouponCreationJob.startDate) &&
        Objects.equals(this.expiryDate, newCouponCreationJob.expiryDate) &&
        Objects.equals(this.numberOfCoupons, newCouponCreationJob.numberOfCoupons) &&
        Objects.equals(this.couponSettings, newCouponCreationJob.couponSettings) &&
        Objects.equals(this.attributes, newCouponCreationJob.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, discountLimit, reservationLimit, startDate, expiryDate, numberOfCoupons, couponSettings, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCouponCreationJob {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    reservationLimit: ").append(toIndentedString(reservationLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    numberOfCoupons: ").append(toIndentedString(numberOfCoupons)).append("\n");
    sb.append("    couponSettings: ").append(toIndentedString(couponSettings)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
