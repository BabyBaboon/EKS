package com.company.Beobachter;

import com.company.Artikel.Artikel;
import com.company.KonkretesSubjekt.Einkaufsliste;

import java.util.ArrayList;

public abstract class BeobachterDarst {

    public abstract void aktualisiere(ArrayList<Artikel> einkaufsliste);
    public abstract void aktualisiere();

}
