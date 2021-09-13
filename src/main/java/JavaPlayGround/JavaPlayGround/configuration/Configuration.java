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
}
