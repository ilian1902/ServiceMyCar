package com.power.ilian.servicemycar.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.power.ilian.servicemycar.R;

import java.io.FileOutputStream;

/**
 * Created by Ilian on 16/01/2016.
 */


public class AddCarFragment extends android.support.v4.app.Fragment {

    private ViewGroup mContainerView;
    public final static String BRAND = "";
    public final static String Model = "text";
    public final static String Image  = "src";
    public final static String Km = "number";

    private Context mContext;
    private Bundle args;
    private View rootView;
    private android.support.v4.app.Fragment fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.add_car_fragment, container, false);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mContainerView = (ViewGroup)rootView.findViewById(R.id.sv_main);






        Button btnAddImage = (Button)rootView.findViewById(R.id.btn_addPhoto);
        if (btnAddImage.getId() == R.id.btn_addPhoto){
            Intent photo = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            photo.getAction();
        }


        Button btnSave = (Button)rootView.findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.btn_save){

                    EditText tvBrand = (EditText)rootView.findViewById(R.id.et_brand);
                    tvBrand.setOnClickListener(new SavePreferenceClickLisener());
                    // Save model
                    EditText tvModel = (EditText)rootView.findViewById(R.id.et_model);
                    tvModel.setOnClickListener(new SavePreferenceClickLisener());
                    //Save KM
                    EditText etKM = (EditText)rootView.findViewById(R.id.et_km);
                    etKM.setOnClickListener(new SavePreferenceClickLisener());

                    String brandKey = getString(R.string.et_brand);
                    String valueBrand = getActivity().getPreferences(Context.MODE_PRIVATE).getString(brandKey, "Non existen");
                    valueBrand.toString();
                    fragment = new HistoryFragment();
                    args = getArguments();
                   // args.putString(HomeFragment.BRAND, valueBrand);
                    fragment.setArguments(args);
                }
            }
        });
        return  rootView;
    }
    private class SaveToFIleClickLisener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String brand = ((EditText)rootView.findViewById(R.id.et_brand)).getText().toString();
            String model = ((EditText)rootView.findViewById(R.id.et_model)).getText().toString();
            String km = ((EditText)rootView.findViewById(R.id.et_km)).getText().toString();

            FileOutputStream outputStream;
            try {
                outputStream = getContext().openFileOutput("File_Name", Context.MODE_APPEND);
                outputStream.write(brand.getBytes());
                outputStream.write(model.getBytes());
                outputStream.write(km.getBytes());
                outputStream.close();

                Toast.makeText(getContext(), "Saved car", Toast.LENGTH_LONG).show();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
    private class GetPreferenceClickLisener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String brandKey = getString(R.string.et_brand);
            String valueBrand = getActivity().getPreferences(Context.MODE_PRIVATE).getString(brandKey, "Non existen");
        }
    }
}
