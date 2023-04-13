package kegiatan.pekan4;

import java.util.HashMap;
import java.util.Scanner;

public class latihan1 {
    static Scanner input = new Scanner(System.in);
    String nama, kelas, subject;
    int nim;

    public latihan1(String nama, String kelas, String subject, int nim){
        this.nama = nama;
        this.kelas = kelas;
        this.subject = subject;
        this.nim = nim;
    }

    public static void main(String[] args) {
        HashMap<String, latihan1> hMap = new HashMap<>();
        String user_input; latihan1 data;

        hMap.put("1", new latihan1("Vadhini", "3A", "Struktur Data", 2020201));
        hMap.put("2", new latihan1("Sheila", "3H", "Basis Data", 2020202));
        hMap.put("3", new latihan1("Rania", "3I", "Pemrograman", 2020203));

        System.out.print("Masukkan ID: ");
        user_input = input.nextLine();
        data = hMap.get(user_input);

        if (data != null){
            System.out.println("Data Mahasiswa: "+data.nama+", kelas: "+data.kelas+", matkul: "+data.subject+
                    ", nim: "+data.nim);
        }
    }
}