package rizqdwan_metode;
        
import java.util.*;

// Rizqdwan Dhuhakbar Hendyutama | 21523100 \\

public class Rizqdwan_Metode {
    
    public static int jumlah,harga,total,uang,kembalian,angka;

    public static void pembelian(int buku,int jumlah) {

    switch(buku){
        case 1: 
            harga = 6000;
            angka(harga);
            break;
        case 2: 
            harga = 4000;
            angka(harga);
            break;
        case 3: 
            harga = 1500;
            angka(harga);
            break;
        case 4: 
            harga = 1000;
            angka(harga);
            break;  
        case 5: 
            harga = 2000;
            angka(harga);
            break;   
        default:
            System.out.println("Input anda salah");
            
        }
        }

    public static int angka(int harga) {

        int angka = harga * jumlah ;
        return angka;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----Toko Alat Tulis-----");
        System.out.println("1. Buku Gambar");
        System.out.println("2. Buku");
        System.out.println("3. Pensil");
        System.out.println("4. Penghapus");
        System.out.println("5. Bolpen");

        System.out.println("\nPilih yang anda ingin beli: ");
        int buku = input.nextInt();
        
        System.out.println("Jumlah yang dibeli: ");
        jumlah = input.nextInt();
        pembelian(buku,jumlah);
        
        System.out.println("Total harga yang anda bayarkan: "+angka(harga));
        System.out.println("Masukkan uang anda : ");
         uang = input.nextInt();   
        if (uang < angka(harga)){
            System.out.println("Uang yang anda serahkan kurang");
        } else if (uang == angka(harga)) {
            System.out.println("Uang anda pas maka tidak ada kembalian");
        } else {
            kembalian = uang - angka(harga);
            System.out.println("Kembalian Anda : " + kembalian);
    }
}
}
