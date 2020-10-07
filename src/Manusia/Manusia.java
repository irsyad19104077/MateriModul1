package Manusia;

public class Manusia {
    private String nama;
    private  int umur;

    //constructor pertama
    public Manusia(){}

    // constructor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //constructor ke3
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //getter & setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
