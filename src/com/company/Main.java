package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Mitarbeiter mitarbeiter = new Mitarbeiter();
        mitarbeiter.Name();
        mitarbeiter.PersonalNr();
        mitarbeiter.datumEintritt();
        int stundenlohn=8;
        int anzahlstunden=40;
        int ueberstundenzuschlag=5;
        int anzahlueberstunden=7;
        int end;
        int ergebnis = stundenlohn * anzahlstunden;
        int ergebnis1 = ueberstundenzuschlag * anzahlueberstunden;
       end=ergebnis+ergebnis1;
System.out.println("Der Hilfsarbeiter verdient: "+end+"$"+" im Monat."); //stundenlohn*anzahlstunden + ueberstundenzuschlag*anzahlueberstunden = (355 Dollar)
}
}