package JavaPlayGround.JavaPlayGround.model;

public class InputPojo {
    public  String userOrGroupId;
    public String userEmail;
    public String transactionId;
    public String transactionRecordId;
    public String objectName;
    public String action;
    public RecordPojo record;
    public InputPojo(){
        record = new RecordPojo();
    }
}
