public class DemoKelas {
    public static void main(String[] args) {
        Siswa zann = new Siswa("Muhamad");

        Kelas k = new Kelas(zann);

        Siswa siti = new Siswa("Siti");
        k.tambahDiBelakang(siti);
        k.tambahDiBelakang(new Siswa("Tahtia"));
        k.tambahDiBelakang(new Siswa("Ainun"));
        k.tambahDiBelakang(new Siswa("Zahra"));
        System.out.println("List siswa awal");
        k.tampilkanSemua();

System.out.println(" ");

        // Test ambilDi
        System.out.println("sekarang kita mau ambil salah satu siswa");
        Siswa siswaAmbilDi = k.ambilDi(2);
        if (siswaAmbilDi != null) {
            System.out.println("kita ambil siswa : " + siswaAmbilDi.nama);
        } else {
            System.out.println("No siswa ambilDi 2");
        }

System.out.println(" ");

        // Test urutan
        System.out.println("Sekarang kita ingin menampilkan siswa itu di urutan ke berapa");
        int urutanKe = k.urutan("Ainun");
        System.out.println("Ainun urutan ke: " + urutanKe);

        // int indexOfNonExist = k.urutan("NonExist");
        // System.out.println("Index of NonExist: " + indexOfNonExist);

System.out.println(" ");

        // Test jumlahSiswa
        System.out.println("Jumlah siswa: " + k.jumlahSiswa());

System.out.println(" ");

        // Test tambahDiDepan
        System.out.println("Menambahkan siswa di depan, sebelum Muhamad");
        k.tambahDiDepan(new Siswa("Naufal"));
        k.tampilkanSemua();

System.out.println(" ");

        // Test tambahSetelah
        System.out.println("Menambahkan siswa setelah Siti");
        k.tambahSetelah("Siti", new Siswa("Fauzan"));
        k.tampilkanSemua();

System.out.println(" ");

        // Test hapus
        System.out.println("Menghapus siswa");
        k.hapus("Tahtia");
        k.tampilkanSemua();

        // k.hapus("Naufal");
        // k.tampilkanSemua();

        // k.hapus("NonExist"); // Should do nothing
        // k.tampilkanSemua();
    }
}
