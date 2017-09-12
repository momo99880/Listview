package com.example.administrator.listview.Content5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content5_1Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conent5_1);
        init();
        content();
    }
    public void init(){
        textView1 = (TextView)findViewById(R.id.text5_1_1);
        textView2=(TextView)findViewById(R.id.text5_1_2);
        textView3=(TextView)findViewById(R.id.text5_1_3);
        textView4=(TextView)findViewById(R.id.text5_1_4);
    }
        public void content(){
            textView1.setText("\n驾照年审时间\n");
            textView2.setText("\t\t\t\t\t\t《机动车驾驶证申领和使用规定》实施后，驾驶证已经取消了年审，取而代之是有效期6年，10年和长期。但是A1，A2，A3，B1，B2证(以前的A证,B证)每年在驾驶证的初次领证日期后15日内要向车管所提交一份体检表，过期一年不提交,驾驶证会被车管所自动注销。\n\t\t\t\t\t\t其它证,只要遵守交规,每个记分周期（一般是从初次领驾驶证的日期算起12个月内）交通违法记分都不满12分(只要不满12分,下一个记分周期自动归零)，驾驶证就可以一直放心使用（但是要按时换证,否则过期一年驾驶证就会被自动注销了）。");
            textView3.setText("\n驾照年审查询\n");
            textView4.setText("\t\t\t\t\t\t一般来说年审是看你有无违章、如果有被扣分，就要先消分，才能年审过关；第二你要提交身体条件合格的证明文件(体检表)。");}

}
