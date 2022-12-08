import java.io.*;

public class Aufgabe_2B_2 {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        int reihe = 0;
        int spalte = reihe;
        int anzahl = 0;

        do {
            System.out.println("Wie viele Reihen?");
            anzahl = Integer.parseInt(eingabe.readLine());
        } while ((anzahl <= 5) || (anzahl % 2 != 1)); // ???

        for (reihe = 0; reihe < anzahl; reihe++) { // Anzahl Reihen
            for (spalte = 0; spalte < anzahl; spalte++) { // Anzahl Spalten
                if (reihe == spalte || reihe + spalte + 1 == anzahl) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println(); // Zeilenvorschub

        }

    }

}
