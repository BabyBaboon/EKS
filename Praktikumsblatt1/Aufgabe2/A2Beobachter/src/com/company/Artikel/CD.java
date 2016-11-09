package com.company.Artikel;

public class CD extends Artikel{

    public String getName() {
        return(super.getName());
    }

    public CD(double preis) {
        super(preis);
        super.setName("CD");
    }


}
