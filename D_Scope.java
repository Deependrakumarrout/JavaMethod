package JavaMethod;

public class D_Scope {
    // In the score it says that we can't able to use the variable which is inside any constructor or any method.
    // if the variable is in the inside of the class above from constructor and method then we can able to declare those
    // variable in any where in our program except in another class.

    String handle = "Stylish";
    int pedal = 2;

    public D_Scope(String ringSize) {
        String part = "Your cycle ring shape is: "+ ringSize + " and black color."; // we can't able to declare the part of the variable in the main method or in any other method.
        System.out.println(part);
    }


    public void sphPart() {
        int wheels = 2;
        int spoke = 29;
        System.out.println("In your cycle it has "+ wheels+ " wheels and " + spoke + " spokes.");
    }


    public static void main(String[] args) {
        D_Scope cycle = new D_Scope("2.4m round");
        System.out.println("Your handle is in "+ cycle.handle + " shape.\nNumber of paddle " + cycle.pedal +".");
        cycle.sphPart();
    }

}
