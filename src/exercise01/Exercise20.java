package exercise01;

public class Exercise20 {

    public static void main(String[] args) {

        //Skapa ett program som har sparat ett tal.
        //datatyp variabelnamn = värde;
        int number = 17;

        //Om talet är mellan 0 och 9
        if(number >= 0 && number <= 9) {
            //ska kvadraten på talet skrivas ut.
            System.out.println(number*number);
        } else {
            // Annars ska lämpligt felmeddelande ges
            System.out.println("Talet är inte mellan 0 och 9");
        }
    }
}
