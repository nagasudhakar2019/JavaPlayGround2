package JavaPlayGround.JavaPlayGround.model.salesloft;

import JavaPlayGround.JavaPlayGround.model.RecordPojo;

public class SalesloftInputPojo {
    public  String userOrGroupId;
    public String transactionId;
    public String transactionRecordId;
    public String objectName;
    public String userEmail;
    public SalesloftTypeRecord record;
    public SalesloftInputPojo(){
        record = new SalesloftTypeRecord();
    }
}
