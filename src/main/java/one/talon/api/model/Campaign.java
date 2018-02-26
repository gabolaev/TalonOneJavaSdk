/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import java.util.Objects;
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
import one.talon.api.model.CodeGeneratorSettings;
import one.talon.api.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Campaign {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("applicationId")
  private Integer applicationId = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("attributes")
  private Object attributes = null;

  /**
   * A disabled or archived campaign is not evaluated for rules or coupons. 
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    ARCHIVED("archived");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = StateEnum.ENABLED;

  @SerializedName("activeRulesetId")
  private Integer activeRulesetId = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  /**
   * Gets or Sets features
   */
  @JsonAdapter(FeaturesEnum.Adapter.class)
  public enum FeaturesEnum {
    COUPONS("coupons"),
    
    REFERRALS("referrals"),
    
    LOYALTY("loyalty");

    private String value;

    FeaturesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeaturesEnum fromValue(String text) {
      for (FeaturesEnum b : FeaturesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FeaturesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeaturesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeaturesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeaturesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("features")
  private List<FeaturesEnum> features = new ArrayList<FeaturesEnum>();

  @SerializedName("couponSettings")
  private CodeGeneratorSettings couponSettings = null;

  @SerializedName("referralSettings")
  private CodeGeneratorSettings referralSettings = null;

  @SerializedName("limits")
  private List<LimitConfig> limits = new ArrayList<LimitConfig>();

  @SerializedName("couponRedemptionCount")
  private Integer couponRedemptionCount = null;

  @SerializedName("referralRedemptionCount")
  private Integer referralRedemptionCount = null;

  @SerializedName("discountCount")
  private Integer discountCount = null;

  @SerializedName("lastActivity")
  private OffsetDateTime lastActivity = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("updatedBy")
  private String updatedBy = null;

  public Campaign id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * This campaign&#39;s ID. Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "This campaign's ID. Unique ID for this entity.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Campaign created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was created.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Campaign applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the application that owns this entity.")
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public Campaign userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that owns this entity.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Campaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A friendly name for this campaign.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A friendly name for this campaign.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Campaign description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the campaign.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A detailed description of the campaign.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Campaign startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Datetime when the campaign will become active.
   * @return startTime
  **/
  @ApiModelProperty(value = "Datetime when the campaign will become active.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Campaign endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Datetime when the campaign will become in-active.
   * @return endTime
  **/
  @ApiModelProperty(value = "Datetime when the campaign will become in-active.")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Campaign attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this campaign
   * @return attributes
  **/
  @ApiModelProperty(value = "Arbitrary properties associated with this campaign")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public Campaign state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * A disabled or archived campaign is not evaluated for rules or coupons. 
   * @return state
  **/
  @ApiModelProperty(required = true, value = "A disabled or archived campaign is not evaluated for rules or coupons. ")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Campaign activeRulesetId(Integer activeRulesetId) {
    this.activeRulesetId = activeRulesetId;
    return this;
  }

   /**
   * ID of Ruleset this campaign applies on customer session evaluation.
   * @return activeRulesetId
  **/
  @ApiModelProperty(value = "ID of Ruleset this campaign applies on customer session evaluation.")
  public Integer getActiveRulesetId() {
    return activeRulesetId;
  }

  public void setActiveRulesetId(Integer activeRulesetId) {
    this.activeRulesetId = activeRulesetId;
  }

  public Campaign tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Campaign addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign.
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "A list of tags for the campaign.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Campaign features(List<FeaturesEnum> features) {
    this.features = features;
    return this;
  }

  public Campaign addFeaturesItem(FeaturesEnum featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * A list of features for the campaign.
   * @return features
  **/
  @ApiModelProperty(required = true, value = "A list of features for the campaign.")
  public List<FeaturesEnum> getFeatures() {
    return features;
  }

  public void setFeatures(List<FeaturesEnum> features) {
    this.features = features;
  }

  public Campaign couponSettings(CodeGeneratorSettings couponSettings) {
    this.couponSettings = couponSettings;
    return this;
  }

   /**
   * Get couponSettings
   * @return couponSettings
  **/
  @ApiModelProperty(value = "")
  public CodeGeneratorSettings getCouponSettings() {
    return couponSettings;
  }

  public void setCouponSettings(CodeGeneratorSettings couponSettings) {
    this.couponSettings = couponSettings;
  }

  public Campaign referralSettings(CodeGeneratorSettings referralSettings) {
    this.referralSettings = referralSettings;
    return this;
  }

   /**
   * Get referralSettings
   * @return referralSettings
  **/
  @ApiModelProperty(value = "")
  public CodeGeneratorSettings getReferralSettings() {
    return referralSettings;
  }

  public void setReferralSettings(CodeGeneratorSettings referralSettings) {
    this.referralSettings = referralSettings;
  }

  public Campaign limits(List<LimitConfig> limits) {
    this.limits = limits;
    return this;
  }

  public Campaign addLimitsItem(LimitConfig limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The set of limits that will operate for this campaign
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "The set of limits that will operate for this campaign")
  public List<LimitConfig> getLimits() {
    return limits;
  }

  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }

  public Campaign couponRedemptionCount(Integer couponRedemptionCount) {
    this.couponRedemptionCount = couponRedemptionCount;
    return this;
  }

   /**
   * Number of coupons redeemed in the campaign.
   * @return couponRedemptionCount
  **/
  @ApiModelProperty(value = "Number of coupons redeemed in the campaign.")
  public Integer getCouponRedemptionCount() {
    return couponRedemptionCount;
  }

  public void setCouponRedemptionCount(Integer couponRedemptionCount) {
    this.couponRedemptionCount = couponRedemptionCount;
  }

  public Campaign referralRedemptionCount(Integer referralRedemptionCount) {
    this.referralRedemptionCount = referralRedemptionCount;
    return this;
  }

   /**
   * Number of referral codes redeemed in the campaign.
   * @return referralRedemptionCount
  **/
  @ApiModelProperty(value = "Number of referral codes redeemed in the campaign.")
  public Integer getReferralRedemptionCount() {
    return referralRedemptionCount;
  }

  public void setReferralRedemptionCount(Integer referralRedemptionCount) {
    this.referralRedemptionCount = referralRedemptionCount;
  }

  public Campaign discountCount(Integer discountCount) {
    this.discountCount = discountCount;
    return this;
  }

   /**
   * Total amount of discounts redeemed in the campaign.
   * @return discountCount
  **/
  @ApiModelProperty(value = "Total amount of discounts redeemed in the campaign.")
  public Integer getDiscountCount() {
    return discountCount;
  }

  public void setDiscountCount(Integer discountCount) {
    this.discountCount = discountCount;
  }

  public Campaign lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Timestamp of the most recent event received by this campaign.
   * @return lastActivity
  **/
  @ApiModelProperty(value = "Timestamp of the most recent event received by this campaign.")
  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }

  public Campaign updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Timestamp of the most recent update to the campaign or any of its elements.
   * @return updated
  **/
  @ApiModelProperty(value = "Timestamp of the most recent update to the campaign or any of its elements.")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public Campaign createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Name of the user who created this campaign if available.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Name of the user who created this campaign if available.")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Campaign updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Name of the user who last updated this campaign if available.
   * @return updatedBy
  **/
  @ApiModelProperty(value = "Name of the user who last updated this campaign if available.")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.created, campaign.created) &&
        Objects.equals(this.applicationId, campaign.applicationId) &&
        Objects.equals(this.userId, campaign.userId) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.description, campaign.description) &&
        Objects.equals(this.startTime, campaign.startTime) &&
        Objects.equals(this.endTime, campaign.endTime) &&
        Objects.equals(this.attributes, campaign.attributes) &&
        Objects.equals(this.state, campaign.state) &&
        Objects.equals(this.activeRulesetId, campaign.activeRulesetId) &&
        Objects.equals(this.tags, campaign.tags) &&
        Objects.equals(this.features, campaign.features) &&
        Objects.equals(this.couponSettings, campaign.couponSettings) &&
        Objects.equals(this.referralSettings, campaign.referralSettings) &&
        Objects.equals(this.limits, campaign.limits) &&
        Objects.equals(this.couponRedemptionCount, campaign.couponRedemptionCount) &&
        Objects.equals(this.referralRedemptionCount, campaign.referralRedemptionCount) &&
        Objects.equals(this.discountCount, campaign.discountCount) &&
        Objects.equals(this.lastActivity, campaign.lastActivity) &&
        Objects.equals(this.updated, campaign.updated) &&
        Objects.equals(this.createdBy, campaign.createdBy) &&
        Objects.equals(this.updatedBy, campaign.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, userId, name, description, startTime, endTime, attributes, state, activeRulesetId, tags, features, couponSettings, referralSettings, limits, couponRedemptionCount, referralRedemptionCount, discountCount, lastActivity, updated, createdBy, updatedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    activeRulesetId: ").append(toIndentedString(activeRulesetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    couponSettings: ").append(toIndentedString(couponSettings)).append("\n");
    sb.append("    referralSettings: ").append(toIndentedString(referralSettings)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    couponRedemptionCount: ").append(toIndentedString(couponRedemptionCount)).append("\n");
    sb.append("    referralRedemptionCount: ").append(toIndentedString(referralRedemptionCount)).append("\n");
    sb.append("    discountCount: ").append(toIndentedString(discountCount)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
