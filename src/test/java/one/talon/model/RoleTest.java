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
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Role
 */
public class RoleTest {
    private final Role model = new Role();

    /**
     * Model tests for Role
     */
    @Test
    public void testRole() {
        // TODO: test Role
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
     * Test the property 'modified'
     */
    @Test
    public void modifiedTest() {
        // TODO: test modified
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        // TODO: test accountId
    }

    /**
     * Test the property 'campaignGroupID'
     */
    @Test
    public void campaignGroupIDTest() {
        // TODO: test campaignGroupID
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'members'
     */
    @Test
    public void membersTest() {
        // TODO: test members
    }

    /**
     * Test the property 'acl'
     */
    @Test
    public void aclTest() {
        // TODO: test acl
    }

}
