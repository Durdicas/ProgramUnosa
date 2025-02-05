import java.util.Scanner;

public class Zadatak2IspisZnakova {
    public static void main(String[] args) {
        /*

        Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova,
        koliko brojeva i koliko "ostalih znakova". Npr. ako je uneseni niz znakova
         "Danas je 27.02.2010.", program treba ispisati:

            Slova: 7
            Brojevi: 8
            Ostali znakovi: 5
         */

        // Kreiranje Scanner objekta za unos s tastature
        Scanner scanner = new Scanner(System.in);

        // Unos niza znakova
        System.out.print("Unesite niz znakova: ");
        String unos = scanner.nextLine();

        // Inicijalizacija brojača
        int slova = 0, brojevi = 0, ostali = 0;

        // Petlja za prolazak kroz svaki znak u unesenom stringu
        for (char znak : unos.toCharArray()) {
            if (Character.isLetter(znak)) {
                slova++;
            } else if (Character.isDigit(znak)) {
                brojevi++;
            } else {
                ostali++;
            }
        }

        // Ispis rezultata
        System.out.println("Slova: " + slova);
        System.out.println("Brojevi: " + brojevi);
        System.out.println("Ostali znakovi: " + ostali);

        // Zatvaranje Scanner objekta
        scanner.close();

    }
}
