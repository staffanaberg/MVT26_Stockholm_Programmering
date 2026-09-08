package exercise01;

public class Exercise33 {

    public static void main(String[] args) {
        //33.Skriv ut talen 100 till 0, dvs 100, 99, 98, …, 0.

        for(int i=0; i < 101; i++) {
            System.out.print((100-i) +", ");
        }

        System.out.println();

        for(int i=100; i >= 0; i--) {
            System.out.print(i +", ");
        }


    }
}
