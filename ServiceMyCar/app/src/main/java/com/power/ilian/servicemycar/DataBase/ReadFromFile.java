package com.power.ilian.servicemycar.DataBase;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ilian on 18/01/2016.
 */
public class ReadFromFile {

    private static final String LOG_TAG = "Erorr";

    public void Read (Context context){
        String text = null;
        FileInputStream inputStream;
        try {
            inputStream = context.openFileInput("File_Name");
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
