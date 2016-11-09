package Aufgabe2.Klient;

import Aufgabe2.Artikel.Buch;
import Aufgabe2.Artikel.CD;
import Aufgabe2.Artikel.DVD;
import Aufgabe2.KonkreteBeobachter.Rechnung;
import Aufgabe2.KonkreteBeobachter.WebDarstellung;
import Aufgabe2.KonkretesSubjekt.Einkaufsliste;

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
