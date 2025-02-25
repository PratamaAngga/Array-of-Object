public class DataDosen {
    public static void dataSemuaDosen(Dosen20[] arrayDosen20) {
        System.out.println("-------Data Dosen-------");
        for (Dosen20 dosen20 : arrayDosen20) {
            if (dosen20 != null) {
                System.out.println("Kode          : "+ dosen20.kode);
                System.out.println("Nama          : "+ dosen20.nama);
                System.out.println("Jenis Kelamin : "+ (dosen20.jenisKelamin ? "Laki-Laki" : "Perempuan"));
                System.out.println("Usia          : "+ dosen20.usia);
                System.out.println("-------------------------------");
            }
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen != null) {
                if (dosen.jenisKelamin) {
                    jumlahPria++;
                } else {
                    jumlahWanita++;
                }
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int totalPria = 0, totalWanita = 0;
        
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen != null) {
                if (dosen.jenisKelamin) {
                    totalUsiaPria += dosen.usia;
                    totalPria++;
                } else {
                    totalUsiaWanita += dosen.usia;
                    totalWanita++;
                }
            }
        }
        
        double rataPria = (totalPria > 0) ? (double) totalUsiaPria / totalPria : 0;
        double rataWanita = (totalWanita > 0) ? (double) totalUsiaWanita / totalWanita : 0;

        System.out.println("Rata-rata usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata usia Dosen Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        Dosen20 tertua = null;
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen != null) {
                if (tertua == null || dosen.usia > tertua.usia) {
                    tertua = dosen;
                }
            }
        }
        if (tertua != null) {
            System.out.println("Dosen Paling Tua:");
            System.out.println("Kode          : " + tertua.kode);
            System.out.println("Nama          : " + tertua.nama);
            System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia          : " + tertua.usia);
        } else {
            System.out.println("Tidak ada data dosen.");
        }
    }

    public static void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        Dosen20 termuda = null;
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen != null) {
                if (termuda == null || dosen.usia < termuda.usia) {
                    termuda = dosen;
                }
            }
        }
        if (termuda != null) {
            System.out.println("Dosen Paling Muda:");
            System.out.println("Kode          : " + termuda.kode);
            System.out.println("Nama          : " + termuda.nama);
            System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia          : " + termuda.usia);
        } else {
            System.out.println("Tidak ada data dosen.");
        }
    }
}
