import java.util.HashMap;

// File utama yang berisi metode main() untuk menjalankan program.
public class HashMapTest {
    public static void main(String[] args) {
        
        // Membuat HashMap dengan key Integer dan value String
        HashMap<Integer, String> mahasiswa = new HashMap<>();

        // Menambahkan pasangan key-value
        mahasiswa.put(101, "Budi");
        mahasiswa.put(102, "Ani");
        mahasiswa.put(103, "Citra");

        // Menampilkan isi HashMap
        System.out.println("Data Mahasiswa: " + mahasiswa);

        // Mengambil value berdasarkan key
        System.out.println("Mahasiswa dengan NIM 101: " + mahasiswa.get(101));

        // Mengubah value berdasarkan key
        // Mengganti Ani menjadi Andi
        mahasiswa.put(102, "Andi");
        System.out.println("Setelah diubah: " + mahasiswa);

        // Menghapus data berdasarkan key
        mahasiswa.remove(103);
        System.out.println("Setelah dihapus: " + mahasiswa);

        // Menampilkan semua key dan value
        for (Integer nim : mahasiswa.keySet()) {
            System.out.println("NIM: " + nim + " | Nama: " + mahasiswa.get(nim));
        }

        // Menampilkan jumlah elemen
        System.out.println("Jumlah data: " + mahasiswa.size());
    }
}