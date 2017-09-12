package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_6Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_6);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_6_1);
        textView2=(TextView)findViewById(R.id.text4_6_2);
        textView3=(TextView)findViewById(R.id.text4_6_3);
        textView4=(TextView)findViewById(R.id.text4_6_4);

    }
    public void content(){
        textView1.setText("\n\t\t\t\t\t\t最令新手头痛的就是停车了,很多新手开车上路都有“停车恐惧症”。因此新手停车时常发生刮蹭事故，这更增加了新手的停车恐惧心理。办法只有一个，那就是练，要在“高手”指导下专门练习各种停车方式。练习时要着重练习两种新手认为比较难的停车位：\n");
        textView2.setText("\t\t\t\t\t\t1.横进法（前后有车，中间留有停车位）：入位要领是一定要完全倒入，可以借鉴在驾校学习的“移库”方法，让车尾先入才能顺利到位。\n");
        textView3.setText("\t\t\t\t\t\t2.直进法（左右有车，中间留有停车位）：车位入位有两种方法，一是正向驶入，另一种是倒入。正向驶入时较为简单，注意与左右两车的距离，以不妨碍左右两车开门为宜；倒入时可以借鉴在驾校学习的“贴库”和“倒库”方法。\n");
        textView4.setText("\t\t\t\t\t\t3.谨防熄火：新手开车上路在过红绿灯时，看到车多路堵，心慌意乱会经常熄火。究其原因是新手油门与离合器配合不好，就会熄火。在看到绿灯亮时和前车起步红色尾灯熄灭时，可轻抬离合器，右脚要加一点油。\n");

    }
}
