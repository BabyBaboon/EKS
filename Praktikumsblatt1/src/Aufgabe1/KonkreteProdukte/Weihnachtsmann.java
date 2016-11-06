package Aufgabe1.KonkreteProdukte;

import Aufgabe1.AbstrakteProdukte.Werbegeschenk;

public class Weihnachtsmann extends Werbegeschenk{

    private String art = "Weihnachtsmann";

    public Weihnachtsmann(){
        super.setArt(this.art);
    }

}

