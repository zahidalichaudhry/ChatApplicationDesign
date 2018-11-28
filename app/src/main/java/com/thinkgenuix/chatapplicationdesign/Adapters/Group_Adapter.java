package com.thinkgenuix.chatapplicationdesign.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thinkgenuix.chatapplicationdesign.R;

/**
 * Created by CH-Hamza on 2/21/2018.
 */




public class Group_Adapter extends RecyclerView.Adapter<Group_Adapter.MyViewHolder> {

    private int size;
    Activity activity;

    public Group_Adapter(int size, Context context) {
        this.size = size;
        activity = (Activity) context;
    }

    @Override
    public Group_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group, parent, false);
        return new Group_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Group_Adapter.MyViewHolder holder, final int position)
    {

    }

    @Override
    public int getItemCount() {
        return size;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView message;

        public MyViewHolder(View itemView) {
            super(itemView);
            message = (TextView) itemView.findViewById(R.id.message);

        }

    }
}


