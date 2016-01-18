package com.power.ilian.servicemycar.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.power.ilian.servicemycar.Adapters.ViewPageAdapter;
import com.power.ilian.servicemycar.R;

public class HomeFragment extends android.support.v4.app.Fragment{
    public static final String BRAND = "Text";

    public interface onCarClickListener {
        void onCarSelected(String text);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.home_fragment, container, false);
        Bundle args = getArguments();

        TextView tvBrand = (TextView)rootView.findViewById(R.id.tv_my_car_brand);
        //tvBrand.setText(args.getString(BRAND));

//        Button addButton = (Button)rootView.findViewById(R.id.btn_addCar);
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                android.support.v4.app.Fragment details = getFragmentManager().findFragmentById(R.id.add_car_fragment);
//                //details.getActivity();
//            }
//        });


        return rootView;
    }

}
