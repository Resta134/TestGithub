import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("|=========================================|");
        System.out.println("|       BARANG YANG TERSEDIA              |");
        System.out.println("|=========================================|");
        System.out.println("|      1. Face Primer = Rp 14.000         |");
        System.out.println("|      2. Foundation  = Rp 30.000         |");
        System.out.println("|      3. Concealer   = Rp 15.000         |");
        System.out.println("|      4. Loose Powder= Rp 12.000         |");
        System.out.println("|      5. BB Cream    = Rp 15.000         |");
        System.out.println("|      6. Blush On    = Rp 14.000         |" );
        System.out.println("|      7. Eyeshadow   = Rp 30.000         |");
        System.out.println("|      8. Pensil Alis = Rp 15.000         |");
        System.out.println("|      9. Eyeliner    = Rp 12.000         |");
        System.out.println("|     10. Maskara     = Rp 15.000         |");
        System.out.println("|=========================================|");

        System.out.print("masukan kode barang yang ingin dibeli: ");
        String Barang = input.nextLine();

        System.out.print("jumlah barang  : ");
        int Jumlah = input.nextInt();

        int Total_harga =0;

        switch (Barang) {
            case "1":
                Total_harga = Jumlah * 14000;
                System.out.println("Face Primer " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "2":
                Total_harga = Jumlah * 30000;
                System.out.println("Foundation " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "3":
                Total_harga = Jumlah * 15000;
                System.out.println("Concealer " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "4":
                Total_harga = Jumlah * 12000;
                System.out.println("Loose Powder " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "5":
                Total_harga = Jumlah * 15000;
                System.out.println("BB Cream " +Jumlah+ " total harganya adalah  Rp."+Total_harga);
                break;
            case "6":
                Total_harga = Jumlah * 14000;
                System.out.println("Blush On " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "7":
                Total_harga = Jumlah * 30000;
                System.out.println("Eyeshadow " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "8":
                Total_harga = Jumlah * 15000;
                System.out.println("Pensil Alis " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "9":
                Total_harga = Jumlah * 12000;
                System.out.println("Eyeliner " +Jumlah+ " total harganya adalah Rp."+Total_harga);
                break;
            case "10":
                Total_harga = Jumlah * 15000;
                System.out.println("Maskara " +Jumlah+ " total harganya adalah  Rp."+Total_harga);
                break;
            default:
                System.out.println("barang sedang kosong");
        }
    }
}
