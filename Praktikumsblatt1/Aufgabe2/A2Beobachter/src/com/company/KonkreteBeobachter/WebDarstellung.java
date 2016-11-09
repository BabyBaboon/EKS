package com.company.KonkreteBeobachter;

import com.company.Artikel.Artikel;
import com.company.Beobachter.BeobachterDarst;
import com.company.KonkretesSubjekt.Einkaufsliste;

import java.util.ArrayList;

public class WebDarstellung extends BeobachterDarst {

    @Override
    public void aktualisiere(ArrayList<Artikel> einkaufsliste) {


        System.out.println(einkaufsliste.size()-1);
        System.out.println("WebDarstellung aktualisiert " + einkaufsliste.get(einkaufsliste.size()-1).getName());

    }

    @Override
    public void aktualisiere() {

    }
}
