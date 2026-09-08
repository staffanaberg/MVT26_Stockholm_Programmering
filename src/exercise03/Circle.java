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

    public boolean hasSmallArea() {
        return calculateArea() < calculateCircumference();
    }

    //Lägg till en metod hasSmallArea som
    //kontrollerar om arean är mindre än omkretsen av cirkeln

    //metodNamn? hasSmallArea
    //datatyp?   boolean
    //värde?     radius*radius*Math.PI < 2*radius*Math.PI
    //värde?     calculateArea() < calculateCircumference()
    //värde?     radius < 2



}
