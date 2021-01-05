package com.example.viewpager2.Fragments;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpager2.MainActivity;
import com.example.viewpager2.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    public static ArrayList<Images> images = new ArrayList<>();

    public Adapter(Context context) {
        this.context = context;
    }

    @NonNull
        @Override
        public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        public void onBindViewHolder (@NonNull ViewHolder holder,int position){

            holder.text1.setText(images.get(position).getMsg());        //for binding text from array list

            Glide.with(context)
                    .asBitmap()                                    // for binding image from URl to view
                    .load(images.get(position).getImageURL())
                    .into(holder.image);

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Position : " + position + " Selected", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(context, MainActivity2.class);
                    intent.putExtra("MESSAGE", images.get(position).getMsg());
                    context.startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount () {
            return images.size();
        }

        public void setImages (ArrayList < Images > images) {
            this.images = images;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            private ImageView image;
            private TextView text1;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                text1 = itemView.findViewById(R.id.textview);
                image = itemView.findViewById(R.id.imageview);
            }
        }
    }