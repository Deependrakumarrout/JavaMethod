package JavaMethod;

public class E_Adding_Parameter {
    // instance filed
    String food;

    // constructor method
    public E_Adding_Parameter(String fastFood) {
        food = fastFood;
    }

    // fruits method
    public void fruits(String apple, String orange, String mango) {
        System.out.println("A shopKeeper has " + apple + " apples.\n"+orange + " color oranges and " +mango+" mango toys.");
    }

    // vegetable method
    public void vegetable(String onion, String garlic, String tomato) {
        System.out.println("The shopKeeper has:");
        System.out.println(onion + garlic + tomato);
        System.out.println("But "+ food);
    }

    // main method
    public static void main(String[] args) {
        E_Adding_Parameter gFood = new E_Adding_Parameter("the shopkeeper love to eat eggRoll.");
        gFood.fruits("red color","orange","yellow color");
        gFood.vegetable("4kg onion,","2kg garlic,","and 3kg tomato");

    }
}

