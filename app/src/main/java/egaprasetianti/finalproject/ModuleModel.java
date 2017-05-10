package egaprasetianti.finalproject;

/**
 * Created by Ega Prasetianti on 5/9/2017.
 */

public class ModuleModel {
    String namaMateri, intentAct;
    int gambar;

    public String getNamaMateri() {
        return namaMateri;
    }

    public int getGambar() {
        return gambar;
    }

    public String getIntentAct() {
        return intentAct;
    }

    public ModuleModel(String namaMateri, int gambar, String intentAct){
        this.namaMateri = namaMateri;
        this.gambar = gambar;
        this.intentAct = intentAct;
    }
}
