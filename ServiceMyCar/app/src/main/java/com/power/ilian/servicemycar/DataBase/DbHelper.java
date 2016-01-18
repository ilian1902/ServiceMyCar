package com.power.ilian.servicemycar.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ilian on 17/01/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static int db_version = 1;
    private  static String db_name = "myCar.db";
    public DbHelper(Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_CAR_TABLE = "CREATE TABLE " + AllDataBase.CarAded.TABLE_NAME + " (" +
                AllDataBase.CarAded._ID + " INTEGER PRIMARY KEY," +
                AllDataBase.CarAded.COLUMN_BRAND + " TEXT NOT NULL" +
                AllDataBase.CarAded.COLUMN_MODEL + " TEXT NOT NULL" +
                AllDataBase.CarAded.COLUMN_KM + " TEXT NOT NULL" +
                AllDataBase.CarAded.COLUMN_IMG + "TEXT NOT NULL" + ");";
        db.execSQL(SQL_CREATE_CAR_TABLE);
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
