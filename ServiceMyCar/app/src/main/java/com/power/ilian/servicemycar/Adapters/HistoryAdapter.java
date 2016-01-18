package com.power.ilian.servicemycar.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.power.ilian.servicemycar.DataBase.Repair;
import com.power.ilian.servicemycar.R;

import java.util.List;

/**
 * Created by Ilian on 17/01/2016.
 */
public class HistoryAdapter extends ArrayAdapter<Repair>{
    private Context context;
    private  int layoutId;
    List<Repair> data;

    public HistoryAdapter(Context context, int layoutResourceId, List<Repair> data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutId = layoutResourceId;
        this.data = data;
    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
//        View row = inflater.inflate(layoutId, null);
//        TextView tvRecipeId = (TextView) row.findViewById(R.id.txtRecipeId);
//        TextView tvName = (TextView) row.findViewById(R.id.txtTitle);
//        TextView tvDescription = (TextView) row.findViewById(R.id.txtDescription);
//        ImageView ivImage = (ImageView) row.findViewById(R.id.imgIcon);
//        tvRecipeId.setText(data.get(position).getRecipeId().toString());
//        tvName.setText(data.get(position).getName());
//        tvDescription.setText(data.get(position).getDescription());
//        //int resourceId = Activity.getResources().getIdentifier("testimage", "drawable", "your.package.name");
//        ivImage.setImageResource(getContext().getResources().getIdentifier(data.get(position).getImage_link(), "drawable", "eu.netcoms.team.radeva.dr.myrecipe"));
//        return row;
//    }
}
