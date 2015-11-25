package com.ezgenius.easylearning;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by moo on 11/25/2015 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper {

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

    private static final String CREATE_EXERCISE_TABLE = "create table exerciseTABLE (" +
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

        //For UserTABLE
        String[] strUser = new String[10];
        strUser[0] = "insert into userTABLE values (null, 'user1', '12345', 'นักเรียน1', 'n/a', 'n/a');";
        strUser[1] = "insert into userTABLE values (null, 'user2', '12345', 'นักเรียน2', 'n/a', 'n/a');";
        strUser[2] = "insert into userTABLE values (null, 'user3', '12345', 'นักเรียน3', 'n/a', 'n/a');";
        strUser[3] = "insert into userTABLE values (null, 'user4', '12345', 'นักเรียน4', 'n/a', 'n/a');";
        strUser[4] = "insert into userTABLE values (null, 'user5', '12345', 'นักเรียน5', 'n/a', 'n/a');";
        strUser[5] = "insert into userTABLE values (null, 'user6', '12345', 'นักเรียน6', 'n/a', 'n/a');";
        strUser[6] = "insert into userTABLE values (null, 'user7', '12345', 'นักเรียน7', 'n/a', 'n/a');";
        strUser[7] = "insert into userTABLE values (null, 'user8', '12345', 'นักเรียน8', 'n/a', 'n/a');";
        strUser[8] = "insert into userTABLE values (null, 'user9', '12345', 'นักเรียน9', 'n/a', 'n/a');";
        strUser[9] = "insert into userTABLE values (null, 'user10', '12345', 'นักเรียน10', 'n/a', 'n/a');";

        for (int i = 0; i < strUser.length; i++) {

            db.execSQL(strUser[i]);

        }   //for

        //For contentTABLE
        String[] strContent = new String[10];
        strContent[0] = "insert into contentTABLE values(null, 'วิดีโอที่ 1', '1', '1');";
        strContent[1] = "insert into contentTABLE values(null, 'วิดีโอที่ 2', '2', '2');";
        strContent[2] = "insert into contentTABLE values(null, 'วิดีโอที่ 3', '3', '3');";
        strContent[3] = "insert into contentTABLE values(null, 'วิดีโอที่ 4', '4', '4');";
        strContent[4] = "insert into contentTABLE values(null, 'วิดีโอที่ 5', '5', '5');";
        strContent[5] = "insert into contentTABLE values(null, 'วิดีโอที่ 6', '6', '6');";
        strContent[6] = "insert into contentTABLE values(null, 'วิดีโอที่ 7', '7', '7');";
        strContent[7] = "insert into contentTABLE values(null, 'วิดีโอที่ 8', '8', '8');";
        strContent[8] = "insert into contentTABLE values(null, 'วิดีโอที่ 9', '9', '9');";
        strContent[9] = "insert into contentTABLE values(null, 'วิดีโอที่ 10', '10', '10');";

        for (int i = 0; i < strContent.length; i++) {

            db.execSQL(strContent[i]);

        }   //for

        //For exerciseTABLE
        String[] strExercise = new String[10];
        strExercise[0] = "insert into exerciseTABLE values(null, '1.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[1] = "insert into exerciseTABLE values(null, '2.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[2] = "insert into exerciseTABLE values(null, '3.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[3] = "insert into exerciseTABLE values(null, '4.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[4] = "insert into exerciseTABLE values(null, '5.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[5] = "insert into exerciseTABLE values(null, '6.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[6] = "insert into exerciseTABLE values(null, '7.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[7] = "insert into exerciseTABLE values(null, '8.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[8] = "insert into exerciseTABLE values(null, '9.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";
        strExercise[9] = "insert into exerciseTABLE values(null, '10.นี่คืออะไร?', 'ตัวเลือก1', 'ตัวเลือก2', 'ตัวเลือก3', 'ตัวเลือก4');";

        for (int i = 0; i < strExercise.length; i++) {

            db.execSQL(strExercise[i]);

        }   //for


    }   // onCreate

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   // Main Class
