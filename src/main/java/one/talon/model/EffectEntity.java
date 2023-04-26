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
 * Definition of all properties that are present on all effects, independent of their type.
 */
@ApiModel(description = "Definition of all properties that are present on all effects, independent of their type.")

public class EffectEntity {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_RULESET_ID = "rulesetId";
  @SerializedName(SERIALIZED_NAME_RULESET_ID)
  private Integer rulesetId;

  public static final String SERIALIZED_NAME_RULE_INDEX = "ruleIndex";
  @SerializedName(SERIALIZED_NAME_RULE_INDEX)
  private Integer ruleIndex;

  public static final String SERIALIZED_NAME_RULE_NAME = "ruleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_EFFECT_TYPE = "effectType";
  @SerializedName(SERIALIZED_NAME_EFFECT_TYPE)
  private String effectType;

  public static final String SERIALIZED_NAME_TRIGGERED_BY_COUPON = "triggeredByCoupon";
  @SerializedName(SERIALIZED_NAME_TRIGGERED_BY_COUPON)
  private Integer triggeredByCoupon;

  public static final String SERIALIZED_NAME_TRIGGERED_FOR_CATALOG_ITEM = "triggeredForCatalogItem";
  @SerializedName(SERIALIZED_NAME_TRIGGERED_FOR_CATALOG_ITEM)
  private Integer triggeredForCatalogItem;


  public EffectEntity campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that triggered this effect.
   * @return campaignId
  **/
  @ApiModelProperty(example = "244", required = true, value = "The ID of the campaign that triggered this effect.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public EffectEntity rulesetId(Integer rulesetId) {
    
    this.rulesetId = rulesetId;
    return this;
  }

   /**
   * The ID of the ruleset that was active in the campaign when this effect was triggered.
   * @return rulesetId
  **/
  @ApiModelProperty(example = "73", required = true, value = "The ID of the ruleset that was active in the campaign when this effect was triggered.")

  public Integer getRulesetId() {
    return rulesetId;
  }


  public void setRulesetId(Integer rulesetId) {
    this.rulesetId = rulesetId;
  }


  public EffectEntity ruleIndex(Integer ruleIndex) {
    
    this.ruleIndex = ruleIndex;
    return this;
  }

   /**
   * The position of the rule that triggered this effect within the ruleset.
   * @return ruleIndex
  **/
  @ApiModelProperty(example = "2", required = true, value = "The position of the rule that triggered this effect within the ruleset.")

  public Integer getRuleIndex() {
    return ruleIndex;
  }


  public void setRuleIndex(Integer ruleIndex) {
    this.ruleIndex = ruleIndex;
  }


  public EffectEntity ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule that triggered this effect.
   * @return ruleName
  **/
  @ApiModelProperty(example = "Give 20% discount", required = true, value = "The name of the rule that triggered this effect.")

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public EffectEntity effectType(String effectType) {
    
    this.effectType = effectType;
    return this;
  }

   /**
   * The type of effect that was triggered. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).
   * @return effectType
  **/
  @ApiModelProperty(example = "rejectCoupon", required = true, value = "The type of effect that was triggered. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).")

  public String getEffectType() {
    return effectType;
  }


  public void setEffectType(String effectType) {
    this.effectType = effectType;
  }


  public EffectEntity triggeredByCoupon(Integer triggeredByCoupon) {
    
    this.triggeredByCoupon = triggeredByCoupon;
    return this;
  }

   /**
   * The ID of the coupon that was being evaluated when this effect was triggered.
   * @return triggeredByCoupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4928", value = "The ID of the coupon that was being evaluated when this effect was triggered.")

  public Integer getTriggeredByCoupon() {
    return triggeredByCoupon;
  }


  public void setTriggeredByCoupon(Integer triggeredByCoupon) {
    this.triggeredByCoupon = triggeredByCoupon;
  }


  public EffectEntity triggeredForCatalogItem(Integer triggeredForCatalogItem) {
    
    this.triggeredForCatalogItem = triggeredForCatalogItem;
    return this;
  }

   /**
   * The ID of the catalog item that was being evaluated when this effect was triggered.
   * @return triggeredForCatalogItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "786", value = "The ID of the catalog item that was being evaluated when this effect was triggered.")

  public Integer getTriggeredForCatalogItem() {
    return triggeredForCatalogItem;
  }


  public void setTriggeredForCatalogItem(Integer triggeredForCatalogItem) {
    this.triggeredForCatalogItem = triggeredForCatalogItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectEntity effectEntity = (EffectEntity) o;
    return Objects.equals(this.campaignId, effectEntity.campaignId) &&
        Objects.equals(this.rulesetId, effectEntity.rulesetId) &&
        Objects.equals(this.ruleIndex, effectEntity.ruleIndex) &&
        Objects.equals(this.ruleName, effectEntity.ruleName) &&
        Objects.equals(this.effectType, effectEntity.effectType) &&
        Objects.equals(this.triggeredByCoupon, effectEntity.triggeredByCoupon) &&
        Objects.equals(this.triggeredForCatalogItem, effectEntity.triggeredForCatalogItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, rulesetId, ruleIndex, ruleName, effectType, triggeredByCoupon, triggeredForCatalogItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectEntity {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    rulesetId: ").append(toIndentedString(rulesetId)).append("\n");
    sb.append("    ruleIndex: ").append(toIndentedString(ruleIndex)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    effectType: ").append(toIndentedString(effectType)).append("\n");
    sb.append("    triggeredByCoupon: ").append(toIndentedString(triggeredByCoupon)).append("\n");
    sb.append("    triggeredForCatalogItem: ").append(toIndentedString(triggeredForCatalogItem)).append("\n");
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

