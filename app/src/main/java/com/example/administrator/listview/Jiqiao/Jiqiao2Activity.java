package com.example.administrator.listview.Jiqiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.listview.Content2.Content2_1Activity;
import com.example.administrator.listview.Content2.Content2_2Activity;
import com.example.administrator.listview.Content2.Content2_3Activity;
import com.example.administrator.listview.Content2.Content2_4Activity;
import com.example.administrator.listview.Content2.Content2_5Activity;
import com.example.administrator.listview.Content2.Content2_6Activity;
import com.example.administrator.listview.Content2.Content2_7Activity;
import com.example.administrator.listview.Content2.Content2_8Activity;
import com.example.administrator.listview.R;

public class Jiqiao2Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiqiao2);
        init();
        click();
    }
    public void init(){
        textView1 = (TextView)findViewById(R.id.jiqiao2_line1_textview1);
        textView2=(TextView)findViewById(R.id.jiqiao2_line2_textview2);
        textView3=(TextView)findViewById(R.id.jiqiao2_line3_textview3);
        textView4=(TextView)findViewById(R.id.jiqiao2_line4_textview4);
        textView5 = (TextView)findViewById(R.id.jiqiao2_line5_textview5);
        textView6=(TextView)findViewById(R.id.jiqiao2_line6_textview6);
        textView7=(TextView)findViewById(R.id.jiqiao2_line7_textview7);
        textView8=(TextView)findViewById(R.id.jiqiao2_line8_textview8);
    }
    public void click(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_1Activity.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_2Activity.class);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_3Activity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_4Activity.class);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_5Activity.class);
                startActivity(intent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_6Activity.class);
                startActivity(intent);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_7Activity.class);
                startActivity(intent);
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao2Activity.this,Content2_8Activity.class);
                startActivity(intent);
            }
        });
    }
}
