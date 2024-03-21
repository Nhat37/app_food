package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.foodViewHolder>{
    private Context mContext;
    private List<food> mListFood;

    public foodAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<food> list){ //set du lieu cho adapter
        this.mListFood = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public foodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item,parent,false);
        return new foodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodViewHolder holder, int position) {//set du lieu de hien thi len
        food f = mListFood.get(position);
        if(f == null) return;
        holder.imageFood.setImageResource(f.getResourceImage());
        holder.tvName.setText(f.getName());
        holder.price.setText(f.getPrice());
    }

    @Override
    public int getItemCount() {
       if(mListFood != null){
           return mListFood.size();
       }
       return 0;
    }

    public class foodViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageFood;
        private TextView tvName;
        private TextView price;
        public foodViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFood = itemView.findViewById(R.id.img_food);
            tvName = itemView.findViewById(R.id.tv_name);
            price = itemView.findViewById(R.id.tv_price);
        }
    }
}
