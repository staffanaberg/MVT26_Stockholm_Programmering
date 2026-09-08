package exercise03;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int newWidth) {
        if(newWidth>0) {
            width = newWidth;
        }
    }

    //metod för att returnera area

    public int area() {
        return width * height;
    }

    public int circumference() {
        return (width + height) * 2;
    }

    public boolean isSquare() {
        return width == height;
    }

    public boolean isSquare2() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }

    //metodNamn? isSquare
    //datatyp?   boolean
    //värde?     beräkning => true/false

    //där bredd och höjd är lika => true
    //de är inte lika => false



}
