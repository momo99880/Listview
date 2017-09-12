package com.example.administrator.listview.Content1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content1_2Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1_2);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text1_2_1);
        textView2=(TextView)findViewById(R.id.text1_2_2);
        textView3=(TextView)findViewById(R.id.text1_2_3);
        textView4=(TextView)findViewById(R.id.text1_2_4);
        textView5 =(TextView)findViewById(R.id.text1_2_5);
        textView6=(TextView)findViewById(R.id.text1_2_6);
        textView7=(TextView)findViewById(R.id.text1_2_7);
        textView8=(TextView)findViewById(R.id.text1_2_8);
    }
    public void content(){
        textView1.setText("\n一、学车费用组成\n");
        textView2.setText("\t\t\t\t\t\t1.体检费用：驾驶员考试体检费用主要为视力检查的费用，一般价格在25元左右。学员可以自行去医院体检，或者由驾校代为体检缴费；\n" +
                "\n" +
                "\t\t\t\t\t\t2.拍照费用：驾驶员资格考试需要考生提供白底小一寸免冠照片。学员可以到当地照相馆拍照并缴费，价格因地而异；\n" +
                "\n" +
                "\t\t\t\t\t\t3.考试费用：车管所会对参加考试的学员收取考试费，该费用一般由驾校代为收取，统一安排考试；\n" +
                "\n" +
                "\t\t\t\t\t\t4.驾驶证办理费用：由车管所收取，用于办理驾驶证的工本费；\n" +
                "\n" +
                "\t\t\t\t\t\t5.其他费用：一些驾校会收取档案管理费，保险费等杂费，这些项目一般也是包括在学车费用的。学员在报名前，可以向驾校详细咨询。\n" );
        textView3.setText("二、补考费\n");
        textView4.setText("\t\t\t\t\t\t考生参加考试，如未一次性通过，需缴纳相应的费用参加补考。有些驾校学费中包括补考费用，但是大多数驾校学费是不包括该费用的。\n");
        textView5.setText("三、退费\n");
        textView6.setText("\t\t\t\t\t\t未参加的科目考试费是可以全额退还，由驾校去车管所办理手续。而驾校的培训费应当按照签约学车合同中的相应规定执行。\n");
        textView7.setText("四、分期付款\n");
        textView8.setText("\t\t\t\t\t\t部分驾校与银行合作，提供分期付款的服务。学员在报考驾校的时候，可以向驾校咨询。\n");
    }
}

