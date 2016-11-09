package Aufgabe2.KonkretesSubjekt;

import Aufgabe2.Artikel.Artikel;
import Aufgabe2.Subjekt.Liste;

import java.util.ArrayList;

//Konkretes Subjekt extends Abstraktes Subjekt

public class Einkaufsliste extends Liste {

    private ArrayList<Artikel> artikelListe = new ArrayList<>();


    public void addArtikel(Artikel a){
        this.artikelListe.add(a);
        benachrichtige(artikelListe, 1);

    }

    public void entferneArtikel(Artikel a){
        this.artikelListe.remove(a);
        benachrichtige(artikelListe, -1);
    }





}
