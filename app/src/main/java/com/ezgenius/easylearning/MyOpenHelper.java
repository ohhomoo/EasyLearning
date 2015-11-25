package com.ezgenius.easylearning;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by moo on 11/25/2015 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private static final String DATABASE_NAME = "Learn.db";
    private static final int DATABASE_VERSION = 1;


    private static final String CREATE_USER_TABLE = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password test," +
            "Name text, " +
            "LastDate text, " +
            "Score text);";

    private static final String CREATE_CONTENT_TABLE = "create table contentTABLE (" +
            "_id integer primary key, " +
            "Video text, " +
            "PathVideo text, " +
            "IconVideo text);";

    private static  final String CREATE_EXERCISE_TABLE = "create table exerciseTABLE (" +
            "_id integer primary key, " +
            "Question text, " +
            "Choice1 text, " +
            "Choice2 text, " +
            "Choice3 text, " +
            "Choice4 text);";


    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }   //Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_CONTENT_TABLE);
        db.execSQL(CREATE_EXERCISE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   // Main Class
