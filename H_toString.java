package JavaMethod;

public class H_toString {

    /*
    // i have done this thing.

    // instance fields
    String shopName,product;
    double price1;

    // constructor method
    public H_toString(String Shop,String item,double p1) {
        shopName = Shop;
        product = item;
        price1 = p1;
    }

    //increase price method
    public double increasePrice(double priceToAdd) {
        double newPrice = price1 + priceToAdd;
        return newPrice;

    }

    // get price with tax method
    public double itemPrice1() {
        double tax = 12.4;
        return price1 + price1 / tax;
    }

    public String toString() { //Here i have called itemPrice1 that is the method to implement the tax of the product price.
                            //it is not mention in the online course i have just edited it.

        return "Do you know that shop name " + shopName + " there the " + product + " is better than others shops, " +
        "and its price is: Rs " + itemPrice1() + " increasing of product price of 5% " + increasePrice(0.42) * 100 / price1;
    }

    //main method
    public static void main(String[] args) {
        H_toString shopOwner = new H_toString("DeeSum","Rice",400);
        H_toString newOwner = new H_toString("Rainle","Toys",680);
        System.out.println(shopOwner);
        System.out.println(newOwner);
        shopOwner.increasePrice(4);
    }
    */


    // Writing from online course codeAcademy

    // instance fields
    String productType;
    double price;

    
    // constructor method
    public H_toString(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }


    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }


    // get price with tax method
    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }


    public String toString() {

        return "This store sells " + productType +" at a price of " + price +".";
    }


    //main method
    public static void main(String[] args) {
        H_toString lemonadeStand = new H_toString("Lemonade", 3.75);
        H_toString cookieShop = new H_toString("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }

}
