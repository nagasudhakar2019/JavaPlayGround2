package JavaPlayGround.JavaPlayGround;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@TestConfiguration
public class IntegrationTestConfiguration {
    @Value("${AppName}")
    private String appNameFromKV;

    public String getAppNameFromKV(){
        return appNameFromKV;
    }
//    @Value("${applicationName}")
//    private String appName;
//    @Value("${envTestVar}")
//    private String testVarValue;
//
//    @Bean("testVar")
//    public String getEnvTestVar(){
//        return testVarValue;
//    }
//
//
//    @Bean("appName")
//    public String getAppName(){
//        return appName;
//    }
//
//    /** The service bus request queue. */
//    @Value("${salesforce-client-request-queue-name}")
//    private String servicebusRequestQueue;
//
//    /** The service bus response queue. */
//    @Value("${salesforce-client-response-queue-name}")
//    private String servicebusResponseQueue;
//
//
//    public String getServicebusRequestQueue(){
//        return servicebusRequestQueue;
//    }
//    public String getServicebusResponseQueue(){
//        return servicebusResponseQueue;
//    }

}
