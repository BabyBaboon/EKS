package Aufgabe1.Klient;

import Aufgabe1.AbstrakteFabrik.Geschenkpaket;
import Aufgabe1.AbstrakteProdukte.Gutschein;
import Aufgabe1.AbstrakteProdukte.Werbegeschenk;
import Aufgabe1.KonkreteErzeuger.Familienpaket;
import Aufgabe1.KonkreteErzeuger.Osterpaket;
import Aufgabe1.KonkreteErzeuger.Weihnachtspaket;

public class Klient {

    public static void main(String[] args) {

        //Abstrakte Fabrik/Erzeuger (Geschenkpaket) erzeugt new Konkreter Erzeuger (Weihnachtspaket weihnachten)
        Geschenkpaket weihnachten = new Weihnachtspaket();
        //Konkreter Erzeuger weihnachten (Weihnachtspaket) erzeugt konkretes Gutschein
        Gutschein meinGutschein = weihnachten.erzeugeGutschein();
        //Konkreter Erzeuger weihnachten (Weihnachtspaket) erzeugt konkretes Werbegeschenk
        Werbegeschenk meinGeschenk = weihnachten.erzeugeWerbegeschenk();

        System.out.println("Weihnachtspaket: " + meinGutschein.getWert() + " " + meinGeschenk.getArt());

        Geschenkpaket ostern = new Osterpaket();
        Gutschein meinGutschein2 = ostern.erzeugeGutschein();
        Werbegeschenk meinGeschenk2 = ostern.erzeugeWerbegeschenk();
        System.out.println("Osterpaket: " + meinGutschein2.getWert() + " " + meinGeschenk2.getArt());


        Geschenkpaket familie  = new Familienpaket();
        Gutschein meinGutschein3 = familie.erzeugeGutschein();
        Werbegeschenk meinGeschenk3 = familie.erzeugeWerbegeschenk();
        System.out.println("Familienpaket: " + meinGutschein3.getWert() + " " + meinGeschenk3.getArt());

        Geschenkpaket familie2  = new Familienpaket();

    }

}
