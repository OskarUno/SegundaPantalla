package com.awakelab.oskar.segundapantalla;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static  final String TAG = "Actividad 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Button btnPtlla2 = findViewById(R.id.btnPantalla2);

        btnPtlla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(MainActivity.this, Pantalla2.class);
                startActivity(explicitIntent);
            }
        });
    }
}