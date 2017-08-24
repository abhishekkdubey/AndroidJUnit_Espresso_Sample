package com.android.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvUsernameVal = (TextView) findViewById(R.id.tv_username_value);
        if (getIntent().hasExtra(Utility.USER_DATA)) {
            tvUsernameVal.setText(getIntent().getStringExtra(Utility.USER_DATA));
        }
    }
}
