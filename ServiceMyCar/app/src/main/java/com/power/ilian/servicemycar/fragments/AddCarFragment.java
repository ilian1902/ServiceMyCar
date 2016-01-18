package com.power.ilian.servicemycar.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.power.ilian.servicemycar.R;

/**
 * Created by Ilian on 16/01/2016.
 */


public class AddCarFragment extends Fragment {

    private ViewGroup mContainerView;
    public final static String BRAND = "";
    public final static String Model = "text";
    public final static String Image  = "src";
    public final static String Km = "number";

    private TextView tvBrand;
    private Context mContext;
    private Bundle args;
    private android.support.v4.app.Fragment fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.add_car_fragment, container, false);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mContainerView = (ViewGroup)rootView.findViewById(R.id.sv_main);
        tvBrand = (TextView)rootView.findViewById(R.id.et_brand);
        fragment = new HomeFragment();
        args = getArguments();
        args.putString(HomeFragment.BRAND, "ala bala");
        fragment.setArguments(args);


//        Button btnAddImage = (Button)rootView.findViewById(R.id.btn_addPhoto);
//        if (btnAddImage.callOnClick()){
//            mContext.getSystemService(Context.CAMERA_SERVICE);
//            DbHelper dbHelper = new DbHelper(mContext);
//
//
//            dbHelper.onCreate(SQLiteDatabase.create(null));
//
//        }
//
//
//
//
//
//
//
//        Button btnSave = (Button)rootView.findViewById(R.id.btn_save);
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (v.getId()==R.id.btn_save){
//
//                }
//            }
//        });
        return  rootView;
    }
}
