package exercise02;

public class Dog {

    //Lägg till ett attribut age för hundens ålder.
    //private datatyp variabel;

    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Voff!");
    }

    //Skapa en metod som gör att du kan uppdatera hundens ålder.
    public void oneYearOlder() {
        age++;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void printAge() {
        System.out.println("Hundens ålder är: " +age);
    }

    //Skapa en metod getHumanAge som returnerar hundens ålder
    //omvandlad till människoår (multiplicera med 7).
    //public datatyp metodNamn() {
    //    return värde;
    //}
    public int getHumanAge() {
        return age*7;
    }
    //metodNamn? getHumanAge
    //datatyp?   int
    //värde?     age*7



}
