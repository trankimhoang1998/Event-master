package com.itk16.bk.pc.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edt_a, edt_b;
    TextView kq;
    Button bt_tong2so;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Activity is listener

        edt_a = (EditText) findViewById(R.id.edt_a);
        edt_b = (EditText) findViewById(R.id.edt_b);
        kq = (TextView) findViewById(R.id.kq);
        bt_tong2so = (Button) findViewById(R.id.bt_tong2so);
        bt_tong2so.setOnClickListener(this);

        // Anonymous listener
//        Button bt_tong2so = (Button) findViewById(R.id.bt_tong2so);
//        bt_tong2so.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText edt_a = (EditText) findViewById(R.id.edt_a);
//                int a = Integer.parseInt(edt_a.getText()+"");
//                EditText edt_b = (EditText) findViewById(R.id.edt_b);
//                int b = Integer.parseInt(edt_b.getText()+"");
//                TextView kq = (TextView) findViewById(R.id.kq);
//                kq.setText((a+b)+"");
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(edt_a.getText()+"");
        int b = Integer.parseInt(edt_b.getText()+"");
        kq.setText((a+b)+"");
    }

    // onclick_in_xml
//    public void bt_tong2so(View view) {
//        EditText edt_a = (EditText) findViewById(R.id.edt_a);
//        int a = Integer.parseInt(edt_a.getText()+"");
//        EditText edt_b = (EditText) findViewById(R.id.edt_b);
//        int b = Integer.parseInt(edt_b.getText()+"");
//        TextView kq = (TextView) findViewById(R.id.kq);
//        kq.setText((a+b)+"");
//    }


}
