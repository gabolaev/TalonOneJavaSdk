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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class AccountAdditionalCost {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;

  /**
   * The type of additional cost. Possible value: - &#x60;session&#x60;: Additional cost will be added per session. - &#x60;item&#x60;: Additional cost will be added per item. - &#x60;both&#x60;: Additional cost will be added per item and session. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SESSION("session"),
    
    ITEM("item"),
    
    BOTH("both");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.SESSION;


  public AccountAdditionalCost id(Integer id) {
    
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


  public AccountAdditionalCost created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public AccountAdditionalCost accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(example = "3886", required = true, value = "The ID of the account that owns this entity.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public AccountAdditionalCost name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The internal name used in API requests.
   * @return name
  **/
  @ApiModelProperty(example = "shippingFee", required = true, value = "The internal name used in API requests.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountAdditionalCost title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The human-readable name for the additional cost that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique.
   * @return title
  **/
  @ApiModelProperty(example = "Shipping fee", required = true, value = "The human-readable name for the additional cost that will be shown in the Campaign Manager. Like `name`, the combination of entity and title must also be unique.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AccountAdditionalCost description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of this additional cost.
   * @return description
  **/
  @ApiModelProperty(example = "A shipping fee", required = true, value = "A description of this additional cost.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AccountAdditionalCost subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public AccountAdditionalCost addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that are subscribed to this additional cost.
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[3, 13]", value = "A list of the IDs of the applications that are subscribed to this additional cost.")

  public List<Integer> getSubscribedApplicationsIds() {
    return subscribedApplicationsIds;
  }


  public void setSubscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    this.subscribedApplicationsIds = subscribedApplicationsIds;
  }


  public AccountAdditionalCost type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of additional cost. Possible value: - &#x60;session&#x60;: Additional cost will be added per session. - &#x60;item&#x60;: Additional cost will be added per item. - &#x60;both&#x60;: Additional cost will be added per item and session. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "session", value = "The type of additional cost. Possible value: - `session`: Additional cost will be added per session. - `item`: Additional cost will be added per item. - `both`: Additional cost will be added per item and session. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAdditionalCost accountAdditionalCost = (AccountAdditionalCost) o;
    return Objects.equals(this.id, accountAdditionalCost.id) &&
        Objects.equals(this.created, accountAdditionalCost.created) &&
        Objects.equals(this.accountId, accountAdditionalCost.accountId) &&
        Objects.equals(this.name, accountAdditionalCost.name) &&
        Objects.equals(this.title, accountAdditionalCost.title) &&
        Objects.equals(this.description, accountAdditionalCost.description) &&
        Objects.equals(this.subscribedApplicationsIds, accountAdditionalCost.subscribedApplicationsIds) &&
        Objects.equals(this.type, accountAdditionalCost.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, accountId, name, title, description, subscribedApplicationsIds, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAdditionalCost {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscribedApplicationsIds: ").append(toIndentedString(subscribedApplicationsIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

