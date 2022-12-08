import java.io.*;

public class Aufgabe_2B_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        // init
        int note = 0;
        char buchstabe = 'a';

        do {
            System.out.println("Geben Sie A B C oder D ein");
            buchstabe = (char) System.in.read();
            Character.toUpperCase(buchstabe);
        } while (buchstabe == ('A' | 'B' | 'C' | 'D'));

        // Checken ob eingabe korrekt

        switch (buchstabe) {
            case 'A':
                System.out.println("TOP");
                note = 1;
                break;
            case 'B':
                System.out.println("recht gut");
                note = 2;
                break;
            case 'C':
                System.out.println("geht so");
                note = 3;
                break;
            case 'D':
                System.out.println("flop");
                note = 4;
                break;
            default:
                System.out.println("Falsch. Starten sie neu.");
                break;
        }

    }

}
