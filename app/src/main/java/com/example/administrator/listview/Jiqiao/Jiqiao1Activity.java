package com.example.administrator.listview.Jiqiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.listview.Content1.Content1_1Activity;
import com.example.administrator.listview.Content1.Content1_2Activity;
import com.example.administrator.listview.Content1.Content1_3Activity;
import com.example.administrator.listview.Content1.Content1_4Activity;
import com.example.administrator.listview.Content1.Content1_5Activity;
import com.example.administrator.listview.R;

public class Jiqiao1Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiqiao1);
        init();
        click();
    }
    public void init(){
        textView1 = (TextView)findViewById(R.id.jiqiao1_line1_textview1);
        textView2=(TextView)findViewById(R.id.jiqiao1_line2_textview2);
        textView3=(TextView)findViewById(R.id.jiqiao1_line3_textview3);
        textView4=(TextView)findViewById(R.id.jiqiao1_line4_textview4);
        textView5=(TextView)findViewById(R.id.jiqiao1_line5_textview5);
    }
    public void click(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao1Activity.this,Content1_1Activity.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao1Activity.this,Content1_2Activity.class);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao1Activity.this,Content1_3Activity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao1Activity.this,Content1_4Activity.class);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao1Activity.this,Content1_5Activity.class);
                startActivity(intent);
            }
        });
    }
}
