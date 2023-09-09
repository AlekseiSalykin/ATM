package ATM;

public class Operation {
    private String cardNumber;
    private String pincode;
    int balance;
    public Operation(String cardNumber, String pincode){
        this.cardNumber = cardNumber;
        this.pincode = pincode;
    }

    public Integer showBalance(){
        return this.balance;
    }

    public void deposit(){

    }
}
