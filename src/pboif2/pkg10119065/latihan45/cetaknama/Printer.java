package pboif2.pkg10119065.latihan45.cetaknama;


/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program cetak nama 
 *                         dengan objek
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak()
    {
        return jmlCetak;
    }
    public void setJmlCetak(int jmlCetak)
    {
        this.jmlCetak = jmlCetak;
    }
    public String getNama()
    {
        return nama;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void cetak(String nama)
    {
        System.out.println("nama anda :"+ nama);
    }
    public void cetak(int jmlCetak, String nama)
    {
        System.out.println("Hasil cetak :");
        for(int i = 0; i < jmlCetak; i++)
        {
            System.out.println((i+1) + ". " + nama);
        }
    }
}
