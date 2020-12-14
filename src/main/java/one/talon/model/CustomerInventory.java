/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.Coupon;
import one.talon.model.CustomerProfile;
import one.talon.model.Loyalty;
import one.talon.model.Referral;

/**
 * CustomerInventory
 */

public class CustomerInventory {
  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private CustomerProfile profile;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private Loyalty loyalty;

  public static final String SERIALIZED_NAME_REFERRALS = "referrals";
  @SerializedName(SERIALIZED_NAME_REFERRALS)
  private List<Referral> referrals = null;

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private List<Coupon> coupons = null;


  public CustomerInventory profile(CustomerProfile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerProfile getProfile() {
    return profile;
  }


  public void setProfile(CustomerProfile profile) {
    this.profile = profile;
  }


  public CustomerInventory loyalty(Loyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Loyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(Loyalty loyalty) {
    this.loyalty = loyalty;
  }


  public CustomerInventory referrals(List<Referral> referrals) {
    
    this.referrals = referrals;
    return this;
  }

  public CustomerInventory addReferralsItem(Referral referralsItem) {
    if (this.referrals == null) {
      this.referrals = new ArrayList<Referral>();
    }
    this.referrals.add(referralsItem);
    return this;
  }

   /**
   * Get referrals
   * @return referrals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Referral> getReferrals() {
    return referrals;
  }


  public void setReferrals(List<Referral> referrals) {
    this.referrals = referrals;
  }


  public CustomerInventory coupons(List<Coupon> coupons) {
    
    this.coupons = coupons;
    return this;
  }

  public CustomerInventory addCouponsItem(Coupon couponsItem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<Coupon>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * Get coupons
   * @return coupons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Coupon> getCoupons() {
    return coupons;
  }


  public void setCoupons(List<Coupon> coupons) {
    this.coupons = coupons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInventory customerInventory = (CustomerInventory) o;
    return Objects.equals(this.profile, customerInventory.profile) &&
        Objects.equals(this.loyalty, customerInventory.loyalty) &&
        Objects.equals(this.referrals, customerInventory.referrals) &&
        Objects.equals(this.coupons, customerInventory.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, loyalty, referrals, coupons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInventory {\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    referrals: ").append(toIndentedString(referrals)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
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
