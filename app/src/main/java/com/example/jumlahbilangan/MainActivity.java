package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.TriggerEvent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit1;
    private EditText edit2;
    private EditText jumlah;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        triggerEvent();
    }

    private void initUI(){
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        jumlah = (EditText) findViewById(R.id.jumlah);
        btn1 = (Button) findViewById(R.id.btn1);
    }

    private void triggerEvent(){
        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(edit1.getText().toString());
        int angka2 = Integer.parseInt(edit2.getText().toString());

        int total = angka1+angka2;

        jumlah.setText(total+"");
    }
}
