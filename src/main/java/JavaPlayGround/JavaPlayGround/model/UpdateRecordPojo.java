package JavaPlayGround.JavaPlayGround.model;

public class UpdateRecordPojo {

    public  String userOrGroupId;
    public String userEmail;
    public String transactionId;
    public String transactionRecordId;
    public String objectName;
    public String action;
    public RecordToUpdate record;
    public UpdateRecordPojo(){
        record = new RecordToUpdate();
    }
}
