package com.ezgenius.easylearning;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by moo on 11/25/2015 AD.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;

    public static final String TABLE_USER="userTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_USER = "User";
    public static final String COLUMN_PASSWORD = "Password";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_LASTDATE = "LastDate";
    public static final String COLUMN_SCORE = "Score";

    public static final String TABLE_CONTENT = "contentTABLE";
    public static final String COLUMN_VIDEO = "Video";
    public static final String COLUMN_PATHVIDEO = "PathVideo";
    public static final String COLUMN_ICONVIDEO = "IconVideo";








    public ManageTABLE(Context context) {

        //Create & Connected Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();


    }   // Constructor



    public String[] readAllAata(int intColumn) {

        String[] strResult = null;
        Cursor objCursor = readSqLiteDatabase.query(TABLE_CONTENT,
                new  String[]{COLUMN_ID, COLUMN_VIDEO, COLUMN_PATHVIDEO, COLUMN_ICONVIDEO},
                null, null, null, null, null);

        if (objCursor != null) {

            strResult = new String[objCursor.getCount()];
            objCursor.moveToFirst();

            for (int i = 0; i < objCursor.getCount(); i++) {

                switch (intColumn) {
                    case 1:
                        strResult[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_VIDEO));
                        break;
                    case 2:
                        strResult[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_PATHVIDEO));
                        break;
                    case 3:
                        strResult[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_ICONVIDEO));
                        break;
                    default:
                        strResult[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_VIDEO));

                        break;

                }   //switch

                objCursor.moveToNext();

            }   //for

        }   // if
        objCursor.close();
        return strResult;

    }

    public String[] searchUser(String strUser) {

        try {

            String[] strResult=null;
            Cursor objCursor = readSqLiteDatabase.query(TABLE_USER,
                    new String[]{COLUMN_ID, COLUMN_USER, COLUMN_PASSWORD, COLUMN_NAME, COLUMN_LASTDATE, COLUMN_SCORE},
                    COLUMN_USER+"=?",
                    new String[]{String.valueOf(strUser)},
                    null, null, null, null);

            if (objCursor!=null) {
                if (objCursor.moveToFirst()) {

                    strResult = new String[6];
                    strResult[0] = objCursor.getString(0);
                    strResult[1] = objCursor.getString(1);
                    strResult[2] = objCursor.getString(2);
                    strResult[3] = objCursor.getString(3);
                    strResult[4] = objCursor.getString(4);
                    strResult[5] = objCursor.getString(5);


                }   //if2
            }   //if1

            objCursor.close();
            return strResult;

        } catch (Exception e) {

            return null;
        }

        //return new String[0];
    }

} // Main Class
