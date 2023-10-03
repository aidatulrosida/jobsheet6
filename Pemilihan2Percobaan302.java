import java.util.Scanner;
public class Pemilihan2Percobaan302 {
    public static void main(String[] args){
            Scanner input02 =new Scanner(System.in);
            String kategori;
            int penghasilan, gajiBersih;
            double pajak=0;

            System.out.println("Masukkan kategori :");
            kategori = input02.next();
            System.out.println("Masukkan penghasilan :");
            penghasilan = input02.nextInt();
           
            if( kategori.equalsIgnoreCase("pekerja")){
                if(penghasilan <=0){
                    System.out.println("penghasilkan yang anda masukkan tidak valid");
                }else if(penghasilan <= 2000000){
                    pajak = 0.1;
                }else if(penghasilan <= 3000000){
                    pajak = 0.15;
                }else{
                    pajak = 0.2;
                }
            gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
            System.out.println("gaji bersih yang anda terima: " +gajiBersih);
            } else if (kategori.equalsIgnoreCase("pebisnis")){
                if(penghasilan <= 2500000){
                    pajak = 0.15;
                }else if(penghasilan <= 3500000){
                    pajak = 0.2;
                }else {
                    pajak = 0.25;
                }
            gajiBersih = (int) (penghasilan -(penghasilan * pajak));
            System.out.println("gaji bersih yang anda terima: " + gajiBersih);
            }else{
                
            }
    }
    
}