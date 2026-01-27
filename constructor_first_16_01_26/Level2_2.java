package constructor_first_16_01_26;



public class Level2_2 {
    static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Akshant",12345678,1000);

        bankAccount.currentBalance();
        bankAccount.deposit(500);
        bankAccount.withDraw(100);
        bankAccount.withDraw(10000);
        bankAccount.currentBalance();
    }
}

class BankAccount{

    private String accountHolder;
    private long accountNumber;
    private double balance;

  public BankAccount(String accountHolder,long accountNumber,double balance){

        this.accountHolder =accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Total money after Deposit: "+ balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withDraw(double amount){

      if(amount<=balance){
          balance -= amount;
          System.out.println("After withDraw: "+ balance);
      }
      else{

          System.out.println("LessBalance please Add some money");
      }
    }

    void currentBalance(){

        System.out.println(balance);
    }
}