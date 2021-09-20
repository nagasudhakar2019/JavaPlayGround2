package JavaPlayGround.JavaPlayGround;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@TestConfiguration
public class IntegrationTestConfiguration {
    @Value("${applicationName}")
    private String appName;
//    @Value("${envTestVar}")
//    private String testVarValue;

    @Bean("appName")
    public String getAppName(){
        return appName;
    }

//    @Bean("testVar")
//    public String getEnvTestVar(){
//        return testVarValue;
//    }
}
