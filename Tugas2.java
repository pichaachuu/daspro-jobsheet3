import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner gaji = new Scanner(System.in);
        double jamKerja, upah, bonus = 0.10, pajak = 0.05, gajiSebelumPajak, gajiAfterBonus, potongPajak, gajiAkhir, bonusan;

        System.out.println("Masukkan jumlah jam kerja");
        jamKerja = gaji.nextDouble();
        System.out.println("Masukkan upah kerja per jam");
        upah = gaji.nextDouble();
        gajiSebelumPajak = jamKerja * upah; 
        bonusan = bonus * gajiSebelumPajak;
        gajiAfterBonus = gajiSebelumPajak + bonusan;
        potongPajak = pajak * gajiAfterBonus;
        gajiAkhir = gajiAfterBonus - potongPajak;
        
        System.out.println("Gaji akhir karyawan anda adalah " +gajiAkhir);
    }
}
