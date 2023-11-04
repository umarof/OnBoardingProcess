package com.example.onboardingprocess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VerifyAccountActivity extends AppCompatActivity {

    private TextView verifyBtn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        verifyBtn2 = findViewById(R.id.verifyBtn2);

        verifyBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), CreateNewPassword.class);
                startActivity(intent);

            }
        });


    }

    public void backBtnClicked (View view) {
        finish();
    }
}
