package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_4Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_4);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_4_1);
        textView2=(TextView)findViewById(R.id.text4_4_2);
        textView3=(TextView)findViewById(R.id.text4_4_3);
        textView4=(TextView)findViewById(R.id.text4_4_4);
        textView5 =(TextView)findViewById(R.id.text4_4_5);
    }
    public void content(){
        textView1.setText("\n1.仪表盘红灯亮了怎么办？\n");
        textView2.setText("\t\t\t\t\t\t如以下故障灯亮起时请不要再行驶，停在路边等求支援：电瓶指示灯亮起时；\n" +
                "\n" + "机油灯亮起时；水温灯亮起时，靠边停车3-4分钟后再熄火，用湿毛巾拧开水箱盖，注意不要被蒸汽烫伤手或脸部。(当其他故障灯亮起时，请及时去最近的4s店进行故障检查。)\n");
        textView3.setText("2.行车出现故障怎么办？\n");
        textView4.setText("\t\t\t\t\t\t一般情况下车辆出现故障，应将车靠边停车，电话至4s店请求支援，下车开启“双闪灯”警示，并在车后方50-100米处放置警示牌，以免发生意外。\n");
        textView5.setText("\t\t\t\t\t\t（重要）遇到爆胎情况是非常危险的，如你在高速公路行驶时，请遵照高速限速要求，如前轮爆胎，一定不可踩刹车，踩了刹车会产生更严重的交通事故，双手紧握方向盘尽力保持车辆直行；后轮爆胎，紧握方向盘，因为车胎已破，车辆会自己慢慢停下来，当车速降至20公里左右，可以轻踩刹车，放开，重复此动作，直至车辆停止为止。重点是每天在出行前要养成先检查胎压情况的习惯！\n");
    }
}
