package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    // Deklarasi variable
    TextView namaData, prodiData, nimData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // Inisialisasi variable
        namaData = findViewById(R.id.namaData);
        nimData = findViewById(R.id.nimData);
        prodiData = findViewById(R.id.prodiData);

        // opsi 1: menerima data berupa data
//        Intent data = getIntent();
//        String nama = data.getStringExtra("keyName");
//        String nim = data.getStringExtra("keyNim");
//        String prodi = data.getStringExtra("keyProdi");
//
//        namaData.setText(nama);
//        nimData.setText(nim);
//        prodiData.setText(prodi);

        // opsi 2
        Bundle bundle = getIntent().getExtras();
        namaData.setText(bundle.getString("keyName"));
        nimData.setText(bundle.getString("keyNim"));
        prodiData.setText(bundle.getString("keyProdi"));
    }
}