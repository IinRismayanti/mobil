public class Main {
    public static void main(String[] args){

        mobil objek = new mobil();

        objek.pemilik = "Iin";
        objek.merek = "Honda jazz";
        objek.jenis = "Matic";
        objek.warna = "Gray";
        objek.harga = 100000000;
        objek.tahun = 2020;

        //panggil method

        objek.jalan();
        objek.kemampuan();
        objek.kelebihan();
        objek.jenisnya();
        objek.mereknya();


        //panggil overloading
        objek.tipemobil("Iin");
        objek.tipemobil("Honda", "Matic");
        objek.tipemobil("Honda jazz", 100000000, 2020);

        //panggil constructor
        mobil satu = new mobil("Toyota");
        mobil dua = new mobil("Hitam", 500000000 );


    }
}
