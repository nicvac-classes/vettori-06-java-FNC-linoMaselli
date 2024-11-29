import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        int n, i, imax, tempo;

        do {
            System.out.println("ins numero atleti");
            n = in.nextInt();
        } while (n < 0);
        
        float[] tempi = new float[n];
        String[] nomi = new String[n];
        String[] nazionali = new String[n];

        for (i = 0; i < n; i++) {
            System.out.println("ins nome " + (i + 1) + "° atleta");
            nomi[i] = in.next();
            System.out.println("ins nazionalità di " + nomi[i]);
            nazionali[i] = in.next();
            tempi[i] = rand.nextInt(11) + 7; // random() % 11 + 7
        }
        
        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + "° atleta. nome: " + nomi[i] + ". nazione: " + nazionali[i] + ". tempo: " + tempi[i]);
        }
        
        imax = 0;
        for (i = 0; i < n; i++) {
            if (tempi[i] < tempi[imax]) {
                imax = i;
            }
        }
        
        System.out.println("l'atleta vincente è " + nomi[imax] + " di nazione " + nazionali[imax] + " con tempo " + tempi[imax]);
    }
}

