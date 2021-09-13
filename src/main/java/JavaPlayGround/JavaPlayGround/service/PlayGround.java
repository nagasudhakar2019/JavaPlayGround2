package JavaPlayGround.JavaPlayGround.service;

import JavaPlayGround.JavaPlayGround.model.*;
import JavaPlayGround.JavaPlayGround.model.salesloft.SalesloftAccountInput;
import JavaPlayGround.JavaPlayGround.model.salesloft.SalesloftAccountRec;
import JavaPlayGround.JavaPlayGround.model.salesloft.SalesloftInputPojo;
import JavaPlayGround.JavaPlayGround.model.salesloft.SalesloftTypeRecord;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class PlayGround {
    public Object getInputRecords(Integer count,String userOrGroupId, String userEmail,String objectName, String action,String requestType) throws IOException {
        List<InputPojo> objects = new ArrayList<>();
        List<SalesloftInputPojo> salesloftInputRecs = new ArrayList<>();
        List<SalesloftAccountInput> salesloftAccountRecs = new ArrayList<>();
        Object results = new Object();
        if (requestType == "SALESFORCE") {
            for (Integer i = 0; i < count; i++) {
                InputPojo rec = new InputPojo();
                rec.userOrGroupId = userOrGroupId;
                if (i % 2 == 0) {
                    rec.userEmail = "npatamsetty@linkedin.com.1337c";
                } else {
                    rec.userEmail = "ndesai1@linkedin.com.1337c";
                }
                rec.transactionId = "TRANS" + i;
                rec.transactionRecordId = "TRANSREC" + i;
                rec.objectName = "contact";
                rec.action = action;
                RecordPojo record = new RecordPojo();
                record.FirstName = "Contact" + i;
                record.LastName = "Vantage Bulk Test ";
                record.Email = "vantagebulktest" + i + "@test.com";
                rec.record = record;
                objects.add(rec);
            }
            results = (Object) objects;
            //return objects;
        } else {
            if (objectName.equals("person")) {
                for (Integer i = 0; i < count; i++) {
                    SalesloftInputPojo rec = new SalesloftInputPojo();
                    rec.userOrGroupId = userOrGroupId;
                    if (i % 2 == 0) {
                        rec.userEmail = "npatamsetty@linkedin.com.1337c";
                    } else {
                        rec.userEmail = "ndesai1@linkedin.com.1337c";
                    }
                    rec.transactionId = "TRANS" + i;
                    rec.transactionRecordId = "TRANSREC" + i;
                    rec.objectName = objectName;
                    //rec.action = action;
                    SalesloftTypeRecord record = new SalesloftTypeRecord();
                    record.first_name = "Contact" + i;
                    record.email_address = "vantagebulktest" + i + "@test.com";
                    record.upsert_key = "email_address";
                    rec.record = record;
                    salesloftInputRecs.add(rec);
                }
                results = (Object) salesloftInputRecs;
                //return salesloftInputRecs;
            }else if(objectName.equals("account")){
                for (Integer i = 0; i < count; i++) {
                    SalesloftAccountInput rec = new SalesloftAccountInput();
                    rec.userOrGroupId = userOrGroupId;
                    if (i % 2 == 0) {
                        rec.userEmail = "npatamsetty@linkedin.com.1337c";
                    } else {
                        rec.userEmail = "ndesai1@linkedin.com.1337c";
                    }
                    rec.transactionId = "TRANS" + i;
                    rec.transactionRecordId = "TRANSREC" + i;
                    rec.objectName = objectName;
                    //rec.action = action;
                    SalesloftAccountRec record = new SalesloftAccountRec();
                    record.name = "Vantage Test Account " + i;
                    record.domain = "salesloft"+i+".com";
                    record.conversational_name = "test";
                    record.description = "test";
                    record.phone = "9999"+i;
                    record.website = "https://salesloft"+i+".com";
                    rec.record = record;
                    salesloftAccountRecs.add(rec);
                }
                results = (Object) salesloftAccountRecs;
                //return salesloftInputRecs;
            }
        }
        return results;
    }
    public Object getRecordsToUpdate(List<ResponsePOJO> recToUpdate,String userOrGroupId, String userEmail,String objectName, String action) throws IOException {
        List<UpdateRecordPojo> objects = new ArrayList<>();
        Integer i=0;
        for(ResponsePOJO response : recToUpdate){
            if(response.objectId != null){
                UpdateRecordPojo rec = new UpdateRecordPojo();
                rec.userOrGroupId = userOrGroupId;
                if(i % 2 == 0){
                    rec.userEmail = "ndesai1@linkedin.com.1337c";
                }else{
                    rec.userEmail = "npatamsetty@linkedin.com.1337c";
                }
                rec.userEmail = userEmail;
                rec.transactionId = "TRANS"+i;
                rec.transactionRecordId  = "TRANSREC"+i;
                rec.objectName = objectName;
                rec.action = action;
                RecordToUpdate record = new RecordToUpdate();
                record.FirstName = "Contact Updated "+i;
                record.LastName = "Vantage Bulk Test";
                record.Email = "vantagebulktest"+i+"@test.com";
                if(response.objectId != null){
                    record.Id = response.objectId;
                }
                rec.record = record;
                i++;
                objects.add(rec);
            }

        }
        return objects;
    }
}
