/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api;

@javax.annotation.Generated(value = "io.talon.codegen.languages.JavaClientCodegen", date = "2018-02-07T17:30:19.650+01:00")
public class Configuration {
    private static IntegrationApiClient integrationApiClient = new IntegrationApiClient();
    private static ManagementApiClient managementApiClient = new ManagementApiClient();

    public static IntegrationApiClient getIntegrationApiClient() {
        return integrationApiClient;
    }
    public static ManagementApiClient getManagementApiClient() {
        return managementApiClient;
    }
}
