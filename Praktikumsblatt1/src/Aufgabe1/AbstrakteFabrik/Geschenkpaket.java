package Aufgabe1.AbstrakteFabrik;

import Aufgabe1.AbstrakteProdukte.Gutschein;
import Aufgabe1.AbstrakteProdukte.Werbegeschenk;
import Aufgabe1.KonkreteErzeuger.Weihnachtspaket;
import Aufgabe1.KonkreteProdukte.CD;

public abstract class Geschenkpaket { //Erzeuger

    public abstract Gutschein erzeugeGutschein(); //ErzeugeAbsProduktA

    public abstract Werbegeschenk erzeugeWerbegeschenk();  //ErzeugeAbsProduktB

}
