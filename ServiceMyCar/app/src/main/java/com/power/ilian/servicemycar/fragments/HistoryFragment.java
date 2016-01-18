package com.power.ilian.servicemycar.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.power.ilian.servicemycar.Adapters.HistoryAdapter;
import com.power.ilian.servicemycar.DataBase.Repair;
import com.power.ilian.servicemycar.R;

import java.util.ArrayList;

public class HistoryFragment extends ListFragment {

//    private ListView listView;
//    private ArrayList<Repair> recipeArray;
//    private HistoryAdapter recipeAdapter;

//    @Override
//    public void onResume() {
//        super.onResume();
//
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        //View header = getActivity().getLayoutInflater().inflate(R.layout.listview_header_row, null);
//        View rootView = inflater.inflate(R.layout.history_fragment, container, false);
//
//        recipeArray = new ArrayList<>();
//        final DbOperations dbOperations = new DbOperations(getActivity().getApplicationContext());
//        Cursor cursor = dbOperations.getRecipesContent();
//        if (cursor.moveToFirst()) {
//            do {
//                Recipe recipe = new Recipe();
//                recipe.setRecipeId(cursor.getInt(cursor.getColumnIndex("recipe_id")));
//                recipe.setName(cursor.getString(cursor.getColumnIndex("name")));
//                recipe.setDescription(cursor.getString(cursor.getColumnIndex("description")));
//                recipe.setImage_link(cursor.getString(cursor.getColumnIndex("image_link")));
//                recipeArray.add(recipe);
//            } while (cursor.moveToNext());
//        }
//        recipeAdapter = new RecipeAdapter(getActivity(), R.layout.listview_item_row, recipeArray);
//
//        ListView listView = (ListView) rootView.findViewById(R.id.lvAllRecipes);
//        listView.addFooterView(header);
//        listView.setAdapter(recipeAdapter);
//
//        // Button for deleting Database.
//        Button btnDeleteDatabase = (Button) rootView.findViewById(R.id.btnDeleteDatabase);
//        btnDeleteDatabase.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getActivity().deleteDatabase("my_recipes.db");
//                Toast.makeText(getActivity(), "Table: recipes is deleted!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        return listView;
//    }
//
//    @Override
//    public void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//        Toast.makeText(getActivity(), "Item: " , Toast.LENGTH_SHORT).show();
//    }
//    }
}
