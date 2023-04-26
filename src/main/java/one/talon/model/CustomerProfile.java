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
import one.talon.model.AudienceMembership;
import one.talon.model.LoyaltyMembership;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerProfile {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_CLOSED_SESSIONS = "closedSessions";
  @SerializedName(SERIALIZED_NAME_CLOSED_SESSIONS)
  private Integer closedSessions;

  public static final String SERIALIZED_NAME_TOTAL_SALES = "totalSales";
  @SerializedName(SERIALIZED_NAME_TOTAL_SALES)
  private BigDecimal totalSales;

  public static final String SERIALIZED_NAME_LOYALTY_MEMBERSHIPS = "loyaltyMemberships";
  @SerializedName(SERIALIZED_NAME_LOYALTY_MEMBERSHIPS)
  private List<LoyaltyMembership> loyaltyMemberships = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MEMBERSHIPS = "audienceMemberships";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MEMBERSHIPS)
  private List<AudienceMembership> audienceMemberships = null;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "lastActivity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private OffsetDateTime lastActivity;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;


  public CustomerProfile id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Internal ID of this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CustomerProfile created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created. The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The time this entity was created. The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CustomerProfile integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The integration ID set by your integration layer.
   * @return integrationId
  **/
  @ApiModelProperty(example = "URNGV8294NV", required = true, value = "The integration ID set by your integration layer.")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public CustomerProfile attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"Language\":\"english\",\"ShippingCountry\":\"DE\"}", required = true, value = "Arbitrary properties associated with this item.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public CustomerProfile accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the Talon.One account that owns this profile.
   * @return accountId
  **/
  @ApiModelProperty(example = "31", required = true, value = "The ID of the Talon.One account that owns this profile.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public CustomerProfile closedSessions(Integer closedSessions) {
    
    this.closedSessions = closedSessions;
    return this;
  }

   /**
   * The total amount of closed sessions by a customer. A closed session is a successful purchase.
   * @return closedSessions
  **/
  @ApiModelProperty(example = "3", required = true, value = "The total amount of closed sessions by a customer. A closed session is a successful purchase.")

  public Integer getClosedSessions() {
    return closedSessions;
  }


  public void setClosedSessions(Integer closedSessions) {
    this.closedSessions = closedSessions;
  }


  public CustomerProfile totalSales(BigDecimal totalSales) {
    
    this.totalSales = totalSales;
    return this;
  }

   /**
   * The total amount of money spent by the customer **before** discounts are applied.  The total sales amount excludes the following: - Cancelled or reopened sessions. - Returned items. 
   * @return totalSales
  **/
  @ApiModelProperty(example = "299.99", required = true, value = "The total amount of money spent by the customer **before** discounts are applied.  The total sales amount excludes the following: - Cancelled or reopened sessions. - Returned items. ")

  public BigDecimal getTotalSales() {
    return totalSales;
  }


  public void setTotalSales(BigDecimal totalSales) {
    this.totalSales = totalSales;
  }


  public CustomerProfile loyaltyMemberships(List<LoyaltyMembership> loyaltyMemberships) {
    
    this.loyaltyMemberships = loyaltyMemberships;
    return this;
  }

  public CustomerProfile addLoyaltyMembershipsItem(LoyaltyMembership loyaltyMembershipsItem) {
    if (this.loyaltyMemberships == null) {
      this.loyaltyMemberships = new ArrayList<LoyaltyMembership>();
    }
    this.loyaltyMemberships.add(loyaltyMembershipsItem);
    return this;
  }

   /**
   * **DEPRECATED** A list of loyalty programs joined by the customer. 
   * @return loyaltyMemberships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**DEPRECATED** A list of loyalty programs joined by the customer. ")

  public List<LoyaltyMembership> getLoyaltyMemberships() {
    return loyaltyMemberships;
  }


  public void setLoyaltyMemberships(List<LoyaltyMembership> loyaltyMemberships) {
    this.loyaltyMemberships = loyaltyMemberships;
  }


  public CustomerProfile audienceMemberships(List<AudienceMembership> audienceMemberships) {
    
    this.audienceMemberships = audienceMemberships;
    return this;
  }

  public CustomerProfile addAudienceMembershipsItem(AudienceMembership audienceMembershipsItem) {
    if (this.audienceMemberships == null) {
      this.audienceMemberships = new ArrayList<AudienceMembership>();
    }
    this.audienceMemberships.add(audienceMembershipsItem);
    return this;
  }

   /**
   * The audiences the customer belongs to.
   * @return audienceMemberships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The audiences the customer belongs to.")

  public List<AudienceMembership> getAudienceMemberships() {
    return audienceMemberships;
  }


  public void setAudienceMemberships(List<AudienceMembership> audienceMemberships) {
    this.audienceMemberships = audienceMemberships;
  }


  public CustomerProfile lastActivity(OffsetDateTime lastActivity) {
    
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Timestamp of the most recent event received from this customer. This field is updated on calls that trigger the rule-engine and that are not [dry requests](https://docs.talon.one/docs/dev/integration-api/dry-requests/#overlay).  For example, [reserving a coupon](https://docs.talon.one/integration-api#operation/createCouponReservation) for a customer doesn&#39;t impact this field. 
   * @return lastActivity
  **/
  @ApiModelProperty(example = "2020-02-08T14:15:20Z", required = true, value = "Timestamp of the most recent event received from this customer. This field is updated on calls that trigger the rule-engine and that are not [dry requests](https://docs.talon.one/docs/dev/integration-api/dry-requests/#overlay).  For example, [reserving a coupon](https://docs.talon.one/integration-api#operation/createCouponReservation) for a customer doesn't impact this field. ")

  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }


  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }


  public CustomerProfile sandbox(Boolean sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Shows whether the customer is part of a sandbox or live Application. See the [docs](https://docs.talon.one/docs/product/applications/overview#application-environments). 
   * @return sandbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Shows whether the customer is part of a sandbox or live Application. See the [docs](https://docs.talon.one/docs/product/applications/overview#application-environments). ")

  public Boolean getSandbox() {
    return sandbox;
  }


  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProfile customerProfile = (CustomerProfile) o;
    return Objects.equals(this.id, customerProfile.id) &&
        Objects.equals(this.created, customerProfile.created) &&
        Objects.equals(this.integrationId, customerProfile.integrationId) &&
        Objects.equals(this.attributes, customerProfile.attributes) &&
        Objects.equals(this.accountId, customerProfile.accountId) &&
        Objects.equals(this.closedSessions, customerProfile.closedSessions) &&
        Objects.equals(this.totalSales, customerProfile.totalSales) &&
        Objects.equals(this.loyaltyMemberships, customerProfile.loyaltyMemberships) &&
        Objects.equals(this.audienceMemberships, customerProfile.audienceMemberships) &&
        Objects.equals(this.lastActivity, customerProfile.lastActivity) &&
        Objects.equals(this.sandbox, customerProfile.sandbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, integrationId, attributes, accountId, closedSessions, totalSales, loyaltyMemberships, audienceMemberships, lastActivity, sandbox);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProfile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    closedSessions: ").append(toIndentedString(closedSessions)).append("\n");
    sb.append("    totalSales: ").append(toIndentedString(totalSales)).append("\n");
    sb.append("    loyaltyMemberships: ").append(toIndentedString(loyaltyMemberships)).append("\n");
    sb.append("    audienceMemberships: ").append(toIndentedString(audienceMemberships)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
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

