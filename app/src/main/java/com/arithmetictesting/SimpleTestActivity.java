package com.arithmetictesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleTestActivity extends AppCompatActivity {
       private EditText etText;
       private Button btnClick;
       private TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_test);

        etText = findViewById(R.id.etText);
        btnClick = findViewById(R.id.btnClick);
        tvDisplay = findViewById(R.id.tvDisplay);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(etText.getText().toString());
            }
        });

    }
}
