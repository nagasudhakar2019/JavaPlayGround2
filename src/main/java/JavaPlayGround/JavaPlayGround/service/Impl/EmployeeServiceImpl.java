package JavaPlayGround.JavaPlayGround.service.Impl;

import JavaPlayGround.JavaPlayGround.configuration.Configuration;
import JavaPlayGround.JavaPlayGround.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
//    @Autowired
//    private Configuration configuration;
    @Autowired
    @Qualifier("appName")
    private String appName;
    public String getEmployee(String empId){
        return "app name is: "+appName;
    }
}
