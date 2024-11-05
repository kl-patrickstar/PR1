package Assigment_005;

public class Perfect {

    public static void main(String[] args) {

        int wert = 6;
        int summe = 0; // Variable zur Speicherung der Summe der echten Teiler

        // Schleife, um die echten Teiler von `wert` zu finden und zu summieren
        for (int i = 1; i < wert; i++) {
            if (wert % i == 0) { // Prüft, ob `i` ein echter Teiler von `wert` ist
                summe += i; // Fügt den echten Teiler zur Summe hinzu
            }
        }

        // Überprüfen, ob die Summe der echten Teiler gleich dem Wert ist
        if (summe == wert) {
            System.out.println(wert + " ist eine perfekte Zahl.");
        } else {
            System.out.println(wert + " ist keine perfekte Zahl.");
        }
    }
}
