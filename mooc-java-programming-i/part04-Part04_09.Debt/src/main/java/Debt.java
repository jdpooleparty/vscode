public class Debt {
    
public Debt(double initialBalance, double initialInterestRate){
    this.balance = initialBalance;
    this.interestRate = initialInterestRate;
}



private double balance;
private double interestRate;

public void printBalance(){
    System.out.println("The balance is: " + balance);

}

public void waitOneYear(){
    balance = balance * interestRate;
}





}
