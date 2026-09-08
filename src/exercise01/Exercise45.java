package exercise01;

public class Exercise45 {

    public static void main(String[] args) {

        //Gör de olika tabellerna
        //for(int i=1; i<=9; i++) {
        //Ettans gångertabell
        //1 * 1 = 1
        //1 * 2 = 2 ...


        for(int j = 1; j<=9; j++) {
            System.out.println("Här kommer tabell nummer: " +j);
            for (int i = 1; i <= 9; i++) {
                int product = j * i;
                System.out.println(j + " * " + i + " = " + product);
            }
            System.out.println();
        }

        //}


    }



}
