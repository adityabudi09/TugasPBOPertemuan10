/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.pertemuan.pkg10;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Segitiga extends BangunDatar{

    private final int alas;
    private final int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = "Biru";
    }

    @Override
    public void gambar() {
        System.out.println("Warna Segitiga      : " + warna);
    }

    @Override
    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }
}
