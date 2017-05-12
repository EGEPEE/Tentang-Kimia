package egaprasetianti.finalproject;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Ega Prasetianti on 5/9/2017.
 */

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.MyViewHolder>{

    List<ModuleModel> moduleModelList;
    Context context;

    public ModuleAdapter(Context context, List<ModuleModel> moduleModelList){
        this.moduleModelList = moduleModelList;
        this.context = context;
    }
    @Override
    public ModuleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutmodule, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ModuleAdapter.MyViewHolder holder, int position) {
        final ModuleModel moduleModel = moduleModelList.get(position);
        holder.judul.setText(moduleModel.getNamaMateri());
        holder.gambar.setImageResource(moduleModel.getGambar());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                Intent i;
                switch (moduleModel.getIntentAct()) {
                    case "spsActivity":
                        i = new Intent(context, SpsActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(i);
                        break;
                    case "perkembanganActivity":
                        i = new Intent(context, PerkembanganActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(i);
                        break;
                    case "kuantumActivity":
                        i = new Intent(context, KuantumActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return moduleModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

         TextView judul;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView){
            super(itemView);

            judul = (TextView) itemView.findViewById(R.id.judulmodule);
            gambar = (ImageView) itemView.findViewById(R.id.gambarmodule);
            layout = (LinearLayout) itemView.findViewById(R.id.layoutmodule);
        }
    }
}
