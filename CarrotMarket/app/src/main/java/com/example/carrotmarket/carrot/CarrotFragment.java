package com.example.carrotmarket.carrot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.airbnb.lottie.L;
import com.example.carrotmarket.R;

import java.util.ArrayList;

public class CarrotFragment extends Fragment {
    ListView carrot_list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_carrot, container, false);

        ArrayList<CarrotDTO> list = new ArrayList<>();
        list.add(new CarrotDTO(R.drawable.profile_round_person, R.drawable.carrot_love_launcher_round));





        carrot_list = v.findViewById(R.id.carrot_list);





        CarrotAdapter adapter = new CarrotAdapter(inflater, getContext(),list);

        carrot_list.setAdapter(adapter);

        return v;
    }
}