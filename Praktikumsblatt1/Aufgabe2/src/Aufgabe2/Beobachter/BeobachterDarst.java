package Aufgabe2.Beobachter;

import Aufgabe2.Artikel.Artikel;

import java.util.ArrayList;

public abstract class BeobachterDarst {

    public abstract void aktualisiere(ArrayList<Artikel> artikelListe, int zustand);

}
