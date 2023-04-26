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
 * NewCampaignGroup
 */

public class NewCampaignGroup {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Integer> campaignIds = null;


  public NewCampaignGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this campaign group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this campaign group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewCampaignGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A longer description of the campaign group.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My campaign group.", value = "A longer description of the campaign group.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewCampaignGroup subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public NewCampaignGroup addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that this campaign group is enabled for.
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 2, 3]", value = "A list of the IDs of the applications that this campaign group is enabled for.")

  public List<Integer> getSubscribedApplicationsIds() {
    return subscribedApplicationsIds;
  }


  public void setSubscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    this.subscribedApplicationsIds = subscribedApplicationsIds;
  }


  public NewCampaignGroup campaignIds(List<Integer> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public NewCampaignGroup addCampaignIdsItem(Integer campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<Integer>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the campaigns that this campaign group owns.
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[4, 6, 8]", value = "A list of the IDs of the campaigns that this campaign group owns.")

  public List<Integer> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Integer> campaignIds) {
    this.campaignIds = campaignIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCampaignGroup newCampaignGroup = (NewCampaignGroup) o;
    return Objects.equals(this.name, newCampaignGroup.name) &&
        Objects.equals(this.description, newCampaignGroup.description) &&
        Objects.equals(this.subscribedApplicationsIds, newCampaignGroup.subscribedApplicationsIds) &&
        Objects.equals(this.campaignIds, newCampaignGroup.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, subscribedApplicationsIds, campaignIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCampaignGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscribedApplicationsIds: ").append(toIndentedString(subscribedApplicationsIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

