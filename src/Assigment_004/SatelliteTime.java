package Assigment_004;

/*Aufgabe:
 * Ein Satellit funkt Zeitspannen als Anzahl Sekunden zur Erde. 
 * Schreiben Sie ein Programm SatelliteTime, dass einen Sekundenbetrag 
 * von der Kommandozeile akzeptiert und 
 * die Zeitspanne in der Form d h m s wieder ausgibt.
 */

public class SatelliteTime {

    public static void main(String[] args) {

        // Testen Sie Ihr Programm mit dem Aufruf java SatelliteTime 10000.
        // Das Ergebnis ist: 0 2 46 50
        int eingabe = Integer.parseInt(args[0]); // Eingabe Sekunden

        int tage = eingabe / 86400;
        eingabe %= 86400;

        int stunden = eingabe / 3600; // im Bereich von 0 bis 23
        eingabe %= 3600;

        int minuten = eingabe / 60; // im Bereich von 0 bis 59

        int sekunden = eingabe / 60; // im Bereich von 0 bis 59

        System.out.println(tage + " Tage, " + stunden + " Stunden, " + minuten + " Minuten, " + sekunden + " Sekunden");

    }

}
