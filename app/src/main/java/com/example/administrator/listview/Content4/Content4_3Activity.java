package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_3Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_3);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_3_1);
        textView2=(TextView)findViewById(R.id.text4_3_2);
        textView3=(TextView)findViewById(R.id.text4_3_3);
        textView4=(TextView)findViewById(R.id.text4_3_4);
        textView5 =(TextView)findViewById(R.id.text4_3_5);
        textView6=(TextView)findViewById(R.id.text4_3_6);
        textView7=(TextView)findViewById(R.id.text4_3_7);
        textView8=(TextView)findViewById(R.id.text4_3_8);
        textView9 =(TextView)findViewById(R.id.text4_3_9);
    }
    public void content(){
        textView1.setText("\n\t\t\t\t\t\t新手驾驶要慢行，紧急情况保持冷静、分清油门和刹车，无论是自动挡还是手动挡都建议您右脚踩油门，右脚踩刹车。\n");
        textView2.setText("\t\t\t\t\t\t1.长距离轻刹车的技巧-高超的刹车技巧是不给乘车人有冲击的感觉，其前提条件是正确把握前方的道路及交通状况。首先是松开油门踏板，然后根据距离、车速等进行刹车操作。\n");
        textView3.setText("\t\t\t\t\t\t2.车辆完全停止前松一次刹车-如果我们踩刹车的目的是停止车辆行驶的话，一直踩着刹车直至车辆停止行驶前瞬间会产生比较大的冲击，其技巧是在车辆完全停止前松开一次刹车，然后再轻点刹车直至车辆停止行驶。\n");
        textView4.setText("\t\t\t\t\t\t3.紧急刹车时要用力踩刹车踏板-20年前的车辆多数没有ABS装置，因此不建议一次全力踩刹车，而是分开2次踩刹车，防止车轮抱死后发生甩尾及方向锁死。但是现在ABS系统已经是车辆的标准配置，因此如果遇到紧急情况时，一定要全力踩下刹车踏板。\n");
        textView5.setText("\t\t\t\t\t\t4.土路或浮砂路面刹车仍然有危险-不仅是乡村道路，即使是城市的柏油路面，由于城市建设等在道路两旁会堆积一些浮土或沙粒，这时候一定要谨慎使用紧急刹车的操作。\n");
        textView6.setText("\t\t\t\t\t\t5.雨天行驶时谨慎使用紧急刹车-尽管现在车辆基本都配置了ABS系统，车轮抱死等现象得到了极大改善。但仍然建议在雨天行驶注意控制车速的同时，需谨慎使用紧急刹车的动作。\n");
        textView7.setText("\t\t\t\t\t\t6.转弯时注意刹车的操作方法-打着方向踩刹车时，车辆容易失去重心，因此在进入弯道前应该通过刹车充分地减低车速。但如果来不及减速的话，可根据情况短暂使用刹车。湿滑弯道路面紧急刹车的话容易发生甩尾，可以通过降低档位，利用发动机制动进行减速。\n");
        textView8.setText("\t\t\t\t\t\t7.7长下坡路段行驶同时使用发动机制动-长时间使用刹车的话，刹车系统会因为发热而影响刹车性能。所以，可以根据路况将变速器的档位选择在3挡、2挡、L挡（自动档）或3挡、2挡、1挡（手动挡），不踩油门踏板利用发动机制动控制车速。\n");
        textView9.setText("\t\t\t\t\t\t8.“排骨路”行驶注意-凹凸情况“排骨路”(搓板路)或沙土路的路面有许多的凹凸，车辆通过时车轮会瞬间悬空，这时的刹车不仅容易产生短暂抱死，且容易发生抢方向的情况，可能的情况下利用发动机制动吧。\n" +
                "\n");
    }
}
