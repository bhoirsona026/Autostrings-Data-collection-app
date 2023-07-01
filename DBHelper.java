package com.example.autostrings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "users";
    private static final int DB_VER = 1;
    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE users(id VARCHAR(10) PRIMARY KEY, name TEXT, email TEXT, age INT)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS users");
        onCreate(sqLiteDatabase);
    }

    public boolean registerUser (String phoneno,
                                 String fname,
                                 String lname,
                                 String houseno,
                                 String city,
                                 String state,
                                 String pincode,
                                 String email,
                                 String manufacturer,
                                 String model,
                                 String year) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("phoneno", phoneno);
            contentValues.put("fname", fname);
            contentValues.put("fname", lname);
            contentValues.put("houseno", houseno);
            contentValues.put("city", city);
            contentValues.put("state", state);
            contentValues.put("pincode", pincode);
            contentValues.put("email", email);
            contentValues.put("manufacturer", manufacturer);
            contentValues.put("model", model);
            contentValues.put("year", year);
            sqLiteDatabase.insert("users", null, contentValues);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            sqLiteDatabase.close();
        }
    }
}
