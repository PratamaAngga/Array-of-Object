public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Mahasiswa20[] arrayMahasiswa20 = new Mahasiswa20[3];
        arrayMahasiswa20[0] = new Mahasiswa20();
        arrayMahasiswa20[0].nim = "244107060033";
        arrayMahasiswa20[0].nama = "AGNES TITANIA KINANTI";
        arrayMahasiswa20[0].kelas = "SIB-1E";
        arrayMahasiswa20[0].ipk = (float) 3.75;
        
        arrayMahasiswa20[1] = new Mahasiswa20();
        arrayMahasiswa20[1].nim = "2341720172";
        arrayMahasiswa20[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMahasiswa20[1].kelas = "TI-2A";
        arrayMahasiswa20[1].ipk = (float) 3.36;

        arrayMahasiswa20[2] = new Mahasiswa20();
        arrayMahasiswa20[2].nim = "244107023006";
        arrayMahasiswa20[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayMahasiswa20[2].kelas = "TI-2E";
        arrayMahasiswa20[2].ipk = (float) 3.80;

        System.out.println("NIM     : "+ arrayMahasiswa20[0].nim);
        System.out.println("Nama    : "+ arrayMahasiswa20[0].nama);
        System.out.println("Kelas   : "+ arrayMahasiswa20[0].kelas);
        System.out.println("IPK     : "+ arrayMahasiswa20[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM     : "+ arrayMahasiswa20[1].nim);
        System.out.println("Nama    : "+ arrayMahasiswa20[1].nama);
        System.out.println("Kelas   : "+ arrayMahasiswa20[1].kelas);
        System.out.println("IPK     : "+ arrayMahasiswa20[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM     : "+ arrayMahasiswa20[2].nim);
        System.out.println("Nama    : "+ arrayMahasiswa20[2].nama);
        System.out.println("Kelas   : "+ arrayMahasiswa20[2].kelas);
        System.out.println("IPK     : "+ arrayMahasiswa20[2].ipk);
        System.out.println("-----------------------------------");
    }
}
