package JavaPlayGround.JavaPlayGround.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Value("${applicationName}")
    private String appName;
    @Bean("appName")
    public String getAppName(){
        return appName;
    }
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
