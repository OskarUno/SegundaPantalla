package com.awakelab.oskar.segundapantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Pantalla2 extends AppCompatActivity {
    private static  final String TAG = "Actividad 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        Log.d(TAG, "onCreate ------------------------------");
        initListeners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart ------------------------------");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume ------------------------------");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart ------------------------------");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause ------------------------------");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop ------------------------------");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy ------------------------------");
    }

        private void initListeners() {
        Button btnLink = findViewById(R.id.btnLink);
        Button btnVolver = findViewById(R.id.btnVolver);
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(implicitIntent);
            }
        });
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}