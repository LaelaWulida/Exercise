package com.example.exercise;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword, edBelumDaftar;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin.findViewById(R.id.button);
        edemail.findViewById(R.id.edEmail);
        edpassword.findViewById(R.id.edPassword);
        edBelumDaftar.findViewById(R.id.belumterdaftar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "laela@gmail.com";
                String pass = "1234";

                if (nama.isEmpty() || password.isEmpty()) {
                    //membuat variable toast dan menampilkan pesan "edittext tidak boleh kosong"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib diisi!!!",
                            Toast.LENGTH_LONG);
                } else {
                    //mengecek apakah isi dari email dan password
                    if (nama.equals(email) && password.equals(pass)) {
                        //membuat variabel toast dan menampilkan pesan "login sukses"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();
                        b.putString("a", nama.trim());
                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(),Home_Activity.class);
                        i.putExtras(b);
                        startActivity(i);
                    } else {
                        //membuat variable toast dan membuat toast dan menampilkan pesan "login gagal
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);

                        t.show();
                    }
                }
            }
        });
    }
}