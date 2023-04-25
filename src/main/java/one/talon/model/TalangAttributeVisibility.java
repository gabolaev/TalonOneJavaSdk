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

/**
 * TalangAttributeVisibility
 */

public class TalangAttributeVisibility {
  public static final String SERIALIZED_NAME_INVISIBLE = "invisible";
  @SerializedName(SERIALIZED_NAME_INVISIBLE)
  private List<String> invisible = null;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private List<String> visible = null;


  public TalangAttributeVisibility invisible(List<String> invisible) {
    
    this.invisible = invisible;
    return this;
  }

  public TalangAttributeVisibility addInvisibleItem(String invisibleItem) {
    if (this.invisible == null) {
      this.invisible = new ArrayList<String>();
    }
    this.invisible.add(invisibleItem);
    return this;
  }

   /**
   * List of attribute names to hide in the UI.
   * @return invisible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attribute names to hide in the UI.")

  public List<String> getInvisible() {
    return invisible;
  }


  public void setInvisible(List<String> invisible) {
    this.invisible = invisible;
  }


  public TalangAttributeVisibility visible(List<String> visible) {
    
    this.visible = visible;
    return this;
  }

  public TalangAttributeVisibility addVisibleItem(String visibleItem) {
    if (this.visible == null) {
      this.visible = new ArrayList<String>();
    }
    this.visible.add(visibleItem);
    return this;
  }

   /**
   * List of attribute names to show in the UI.
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attribute names to show in the UI.")

  public List<String> getVisible() {
    return visible;
  }


  public void setVisible(List<String> visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TalangAttributeVisibility talangAttributeVisibility = (TalangAttributeVisibility) o;
    return Objects.equals(this.invisible, talangAttributeVisibility.invisible) &&
        Objects.equals(this.visible, talangAttributeVisibility.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invisible, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TalangAttributeVisibility {\n");
    sb.append("    invisible: ").append(toIndentedString(invisible)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

