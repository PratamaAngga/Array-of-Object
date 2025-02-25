import java.util.Scanner;
public class MatakuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, banyakData;
        System.out.print("Masukan banyak data yang ingin di input: ");
        banyakData = sc.nextInt();
        sc.nextLine();
        Matakuliah20[] arrayMatakuliah20 = new Matakuliah20[banyakData];
        int jumlahData = banyakData-1;
        for(int i=0; i<jumlahData; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");
            arrayMatakuliah20[i] = new Matakuliah20(kode, nama, sks, jumlahJam);
        }
        System.out.print("Apakah anda ingin menambah data matakuliah (y/n): ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            if (jumlahData < arrayMatakuliah20.length) {
                arrayMatakuliah20[jumlahData] = Matakuliah20.tambahData(sc);
                jumlahData++;
            } else {
                System.out.println("Kapasitas array sudah penuh! Tidak bisa menambah data lagi.");
            }
        }
        for(int i=0; i<jumlahData; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayMatakuliah20[i].cetakInfo();
        }

        sc.close();
    }
}
