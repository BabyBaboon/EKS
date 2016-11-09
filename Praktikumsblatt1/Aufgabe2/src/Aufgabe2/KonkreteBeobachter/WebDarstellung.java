package Aufgabe2.KonkreteBeobachter;
import Aufgabe2.Artikel.Artikel;
import Aufgabe2.Beobachter.BeobachterDarst;

import java.util.ArrayList;

public class WebDarstellung extends BeobachterDarst {

    @Override
    public void aktualisiere(ArrayList<Artikel> artikelListe, int zustand) {

        if (zustand == 1){
            System.out.println(artikelListe.get(artikelListe.size()-1).getName() + " hinzugefügt");
            System.out.println("Artikelanzahl: " + (artikelListe.size()));
            System.out.println("-------------------------");
        }
        else if (zustand == -1){
            System.out.println(artikelListe.get(artikelListe.size()-1).getName() + " removed");
            System.out.println("Artikelanzahl: " + (artikelListe.size()));
            System.out.println("-------------------------");
        }


    }


}
