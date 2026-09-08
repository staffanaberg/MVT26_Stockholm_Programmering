package exercise01;

public class Exercise42 {

    public static void main(String[] args) {

        //En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För
        //första dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv. Lönen
        //fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen
        //måste arbeta för att tjäna en miljon kronor.

        double price = 1500*0.8;


        int coupons = 1;

        // 1 000 000 00

        while(overHundred(price)) {
            price *= 0.8;
            coupons++;


            System.out.println("Number: " +price);
            System.out.println("Total: " +coupons);

        }

        System.out.println("Coupons: " +coupons);
    }

    public static boolean overHundred(double price) {
        return price >= 100.00;
    }
}
