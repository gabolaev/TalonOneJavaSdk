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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Binding
 */

public class Binding {
  @SerializedName("name")
  private String name = null;

  @SerializedName("expression")
  private List<Object> expression = new ArrayList<Object>();

  public Binding name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the value to be bound.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A descriptive name for the value to be bound.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Binding expression(List<Object> expression) {
    this.expression = expression;
    return this;
  }

  public Binding addExpressionItem(Object expressionItem) {
    this.expression.add(expressionItem);
    return this;
  }

   /**
   * A Talang expression that will be evaluated and its result attached to the name of the binding.
   * @return expression
  **/
  @ApiModelProperty(required = true, value = "A Talang expression that will be evaluated and its result attached to the name of the binding.")
  public List<Object> getExpression() {
    return expression;
  }

  public void setExpression(List<Object> expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Binding binding = (Binding) o;
    return Objects.equals(this.name, binding.name) &&
        Objects.equals(this.expression, binding.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Binding {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

