package Aufgabe2.KonkreteBeobachter;

import Aufgabe2.Artikel.Artikel;
import Aufgabe2.Beobachter.BeobachterDarst;

import java.util.ArrayList;

public class Rechnung extends BeobachterDarst {

    double gesamt;

    @Override
    public void aktualisiere(ArrayList<Artikel> artikelListe, int zustand) {

        gesamt += artikelListe.get(artikelListe.size()-1).getPreis();
        System.out.println("Artikelpreis: " + artikelListe.get(artikelListe.size()-1).getPreis());
        System.out.println("Gesamt: " + gesamt);

    }




}
