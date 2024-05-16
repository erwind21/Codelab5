import java.util.ArrayList;
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.print("Masukkan nama ke " + i + " : ");
            String nama = scanner.nextLine();

            if (nama.isEmpty()) {
                try {
                    throw new IllegalArgumentException("Tidak boleh kosong");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            if (nama.equalsIgnoreCase("Tutup")) {
                break;
            }

            daftarNama.add(i + "." + nama);
            i++;
        }

        System.out.println("\nDaftar Nama :");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}