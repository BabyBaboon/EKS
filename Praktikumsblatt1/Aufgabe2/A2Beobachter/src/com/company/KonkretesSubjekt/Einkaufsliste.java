package com.company.KonkretesSubjekt;

import com.company.Artikel.Artikel;
import com.company.Subjekt.Liste;

import java.util.ArrayList;

//Konkretes Subjekt extends Abstraktes Subjekt

public class Einkaufsliste extends Liste {

    ArrayList<Artikel> einkaufsListeZustand = new ArrayList<>();

    public ArrayList<Artikel> gibZustand() {
        return einkaufsListeZustand;
    }

    public void setzeZustand() {
    }

    public void addArtikel(Artikel a){
        this.einkaufsListeZustand.add(a);
        benachrichtige(einkaufsListeZustand);
    }

    public void entferneArtikel(Artikel a){
        this.einkaufsListeZustand.remove(a);
        benachrichtige(einkaufsListeZustand);
    }

}
