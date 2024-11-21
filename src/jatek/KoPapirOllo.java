package jatek;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*Kérdés amire várjuk a választ.*/
//        System.out.println("Szöveg: ");
        /*Eltárpljuk megfelelő típusban a választ*/
//        int egesz = sc.nextInt(); /*Szám bekérése*/
        /*Bekérés eredményének kiírása*/
//        System.out.println("Bekért szöveg: " + egesz*2);/*Bekért szám 2x-nek kiírása*/

        /*Csak akkor, ha szám után szöveget kérünk be, mert a szám utáni ENTER
        (\r\n) "ott marad" ezt olvasa ki*/
//        sc.nextLine();
//        System.out.println("Szöveg: ");
        /*Szöveg bekérés*/
//        String szoveg = sc.nextLine();
//        System.out.println("Bekért szöveg: "); /*Bekért szöveg kiírása*/


        System.out.println("Üdvözöllek a Kő Papír Olló játékban!");
        System.out.println("Kérlek írj ide valamit a következők közűl: Kő-Papí-Olló");
        String[] lehetosegek = {"Kő", "Papír", "Olló"};

        while (true) {
            String jatekos = sc.nextLine();
            if (!jatekos.equals("Kő")
                    && !jatekos.equals("Olló")
                    && !jatekos.equals("Papír")) {
                System.out.println("Érvénytelen választás, Kérlek válassz a megadott szavak közül!");
                continue;
            }

            Random ran = new Random();
            String szamitogep = lehetosegek[ran.nextInt(3)];

            System.out.println("Játékos választása: " + jatekos);
            System.out.println("Számítógép választása: " + szamitogep);

            if (jatekos.equals(szamitogep)) {
                System.out.println("Döntetlen");
            } else if ((jatekos.equals("Kő") && szamitogep.equals("Olló"))
                    || (jatekos.equals("Olló") && szamitogep.equals("Papír"))
                    || (jatekos.equals("Papír") && szamitogep.equals("Kő"))) {
                System.out.println("Gratulálok, Te Nyerél!");
            } else {
                System.out.println("Sajnáljuk, Vesztettél...");
                break;
            }
        }
        sc.close();
        
        
        System.out.println("Mit választasz?");
        System.out.println("1: Kő");
        System.out.println("2. Papír");
        System.out.println("3. Olló");
        System.out.println("Kérlek válassz: ");
        int jatekos = sc.nextInt();
        
        Random rnd = new Random();
        int szamitogep = rnd.nextInt(3)+1;
        
        String eredmeny = "Döntetlen";
        
        
        
        
        
        

    }

}
