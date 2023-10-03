import java.util.Scanner;
public class Pemilihan2Percobaan102_1 {
    public static void main(String[] args){
        Scanner input07 =new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan Tahun :");
        tahun =input07.nextInt();

        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0){
                System.out.println("Tahun Kabisat");
            }else if ((tahun % 400) == 0){
                System.out.println("Tahun Kabisat");
            }else if ((tahun % 100) == 0){
                System.out.println("Bukan Tahun Kabisat");
            }
            else {
                System.out.println("Tidak Terdefinisi");
            }

    }
        
}
}