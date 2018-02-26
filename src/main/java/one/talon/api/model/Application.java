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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Application {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("modified")
  private OffsetDateTime modified = null;

  @SerializedName("accountId")
  private Integer accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("currency")
  private String currency = null;

  public Application id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this entity.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Application created(OffsetDateTime created) {
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

  public Application modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The exact moment this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was last modified.")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public Application accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that owns this entity.")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public Application name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this application.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Application description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A longer description of the application.
   * @return description
  **/
  @ApiModelProperty(value = "A longer description of the application.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Application key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Hex key for HMAC-signing API calls as coming from this application (16 hex digits)
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Hex key for HMAC-signing API calls as coming from this application (16 hex digits)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Application timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * A string containing an IANA timezone descriptor.
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "A string containing an IANA timezone descriptor.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Application currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * A string describing a default currency for new customer sessions.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "A string describing a default currency for new customer sessions.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.id, application.id) &&
        Objects.equals(this.created, application.created) &&
        Objects.equals(this.modified, application.modified) &&
        Objects.equals(this.accountId, application.accountId) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.description, application.description) &&
        Objects.equals(this.key, application.key) &&
        Objects.equals(this.timezone, application.timezone) &&
        Objects.equals(this.currency, application.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, accountId, name, description, key, timezone, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
