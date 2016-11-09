package com.company.KonkreteBeobachter;

import com.company.Artikel.Artikel;
import com.company.Beobachter.BeobachterDarst;
import com.company.KonkretesSubjekt.Einkaufsliste;

import java.util.ArrayList;

public class Rechnung extends BeobachterDarst {

    double gesamt;
    Einkaufsliste einkaufsliste = new Einkaufsliste();


    @Override
    public void aktualisiere(ArrayList<Artikel> einkaufsliste) {

        gesamt += einkaufsliste.get(einkaufsliste.size()-1).getPreis();
        System.out.println("Rechnung aktualisiert " + einkaufsliste.get(einkaufsliste.size()-1).getPreis());
        System.out.println("Gesamtpreis: " + einkaufsliste.get(einkaufsliste.size()-1).getPreis());
    }

    @Override
    public void aktualisiere() {

    }
}
