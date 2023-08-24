package com.example.a24_8_2023;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickListener implements View.OnClickListener{

    Context c;

    public MyClickListener(Context c){
        this.c = c;
    }

    @Override
    public  void OnClick(View view){
        Toast.makeText(c, "Helloooo", Toast.LENGTH_SHORT).show();
    }
}
