package exercise03;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius*radius*Math.PI;
    }

    public double calculateCircumference() {
        return 2*radius*Math.PI;
    }

    //metodNamn? calculateCircumference
    //datatyp?   double
    //värde?     2*Math.PI*radius


}
