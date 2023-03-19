
/**
 * Introduction to Programming
 * @author             Team1 - DCBA
 *         Aldo Sunan        - 
 *         M. Ilmi Nasrulloh - 2602233235
 *         Muliando Marpaung - 2602233393
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
        
        int pesanan1, pesanan2, pesanan3, pesanan4, pesanan5;
        
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

    
        System.out.println("Pesanan Anda [Batas Pesanan 0-10 Porsi]");
    
        System.out.print("1. Nasi Goreng Spesial \t\t : ");
        pesanan1 = input.nextInt();

        System.out.print("2. Ayam Bakar Spesial \t\t : ");
        pesanan2 = input.nextInt();

        System.out.print("3. Steak Sirloin Spesial \t : ");
        pesanan3 = input.nextInt();

        System.out.print("4. Kwetiaw Siram Spesial \t : ");
        pesanan4 = input.nextInt();

        System.out.print("5. Kambing Guling Spesial \t : ");
        pesanan5 = input.nextInt();
        //====Selesai Nomor 2=====//


        //====Proses Penghitungan pesanan=====//
         double Menu1 = (pesanan1 * makanan1_price);
         double Menu2 = (pesanan2 * makanan2_price);
         double Menu3 = (pesanan3 * makanan3_price);
         double Menu4 = (pesanan4 * makanan4_price);
         double Menu5 = (pesanan5 * makanan5_price);
         
         // Total pesanan
         double Total = Menu1 + Menu2 + Menu3 + Menu4 + Menu5;
         
         // Jumlah diskon
         double Diskon = Total * 10/(float)100;
         
         // Total bayar
         double Total_bayar = Total - Diskon;
         
         // Pembayaran per orang
         double Pembelian_perorang = Total_bayar/jumlahorang;
        
         
         System.out.println("\n\n" + "Selamat menikmati makanan anda..." + "\n");
         
        //====Hasil Penghitungan pesanan=====//
         System.out.print("Harga Pembelian : ");
         System.out.printf("\n 1. Nasi Goreng Spesial       %d Porsi *  9999,99  = Rp. " + Menu1, pesanan1);
         System.out.printf("\n 2. Ayam goreng Spesial       %d Porsi *  12345,67 = Rp. " + Menu2, pesanan2);
         System.out.printf("\n 3. Steak Sirloin Spesial     %d Porsi *  21108,40 = Rp. " + Menu3, pesanan3);
         System.out.printf("\n 4. Kwetiaw Siram Spesial     %d Porsi *  13579,13 = Rp. " + Menu4, pesanan4);
         System.out.printf("\n 5. Kambing Guling Spesial    %d Porsi *  98765,43 = Rp. " + Menu5, pesanan5);
         System.out.println("");
         System.out.println("=======================================================================");
        //====Selesai Nomor 3=====//
        
    }
    
}
