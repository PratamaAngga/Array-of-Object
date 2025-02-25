import java.util.Scanner;
public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen20[] arrayDosen20 = new Dosen20[3];
        for(int i=0; i<2; i++){
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode        : ");
            String kode = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (1 = Laki-laki, 2 = Perempuan): ");
            int JK = sc.nextInt();
            boolean jenisKelamin = (JK == 1);
            System.out.print("Usia  : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");
            arrayDosen20[i] = new Dosen20(kode, nama, jenisKelamin, usia);
        }
        DataDosen.dataSemuaDosen(arrayDosen20);
        DataDosen.jumlahDosenPerJenisKelamin(arrayDosen20);
        DataDosen.rerataUsiaDosenPerJenisKelamin(arrayDosen20);
        DataDosen.infoDosenPalingTua(arrayDosen20);
        DataDosen.infoDosenPalingMuda(arrayDosen20);
        sc.close();
    }
}
