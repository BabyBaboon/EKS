package Aufgabe1.KonkreteErzeuger;

import Aufgabe1.AbstrakteFabrik.Geschenkpaket;
import Aufgabe1.AbstrakteProdukte.Gutschein;
import Aufgabe1.AbstrakteProdukte.Werbegeschenk;
import Aufgabe1.KonkreteProdukte.DVD;
import Aufgabe1.KonkreteProdukte.Fussball;

public class Familienpaket extends Geschenkpaket{

    public Familienpaket() {
        erzeugeGutschein();
        erzeugeWerbegeschenk();
        System.out.println(erzeugeGutschein().getWert() + " " + erzeugeWerbegeschenk().getArt());
    }

    @Override
    public Gutschein erzeugeGutschein() {
        return new DVD(25);
    }

    @Override
    public Werbegeschenk erzeugeWerbegeschenk() {
        return new Fussball();
    }
}
