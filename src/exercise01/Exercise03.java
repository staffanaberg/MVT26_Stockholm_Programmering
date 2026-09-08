package exercise01;

public class Exercise03 {

    public static void main(String[] args) {
        //Skapa ett program där antal timmar är definierad i en variabel.
        // Programmet beräknar och skriver ut hur mycket det blir
        // omvandlat till minuter resp. sekunder.

        //private datatyp variabelNamn;
        //        datatyp variabelNamn = värde;
        double hours = 7.813;
        double minutes = hours*60;
        double seconds = minutes*60;

        System.out.println(hours +" timmar blir");
        System.out.println(minutes +" minuter");
        System.out.println(seconds +" sekunder");

        //3 timmar blir
        //180 minuter
        //10800 sekunder
    }
}
