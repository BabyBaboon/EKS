package Aufgabe2.Artikel;

public class DVD extends Artikel{

    public String getName() {
        return(super.getName());
    }

    public DVD(int preis) {
        super(preis);
        super.setName("DVD");
    }

}