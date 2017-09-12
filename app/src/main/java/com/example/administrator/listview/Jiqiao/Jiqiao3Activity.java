package com.example.administrator.listview.Jiqiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.listview.Content3.Content3_1Activity;
import com.example.administrator.listview.Content3.Content3_2Activity;
import com.example.administrator.listview.Content3.Content3_3Activity;
import com.example.administrator.listview.Content3.Content3_4Activity;
import com.example.administrator.listview.Content3.Content3_5Activity;
import com.example.administrator.listview.Content3.Content3_6Activity;
import com.example.administrator.listview.R;

public class Jiqiao3Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiqiao3);
        init();
        click();
    }
    public void init(){
        textView1 = (TextView)findViewById(R.id.jiqiao3_line1_textview1);
        textView2=(TextView)findViewById(R.id.jiqiao3_line2_textview2);
        textView3=(TextView)findViewById(R.id.jiqiao3_line3_textview3);
        textView4=(TextView)findViewById(R.id.jiqiao3_line4_textview4);
        textView5 = (TextView)findViewById(R.id.jiqiao3_line5_textview5);
        textView6=(TextView)findViewById(R.id.jiqiao3_line6_textview6);
    }
    public void click(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao3Activity.this,Content3_1Activity.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao3Activity.this,Content3_2Activity.class);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao3Activity.this,Content3_3Activity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao3Activity.this,Content3_4Activity.class);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao3Activity.this,Content3_5Activity.class);
                startActivity(intent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao3Activity.this,Content3_6Activity.class);
                startActivity(intent);
            }
        });
    }
}
