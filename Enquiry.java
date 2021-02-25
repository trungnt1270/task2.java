package sesion01;

public class Enquiry {
    public static void main(String[] args){
        int accountNumber = 192834;
        double accountBalance = 11423.79;
        char accountType = 'S';
        boolean acctive = true;

        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Active:" + acctive);
        System.out.println("Account Type" + "(S: Savings C: Current): " + accountType);
        System.out.println("Account Balance: $" + accountBalance);
    }
}
