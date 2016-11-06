package Aufgabe1.KonkreteErzeuger;

import Aufgabe1.AbstrakteFabrik.Geschenkpaket;
import Aufgabe1.AbstrakteProdukte.Gutschein;
import Aufgabe1.AbstrakteProdukte.Werbegeschenk;
import Aufgabe1.KonkreteProdukte.CD;
import Aufgabe1.KonkreteProdukte.Weihnachtsmann;

public class Weihnachtspaket extends Geschenkpaket {
    private String art;
    private int wert;

    @Override
    public Gutschein erzeugeGutschein() {
        return new CD(20);
    }

    @Override
    public Werbegeschenk erzeugeWerbegeschenk() {
        return new Weihnachtsmann();
    }
}
