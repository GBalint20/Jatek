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
        sc.nextLine();
        
//        System.out.println("Szöveg: ");
        /*Szöveg bekérés*/
//        String szoveg = sc.nextLine();
//        System.out.println("Bekért szöveg: "); /*Bekért szöveg kiírása*/
        
        
        
        System.out.println("Üdvözöllek a Kő Papír Olló játékban!");
        System.out.println("Kérlek írj ide valamit: ");
        String [] lehetosegek = {"Kő", "Papír", "Olló"};
        Random ran = new Random();
        String szamitogep = lehetosegek[ran.nextInt(3)];
        String jatekos = sc.nextLine();
        if (jatekos.equals(szamitogep)) {
            System.out.println("Döntetlen");
        } else if ((jatekos.equals("Kő") && szamitogep.equals("Olló")) ||
                  (jatekos.equals("Olló") && szamitogep.equals("Papír")) ||
                  (jatekos.equals("Papír") && szamitogep.equals("Kő"))) {
            System.out.println("Gratulálok, Te Nyerél!");
        } else {
            System.out.println("Sajnlunk, Vesztettél...");
        }
        
        
        
        
    }
    
}
