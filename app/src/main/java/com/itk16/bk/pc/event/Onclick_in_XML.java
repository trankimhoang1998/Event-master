package com.itk16.bk.pc.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Onclick_in_XML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void bt_tong2so(View view) {
        EditText edt_a = (EditText) findViewById(R.id.edt_a);
        int a = Integer.parseInt(edt_a.getText()+"");
        EditText edt_b = (EditText) findViewById(R.id.edt_b);
        int b = Integer.parseInt(edt_b.getText()+"");
        TextView kq = (TextView) findViewById(R.id.kq);
        kq.setText((a+b)+"");
    }
}

