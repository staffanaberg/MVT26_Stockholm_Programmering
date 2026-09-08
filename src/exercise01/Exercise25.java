package exercise01;

public class Exercise25 {

    public static void main(String[] args) {
        //Skapa ett program där ett tal sparas
        int number = 0;

        //och det skrivs ut om talet är positivt eller negativt
        //number < 0 => negativt
        //number >= 0 => positivt
        //number == 0 => varken eller

        if (number < 0) {
            System.out.println(number + " är ett negativt tal");
        } else if (number > 0) {
            System.out.println(number + " är ett positivt tal");
        } else if (number == 0) {
            System.out.println(number + " är varken positivt eller negativt");
        }
    }
}
