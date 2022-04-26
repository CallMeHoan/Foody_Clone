package com.nhom03.foody.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nhom03.foody.Food;
import com.nhom03.foody.FoodAdapter;
import com.nhom03.foody.R;

import java.util.ArrayList;
import java.util.List;

public class RestaurantFragment extends Fragment {
    private RecyclerView foodRcv;
    private FoodAdapter foodAdapter;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //food adapter
        foodRcv = view.findViewById(R.id.food_rcv);
        foodAdapter = new FoodAdapter(getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
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
