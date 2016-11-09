package com.company.Artikel;

public class Buch extends Artikel {

    public String getName() {
        return(super.getName());
    }

    public Buch(double preis) {
        super(preis);
        super.setName("Buch");
    }
}
