package com.power.ilian.servicemycar;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.power.ilian.servicemycar.Adapters.ViewPageAdapter;
import com.power.ilian.servicemycar.fragments.AddCarFragment;
import com.power.ilian.servicemycar.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity{
    ViewPager viewPager;
    ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar mActionBar = getSupportActionBar();


        mActionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);

        viewPager = (ViewPager)findViewById(R.id.view_pager);

        adapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        android.support.v7.app.ActionBar.TabListener listener = new android.support.v7.app.ActionBar.TabListener() {
            @Override
            public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction ft) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction ft) {
            }

            @Override
            public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction ft) {
            }
        };

        android.support.v7.app.ActionBar.Tab home = mActionBar.newTab();
        home.setText("Home");
        home.setTabListener(listener);
        mActionBar.addTab(home);

        android.support.v7.app.ActionBar.Tab historyRepiar = mActionBar.newTab();
        historyRepiar.setText("History Repair");
        historyRepiar.setTabListener(listener);
        mActionBar.addTab(historyRepiar);


        android.support.v7.app.ActionBar.Tab newRecipie = mActionBar.newTab();
        newRecipie.setText("Add new repair");
        newRecipie.setTabListener(listener);
        mActionBar.addTab(newRecipie);
    }


    public void navigateToFragment(View view) {
        //if (view.getId()== R.id.btn_addCar){

//            getFragmentManager().findFragmentById(R.id.add_car_fragment);
//            onAttachFragment(new AddCarFragment());
//        }
    }
}
