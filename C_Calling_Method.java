package JavaMethod;


public class C_Calling_Method {
    // instance fields
    String productName;

    // constructor method
    public C_Calling_Method(String product) {
        productName = product;
        // System.out.println(productName); //we can also print the value in this way.
    }

    // fruitStore method
    public void fruitStore() {
        System.out.println("You have purchased "+productName+" from our store.");
        System.out.println("Please visit to our store again...\n");
    }


    // main method
    public static void main(String[] args) {
        C_Calling_Method fruits = new C_Calling_Method("bananas");
        C_Calling_Method vegetable = new C_Calling_Method("tomato");

        fruits.fruitStore();
        // System.out.println(fruits.productName); // Or in this way.
        fruits.fruitStore(); // How much time we call that much time it will print.

        vegetable.fruitStore(); // it becomes available to use on any fruits, vegetable object.

    }

}

