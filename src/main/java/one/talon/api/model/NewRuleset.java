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
 * NewRuleset
 */

public class NewRuleset {
  @SerializedName("rules")
  private List<Rule> rules = new ArrayList<Rule>();

  public NewRuleset rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public NewRuleset addRulesItem(Rule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Set of rules to apply.
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "Set of rules to apply.")
  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewRuleset newRuleset = (NewRuleset) o;
    return Objects.equals(this.rules, newRuleset.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewRuleset {\n");

    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

