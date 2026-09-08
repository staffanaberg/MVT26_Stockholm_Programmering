package exercise02;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    //variabelnamn?	grade
    //datatyp?	    int
    //
    //Namn? Staffan -> text
    //Årskurs? 7 -> heltal

    //Skapa en metod som skriver ut
    //vilket stadie man går på (Lågstadiet, mellanstadiet osv.)
    public void printLevel() {
        //Om grade==1, 2 eller 3
        System.out.println("Lågstadiet");
        //Om grade==4, 5 eller 6
        System.out.println("Mellanstadiet");
        //Om grade==7, 8 eller 9
        System.out.println("Högstadiet");
    }
}
