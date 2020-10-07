package com.irsyad.modul1;

//class main / demo class
public class Objek {
    public static void main(String[] args) {
        //deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Bagus");
        mahasiswaTanpa.setNim(18104005);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: "+mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: "+mahasiswaTanpa.getNim());

        //deklarasi bjek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 803303533);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: "+ mahasiswa.getNama());
        System.out.println("Nim\t\t: "+mahasiswa.getNim());
    }
}
