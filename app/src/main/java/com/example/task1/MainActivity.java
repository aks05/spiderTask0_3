package com.example.task1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etWght, etHeight;
    private TextView tvBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWght=findViewById(R.id.etWght);
        etHeight=findViewById(R.id.etHeight);
        tvBMI=findViewById(R.id.tvBMI);
    }

    public void calcBMI(View view) {
        if (etHeight.getText().length()==0 || etWght.getText().length()==0 ||
            Float.parseFloat(etWght.getText().toString())==0 || Float.parseFloat(etHeight.getText().toString())==0) {
            Context context = getApplicationContext();
            CharSequence text = "Enter non-zero value";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        else {

            float Wght=Float.parseFloat(etWght.getText().toString());
            float Height=Float.parseFloat(etHeight.getText().toString());
            float BMI=Wght/(Height*Height);
            tvBMI.setText("Your BMI is : "+BMI);
        }
    }
}
