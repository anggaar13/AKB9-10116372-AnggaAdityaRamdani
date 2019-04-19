package com.example.lat2_akb9_10116372_anggaadityaramdani;
//17 April 2019
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.lat2_akb9_10116372_anggaadityaramdani.R;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
    public void Home (View view){
        Intent intent = new Intent(VerifyActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
