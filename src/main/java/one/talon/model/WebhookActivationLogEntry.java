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
import org.threeten.bp.OffsetDateTime;

/**
 * Log of activated webhooks
 */
@ApiModel(description = "Log of activated webhooks")

public class WebhookActivationLogEntry {
  public static final String SERIALIZED_NAME_INTEGRATION_REQUEST_UUID = "integrationRequestUuid";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_REQUEST_UUID)
  private String integrationRequestUuid;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private Integer webhookId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public WebhookActivationLogEntry integrationRequestUuid(String integrationRequestUuid) {
    this.integrationRequestUuid = integrationRequestUuid;
    return this;
  }

   /**
   * UUID reference of the integration request that triggered the effect with the webhook
   * @return integrationRequestUuid
  **/
  @ApiModelProperty(required = true, value = "UUID reference of the integration request that triggered the effect with the webhook")
  public String getIntegrationRequestUuid() {
    return integrationRequestUuid;
  }

  public void setIntegrationRequestUuid(String integrationRequestUuid) {
    this.integrationRequestUuid = integrationRequestUuid;
  }

  public WebhookActivationLogEntry webhookId(Integer webhookId) {
    this.webhookId = webhookId;
    return this;
  }

   /**
   * ID of the webhook that triggered the request
   * @return webhookId
  **/
  @ApiModelProperty(required = true, value = "ID of the webhook that triggered the request")
  public Integer getWebhookId() {
    return webhookId;
  }

  public void setWebhookId(Integer webhookId) {
    this.webhookId = webhookId;
  }

  public WebhookActivationLogEntry applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ID of the application that triggered the webhook
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "ID of the application that triggered the webhook")
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public WebhookActivationLogEntry campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign that triggered the webhook
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "ID of the campaign that triggered the webhook")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public WebhookActivationLogEntry created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Timestamp of request
   * @return created
  **/
  @ApiModelProperty(required = true, value = "Timestamp of request")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookActivationLogEntry webhookActivationLogEntry = (WebhookActivationLogEntry) o;
    return Objects.equals(this.integrationRequestUuid, webhookActivationLogEntry.integrationRequestUuid) &&
        Objects.equals(this.webhookId, webhookActivationLogEntry.webhookId) &&
        Objects.equals(this.applicationId, webhookActivationLogEntry.applicationId) &&
        Objects.equals(this.campaignId, webhookActivationLogEntry.campaignId) &&
        Objects.equals(this.created, webhookActivationLogEntry.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationRequestUuid, webhookId, applicationId, campaignId, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookActivationLogEntry {\n");
    
    sb.append("    integrationRequestUuid: ").append(toIndentedString(integrationRequestUuid)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
