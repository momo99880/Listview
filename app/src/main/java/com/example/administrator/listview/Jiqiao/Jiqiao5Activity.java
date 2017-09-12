package com.example.administrator.listview.Jiqiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.listview.Content5.Content5_1Activity;
import com.example.administrator.listview.Content5.Content5_2Activity;
import com.example.administrator.listview.Content5.Content5_3Activity;
import com.example.administrator.listview.Content5.Content5_4Activity;
import com.example.administrator.listview.R;

public class Jiqiao5Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiqiao5);
        init();
        click();

    }
    public void init(){
        textView1 = (TextView)findViewById(R.id.jiqiao5_line1_textview1);
        textView2=(TextView)findViewById(R.id.jiqiao5_line2_textview2);
        textView3=(TextView)findViewById(R.id.jiqiao5_line3_textview3);
        textView4=(TextView)findViewById(R.id.jiqiao5_line4_textview4);
    }
    public void click(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao5Activity.this,Content5_1Activity.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao5Activity.this,Content5_2Activity.class);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao5Activity.this,Content5_3Activity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao5Activity.this,Content5_4Activity.class);
                startActivity(intent);
            }
        });
    }
}
