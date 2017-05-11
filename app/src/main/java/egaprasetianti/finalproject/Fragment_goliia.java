package egaprasetianti.finalproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment_goliia extends Fragment {
    RecyclerView recyclerView;
    UnsurModel unsurModel;
    UnsurAdapter unsurAdapter;
    List<UnsurModel> unsurModelList =new ArrayList<>();

    public Fragment_goliia() {
        String [] namaUnsur = {"Berilium ( Be )", "Magnesium ( Mg )", "Kalsium ( Ca )", "Strontium ( Sr )", "Barium ( Ba )", "Radium ( Ra )"};
        int [] penjelasan = {R.string.berilium, R.string.magnesium, R.string.kalsium, R.string.strontium, R.string.barium, R.string.radium};
        int [] gambar = {R.drawable.berilium, R.drawable.magnesium, R.drawable.kalsium, R.drawable.strontium, R.drawable.barium , R.drawable.radium};

        for(int i=0;i<namaUnsur.length;i++){
            unsurModel=new UnsurModel(namaUnsur[i],penjelasan[i],gambar[i]);
            unsurModelList.add(unsurModel);}
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_goliia, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        unsurAdapter = new UnsurAdapter(getActivity(),unsurModelList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(unsurAdapter);
        new Fragment_golia();
        return view;
    }

}
