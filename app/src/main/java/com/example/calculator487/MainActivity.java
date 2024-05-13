package com.example.calculator487;

import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edt1,edt2;
    private TextView txtans;
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);

        txtans = findViewById(R.id.txtans);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(edt1.getText().toString());
                secondValue = Integer.parseInt(edt2.getText().toString());
                ans = firstValue +secondValue;
                txtans.setText("ans is " +ans);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(edt1.getText().toString());
                secondValue = Integer.parseInt(edt2.getText().toString());
                ans = firstValue-secondValue;
                txtans.setText("ans is "+ans);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(edt1.getText().toString());
                secondValue = Integer.parseInt(edt2.getText().toString());
                ans = firstValue * secondValue ;
                txtans.setText("ans is "+ans);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(edt1.getText().toString());
                secondValue = Integer.parseInt(edt2.getText().toString());
                ans =  firstValue/secondValue;
                txtans.setText("ans is "+ans);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
