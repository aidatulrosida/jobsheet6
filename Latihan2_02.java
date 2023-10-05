import java.util.Scanner;
public class Latihan2_02 {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner input02 =new Scanner(System.in);
        String  kategori;
        int jumlahBuku, harga, total, bayar;
        double diskon = 0;
        double diskon1 = 0;
        double diskon2 = 0;
       
        System.out.println("Masukkan kategori buku: ");
        kategori = input02.next();
        System.out.println("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = input02.nextInt();
        System.out.println("Masukkan harga buku");
        harga = input02.nextInt();

        if (kategori.equalsIgnoreCase("kamus")){
            if(jumlahBuku > 2){
                diskon = 0.12;
                System.out.println("Anda mendapatkan diskon sebesar 10% dan tambahan 2%");
            }else if (jumlahBuku <= 2){
                diskon = 0.1;
                System.out.println("Anda mendapatkan diskon sebesar 10%");
            }
            total =  (jumlahBuku * harga);
            diskon1= total * diskon;
            bayar = (int) (total- (total * diskon));
             System.out.println("Anda mendapatkan diskon sebanyak: Rp " + diskon1);
            System.out.println("total harga: " + bayar);
        }else if (kategori.equalsIgnoreCase("novel")){
            if ( jumlahBuku > 3){
                diskon = 0.09;
                System.out.println("Anda mendapatkan diskon sebesar 7% dan tambahan 2%");
            }else if (jumlahBuku <= 3){
                diskon = 0.08;
                System.out.println("Anda mendapatkan diskon 8%");
            }
            total = (jumlahBuku * harga);
            diskon2 = total * diskon;
            bayar = (int) (total -(total * diskon));
            System.out.println("Anda mendapatkan diskon sebanyak: Rp " + diskon2);
            System.out.println("total harga: " + bayar);
        }
        



    }
}