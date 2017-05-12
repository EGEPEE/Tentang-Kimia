package egaprasetianti.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ModuleActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ModuleModel moduleModel;
    ModuleAdapter moduleAdapter;
    List<ModuleModel> moduleModelList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerViewmodule);
        moduleAdapter = new ModuleAdapter(getApplicationContext(),moduleModelList);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(moduleAdapter);
        persiapanData();
    }
    void persiapanData(){
        String [] namaMateri = {"Sistem Periodik Unsur", "Perkembangan Sistem Periodik", "Bilangan Kuantum"};
        int [] gambar = {R.drawable.imgflash, R.drawable.imgrank, R.drawable.imgkuantum};
        String [] IntentAct = {"spsActivity", "perkembanganActivity", "kuantumActivity"};

        for(int i=0; i < namaMateri.length;i++){
            moduleModel = new ModuleModel(namaMateri[i], gambar[i], IntentAct[i]);
            moduleModelList.add(moduleModel);
        }
    }
}
