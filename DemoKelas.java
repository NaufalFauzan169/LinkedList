public class DemoKelas {
    public static void main(String[] args) {
        Siswa zann = new Siswa("Zann");

        Kelas k = new Kelas(zann);

        Siswa siti = new Siswa("Siti");
        k.tambahDiBelakang(siti);
        k.tambahDiBelakang(new Siswa("Tahtia"));
        k.tambahDiBelakang(new Siswa("Ainun"));
        k.tambahDiBelakang(new Siswa("Zahra"));
        k.tampilkanSemua();

        // Test ambilDi
        System.out.println("Testing ambilDi:");
        Siswa siswaAt2 = k.ambilDi(2);
        if (siswaAt2 != null) {
            System.out.println("Siswa at index 2: " + siswaAt2.nama);
        } else {
            System.out.println("No siswa at index 2");
        }

        // Test urutan
        System.out.println("Testing urutan:");
        int indexOfAinun = k.urutan("Ainun");
        System.out.println("Index of Ainun: " + indexOfAinun);

        int indexOfNonExist = k.urutan("NonExist");
        System.out.println("Index of NonExist: " + indexOfNonExist);

        // Test jumlahSiswa
        System.out.println("Testing jumlahSiswa:");
        System.out.println("Jumlah siswa: " + k.jumlahSiswa());

        // Test tambahDiDepan
        System.out.println("Testing tambahDiDepan:");
        k.tambahDiDepan(new Siswa("Budi"));
        k.tampilkanSemua();

        // Test tambahSetelah
        System.out.println("Testing tambahSetelah:");
        k.tambahSetelah("Siti", new Siswa("Dewi"));
        k.tampilkanSemua();

        // Test hapus
        System.out.println("Testing hapus:");
        k.hapus("Tahtia");
        k.tampilkanSemua();

        k.hapus("Budi");
        k.tampilkanSemua();

        k.hapus("NonExist"); // Should do nothing
        k.tampilkanSemua();
    }
}
