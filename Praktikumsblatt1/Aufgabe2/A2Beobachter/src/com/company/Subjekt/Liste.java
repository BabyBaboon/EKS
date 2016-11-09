package com.company.Subjekt;
import com.company.Artikel.Artikel;
import com.company.Beobachter.BeobachterDarst;
import com.company.KonkretesSubjekt.Einkaufsliste;

import java.util.ArrayList;
import java.util.List;

//Subjekt
public abstract class Liste {

    //Beobachter
    private List<BeobachterDarst> beobachterList = new ArrayList<>();

    public void meldeAn(BeobachterDarst beobachter){
        this.beobachterList.add(beobachter);
    };

    public void meldeAb(BeobachterDarst beobachter){
        this.beobachterList.remove(beobachter);
    };

    public void benachrichtige(ArrayList<Artikel> einkaufsliste) {
        for(BeobachterDarst beobachterDarst : beobachterList) {
            beobachterDarst.aktualisiere(einkaufsliste);
        }
    }


}
