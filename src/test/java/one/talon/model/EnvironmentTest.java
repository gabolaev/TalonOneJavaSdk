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
import one.talon.model.AccountAdditionalCost;
import one.talon.model.Attribute;
import one.talon.model.Audience;
import one.talon.model.Collection;
import one.talon.model.FunctionDef;
import one.talon.model.GiveawaysPool;
import one.talon.model.LoyaltyProgram;
import one.talon.model.SlotDef;
import one.talon.model.TemplateDef;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Environment
 */
public class EnvironmentTest {
    private final Environment model = new Environment();

    /**
     * Model tests for Environment
     */
    @Test
    public void testEnvironment() {
        // TODO: test Environment
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        // TODO: test applicationId
    }

    /**
     * Test the property 'slots'
     */
    @Test
    public void slotsTest() {
        // TODO: test slots
    }

    /**
     * Test the property 'functions'
     */
    @Test
    public void functionsTest() {
        // TODO: test functions
    }

    /**
     * Test the property 'templates'
     */
    @Test
    public void templatesTest() {
        // TODO: test templates
    }

    /**
     * Test the property 'variables'
     */
    @Test
    public void variablesTest() {
        // TODO: test variables
    }

    /**
     * Test the property 'giveawaysPools'
     */
    @Test
    public void giveawaysPoolsTest() {
        // TODO: test giveawaysPools
    }

    /**
     * Test the property 'loyaltyPrograms'
     */
    @Test
    public void loyaltyProgramsTest() {
        // TODO: test loyaltyPrograms
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'additionalCosts'
     */
    @Test
    public void additionalCostsTest() {
        // TODO: test additionalCosts
    }

    /**
     * Test the property 'audiences'
     */
    @Test
    public void audiencesTest() {
        // TODO: test audiences
    }

    /**
     * Test the property 'collections'
     */
    @Test
    public void collectionsTest() {
        // TODO: test collections
    }

}
