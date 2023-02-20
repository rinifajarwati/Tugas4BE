package Tugas;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SoalDua {
    public static void main(String[] args) {
        // List Nama makanan minimal 10 data
        List<String> makanan = new ArrayList<>();
        makanan.add("Nasi goreng");
        makanan.add("Sate ayam");
        makanan.add("Bakso");
        makanan.add("Mie ayam");
        makanan.add("Gado-gado");
        makanan.add("Rendang");
        makanan.add("Sayur Lodeh");
        makanan.add("Nasi kuning");
        makanan.add("Ayam bakar");
        makanan.add("Soto banjar");

        System.out.println("list 10 nama makanan " + makanan);
        System.out.println();


        // List Tahun Piala Dunia minimal 3 data
        List<Integer> tahunPialaDunia = new ArrayList<>();
        tahunPialaDunia.add(2018);
        tahunPialaDunia.add(2014);
        tahunPialaDunia.add(2010);

        System.out.println("list 3 tahun piala dunia " + tahunPialaDunia );
        System.out.println();


        // Implement sort pada list nama provinsi minimal 10 data secara descending
        List<String> provinsi = new ArrayList<>();
        provinsi.add("Aceh");
        provinsi.add("Bali");
        provinsi.add("Banten");
        provinsi.add("Jawa Barat");
        provinsi.add("Jawa Tengah");
        provinsi.add("Jawa Timur");
        provinsi.add("Kalimantan Barat");
        provinsi.add("Kalimantan Timur");
        provinsi.add("Sulawesi Utara");
        provinsi.add("Sumatera Selatan");

        Collections.sort(provinsi, Collections.reverseOrder());
        System.out.println("List 10 nama provinsi secara descending " + provinsi);
        System.out.println();


        // Implement penghapusan data untuk 5 data yang berbeda dari list bahasa pemograman yang berisikan 12 data
        List<String> bahasaPemrograman = new ArrayList<>();
        bahasaPemrograman.add("Java");
        bahasaPemrograman.add("Python");
        bahasaPemrograman.add("C++");
        bahasaPemrograman.add("JavaScript");
        bahasaPemrograman.add("Ruby");
        bahasaPemrograman.add("Swift");
        bahasaPemrograman.add("PHP");
        bahasaPemrograman.add("Go");
        bahasaPemrograman.add("Kotlin");
        bahasaPemrograman.add("R");
        bahasaPemrograman.add("Scala");
        bahasaPemrograman.add("Perl");

        System.out.println("list 10 bahasa pemograman " + bahasaPemrograman);
        System.out.println();
        // Menghapus 5 data yang berbeda dari list bahasa pemograman
        bahasaPemrograman.remove("Go");
        bahasaPemrograman.remove("Kotlin");
        bahasaPemrograman.remove("Swift");
        bahasaPemrograman.remove("Perl");
        bahasaPemrograman.remove("Scala");
        System.out.println("list 5 bahasa pemograman yang sudah di hapus " + bahasaPemrograman);
        System.out.println();
    }

}
