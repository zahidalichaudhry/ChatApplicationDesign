package com.thinkgenuix.chatapplicationdesign.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thinkgenuix.chatapplicationdesign.Contact_Detail;
import com.thinkgenuix.chatapplicationdesign.R;

/**
 * Created by CH-Hamza on 2/21/2018.
 */




public class Contact_Adapter extends RecyclerView.Adapter<Contact_Adapter.MyViewHolder> {

    private int size;
    Activity activity;

    public Contact_Adapter(int size, Context context) {
        this.size = size;
        activity = (Activity) context;
    }

    @Override
    public Contact_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new Contact_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Contact_Adapter.MyViewHolder holder, final int position)
    {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (activity,Contact_Detail.class);
                activity.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return size;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);

        }

    }
}


