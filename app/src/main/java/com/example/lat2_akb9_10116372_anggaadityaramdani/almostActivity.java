package com.example.lat2_akb9_10116372_anggaadityaramdani;
//17 April 2019
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class almostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

    }

    public void verify (View view){
        Intent intent = new Intent(almostActivity.this, VerifyActivity.class);
        startActivity(intent);
    }

}
