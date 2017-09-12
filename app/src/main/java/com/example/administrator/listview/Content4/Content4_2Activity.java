package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_2Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_2);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_2_1);
        textView2=(TextView)findViewById(R.id.text4_2_2);
        textView3=(TextView)findViewById(R.id.text4_2_3);
        textView4=(TextView)findViewById(R.id.text4_2_4);
        textView5 =(TextView)findViewById(R.id.text4_2_5);
        textView6=(TextView)findViewById(R.id.text4_2_6);
    }
    public void content(){
        textView1.setText("\n1.起步熄火怎么办？\n");
        textView2.setText("\t\t\t\t\t\t左脚起步抬离合，同时右脚轻踩加油。听车辆发动机声音变小、车头微抬开始前行时，左脚停顿，待车行4、5米后离合器全松，完成起步。熟练记住“一快二停三联动”。特别是遇红灯，重新起步发生熄火的状况，请牢记以下起步口诀：离合快停慢，轻轻把油加，停顿跟加油，起步练熟它。 上坡时车辆熄火，半离合，加油门，注意和前车距离，不要给过大油门，以免发生追尾。拉手刹（新手可先拉手刹再起步）；左抬、右轻加油；车头微抬、半离合、右轻加油；松手刹。\n");
        textView3.setText("2.停车时切记回空挡！\n");
        textView4.setText("\t\t\t\t\t\t如果没有回空档，当你的档位在档位内时，启动时可能会发生车往前冲的情况，如果停车时是档位在倒档上，启动时可能会往后倒的情况，比较危险，停好车后一定要回空挡。\n");
        textView5.setText("3.档位和速度怎么配合操作呢？\n");
        textView6.setText("\t\t\t\t\t\t开车由N档换1档起步，车行驶起来可换2档。实际操作：驾驶时转速在2200-2500区间时可逐级加档，开空调时在2500-2800区间加档。不要低于2000换档，这样可使每个档位扭力足够并节油，可减少发动机积炭，延长发动机寿命。\n");
    }
}
