package com.example.administrator.listview.Content1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content1_5Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1_5);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text1_5_1);
        textView2=(TextView)findViewById(R.id.text1_5_2);
        textView3=(TextView)findViewById(R.id.text1_5_3);
        textView4=(TextView)findViewById(R.id.text1_5_4);
        textView5 =(TextView)findViewById(R.id.text1_5_5);
    }
    public void content(){
        textView1.setText("\n\t\t\t\t\t\t违反驾照考试纪律规定的一切行为都被视为考试作弊,例如携带纸条,手机及无线通信设备进入考场。考试过程进行全程录音、录像，严肃考试纪律，规范考场秩序，对考场秩序混乱的，应当中止考试。\n\n");
        textView2.setText("\t\t\t\t\t\t近年来，全国公安交管部门通过加强考试民警教育培训、应用科技评判监督系统、完善内外监督机制，驾驶人考试工作规范化水平有所提升。但是，仍然存在一些考试不规范、考试制度落实不到位问题。为进一步严格车辆管理所考试发证的监管， 123号令明确了考试工作监管机制和考试工作纪律规定。\n" );
        textView3.setText("\t\t\t\t\t\t1.完善考试工作监管机制，建立驾驶人考试业务数据分析核查机制，完善考试能力、考试质量公告制度等社会监督机制。\n");
        textView4.setText("\t\t\t\t\t\t2.明确考试员工作纪律。对为不符合机动车驾驶许可条件、未经考试、考试不合格核发驾驶证的，减少机动车驾驶人考试项目、降低评判标准或者参与、协助、纵容作弊的，收取培训机构、教练员、考生财物的，给予相应处分；构成犯罪的，依法追究刑事责任。\n");
        textView5.setText("\t\t\t\t\t\t3.实行考试责任倒查。对三年以下驾龄的驾驶人发生交通死亡事故负主要以上责任的，要开展车辆管理所考试发证情况责任倒查。对车辆管理所存在严重违规办理机动车驾驶证业务的，上级部门可以暂停其业务或者指派人员接管业务。\n");
    }
}
