package exercise01;

public class Exercise07 {

    public static void main(String[] args) {

        //Skapa ett program som beräknar vad du ska betala för en tank bensin.
        // Indata är antal liter, pris per liter och eventuell rabatt i procent.
        // Utdata är priset som du ska betala.
        //Indatan kan vara definierade i variabler

        double gas = 30;
        double price = 15;
        double discPercent = 0.05;

        double totalPrice = gas*price;
        double discPrice = totalPrice*(1-discPercent);
        System.out.println(discPrice);

//bensin: 30
//pris: 15
//rabatt: 5
//
//Kostnad? 30*15 - 30*15*5/100

    }

}
