
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
        
        System.out.print("Selamat siang..." + "\n");
        System.out.print("Pesan untuk berapa orang :");
        int jumlahorang = input.nextInt();
        input.nextLine();
        
        System.out.println("Pesanan atas nama :");
        String namapemesan = input.nextLine();
        
        
        System.out.println("Menu spesial hari ini" + "\n");
        System.out.println("=====================" + "\n");
        
        System.out.print("1. Nasi Goreng Spesial        @ Rp.9999.99" + "\n");
        System.out.print("2. Ayam Bakar Spesial         @ Rp.12345.67" + "\n");
        System.out.print("3. Steak Sirloin Spesial      @ Rp.21108.40" + "\n");
        System.out.print("4. Kwetiaw Siram Spesial      @ Rp.13579.13" + "\n");
        System.out.print("5. Kambing Guling Spesial     @ Rp.98765.43" + "\n");
        
    }
    
}
