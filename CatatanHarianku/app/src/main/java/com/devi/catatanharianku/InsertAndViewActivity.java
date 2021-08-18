package com.devi.catatanharianku;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InsertAndViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_and_view);

        setTitle("Catatan Baru");
    }

    public void actionSumbitNote(View view) {
        //aksi setelah submit
        //melakukan koneksi internet
        //penyimpanan file
    }
}