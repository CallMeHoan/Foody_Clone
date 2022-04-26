package com.nhom03.foody;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    private RecyclerView foodRcv;
    private FoodAdapter foodAdapter;
    private View view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodRcv = view.findViewById(R.id.cartPage_foodRcv);
        foodAdapter = new FoodAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        foodRcv.setLayoutManager(linearLayoutManager);
        foodAdapter.setData(getListFood());
        foodRcv.setAdapter(foodAdapter);
    }
    private List<Food> getListFood() {
        List<Food> list = new ArrayList<>();
        list.add(new Food(R.drawable.food, "Mon nao do", 20));
        list.add(new Food(R.drawable.food, "Mon nao do 1", 28));
        list.add(new Food(R.drawable.food, "Mon nao do 2", 30));
        list.add(new Food(R.drawable.food, "Mon nao do 4", 50));
        return list;
    }
}
