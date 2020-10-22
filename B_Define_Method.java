package JavaMethod;

public class B_Define_Method {
    // instance fields
    String productId;

    // constructor method
    public B_Define_Method(String product) {
        productId = product;
    }

    // shop method:
    public static void shop(int n,int b) {
        System.out.println("There are the things available in our shop:");
        System.out.println("salt,sugar,wheat,rice,dal,potato,onion,garlic");

        /*
        //Without using return type i have used this instruction.

        System.out.println("Sum of: "+n+" and "+b);
        System.out.println(n+b);
        */
    }


    // main method
    public static void main(String[] args) {
        B_Define_Method store = new B_Define_Method("chocolate");
        shop(3,4);
    }

/*
* From that course i have copied that code which is below.

*   // instance fields
  String productType;

  // constructor method
  public Store(String product) {
    productType = product;
  }

  // advertise method
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!" );

  }

  // main method
  public static void main(String[] args) {

* */

}


