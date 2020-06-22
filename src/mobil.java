public class mobil {


//atribute

 String pemilik;
String merek;
String jenis;
String warna;
int harga;
int tahun;

//method
 void jalan(){
     System.out.println("mobil digunakan untuk jalan-jalan");
     System.out.println("mobil digunakan untuk berkeliling kota");
     System.out.println("pemilik mobil adalah :" + pemilik );
     System.out.println("merek mobil adalah :" + merek);
     System.out.println("jenis mobil adalah :" + jenis);
     System.out.println("warna mobil adalah :" + warna);
     System.out.println("harga mobil adalah :" + harga);
     System.out.println("tahun keluar mobil adalah :" + tahun);
     System.out.println();

 }

void kemampuan(){
    System.out.println("mobil bisa dijalnkan");
    System.out.println("mobil bisa dimajukan");
    System.out.println("mobil bisa dimundurkan");
    System.out.println("mobil bisa dibelokkan");
    System.out.println();
}

void kelebihan(){
    System.out.println("mobil melindungi dari panas dan hujan");
    System.out.println("dapat jalan-jala dengan santai");
    System.out.println("mobil dapat melindungi dari folusi udara");
    System.out.println();
}

void jenisnya()
{
    System.out.println("mobil tersedia dengan berbagai jenis");
    System.out.println("mobil mempunyai banyak warna");
    System.out.println();
}

void mereknya(){
    System.out.println("mobil tersedia dengan banyak merek ");
    System.out.println();
}

//overloading

    void tipemobil(String pemilik){
     System.out.println(pemilik);
    }
    void tipemobil(String merek, String jenis ){
        System.out.println(merek + jenis);
 }
    void tipemobil(String merek, int harga, int tahun ) {
        System.out.println(merek + harga + tahun);
        System.out.println();
    }
    //constructor

    mobil() {

     System.out.println("burmmmmmmm ... brummm");
    }

    mobil(String merek) {
     System.out.println("merek mobil adalah" + merek);

    }

    mobil(String warna, int harga){
        System.out.println("warna mobil adalah" + warna);
        System.out.println("hargamobil adalah" + harga);
    }
}
