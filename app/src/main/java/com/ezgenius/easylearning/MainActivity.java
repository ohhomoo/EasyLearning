package com.ezgenius.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE objManageTABLE;
    private EditText userEditText, passwordEditText;
    private String userString, passwordString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();


        // Connected Database
        objManageTABLE = new ManageTABLE(this);

    }   // onCreate

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);

    }

    public void clickLogin(View view) {

        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        if (userString.equals("")||passwordString.equals("")) {

            //Have Space
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(MainActivity.this, "มีช่องว่างนะครับ", "กรุณากรอกให้ครบทุกช่อง");

        } else {

            //No Space
            checkUser();

        }

    }   // clickLogin

    private void checkUser() {

        try {

            String[] strMyResult = objManageTABLE.searchUser(userString);

            //Check Password

            if (passwordString.equals(strMyResult[2])) {

                //Intent to Service
                Intent objIntent = new Intent(MainActivity.this, HubActivity.class);
                startActivity(objIntent);
                finish();

            } else {

                //Password False
                MyAlertDialog objAlertDialog = new MyAlertDialog();
                objAlertDialog.myDialog(MainActivity.this, "Password False", "Please Try Again Password False");

            }

        } catch (Exception e) {

            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(MainActivity.this, "No This User", "No" + userString + "in my Database");
        }

    }   // checkUser


}   // Main Class
