import java.util.Scanner;

public class Zadatak1StringMetode {
    public static void main(String[] args) {
        /*
        Napišite program koji od korisnika učitava tekst u dvije
        varijable. U prvoj varijabli odvojeno razmakom ime i prezime, a u
        drugoj varijabli grad rođenja. Potrebno je ispisati ime i prezime, a
        ako je duljina imena veća od 7 znakova, tražiti korisnika da ponovi unos
        i ispisati mu poruku „Ime sadrži više od 7 znakova”. Razmaci prije i nakon
        imena i prezimena ne uzimaju se u obzir. Za grad rođenja potrebno je ispisati
        koje samoglasnike sadrži (provjera prema malim slovima).

            Primjer ispisa:
            Upišite ime i prezime:
            ”     Miro Mirić  ”
            Upišite grad rođenja:
            Varaždin
            upisali ste ime: Miro
            upisali ste prezime: Mirić
            grad ima samoglasnik a
            grad ima samoglasnik i

            https://prnt.sc/bDJzVreGfsid

            BONUS: prebrojati sve samoglasnike unutar riječi Grad
         */

        Scanner scanner = new Scanner(System.in);
        String imePrezime;
        String grad;

        // Unos imena i prezimena s provjerom dužine imena
        while (true) {
            System.out.println("Upišite ime i prezime:");
            imePrezime = scanner.nextLine().trim(); // Uklanja razmake s početka i kraja

            String[] dijelovi = imePrezime.split("\\s+"); // Razdvajanje po razmacima
            if (dijelovi.length < 2) { // ima li i. i p- dva dijela/člana
                System.out.println("Morate unijeti i ime i prezime.");
                continue;
            }

            String ime = dijelovi[0]; // Uzimamo prvi element niza (ime)
            String prezime = dijelovi[1]; // // Uzimamo drugi element niza

            if (ime.length() > 7) { // Provjera ima li ime više od 7 znakića
                System.out.println("Ime sadrži više od 7 znakova. Pokušajte ponovo.");
            } else {
                System.out.println("Upisali ste ime: " + ime);
                System.out.println("Upisali ste prezime: " + prezime);
                break; // Ako je unos ispravan, izlazimo iz petlje
            }
        }

        // Unos grada
        System.out.println("Upišite grad rođenja:");
        grad = scanner.nextLine().trim().toLowerCase(); // Pretvorba u mala slova radi lakše provjere, grad se pretvara u mala slova kako bi se lakše provjeravali samoglasnici.

        // Samoglasnici u hrvatskom jeziku
        char[] samoglasnici = {'a', 'e', 'i', 'o', 'u'};
        int brojacSamoglasnika = 0;

        // Provjera i ispis samoglasnika u nazivu grada
        for (char samoglasnik : samoglasnici) {
            if (grad.indexOf(samoglasnik) != -1) { // Koristi se indexOf() da se provjeri sadrži li grad pojedini samoglasnik. Ako znak ne postoji, vraća -1.
                System.out.println("Grad ima samoglasnik " + samoglasnik);
            }
        }

        // BONUS: Prebrojavanje svih samoglasnika u nazivu grada
        // Iterira se kroz sva slova u nazivu grada i broje se pojavljivanja samoglasnika.
        for (char slovo : grad.toCharArray()) {
            for (char samoglasnik : samoglasnici) {
                if (slovo == samoglasnik) {
                    brojacSamoglasnika++;
                }
            }
        }

        System.out.println("Ukupno samoglasnika u nazivu grada: " + brojacSamoglasnika);

        scanner.close();
    }
}
