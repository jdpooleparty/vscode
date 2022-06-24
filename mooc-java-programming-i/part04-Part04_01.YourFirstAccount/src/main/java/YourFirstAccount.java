
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        //instantiate an account object with the owner "Jonathan" and balance 100
        Account account = new Account("Jonathan", 100.0);

        //deposit 20
        account.deposit(20.0);
        
        //view balance
        System.out.println(account.saldo());

        
    }
}
