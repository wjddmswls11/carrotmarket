package com.example.carrotmarket.town;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carrotmarket.R;

public class TownFragment extends Fragment {
    RecyclerView recview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_town, container, false);
        recview = v.findViewById(R.id.recview);


        TownAdapter adapter = new TownAdapter(inflater);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
          getContext(), RecyclerView.VERTICAL,false

        );


        recview.setAdapter(adapter);
        recview.setLayoutManager(manager);
        return v;
    }
}