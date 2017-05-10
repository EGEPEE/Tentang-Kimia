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
        final String dynamic_class = moduleModel.getIntentAct();
        holder.judul.setText(moduleModel.getNamaMateri());
        holder.gambar.setImageResource(moduleModel.getGambar());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(context, (Class<?>) Class.forName(dynamic_class).newInstance());
                    context.startActivity(i);
                    // i.setClassName(context, moduleModel.getIntentAct());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    Log.e("YourParentClassName", "System can't find class with given name: " + dynamic_class, e);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView judul;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView){
            super(itemView);

            judul = (TextView) itemView.findViewById(R.id.judul);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
            layout = (LinearLayout) itemView.findViewById(R.id.layout);
        }
    }
}
