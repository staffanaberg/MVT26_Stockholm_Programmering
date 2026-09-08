package exercise01;

public class Exercise34 {
    public static void main(String[] args) {

        //Skapa ett program som skriver ut ett tal i taget med start ifrån 0.
        //
        // När summan av alla tidigare tal är mer än 50 ska programmet avsluta.

        //total = 0
        int total = 0;
        //number = 0
        int number = 0;

        //total > 50 -> avbryta
        //total <= 50 -> fortsätta
        while(total <= 50) {
            number++;

            total += number;

            System.out.println("Number: " +number);
            System.out.println("Total: " +total);
        }
        total = 0;
        //number = 0
        number = 0;
        while(true) {
            if(total > 50) {
                break;
            }
            number++;

            total += number;

            System.out.println("Number: " +number);
            System.out.println("Total: " +total);
        }



    }
}
