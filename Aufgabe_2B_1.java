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
            buchstabe = Character.toUpperCase(buchstabe);
        } while (buchstabe == ('A' | 'B' | 'C' | 'D'));

        // Checken ob eingabe korrekt

        switch (buchstabe) {
            case 'A':
                System.out.println("TOP");
                note = 4;
                break;
            case 'B':
                System.out.println("recht gut");
                note = 3;
                break;
            case 'C':
                System.out.println("geht so");
                note = 2;
                break;
            case 'D':
                System.out.println("flop");
                note = 1;
                break;
            default:
                System.out.println("Ungueltig");
                break;
        }

        for (int i = 0; i < note; i++) {
            System.out.print("*");
        }

    }

}
