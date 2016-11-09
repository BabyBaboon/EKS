package Aufgabe2.Artikel;

public class Artikel {

    private int preis;
    private String name;
    private int produktNr;


    public Artikel(int preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }
}
