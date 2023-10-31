package Tugas2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Program JumlahHariBerlalu adalah program sederhana yang menghitung jumlah hari yang telah berlalu sejak
 * tanggal lahir yang dimasukkan oleh pengguna hingga saat ini dan menampilkan pesan selamat.
 */
public class JumlahHariBerlalu {
    /**
     * Metode utama yang dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah yang bisa digunakan (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        // Membaca nama dan tanggal lahir dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan tanggal lahir Anda (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.nextLine();

        // Mengkonversi string tanggal lahir ke LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Mendapatkan tanggal saat ini
        LocalDate tanggalSaatIni = LocalDate.now();

        // Menghitung selisih hari
        long selisihHari = ChronoUnit.DAYS.between(tanggalLahir, tanggalSaatIni);

        // Membuat pesan yang menarik dengan karakter ASCII
        String pesan = "  Selamat Ulang Tahun, " + nama + "! 🎉🍰\n"
                + "  Kamu telah hidup selama " + selisihHari + " hari.\n"
                + "  Teruslah bersemangat! 💪😊";

        // Menampilkan pesan
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║ " + pesan);
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
