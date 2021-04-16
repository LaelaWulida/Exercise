package com.example.exercise;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Pendaftaran extends AppCompatActivity {
    EditText edalamat, ednama, edEmail, edPassword, edrepass;
    TextView tPendaftaran, tJenisKelamin, tAgama;
    Button btnBatal, btnDaftar;
    CheckBox cLaki, cPerempuan, cIslam, cKristen, cKatolik, cHindu, cBudha, cPenganutKepercayan, cKonghuchu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        edalamat=findViewById(R.id.edalamat);
        edEmail=findViewById(R.id.edEmail);
        ednama=findViewById(R.id.ednama);
        edPassword=findViewById(R.id.edPassword);
        edrepass=findViewById(R.id.edrepass);
        tPendaftaran=findViewById(R.id.tPendaftaran);
        tJenisKelamin=findViewById(R.id.tJenisKelamin);
        tAgama=findViewById(R.id.tAgama);
        btnDaftar=findViewById(R.id.btnDaftar);
        btnBatal=findViewById(R.id.btnBatal);
        cBudha=findViewById(R.id.cBudha);
        cHindu=findViewById(R.id.cHindu);
        cIslam=findViewById(R.id.cIslam);
        cKatolik=findViewById(R.id.cKatolik);
        cKonghuchu=findViewById(R.id.cKonghuchu);
        cKristen=findViewById(R.id.cKristen);
        cPenganutKepercayan=findViewById(R.id.cPenganutKepercayaan);
        cLaki=findViewById(R.id.cLaki);
        cPerempuan=findViewById(R.id.cPerempuan);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edalamat.getText().toString().isEmpty() ||
                        edEmail.getText().toString().isEmpty() ||
                        ednama.getText().toString().isEmpty() ||
                        edPassword.getText().toString().isEmpty() ||
                        edrepass.getText().toString().isEmpty() ||
                        cBudha.callOnClick() ||
                        cHindu.callOnClick() ||
                        cIslam.callOnClick() ||
                        cKatolik.callOnClick() ||
                        cKristen.callOnClick() ||
                        cKonghuchu.callOnClick() ||
                        cPenganutKepercayan.callOnClick() ||
                        cLaki.callOnClick() ||
                        cPerempuan.callOnClick())
                {
                    Snackbar.make(view, "Wajib isi seluruh data!!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edPassword.getText().toString().equals(edrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil",
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), Pendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}