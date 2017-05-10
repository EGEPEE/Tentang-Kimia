package egaprasetianti.finalproject;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Ega Prasetianti on 5/10/2017.
 */

public class UnsurAdapter extends RecyclerView.Adapter<UnsurAdapter.MyViewHolder> {


    List<UnsurModel> unsurModellist;
    Context context;

    public  UnsurAdapter(Context context, List<UnsurModel> animalModellist){
        this.unsurModellist = animalModellist;
        this.context=context;
    }

    @Override
    public UnsurAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutunsur,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UnsurAdapter.MyViewHolder holder, int position) {
        final UnsurModel animalModel = unsurModellist.get(position);
        holder.namaunsur.setText(animalModel.getNamaUnsur());
        holder.gambarunsur.setImageResource(animalModel.getGambar());
        holder.penjelasan.setText(animalModel.getPenjelasan());
    }

    @Override
    public int getItemCount() {
        return unsurModellist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namaunsur, penjelasan;
        ImageView gambarunsur;

        public MyViewHolder(View itemView){
            super(itemView);

            namaunsur = (TextView) itemView.findViewById(R.id.namaunsur);
            penjelasan = (TextView) itemView.findViewById(R.id.penjelasan);
            gambarunsur = (ImageView) itemView.findViewById(R.id.gambarunsur);
        }
    }
}
