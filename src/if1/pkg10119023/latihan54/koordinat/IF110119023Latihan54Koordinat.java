package if1.pkg10119023.latihan54.koordinat;
/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program mengisi koordinat
 *
 */
public class IF110119023Latihan54Koordinat{
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+ wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
}
