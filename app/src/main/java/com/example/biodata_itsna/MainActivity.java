package com.example.biodata_itsna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telepon(View view){
        Uri uri = Uri.parse("tel:0895367608879");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void alamat(View view) {
        Uri uri = Uri.parse("https://goo.gl/maps/pqMBDDVXhE8No2Hy7");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri );
        startActivity(it);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"hasanmaulana453@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Halo Itsna");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}