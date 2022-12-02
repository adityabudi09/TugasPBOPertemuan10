/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.pertemuan.pkg10;

/**
 *
 * @author DWI ADITYA BUDI
 */
import java.lang.Math;

public class Lingkaran extends BangunDatar{

    private final int r;

    public Lingkaran(int r){
        this.r = r;
        this.warna = "Pink";
    }

    @Override
    public void gambar() {
        System.out.println("Warna Lingkaran     : " + warna);
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
}