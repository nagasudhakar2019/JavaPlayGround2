package JavaPlayGround.JavaPlayGround.model.salesloft;

public class SalesloftAccountInput {
    public  String userOrGroupId;
    public String transactionId;
    public String transactionRecordId;
    public String objectName;
    public String userEmail;
    public SalesloftAccountRec record;
    public SalesloftAccountInput(){
        record = new SalesloftAccountRec();
    }
}
