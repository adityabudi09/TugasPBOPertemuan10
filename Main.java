/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo.pertemuan.pkg10;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Main {
    public static void main(String[] args) {
        // Membuat Objek Kelas
        BangunDatar persegi = new Persegi(15, 15);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(10, 10);

        // Mengeluarkan gambar
        persegi.gambar();
        lingkaran.gambar();
        segitiga.gambar();

        // Menghitung Luas Bangun Datar
        System.out.println("Luas Persegi        : " + persegi.luas());
        System.out.println("Luas Lingkaran      : " + lingkaran.luas());
        System.out.println("Luas Segitiga       : " + segitiga.luas());
    }
}
