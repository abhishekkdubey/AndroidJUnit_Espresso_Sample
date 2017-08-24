package com.android.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText tvUsername;
    private EditText tvPass;
    private TextInputLayout tilUsername;
    private TextInputLayout tilPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvUsername = (EditText) findViewById(R.id.tv_username);
        tvPass = (EditText) findViewById(R.id.tv_password);
        tilUsername = (TextInputLayout) findViewById(R.id.til_username);
        tilPass = (TextInputLayout) findViewById(R.id.til_password);
        findViewById(R.id.btn_sign_in).setOnClickListener(this);
        findViewById(R.id.tv_forgot_pwd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                if (Utility.getInstance().checkForValidFields(tvUsername.getText().toString(), tvPass.getText().toString())) {
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra(Utility.USER_DATA, tvUsername.getText().toString());
                    startActivity(intent);
                } else {
                    tilUsername.setError(getString(R.string.invalid_input));
                    tilPass.setError(getString(R.string.invalid_input));
                }
                break;
            case R.id.tv_forgot_pwd:
                Intent intent = new Intent(this, ForgotPasswordActivity.class);
                startActivity(intent);
                LoginActivity.this.finish();
                break;
            default:
                break;
        }

    }
}
