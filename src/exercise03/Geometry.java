package exercise03;

public class Geometry {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12, 12);
        System.out.println(rectangle.area());
        System.out.println(rectangle.circumference());

        if(rectangle.isSquare()) {
            System.out.println("Det är en kvadrat");
        } else {
            System.out.println("Det är inte en kvadrat");
        }

    }

}
