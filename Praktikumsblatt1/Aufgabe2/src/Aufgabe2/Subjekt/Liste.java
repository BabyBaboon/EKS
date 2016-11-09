package Aufgabe2.Subjekt;
import Aufgabe2.Beobachter.BeobachterDarst;
import Aufgabe2.Artikel.Artikel;

import java.util.ArrayList;
import java.util.List;

//Subjekt
public abstract class Liste {

    //Beobachter
    private List<BeobachterDarst> beobachterList = new ArrayList<>();


    public void meldeAn(BeobachterDarst beobachter){
        this.beobachterList.add(beobachter);
    };

    public void benachrichtige(ArrayList<Artikel> artikelliste, int zustand) {
        for(BeobachterDarst beobachterDarst : beobachterList) {
            beobachterDarst.aktualisiere(artikelliste, zustand);
        }
    }


}
