package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_5Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_5);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_5_1);
        textView2=(TextView)findViewById(R.id.text4_5_2);
        textView3=(TextView)findViewById(R.id.text4_5_3);
        textView4=(TextView)findViewById(R.id.text4_5_4);
        textView5 =(TextView)findViewById(R.id.text4_5_5);
        textView6=(TextView)findViewById(R.id.text4_5_6);
        textView7=(TextView)findViewById(R.id.text4_5_7);
        textView8=(TextView)findViewById(R.id.text4_5_8);
        textView9 =(TextView)findViewById(R.id.text4_5_9);
        textView10=(TextView)findViewById(R.id.text4_5_10);
        textView11=(TextView)findViewById(R.id.text4_5_11);
        textView12=(TextView)findViewById(R.id.text4_5_12);
    }
    public void content(){
        textView1.setText("\n1.遇到大雾天气\n");
        textView2.setText("\t\t\t\t\t\t开启雾灯，打开双闪警示其他车辆！慢行！\n");
        textView3.setText("2.遇到冰雪路面\n");
        textView4.setText("\t\t\t\t\t\t行驶更需要驾驶员集中注意力，提高警惕。最好能保持车辆匀速直线行驶，转方向盘要缓，油门及制动的力度都要轻柔，切记动作幅度过大过猛。\n");
        textView5.setText("3.遇到雨天路滑\n");
        textView6.setText("\t\t\t\t\t\t雨天行车，车内会产生雾气，影响视线，司机应调整出风口及时消雾；雨中行驶，应控制速度避免急刹；行车时应保持足够的安全距离。\n");
        textView7.setText("4.遇到积水路面时\n");
        textView8.setText("\t\t\t\t\t\t应注意观察水的深度，若水深超过汽车的最大涉水深度时，涉水前还应做好以下准备，关好百叶窗，拆下风扇皮带，用塑料布等包扎分电器和高压线。其次，驶入水中时一定要挂低挡缓慢驶入，避免冲入水中浸湿发动机部分，行驶中应稳住方向盘，不要换挡和停车。\n");
        textView9.setText("5.驶过积水路面后\n");
        textView10.setText("\t\t\t\t\t\t通过积水路面以后，轻踩刹车，排空刹车鼓的水，当刚开始踩刹车时，会感觉刹车很“疲”，当感觉刹车恢复平常感觉时，即可恢复正常行驶。\n");
        textView11.setText("6.遇到车内起雾\n");
        textView12.setText("\t\t\t\t\t\t如果雾气不大，可将两侧的车窗开一条缝隙，车内外空气对流，车内的温度慢慢接近车外温度，雾气就会散去。\n" +
                "\n" +
                "遇到寒冷天或雨天时，可借助车内外风扇和制冷系统，当冷气吹到玻璃上，雾气就会一散而尽，效果很快、很直接。也可在出行前用抹布沾一点清洁精擦拭挡风玻璃内侧及两边窗户内侧。\n");
    }
}
