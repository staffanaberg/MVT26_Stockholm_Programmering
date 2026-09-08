package exercise03;

public class Geometry {

    public static void main(String[] args) {


        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Rectangle rectangle = new Rectangle(12, 12);
        System.out.println(rectangle.area());
        System.out.println(rectangle.circumference());

        if(rectangle.isSquare()) {
            System.out.println("Det är en kvadrat");
        } else {
            System.out.println("Det är inte en kvadrat");
        }

        rectangle.setWidth(2);

        double pi1 = 3.14;
        double pi2 = Math.PI;



    }

}
