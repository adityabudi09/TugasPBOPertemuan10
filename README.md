# Tugas PBO Pertemuan 10
Saya membuat project ini dengan menggunakan Apche NetBeans IDE 15 dan membuat 5 file java dengan salah satu diantaranya adalah Main.java sebagai Class utama. Pada Project kali ini saya akan membuat perhitungan bangun luas dan warna Persegi, Lingkaran dan Segitiga. Dan ketiga file tersebut merupakan child class dari BangunDatar.java sebagai parent class. Jadi strukturnya akan seperti ini,


        - Main.java           (Main Class)
        - BangunDatar.java    (Parent Class)
        - Lingkaran.java      (Child Class)
        - Persegi.java        (Child Class)
        - Segitiga.java       (Child Class)
      
      
Setelah ini saya mulai menulis baris code untuk parent class nya terlebih dahulu, saya membuat dua fungsi yang akan di jadikan override di kelas child yaitu luas dan keliling kedua fungsi ini akan di turunkan juga di child class

      public abstract class BangunDatar {
          String warna;

          public abstract void gambar();
          public abstract float luas();

      }
Setelah saya membuat fungsi di class BangunDatar.java, saya langsung membuat override untuk ketiga kelas child, namun sebelum itu override sendiri artinya adalah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class.

Maka code di dalam child class tidak akan berbeda jauh, hanya berbeda dari segi rumus penyelesaian, selebihnya akan sama saja dalam penerapan code nya. Dan sample code nya akan menjadi seperti ini.

- Persegi

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


- Lingkaran

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

- Segitiga

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


Dan di akhir kita hanya membuat objek di class Main atau file utama kita, sehingga program kita bisa di jalankan dan mengeluarkan output. Sehingga full code Main.java akan menjadi sebagi berikut,

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

Maka jika Program di Run hasil output yang dikeluarkan akan menjadi seperti gambar di bawah ini,


![image](https://user-images.githubusercontent.com/115923969/205293152-e3362409-dbd9-432c-83b6-e4d0cd201906.png)


