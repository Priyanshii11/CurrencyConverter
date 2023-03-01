 package com.priyu.currencycoverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

 public class MainActivity extends AppCompatActivity {
    Button dollar,pound,euro,yen,taka,hkdollar,ausdollar,won,yuan;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollar = findViewById(R.id.Dollar);
        pound = findViewById(R.id.Pound);
        euro = findViewById(R.id.Euro);
        yen = findViewById(R.id.Yen);
        taka = findViewById(R.id.Taka);
        hkdollar = findViewById(R.id.HKdollar);
        ausdollar = findViewById(R.id.AUSdollar);
        won = findViewById(R.id.won);
        yuan = findViewById(R.id.Yuan);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.037;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.011;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.65;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        taka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.27;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        hkdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.095;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.018;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        won.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 15.78;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        yuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.083;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
    }
}