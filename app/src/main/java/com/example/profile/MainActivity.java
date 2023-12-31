package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView namaData, nimData;
    EditText prodiData;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaData = findViewById(R.id.namaData);
        nimData = findViewById(R.id.nimData);
        prodiData = findViewById(R.id.prodiData);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String name = namaData.getText().toString();
                    String nim = nimData.getText().toString();
                    String prodi = prodiData.getText().toString();

                    if(prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Program Studi Harus diisi!", Toast.LENGTH_SHORT).show();
                    } else {
                        // Opsi 1
//                        Intent i = new Intent(MainActivity.this, BiodataActivity.class);
//                        i.putExtra("keyName", name);
//                        i.putExtra("keyNim", nim);
//                        i.putExtra("keyProdi", prodi);
//                        startActivity(i);

                        // opsi 2
                        Bundle bundle = new Bundle();
                        bundle.putString("keyName", name);
                        bundle.putString("keyNim", nim);
                        bundle.putString("keyProdi", prodi);
                        Intent i = new Intent(MainActivity.this, BiodataActivity.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error, TRY AGAIN!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}