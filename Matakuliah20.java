import java.util.Scanner;

public class Matakuliah20 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    
    public Matakuliah20 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo(){
        System.out.println("Kode         : "+ kode);
        System.out.println("Nama         : "+ nama);
        System.out.println("Sks          : "+ sks);
        System.out.println("Jumlah jam   : "+ jumlahJam);
        System.out.println("-----------------------------------");
    }

    public static Matakuliah20 tambahData(Scanner sc){
        System.out.println("Masukkan Data Matakuliah Baru");
        System.out.print("Kode        : ");
        String kode = sc.nextLine();
        System.out.print("Nama        : ");
        String nama = sc.nextLine();
        System.out.print("Sks         : ");
        int sks = sc.nextInt();
        System.out.print("Jumlah Jam  : ");
        int jumlahJam = sc.nextInt();
        System.out.println("-----------------------------");
    
        return new Matakuliah20(kode, nama, sks, jumlahJam);
    }
}
