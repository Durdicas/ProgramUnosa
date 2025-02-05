import java.util.Scanner;

public class TransformiraniString {
    public static void main(String[] args) {
        /*
Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i okrenuti
redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
Primjer ulaza: Dobar dan svima
Primjer izlaza: svima dan Dobar
         */

        // Kreiranje Scanner objekta za unos niza znakova koje želimo
        Scanner scanner = new Scanner(System.in);

        // Unos stringa od korisnika
        System.out.print("Unesite niz znakova: ");
        String unos = scanner.nextLine();

        // Rastavljanje unesenog stringa u niz riječi tako da među njima imamo i razmak
        String[] rijeci = unos.split(" ");

        // Kreiranje novog stringa s obrnutim redoslijedom riječi koje smo ranije unijeli
        String obrnutiString = ""; // za sada je prazan, popunjavat ćemo ga pomoću donje petlje

        // Petlja koja dodaje riječi u obrnutom redoslijedu
        for (int i = rijeci.length - 1; i >= 0; i--) {
            obrnutiString += rijeci[i] + " ";
        }

        // Ispis rezultata (uklanjamo poslednji razmak trim() metodom)
        System.out.println("Obrnuti redoslijed unesenih riječi: " + obrnutiString.trim());

        // Zatvaranje Scanner objekta
        scanner.close();
    }
}
