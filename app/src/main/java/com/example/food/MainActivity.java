package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvFood;
    private foodAdapter mFoodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         rcvFood = findViewById(R.id.rcv_food);
        mFoodAdapter = new foodAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvFood.setLayoutManager(gridLayoutManager);

        mFoodAdapter.setData(getListFood());
        rcvFood.setAdapter(mFoodAdapter);
    }
    private List<food> getListFood(){
        List<food> list = new ArrayList<>();
        list.add(new food(R.drawable.food_1,"DO AN 1","200"));
        list.add(new food(R.drawable.food_2,"DO AN 2","100"));
        list.add(new food(R.drawable.food_3,"DO AN 3","800"));
        list.add(new food(R.drawable.food_4,"DO AN 4","400"));

        list.add(new food(R.drawable.food_1,"DO AN 1","200"));
        list.add(new food(R.drawable.food_2,"DO AN 2","100"));
        list.add(new food(R.drawable.food_3,"DO AN 3","800"));
        list.add(new food(R.drawable.food_4,"DO AN 4","400"));

        list.add(new food(R.drawable.food_1,"DO AN 1","200"));
        list.add(new food(R.drawable.food_2,"DO AN 2","100"));
        list.add(new food(R.drawable.food_3,"DO AN 3","800"));
        list.add(new food(R.drawable.food_4,"DO AN 4","400"));

        return list;
    }
}