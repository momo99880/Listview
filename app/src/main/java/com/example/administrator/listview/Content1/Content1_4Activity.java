package com.example.administrator.listview.Content1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content1_4Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1_4);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text1_4_1);
        textView2=(TextView)findViewById(R.id.text1_4_2);
        textView3=(TextView)findViewById(R.id.text1_4_3);
        textView4=(TextView)findViewById(R.id.text1_4_4);
        textView5 =(TextView)findViewById(R.id.text1_4_5);
        textView6=(TextView)findViewById(R.id.text1_4_6);
        textView7=(TextView)findViewById(R.id.text1_4_7);
        //textView8=(TextView)findViewById(R.id.text1_1_8);
        imageView=(ImageView)findViewById(R.id.img);
    }
    public void content(){
        textView1.setText("\n一、体检项目\n");
        textView2.setText("\t\t\t\t\t\t身高、视力、辨色力、听力、上肢、下肢、躯干、颈部。\n" );
        textView3.setText("二、体检须知\n");
        textView4.setText("\t\t\t\t\t\t1.必须由本人体检，不得代检代办。\n" + "\t\t\t\t\t\t2.自备白背景彩色一寸近照一张。\n");
        textView5.setText("三、体检地点\n");
        textView6.setText("\t\t\t\t\t\t二甲级以上的医院可以做学车体检(当然三甲级的更可以了)，二甲级以上的医院有专门学车体检的部门，做体检时不用挂号，拿着驾校专门的体检表到二甲级以上的医院做体检就可以了。\n");
        textView7.setText("\n红绿色盲检测图\n");
        imageView.setImageResource(R.mipmap.img);
      //  textView8.setText("\t\t\t\t\t\t红绿色盲者中的红色盲者能读出６，而绿色盲者能读出２，但红绿色弱者及正常者则两个字都能读出来。\n");
    }
}
