package Aufgabe1.KonkreteErzeuger;

import Aufgabe1.AbstrakteFabrik.Geschenkpaket;
import Aufgabe1.AbstrakteProdukte.Gutschein;
import Aufgabe1.AbstrakteProdukte.Werbegeschenk;
import Aufgabe1.KonkreteProdukte.CD;
import Aufgabe1.KonkreteProdukte.Osterhase;

public class Osterpaket extends Geschenkpaket{


    @Override
    public Gutschein erzeugeGutschein() {
        return new CD(15);
    }

    @Override
    public Werbegeschenk erzeugeWerbegeschenk() {
        return new Osterhase();
    }
}
