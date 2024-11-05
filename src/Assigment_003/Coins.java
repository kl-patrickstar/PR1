package Assigment_003;

public class Coins {

    public static void main(String[] args) {

        // Einlesen des Wertes von der Konsole
        double euro = Double.parseDouble(args[0]);

        // Umwandeln in Cent
        int cents = (int) Math.round(euro * 100);

        berechnungMuenzelAnzahl(cents);

    }

    public static void berechnungMuenzelAnzahl(int cents) {
        // Münzen-Variablen
        int euro2 = 0;
        int euro1 = 0;
        int cent50 = 0;
        int cent20 = 0;
        int cent10 = 0;
        int cent5 = 0;
        int cent2 = 0;
        int cent1 = 0;

        // Berechnung der minimalen Münzenanzahl
        euro2 = cents / 200; // Anzahl 2€ Münzen
        cents %= 200;

        euro1 = cents / 100; // Anzahl 1€ Münzen
        cents %= 100;

        cent50 = cents / 50; // Anzahl 50 Cent Münzen
        cents %= 50;

        cent20 = cents / 20; // Anzahl 20 Cent Münzen
        cents %= 20;

        cent10 = cents / 10; // Anzahl 10 Cent Münzen
        cents %= 10;

        cent5 = cents / 5; // Anzahl 5 Cent Münzen
        cents %= 5;

        cent2 = cents / 2; // Anzahl 2 Cent Münzen
        cents %= 2;

        cent1 = cents; // Anzahl 1 Cent Münzen

        // Ausgabe
        System.out.println(euro2 + " x 2 Euro");
        System.out.println(euro1 + " x 1 Euro");
        System.out.println(cent50 + " x 50 Cent");
        System.out.println(cent20 + " x 20 Cent");
        System.out.println(cent10 + " x 10 Cent");
        System.out.println(cent5 + " x 5 Cent");
        System.out.println(cent2 + " x 2 Cent");
        System.out.println(cent1 + " x 1 Cent");

    }

}
