package JavaPlayGround.JavaPlayGround.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class IntegrationTestsPOC {

    @Qualifier("appName")
    @Autowired
    private String appName;
    public String welcomeMethod(String applicantName){
        return "Hello "+ applicantName + ", welcome to "+appName;
    }
}

