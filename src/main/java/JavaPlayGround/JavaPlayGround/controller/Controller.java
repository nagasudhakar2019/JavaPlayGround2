package JavaPlayGround.JavaPlayGround.controller;

import JavaPlayGround.JavaPlayGround.model.RecordPojo;
import JavaPlayGround.JavaPlayGround.model.ResponsePOJO;
import JavaPlayGround.JavaPlayGround.service.IEmployeeService;
import JavaPlayGround.JavaPlayGround.service.PlayGround;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.ListResourceBundle;

@RestController
public class Controller {
    @Autowired
    private  PlayGround playGround;
    @Autowired
    private IEmployeeService iEmployeeService;
    @RequestMapping(value = "/javaplayground/getinputs", method = RequestMethod.GET)
    public Object getSalesforceInput(@RequestParam Integer count,
                                @RequestParam String userOrGroupId,
                                @RequestParam String userEmail,
                                @RequestParam String objectName,
                                @RequestParam  String action) throws IOException {
        return playGround.getInputRecords(count,userOrGroupId,userEmail,objectName,action,"SALESFORCE");
    }

    @RequestMapping(value = "/javaplayground/get_salesloft_inputs", method = RequestMethod.GET)
    public Object getSalesloftInput(@RequestParam Integer count,
                                @RequestParam String userOrGroupId,
                                @RequestParam String userEmail,
                                @RequestParam String objectName
                                ) throws IOException {
        return playGround.getInputRecords(count,userOrGroupId,userEmail,objectName,null,"SALESLOFT");
    }

    @RequestMapping(value = "/javaplayground/getinputstoupdate", method = RequestMethod.POST)
    public Object callSFDCQuery(
                                @RequestParam String userOrGroupId,
                                @RequestParam String userEmail,
                                @RequestParam String objectName,
                                @RequestParam String action,
                                @RequestBody List<ResponsePOJO> recToUpdate) throws IOException {
        return playGround.getRecordsToUpdate(recToUpdate,userOrGroupId,userEmail,objectName,action);
    }

    /**
     * it is for POC
     */
    @RequestMapping(value = "/javaplayground/getEmployeeDetails", method = RequestMethod.GET)
    public Object getEmployee(
            @RequestParam String employeeId) throws IOException {
        return iEmployeeService.getEmployee(employeeId);
    }

}
