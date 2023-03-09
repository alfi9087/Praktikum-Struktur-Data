package Modul1.Latihan;

public class Hidangan {
    protected String namaHidangan;

    public String getNamaHidangan(){
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidanga) {
        this.namaHidangan = namaHidanga;
    }

    public String disantap(){
        return "Makanan Dihidangkan";
    }
}
