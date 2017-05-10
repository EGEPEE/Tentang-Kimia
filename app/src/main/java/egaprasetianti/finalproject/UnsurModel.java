package egaprasetianti.finalproject;

/**
 * Created by Ega Prasetianti on 5/10/2017.
 */

public class UnsurModel {
    String namaUnsur;
    int gambar, penjelasan;

    public String getNamaUnsur() {
        return namaUnsur;
    }

    public int getPenjelasan() {
        return penjelasan;
    }

    public int getGambar() {
        return gambar;
    }

    public UnsurModel(String namaUnsur, int penjelasan, int gambar){
        this.namaUnsur =  namaUnsur;
        this.penjelasan = penjelasan;
        this.gambar = gambar;
    }

}
