package ATM;

public class Account {
    private String firstName;
    private String secondName;
    private Integer balance;

    public Account(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean createAccount() {
        try {
            String cardNumber = this.generateCardNumber();
            String pincode = this.generatePincode();
            System.out.println("Account created successfully");
            System.out.println("Card number: " + cardNumber);
            System.out.println("Your pin: " + pincode);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public String generateCardNumber() {
        Integer length = 8;

        String password = "1234567890";
        char[] cardNumber = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * password.length());

            cardNumber[i] = password.charAt(random);
        }

        return new String(cardNumber);
    }

    public String generatePincode() {
        Integer length = 4;

        String pin = "1234567890";
        char[] pincode = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * pin.length());

            pincode[i] = pin.charAt(random);
        }
        return new String(pincode);
    }
}
