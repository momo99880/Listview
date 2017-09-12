package com.example.administrator.listview.Content5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content5_3Activity extends AppCompatActivity {
   private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content5_3);
        init();
        content();
    }

    public void init(){
        textView1 = (TextView)findViewById(R.id.text5_3_1);
        textView2=(TextView)findViewById(R.id.text5_3_2);
        textView3=(TextView)findViewById(R.id.text5_3_3);
        textView4=(TextView)findViewById(R.id.text5_3_4);
        textView5 = (TextView)findViewById(R.id.text5_3_5);
        textView6=(TextView)findViewById(R.id.text5_3_6);
        textView7=(TextView)findViewById(R.id.text5_3_7);
        textView8=(TextView)findViewById(R.id.text5_3_8);
    }
    public void content(){
        textView1.setText("\n驾照遗失补办\n");
        textView2.setText("\t\t\t\t\t\t机动车驾驶证遗失的，机动车驾驶人应当向机动车驾驶证核发地车辆管理所申请补发。\n");
        textView3.setText("补办需要的资料\n");
        textView4.setText("\t\t\t\t\t\t当事人的身份证和复印件，申请补办驾驶证的表格，两张彩色小一寸相片。\n");
        textView5.setText("补办要填写的内容\n");
        textView6.setText("\t\t\t\t\t\t姓名、驾驶证的档案号、身份证号码，遗失经过和理由。\n");
        textView7.setText("补办的办法\n");
        textView8.setText("\t\t\t\t\t\t1.符合规定的，车辆管理所应当在一日内补发机动车驾驶证。\n" + "	\t\t\t\t\t2.机动车驾驶人补领机动车驾驶证后，原机动车驾驶证作废，不得继续使用。\n" +" \t\t\t\t\t\t3.机动车驾驶证被依法扣押、扣留或者暂扣期间，机动车驾驶人不得申请补发。\n");
    }
}
