/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nilai;

/**
 *
 * @author Nauval Amarullah
 */
import java.util.Scanner;

public class Nilai {
    static String Grade = null;
    static Scanner input = new Scanner(System.in);
    static String[] namaMatkul;
    static int[] Tugas1, Tugas2, Tugas3, Quiz, Project, uts, uas;
    static int jumlahMatkul = 0;
    static double[] per_nilai1, per_nilai2, per_nilai3, per_Quiz, per_Project, per_uts, per_uas, total_nilai;

    public static void inputJumlahMatkul() {

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = input.nextInt();
        input.nextLine(); // membersihkan newline

        namaMatkul = new String[jumlahMatkul];
        Tugas1 = new int[jumlahMatkul];
        Tugas2 = new int[jumlahMatkul];
        Tugas3 = new int[jumlahMatkul];
        Quiz = new int[jumlahMatkul];
        Project = new int[jumlahMatkul];
        uts = new int[jumlahMatkul];
        uas = new int[jumlahMatkul];
        per_nilai1 = new double[jumlahMatkul];
        per_nilai2 = new double[jumlahMatkul];
        per_nilai3 = new double[jumlahMatkul];
        per_Quiz = new double[jumlahMatkul];
        per_Project = new double[jumlahMatkul];
        per_uts = new double[jumlahMatkul];
        per_uas = new double[jumlahMatkul];
        total_nilai = new double[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Nama Mata Kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = input.nextLine();
        }
    }
    public static void inputNilai() {

        if (namaMatkul == null) {
            System.out.println("Silakan input jumlah dan nama mata kuliah terlebih dahulu.");
            return;
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai Tugas1 " + namaMatkul[i] + ": ");
            Tugas1[i] = input.nextInt();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai tugas2 " + namaMatkul[i] + ": ");
            Tugas2[i] = input.nextInt();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai tugas3 " + namaMatkul[i] + ": ");
            Tugas3[i] = input.nextInt();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai quiz " + namaMatkul[i] + ": ");
            Quiz[i] = input.nextInt();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai Project " + namaMatkul[i] + ": ");
            Project[i] = input.nextInt();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai UTS " + namaMatkul[i] + ": ");
            uts[i] = input.nextInt();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai UAS " + namaMatkul[i] + ": ");
            uas[i] = input.nextInt();
        }
    }

    public static void lihatNilai() {
        if (namaMatkul == null || Tugas1 == null) {
            System.out.println("Belum ada data nilai. Silakan input dulu.");
            return;
        }
        System.out.println("\n=== Daftar Nilai Mata Kuliah ===");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println(namaMatkul[i] + " = " + " Tugas 1 = " + Tugas1[i] + " Tugas 2 = " + Tugas2[i] + " Tugas 3 = " + Tugas3[i] + " Quiz = " + Quiz[i] + " Project = " + Project[i] + " UAS = " + uas[i] + " UTS = " + uts[i]);
        }
    }

    public static void PresensiNilai() {
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi Tugas 1 Matkul (Harap Masukan Angka Persentase nya saja contoh 10% = 0,10) " + namaMatkul[i]);
            per_nilai1[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi Tugas 2 : ");
            per_nilai2[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi Tugas 3 : ");
            per_nilai3[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi Quiz : ");
            per_Quiz[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi Project : ");
            per_Project[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi UAS ");
            per_uas[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Presensi UTS : ");
            per_uts[i] = Double.parseDouble(input.nextLine().replace(",","."));
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            total_nilai[i] = Tugas1[i] * per_nilai1[i] + Tugas2[i] * per_nilai2[i] + Tugas3[i] * per_nilai3[i] + Quiz[i] * per_Quiz[i] + Project[i] * per_Project[i] + uts[i] * per_uts[i] + uas[i] * per_uas[i];
            
        }

    }

    public static void cekStatusLulus() {
        if (namaMatkul == null || Tugas1 == null) {
            System.out.println("Data nilai belum ada.");
            return;
        }
        System.out.println("\n=== Status Kelulusan ===");
        for (int i = 0; i < jumlahMatkul; i++) {
            String status = total_nilai[i] >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.println(namaMatkul[i] + ": " + total_nilai[i] + " (" + status + ")");
            if (total_nilai[i] >= 80 ) {
                Grade ="A";
            } else if (total_nilai[i] >= 75) {
                Grade = "A-";
            } else if (total_nilai[i] >= 70) {
                Grade = "B+";
            } else if (total_nilai[i] >= 65) {
                Grade = "C";
            } else {
                Grade = "D (Anda Tidak Lulus)";
            }
            System.out.println("Anda Lulus Dengan Grade : " + Grade);
        }
    }

    public static void menu() {
        System.out.println("\n========= MENU =========");
        System.out.println("1. Input Mata Kuliah");
        System.out.println("2. Input Presensi Nilai");
        System.out.println("3. Input Nilai");
        System.out.println("4. Lihat Nilai");
        System.out.println("5. Cek Status Lulus");
        System.out.println("6. Exit");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        int pilihan;
        do {
            menu();
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan newline
            switch (pilihan) {
                case 1:
                    inputJumlahMatkul();
                    break;
                case 2:
                    PresensiNilai();
                    break;
                case 3:
                    inputNilai();
                    break;
                case 4:
                    lihatNilai();
                    break;
                case 5:
                    cekStatusLulus();
                    break;
                case 6:
                    System.out.println("Terima kasih, program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (true);
    }
}
