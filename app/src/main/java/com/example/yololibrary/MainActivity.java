package com.example.yololibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.mylibrary.YoloTest;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        String strPath=YoloTest.INSTANCE.getModelPath(this);

        textView.setText("path: "+strPath);

//        Log.i("AssetPathIs","path: "+YoloTest.INSTANCE.getModelPath(this));

    }
}