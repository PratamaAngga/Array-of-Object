import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa20[] arrayMahasiswa20 = new Mahasiswa20[3];
        String dummy;
        for(int i=0; i<3; i++) {
            arrayMahasiswa20[i] = new Mahasiswa20();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayMahasiswa20[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayMahasiswa20[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayMahasiswa20[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayMahasiswa20[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }
        for(int i=0; i<3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayMahasiswa20[i].cetakInfo();
        }

        sc.close();
    }
}
