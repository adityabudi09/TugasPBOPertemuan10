/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.pertemuan.pkg10;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Persegi extends BangunDatar{

    private final float panjang;
    private final float lebar;


    public Persegi(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.warna = "Merah";
    }

    @Override
    public void gambar() {
        System.out.println("Warna Persegi       : " + warna);
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }
}
