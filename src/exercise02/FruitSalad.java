package exercise02;

public class FruitSalad {

    public static void main(String[] args) {

        //Definition av att skapa objekt
        //dataTyp variabelNamn = new konstruktor();
        //KlassNamn variabelNamn = new KlassNamn();
        Fruit apple = new Fruit();

        //Definition av att skapa objekt med parameter
        //dataTyp variabelNamn = new konstruktor(parameterVärde);
        //KlassNamn variabelNamn = new KlassNamn(värde);

        Fruit melon = new Fruit("green", "cantaloupe");
        Fruit banana = new Fruit("yellow", "big mike");

        banana.print();
        banana.print();
        apple.print();
        melon.print();
        banana.print();

    }

}
