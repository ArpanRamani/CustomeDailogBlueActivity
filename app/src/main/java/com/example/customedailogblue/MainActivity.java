package com.example.customedailogblue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitView();
    }

    private void InitView() {


        Dialog dialog = new Dialog(MainActivity.this);

        dialog.setContentView(R.layout.dialog_custom);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

        dialog.show();


    }
}