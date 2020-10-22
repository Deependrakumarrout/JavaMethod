package JavaMethod;

public class G_Return {

    /*
   //This one done my me;

    int rollNum;
    public G_Return(int std_roll) {
        rollNum = std_roll;
    }

    public void num(){ //So like this we can print using void keyword, i am testing this thing.
        int sum = 4 + 6;
        System.out.println(sum);
    }

    //By using int dataType.
    public int num1() {
        int multi = 5 * 3; //This thing is done by that course that i am following.
        return multi;
    }

    public static void main(String[] args) {
        G_Return tech = new G_Return(32);
        tech.num();
        int dear = tech.num1();
        System.out.println(dear);

    }

 */

    // online course one ->
    
    //instance fields
    String productType;
    double price;

    // constructor method
    public G_Return(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println("Total price: " + price);
    }

    // get price with tax method
    public double getPriceWithTax() {
        double totalPrice = price + price * 0.08;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        G_Return lemonadeStand = new G_Return("LemonJuice", 3.75);
        G_Return lemonPrice = new G_Return("AppleJuice",4.53);

        double lemonadePrice = lemonadeStand.getPriceWithTax(); // we can declare in this way because we are using double in out method which give return us.
        System.out.println(lemonadePrice);

        lemonPrice.increasePrice(4); // But here we can't able to declare like that because we are using void keyword in our method.

    }
}
