package JavaMethod;

public class F_Reassigning_instance {
    double balance;

    /*
    //There program done by me.

    public F_Reassigning_instance(double checkBalance) {
        balance = checkBalance;
        //System.out.println(balance);
    }

    public void amountToWithdrew(double withdrewAmount) {
        double updateAmount = balance - withdrewAmount;
        balance = updateAmount;
        System.out.println("Now you have withdraw of: Rs " + withdrewAmount);
        System.out.println("Your current balance is now: Rs " + balance +"\n");
    }

    public void amountToDeposit(double depositAmount) {
        double updateAmount = balance + depositAmount;
        balance = updateAmount;
        //System.out.println("")
        System.out.println("Now you have deposited of: Rs " + depositAmount);
        System.out.println("Your current balance is now: Rs " + balance +"\n");
    }


    public static void main(String[] args) {
        F_Reassigning_instance yourAccount = new F_Reassigning_instance(2000);
        System.out.println("Your current balance is: Rs " + yourAccount.balance);
        yourAccount.amountToWithdrew(1500);
        yourAccount.amountToDeposit(4380);
        System.out.println("Final amount including tax: Rs " + yourAccount.balance);
        System.out.println("Thanks for banking with us.");
*/

    /*Changing instance fields is how we change the state of an object and make our
    objects more flexible and realistic.*/

        //From the course program.

        // instance fields
        String productType;
        double price;

        // constructor method
  public F_Reassigning_instance(String product, double initialPrice) {
            productType = product;
            price = initialPrice;
        }

        // increase price method
        public void increasePrice(double priceToAdd){
            double newPrice = price + priceToAdd;
            price = newPrice;
        }

        // main method
        public static void main(String[] args) {
            F_Reassigning_instance lemonadeStand = new F_Reassigning_instance("Lemonade", 3.75);
            lemonadeStand.increasePrice(1.5);
            System.out.println(lemonadeStand.price);

    }
}
