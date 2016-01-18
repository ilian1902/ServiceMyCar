package com.power.ilian.servicemycar.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.power.ilian.servicemycar.Adapters.ViewPageAdapter;
import com.power.ilian.servicemycar.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeFragment extends android.support.v4.app.Fragment {
    public static final String BRAND = "Text";

    public interface onCarClickListener {
        void onCarSelected(String text);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.home_fragment, container, false);

        TextView tvBrand = (TextView) rootView.findViewById(R.id.tv_my_car_brand);
        //tvBrand.setText(args.getString(BRAND));
        //tvBrand.findViewById(R.id.et_brand);

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

    private class ReadForFileIn {

        private static final String LOG_TAG = "Erorr";

        public void Read (){
            String text = null;
            FileInputStream inputStream;
            try {
                inputStream = getContext().openFileInput("File_Name");
                text = readStream(inputStream);
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

       }
        private String readStream(FileInputStream inputStream){
            String text = null;
            BufferedReader reader = null;
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null){
                return  null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            try {
                while ((line = reader.readLine()) != null){
                    buffer.append(line + "\n");
                }
            }catch (IOException e){
                Log.e(LOG_TAG, e.getMessage());
            }
            if (buffer.length() == 0){
                return  null;
            }
            text = buffer.toString();
            return  text.toString();
        }
    }
}
