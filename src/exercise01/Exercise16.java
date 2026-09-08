package exercise01;

public class Exercise16 {

    public static void main(String[] args) {


        int price = 120;
        int nbrArticles = 9;
        int limit = 1000;
        double discount = 0.9;

        //totalpris = pris*antalVaror
        double total = price*nbrArticles;

        //OM totalpris > gräns
        if(total >= limit) {
            total = price*nbrArticles*discount;
        }
        //totalpris = pris*antalVaror*rabatt
        //

        //skriva ut totalpriset
        System.out.println(total);


    }
}
