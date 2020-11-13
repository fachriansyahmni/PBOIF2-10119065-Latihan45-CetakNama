package pboif2.pkg10119065.latihan45.cetaknama;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program cetak nama 
 *                         dengan objek
 */
public class PBOIF210119065Latihan45CetakNama {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukkan nama anda : ");
        printer.setNama(sc.next());
        System.out.print("Mau di cetak berapa kali? : ");
        printer.setJmlCetak(sc.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
