package com.thinkgenuix.chatapplicationdesign.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thinkgenuix.chatapplicationdesign.Adapters.Chat_Adapter;
import com.thinkgenuix.chatapplicationdesign.Adapters.Group_Adapter;
import com.thinkgenuix.chatapplicationdesign.R;


public class Groups extends Fragment {


    RecyclerView recyclerView;
    Group_Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    public Groups() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_group, container, false);


        recyclerView=(RecyclerView)view.findViewById(R.id.chat);
        layoutManager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setNestedScrollingEnabled(false);
//        recyclerView.setItemAnimator(newa DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        adapter=new Group_Adapter(3,getActivity());
        recyclerView.setAdapter(adapter);
        return view;
    }

}
