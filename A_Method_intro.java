package JavaMethod;

public class A_Method_intro {
    double balance;
    public A_Method_intro(double accBalance) {
        balance = accBalance;
    }
    //Not implementing method yet in the next exercise i will implement.
    /* Its done by me:
    public static void main(String[] args) {
        A_Method_intro balanceAvailable = new A_Method_intro(2000);
        System.out.println("Your balance: " + balanceAvailable.balance);


        //withdrew money:
        balanceAvailable.balance = balanceAvailable.balance - 300;
        System.out.println("You just withdrew: 300");
        System.out.println("Your balance is now: "+ balanceAvailable.balance);

        //Depositing money:
        balanceAvailable.balance = balanceAvailable.balance + 600;
        System.out.println("You just deposit: 600 ");

        //Showing balance:
        System.out.println("Your balance is: " + balanceAvailable.balance);
 }
    */

        //Done through course:
        public static void main(String[] args) {
            A_Method_intro savings = new A_Method_intro(2000);

            //Check balance:
            System.out.println("Hello!");
            System.out.println("Your balance is "+savings.balance);

            //Withdrawing:
            double afterWithdraw = savings.balance - 300;
            savings.balance = afterWithdraw;
            System.out.println("You just withdrew "+300);

            //Check balance:
            System.out.println("Hello!");
            System.out.println("Your balance is "+savings.balance);

            //Deposit:
            double afterDeposit = savings.balance + 600;
            savings.balance = afterDeposit;
            System.out.println("You just deposited "+600);

            //Check balance:
            System.out.println("Hello!");
            System.out.println("Your balance is "+savings.balance);

            //Deposit:
            double afterDeposit2 = savings.balance + 600;
            savings.balance = afterDeposit2;
            System.out.println("You just deposited "+600);

            //Check balance:
            System.out.println("Hello!");
            System.out.println("Your balance is "+savings.balance);

        }
}
