package com.example.administrator.listview.Content1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content1_3Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1_3);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text1_3_1);
        textView2=(TextView)findViewById(R.id.text1_3_2);
        textView3=(TextView)findViewById(R.id.text1_3_3);
        textView4=(TextView)findViewById(R.id.text1_3_4);
        textView5 =(TextView)findViewById(R.id.text1_3_5);
    }
    public void content(){
        textView1.setText("\n考试顺序按照科目一、科目二、科目三依次进行，前一科目考试合格后，可以参加下一科目的考试；前一科目考试不合格的，继续该科目考试。\n");
        textView2.setText("\t\t\t\t\t\t1.科目一：考试主要考核道路交通安全法律法规、交通信号、通行规则等基本知识。科目一考试试卷由100道题目组成，题型为判断题和单项选择题，满分100分，90分合格。\n" );
        textView3.setText("\t\t\t\t\t\t2.科目二：小型汽车场地考试项目为“训练和考试均为5项”，即倒车入库、坡道定点停车与起步、侧方停车、曲线行驶和直角转弯。\n");
        textView4.setText("\t\t\t\t\t\t3.科目三路考部分：道路驾驶技能和安全文明驾驶常识。基本项目有16项，包括上车准备、起步、直线行驶、加减挡位操作、变更车道、靠边停车、直行通过路口、路口左转弯、路口右转弯、通过人行横道线、通过学校区域、通过公共汽车站、会车、超车、掉头、夜间行驶。小型汽车考试里程不少于3公里，并抽取不少于20%进行夜间考试；不进行夜间考试的，应当进行模拟夜间灯光使用考试。\n");
        textView5.setText("\t\t\t\t\t\t4.科目四理论考试部分：安全文明驾驶常识考试。主要内容包括，安全文明驾驶操作要求、恶劣气象和复杂道路条件下的安全驾驶知识、爆胎等紧急情况下的临危处置方法以及发生交通事故后的处置知识等内容。考试试卷由50道题目组成，题目以案例、图片、动画等形式为主，题型为判断题、单项选择题和多项选择题，满分100分，90分合格。\n");
    }
}
