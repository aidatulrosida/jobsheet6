import java.util.Scanner;

public class Pemilihan2Percobaan202 {
    public static void main (String[] args) {
        Scanner input02 =new Scanner(System.in);

        System.out.println("Masukkan Sudut 1 : ");
        float Sudut1 = input02.nextFloat();
        System.out.println("Masukkan Sudut 2 : ");
        float Sudut2 = input02.nextFloat();
        System.out.println("Masukkan Sudut 3 : ");
        float Sudut3 = input02.nextFloat();

        float totalSudut = Sudut1 + Sudut2 + Sudut3;

        if (totalSudut == 180) {
            if ((Sudut1 == 90) || (Sudut2 == 90) || (Sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku ");
        else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        }
        else
            System.out.println(" Bukan Seitiga");
    }
}