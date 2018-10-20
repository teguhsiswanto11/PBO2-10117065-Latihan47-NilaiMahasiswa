/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Meghitung nilai akhir mahasiswa berdasarkan
 * nilai quiz, uts, dan uas
 *
 */
public class Main {
    public static void main(String[] args) {
        NilaiMahasiswa nm = new NilaiMahasiswa(60,80,75);

        System.out.println("QUIZ \t = "+nm.getQuiz());
        System.out.println("UTS \t = "+nm.getUts());
        System.out.println("UAS \t = "+nm.getUas());
        System.out.println("\nNilai Akhir = "+ nm.nilaiAkhir());
        System.out.println("\nIndex = "+ nm.indexNilai());
        System.out.println("Keterangan = "+ nm.ketereangan());

    }
}
