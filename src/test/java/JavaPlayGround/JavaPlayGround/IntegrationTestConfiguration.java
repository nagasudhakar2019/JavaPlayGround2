package JavaPlayGround.JavaPlayGround;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@TestConfiguration
//@Profile("test")
public class IntegrationTestConfiguration {
    @Value("${applicationName}")
    private String appName;
    @Bean("appName")
    //@Primary
    public String getAppName(){
        return appName;
    }
}
