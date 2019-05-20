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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ApplicationStorage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATATYPE = "datatype";
  @SerializedName(SERIALIZED_NAME_DATATYPE)
  private Object datatype = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_USED_AT = "usedAt";
  @SerializedName(SERIALIZED_NAME_USED_AT)
  private List<String> usedAt = new ArrayList<String>();

  public ApplicationStorage id(Integer id) {
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

  public ApplicationStorage created(OffsetDateTime created) {
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

  public ApplicationStorage modified(OffsetDateTime modified) {
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

  public ApplicationStorage applicationId(Integer applicationId) {
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

  public ApplicationStorage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Identifier for the information to be saved, e.g. \&quot;Loyalty points for SKU\&quot;.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Identifier for the information to be saved, e.g. \"Loyalty points for SKU\".")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationStorage datatype(Object datatype) {
    this.datatype = datatype;
    return this;
  }

   /**
   * A JSON Schema describing the information to be saved in the storage
   * @return datatype
  **/
  @ApiModelProperty(required = true, value = "A JSON Schema describing the information to be saved in the storage")
  public Object getDatatype() {
    return datatype;
  }

  public void setDatatype(Object datatype) {
    this.datatype = datatype;
  }

  public ApplicationStorage description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the application store
   * @return description
  **/
  @ApiModelProperty(value = "Description of the application store")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationStorage usedAt(List<String> usedAt) {
    this.usedAt = usedAt;
    return this;
  }

  public ApplicationStorage addUsedAtItem(String usedAtItem) {
    this.usedAt.add(usedAtItem);
    return this;
  }

   /**
   * array of rulesets where the application storage is used
   * @return usedAt
  **/
  @ApiModelProperty(required = true, value = "array of rulesets where the application storage is used")
  public List<String> getUsedAt() {
    return usedAt;
  }

  public void setUsedAt(List<String> usedAt) {
    this.usedAt = usedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationStorage applicationStorage = (ApplicationStorage) o;
    return Objects.equals(this.id, applicationStorage.id) &&
        Objects.equals(this.created, applicationStorage.created) &&
        Objects.equals(this.modified, applicationStorage.modified) &&
        Objects.equals(this.applicationId, applicationStorage.applicationId) &&
        Objects.equals(this.name, applicationStorage.name) &&
        Objects.equals(this.datatype, applicationStorage.datatype) &&
        Objects.equals(this.description, applicationStorage.description) &&
        Objects.equals(this.usedAt, applicationStorage.usedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, applicationId, name, datatype, description, usedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStorage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usedAt: ").append(toIndentedString(usedAt)).append("\n");
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
