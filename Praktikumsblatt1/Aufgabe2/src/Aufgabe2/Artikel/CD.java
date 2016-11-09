package Aufgabe2.Artikel;

public class CD extends Artikel{

    public String getName() {
        return(super.getName());
    }

    public CD(int preis) {
        super(preis);
        super.setName("CD");
    }


}
