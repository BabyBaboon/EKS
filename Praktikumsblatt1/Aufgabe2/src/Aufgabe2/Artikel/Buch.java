package Aufgabe2.Artikel;

public class Buch extends Artikel {

    public String getName() {
        return(super.getName());
    }

    public Buch(int preis) {
        super(preis);
        super.setName("Buch");
    }
}
