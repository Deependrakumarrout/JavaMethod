package JavaMethod;

public class I_Review {
    /*

   //This all code is done by myself. But not the below one which i have define that i did from the online course.

    // instance field
    double balance,bonus,tds;

    // constructor method
   public I_Review(double balanceAmount,double bonusPrice,double taxTDS) {
       balance = balanceAmount;
       bonus = bonusPrice;
       tds = taxTDS;
   }

   // check balance method
   public void checkBalance() {
       System.out.println("Hello\n"+"Your current balance is: Rs " + balance);
   }

   // withdraw method
    public double withdraw(double amountToWithdraw) {
       balance = balance - amountToWithdraw;                                    // (IMP)
       System.out.println("You just have withdrew of: Rs " + amountToWithdraw); // Here i cant able to write any 'return' type like this ->
        return balance;                                              // -> return "You just have withdrew of: Rs " + amountToWithdraw;
                                                                     // It will through me an error it will say can't able to convert from string to double.
                                                                    // This things will only work in 'void' keyword but not in double, int etc.
    }


    // deposit method
    public double deposit(double depositAmount) {
       balance = balance + depositAmount;
       System.out.println("You just have deposit of: Rs " + depositAmount);
       return balance;
    }

    // toString method
    public String toString() {
       balance = balance + bonus - tds;
       return "Congrats you have received bonus of: Rs " + bonus + " and the TDS has charged of: Rs " + tds +
               " and now your balance is: Rs " + balance + "\n";
    }

    public static void main(String[] args){
        I_Review banker = new I_Review(4820,80,50);
        banker.checkBalance();
        banker.withdraw(3000);
        banker.checkBalance();
        banker.deposit(9050);
        banker.checkBalance();
        System.out.println(banker);
    }

}

   */


    // i did it from the online course.
    // instance fields
    int balance,bonus;

    public I_Review(int initialBalance, int amtBonus){
        balance = initialBalance;
        bonus = amtBonus;
    }

    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }


    public void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("Your just deposited " + amountToDeposit);
    }


    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return balance;
    }

    //  bonus method
    public int bonus(int bonusAmt){
        return balance = balance + bonusAmt;
    }

    // toString method
    public String toString() {
        return "your balance " + balance + " and your bonus amount is " + bonus;
    }

    public static void main(String[] args){
        I_Review savings = new I_Review(2000,250);
        System.out.println(savings);

        // Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();


        // Withdrawing:
        // int afterWithdraw = savings.balance - 300;
        // savings.balance = afterWithdraw;
        // System.out.println("You just withdrew "+300);
        savings.withdraw(300);

        // Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();


        // Deposit:
        // int afterDeposit = savings.balance + 600;
        // savings.balance = afterDeposit;
        // System.out.println("You just deposited "+600);
        savings.deposit(600);


        // Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        // Deposit:
        // int afterDeposit2 = savings.balance + 600;
        // savings.balance = afterDeposit2;
        // System.out.println("You just deposited "+600);
        savings.deposit(600);

        // Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

    }

}
