package com.nhom03.foody;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager2 mViewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        myViewPagerAdapter = new MyViewPagerAdapter(this);
        mViewPager.setAdapter(myViewPagerAdapter);
        new TabLayoutMediator(mTabLayout, mViewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setCustomView(R.layout.home_item);
                    break;
                case 1:
                    tab.setCustomView(R.layout.restaurant_item);
                    break;
                case 2:
                    tab.setCustomView(R.layout.food_item);
                    break;
                case 3:
                    tab.setCustomView(R.layout.profile_item);
                    break;
            }
        }).attach();
    }
}
