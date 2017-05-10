package egaprasetianti.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment_golia extends Fragment {
    RecyclerView recyclerView;
    UnsurModel unsurModel;
    UnsurAdapter unsurAdapter;
    List<UnsurModel> unsurModelList =new ArrayList<>();


    public Fragment_golia() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_golia, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        unsurAdapter = new UnsurAdapter(getActivity(),unsurModelList);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(unsurAdapter);
        persiapanData();
        return view;
    }

    void persiapanData(){
        String [] namaUnsur = {"Hidrogen", "Litium"};
        int [] penjelasan = {R.string.hidrogen, R.string.litium};
        int [] gambar = {R.drawable.hidrogen, R.drawable.litium};

        for(int i=0;i<namaUnsur.length;i++){
            unsurModel=new UnsurModel(namaUnsur[i],penjelasan[i],gambar[i]);
            unsurModelList.add(unsurModel);}
    }

}
