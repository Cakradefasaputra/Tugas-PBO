/*
Nama             : Cakra Defa Saputra
Nim              : 13020220125
Kelas            : A4
Soal            : Modul 4, No 2.
Tanggal Pengerjaan : Jumat, 29 Maret 2024
*/
package pertemuan2.modul4.user;
import java.util.*;

class Orang {
    public String nama;

    public Orang() {
        this.nama = "Nur Ikhwan Alfiansyah";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Orang.");
    }
}

class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002131"; //stambuk anda
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Mahasiswa.");
    }
}

public class Utamaa {
    public static void main(String[] args) {
        // Memanggil method info() dari kelas Orang
        Orang.info();
        
        // Memanggil method info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}
