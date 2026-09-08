package exercise02;

public class Fruit {

    private String color;
    private String type;

    //definition av en konstruktor
    //public klassNamn() {
    //}
    public Fruit() {
        color = "red";
    }


    public Fruit(String myColor, String myType) {

        color = myColor;
        type = myType;
    }

    public Fruit(String myColor, int type) {

        color = myColor;

    }



    //Metod som inte returnerar något (bara gör saker)
    //public void metodNamn() {
    //}
    public void print() {
        System.out.println("Fruktens färg är: " +color);
    }


}
