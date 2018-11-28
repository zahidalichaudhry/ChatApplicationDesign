package com.thinkgenuix.chatapplicationdesign.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thinkgenuix.chatapplicationdesign.Chat_Detail;
import com.thinkgenuix.chatapplicationdesign.R;

/**
 * Created by CH-Hamza on 2/21/2018.
 */




public class Chat_Adapter extends RecyclerView.Adapter<Chat_Adapter.MyViewHolder> {

    private int size;
    Activity activity;

    public Chat_Adapter(int size, Context context) {
        this.size = size;
        activity = (Activity) context;
    }

    @Override
    public Chat_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new Chat_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Chat_Adapter.MyViewHolder holder, final int position)
    {
        holder.message.setText("Last Message");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity,Chat_Detail.class);
                activity.startActivity(intent);
            }
        });

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


