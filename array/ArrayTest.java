import java.util.ArrayList;

// Ini adalah file utama yang berisi metode main() untuk menjalankan program.
public class ArrayTest {
    public static void main(String[] args) {
        
        // Membuat ArrayList bertipe String
        ArrayList<String> nama = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        nama.add("Didi");
        nama.add("Andii");
        nama.add("Citro");

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList: " + nama);

        // Mengambil elemen berdasarkan index
        // index 0 = Budi
        System.out.println("Elemen ke-1: " + nama.get(0));

        // Mengubah elemen
        // Mengganti Ani (index 1) menjadi Andi
        nama.set(1, "Andi");
        System.out.println("Setelah diubah: " + nama);

        // Menghapus elemen
        // Menghapus elemen index ke-2
        nama.remove(2);
        System.out.println("Setelah dihapus: " + nama);

        // Menampilkan jumlah elemen
        System.out.println("Jumlah elemen: " + nama.size());
    }
}