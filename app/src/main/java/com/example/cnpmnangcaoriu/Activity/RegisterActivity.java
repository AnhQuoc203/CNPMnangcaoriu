package com.example.cnpmnangcaoriu.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cnpmnangcaoriu.R;

public class RegisterActivity extends AppCompatActivity {
    private ImageView imgRegister;
    private EditText edtEmail, edtPassword, edtRepassword;
    private TextView dangNhap;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initUi();
        initListener();
    }

    private void initUi() {
        imgRegister = findViewById(R.id.img_register);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtRepassword = findViewById(R.id.edtRepassword);
        btnRegister = findViewById(R.id.btnRegister);
        dangNhap = findViewById(R.id.dangNhap);
    }
    private void initListener() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickRegister();
            }
        });
    }

    private void onClickRegister() {
        String emailValue = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();
        String repasswordValue = edtRepassword.getText().toString().trim();

        if (TextUtils.isEmpty(emailValue) || TextUtils.isEmpty(password) ||  TextUtils.isEmpty(repasswordValue)) {
            Toast.makeText(getApplicationContext(),"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }
}