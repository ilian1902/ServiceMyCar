package com.power.ilian.servicemycar.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ilian on 17/01/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static int db_version = 1;
    private  static String db_name = "MyCar";
    public DbHelper(Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table brands" + "( _id integer primary key autoincrement, brand_url not null);");
       // db.execSQL("create table brands" + "( _id integer primary key autoincrement, brand_url not null);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    @Override
    public synchronized void close() {
        super.close();
    }
}
