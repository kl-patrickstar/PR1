package Assigment_004;

public class ShortStatements {

    public static void main(String[] args) {

        int i = 0, j = 0, k = 0;
        boolean b = true, c = false, d = false;

        // Prüfüng: Ist gleich/ungleich null
        System.out.println((i != 0 && j != 0 && k != 0));

        // Prüfüng: i ist durch 17 teilbar
        System.out.println((i % 17 == 0 && i > 0));

        // Prufung: j ist ungerade und liegt zwischen 20 und 40
        System.out.println((j % 2 != 0 && j >= 20 && j <= 40));

        // Prüfung: k ist entweder Vielfaches von 3 und 5, oder Vielfaches von 5 und 7
        // oder Vielfaches von 5 und 11
        System.out.println((k % 3 == 0 && k % 5 == 0) || (k % 5 == 0 && k % 7 == 0) || (k % 5 == 0 && k % 11 == 0));

        // Prüfung: Geanu eines von b,c und d ist true
        System.out.println(((b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0) == 1));

        // Prüfung: b,c und d sind alle drei true oder alle drei false

        System.out.println(((b ? 1 : 0) == 1 && (c ? 1 : 0) == 1 && (d ? 1 : 0) == 1)
                || ((b ? 1 : 0) == 0 && (c ? 1 : 0) == 0 && (d ? 1 : 0) == 0));

        // Alternativ System.out.println((b ? 1 : 0) == (c ? 1 : 0) && (c ? 1 : 0) == (d
        // ? 1 : 0));
    }

}
