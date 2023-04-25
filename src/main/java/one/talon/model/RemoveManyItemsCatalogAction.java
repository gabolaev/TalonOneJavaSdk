/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import one.talon.model.CatalogActionFilter;

/**
 * The specific properties of the \&quot;REMOVE_MANY\&quot; catalog sync action.
 */
@ApiModel(description = "The specific properties of the \"REMOVE_MANY\" catalog sync action.")

public class RemoveManyItemsCatalogAction {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<CatalogActionFilter> filters = null;


  public RemoveManyItemsCatalogAction filters(List<CatalogActionFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public RemoveManyItemsCatalogAction addFiltersItem(CatalogActionFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<CatalogActionFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The list of filters used to select the items to patch, joined by &#x60;AND&#x60;.  **Note:** Every item in the catalog will be removed if there are no filters. 
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of filters used to select the items to patch, joined by `AND`.  **Note:** Every item in the catalog will be removed if there are no filters. ")

  public List<CatalogActionFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<CatalogActionFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveManyItemsCatalogAction removeManyItemsCatalogAction = (RemoveManyItemsCatalogAction) o;
    return Objects.equals(this.filters, removeManyItemsCatalogAction.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveManyItemsCatalogAction {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

