package com.nhom03.foody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodOrderAdapter extends RecyclerView.Adapter<FoodOrderAdapter.FoodViewHolder> {

    private Context fContext;
    private List<Food> foodList;

    public FoodOrderAdapter(Context fContext) {
        this.fContext = fContext;
    }

    public  void setData(List<Food> list){
        this.foodList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_cart, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = foodList.get(position);
        if(food == null){
            return;
        }
        holder.foodImage.setImageResource(food.getfId());
        holder.foodName.setText(food.getfName());
        holder.foodPrice.setText(String.valueOf(food.getfPrice()));
    }

    @Override
    public int getItemCount() {
        if (foodList != null){
            return foodList.size();
        }
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private ImageView foodImage;
        private TextView foodName;
        private TextView foodPrice;


        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.cartView_imageIv);
            foodName = itemView.findViewById(R.id.cartView_productTv);
            foodPrice = itemView.findViewById(R.id.cartView_priceTv);

        }
    }
}
