package com.power.ilian.servicemycar.DataBase;

import android.media.Image;
import android.provider.BaseColumns;

/**
 * Created by Ilian on 18/01/2016.
 */
public class AllDataBase {
    public static final class CarAded implements BaseColumns{

        public  static final String TABLE_NAME = "car";

        public  static final String COLUMN_BRAND = "brands";
        public  static final String COLUMN_MODEL = "model";
        public  static final String COLUMN_KM = "km";
        public  static final String COLUMN_IMG = "image";


    }
    public static final class AddRepair implements BaseColumns{

        public  static final String TABLE_NAME = "repair";

        public  static final String COLUMN_NAME = "name";
        public  static final String COLUMN_TYPE = "type";
        public  static final String COLUMN_KM = "km";

    }
}
