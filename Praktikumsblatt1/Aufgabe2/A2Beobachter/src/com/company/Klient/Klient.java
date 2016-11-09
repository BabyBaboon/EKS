package com.company.Klient;

import com.company.Artikel.Artikel;
import com.company.Artikel.Buch;
import com.company.Artikel.CD;
import com.company.Artikel.DVD;
import com.company.KonkreteBeobachter.Gesamtumsatz;
import com.company.KonkreteBeobachter.Rechnung;
import com.company.KonkreteBeobachter.WebDarstellung;
import com.company.KonkretesSubjekt.Einkaufsliste;

public class Klient {

    public static void main(String[] args){

        CD cd3 = new CD(25);
        CD cd4 = new CD(8);
        DVD dvd2 = new DVD(145);
        Buch buch4 = new Buch(16);
        Buch buch5 = new Buch(76);
        // ConcreteSubject concreteSubject = new ConcreteSubject();
        Einkaufsliste einkaufsliste = new Einkaufsliste();

        // doncreteSubject.register(new ConcreteObserverA());
        einkaufsliste.meldeAn(new WebDarstellung());
        einkaufsliste.meldeAn(new Rechnung());
        einkaufsliste.meldeAn(new Gesamtumsatz());

        einkaufsliste.addArtikel(cd3);
        einkaufsliste.addArtikel(cd4);
        einkaufsliste.addArtikel(cd3);
        einkaufsliste.addArtikel(dvd2);

        einkaufsliste.entferneArtikel(cd4);
        einkaufsliste.entferneArtikel(cd3);

        einkaufsliste.addArtikel(buch4);
        einkaufsliste.addArtikel(cd4);
        einkaufsliste.addArtikel(buch5);

        //concreteSubject.setState(77);

    }

}
