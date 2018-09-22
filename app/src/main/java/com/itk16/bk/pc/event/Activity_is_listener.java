package com.itk16.bk.pc.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_is_listener extends AppCompatActivity implements View.OnClickListener{
    EditText edt_a, edt_b;
    TextView kq;
    Button bt_tong2so;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_a = (EditText) findViewById(R.id.edt_a);
        edt_b = (EditText) findViewById(R.id.edt_b);
        kq = (TextView) findViewById(R.id.kq);
        bt_tong2so = (Button) findViewById(R.id.bt_tong2so);
        bt_tong2so.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(edt_a.getText()+"");
        int b = Integer.parseInt(edt_b.getText()+"");
        kq.setText((a+b)+"");
    }
}
