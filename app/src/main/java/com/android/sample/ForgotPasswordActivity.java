package com.android.sample;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etNewPassword;
    private EditText etConfirmPassword;
    private TextView tvSuccessMessage;
    private LinearLayout llParentLayout;
    private TextInputLayout tilUsername;
    private TextInputLayout tilNewPass;
    private TextInputLayout tilCnfPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etUsername = (EditText) findViewById(R.id.tv_username);
        etNewPassword = (EditText) findViewById(R.id.tv_new_password);
        etConfirmPassword = (EditText) findViewById(R.id.tv_cnf_password);
        tvSuccessMessage = (TextView) findViewById(R.id.tv_success_msg);
        llParentLayout = (LinearLayout) findViewById(R.id.ll_parent_layout);
        tilUsername = (TextInputLayout) findViewById(R.id.til_username);
        tilNewPass = (TextInputLayout) findViewById(R.id.til_new_password);
        tilCnfPass = (TextInputLayout) findViewById(R.id.til_confirm_password);

        Button btChangePwd = (Button) findViewById(R.id.btn_change_pwd);
        btChangePwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Utility.getInstance().checkForValidFields(etUsername.getText().toString(), etNewPassword.getText().toString(), etConfirmPassword.getText().toString())) {
                    llParentLayout.setVisibility(View.GONE);
                    tvSuccessMessage.setVisibility(View.VISIBLE);
                } else {
                    tilUsername.setError(getString(R.string.invalid_input));
                    tilNewPass.setError(getString(R.string.invalid_input));
                    tilCnfPass.setError(getString(R.string.invalid_input));
                }
            }
        });
    }
}
