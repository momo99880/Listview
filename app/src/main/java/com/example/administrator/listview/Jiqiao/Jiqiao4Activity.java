package com.example.administrator.listview.Jiqiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.listview.Content4.Content4_1Activity;
import com.example.administrator.listview.Content4.Content4_2Activity;
import com.example.administrator.listview.Content4.Content4_3Activity;
import com.example.administrator.listview.Content4.Content4_4Activity;
import com.example.administrator.listview.Content4.Content4_5Activity;
import com.example.administrator.listview.Content4.Content4_6Activity;
import com.example.administrator.listview.Content4.Content4_7Activity;
import com.example.administrator.listview.R;

public class Jiqiao4Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiqiao4);
        init();
        click();
    }
    public void init(){
        textView1 = (TextView)findViewById(R.id.jiqiao4_line1_textview1);
        textView2=(TextView)findViewById(R.id.jiqiao4_line2_textview2);
        textView3=(TextView)findViewById(R.id.jiqiao4_line3_textview3);
        textView4=(TextView)findViewById(R.id.jiqiao4_line4_textview4);
        textView5 = (TextView)findViewById(R.id.jiqiao4_line5_textview5);
        textView6=(TextView)findViewById(R.id.jiqiao4_line6_textview6);
        textView7=(TextView)findViewById(R.id.jiqiao4_line7_textview7);

    }
    public void click(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_1Activity.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_2Activity.class);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_3Activity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_4Activity.class);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_5Activity.class);
                startActivity(intent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_6Activity.class);
                startActivity(intent);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Jiqiao4Activity.this,Content4_7Activity.class);
                startActivity(intent);
            }
        });

    }

}
