package com.company.Artikel;

public class DVD extends Artikel{

    public String getName() {
        return(super.getName());
    }

    public DVD(double preis) {
        super(preis);
        super.setName("DVD");
    }

}