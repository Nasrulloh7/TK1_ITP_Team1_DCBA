
/**
 * Introduction to Programming
 * @author             Team1 - DCBA
 *         Aldo Sunan        - 
 *         M. Ilmi Nasrulloh - 2602233235
 *         Muliando Marpaung - 
 *         Nurul Amalia      - 2602243993
 *         Parlin Situmeang  - 2602239056
 */
import java.util.Scanner;
public class restoranBungar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int jumlah_orang;
        String nama_pemesan;
        
        // variable menu makanan
        double makanan1_price = 9999.99,
               makanan2_price = 12345.67,
               makanan3_price = 21108.40,
               makanan4_price = 13579.13,
               makanan5_price = 98765.43;
        
        //====Tugas Nomor 1 A dan B=====//
        System.out.println("Selamat Datang di Restoran BUNGAR");
        System.out.print("Selamat siang..." + "\n");
        
        // input jumlah orang
        System.out.print("Pesan untuk berapa orang : ");
        int jumlahorang = input.nextInt();
        input.nextLine();
        
        // input nama pemesan
        System.out.print("Pesanan atas nama \t : ");
        String namapemesan = input.nextLine();
        
        // Menampilkan menu makanan
        System.out.println("\n" + "Menu spesial hari ini");
        System.out.println("=====================" + "\n");
        
        System.out.printf(" 1. Nasi Goreng Spesial        Rp. %,.2f%n", makanan1_price);
        System.out.printf(" 2. Ayam Bakar Spesial         Rp. %,.2f%n", makanan2_price);
        System.out.printf(" 3. Steak Sirloin Spesial      Rp. %,.2f%n", makanan3_price);
        System.out.printf(" 4. Kwetiaw Siram Spesial      Rp. %,.2f%n", makanan4_price);
        System.out.printf(" 5. Kambing Guling Spesial     Rp. %,.2f%n", makanan5_price);
        System.out.println();
        //====Selesai Nomor 1 A dan B=====//
        
    }
    
}
