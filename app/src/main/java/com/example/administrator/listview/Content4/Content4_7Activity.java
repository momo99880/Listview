package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_7Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_7);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_7_1);
        textView2=(TextView)findViewById(R.id.text4_7_2);
        textView3=(TextView)findViewById(R.id.text4_7_3);
        textView4=(TextView)findViewById(R.id.text4_7_4);
        textView5 =(TextView)findViewById(R.id.text4_7_5);
        textView6=(TextView)findViewById(R.id.text4_7_6);
        textView7=(TextView)findViewById(R.id.text4_7_7);
    }
    public void content(){
        textView1.setText("\n\t\t\t\t\t\t拨打122报交警，如有人员受伤，不要随便移动受伤人员，一是怕破坏现场，二是你不知道人员受伤的情况，随意移动受伤人员可能会造成二次伤害，要及时通知120等求救援，无人员受伤则由交警进行责任划分，再通知保险公司。\n");
        textView2.setText("\t\t\t\t\t\t1.一旦发生道路交通事故，当事人应及时报警、及时保护现场、及时抢救伤员、及时提醒过往车辆，便于交警部门正确认定责任事故和减少不必要的道路交通拥堵现象。\n");
        textView3.setText("\t\t\t\t\t\t2.作为肇事司机，应当在发生交通事故后及时向保险公司报案，免得因报案不及时，而被保险公司作为不予理赔的理由。\n");
        textView4.setText("\t\t\t\t\t\t3.无论是肇事司机还是受害人，都应当妥善保管各种发票，如急救费发票、医疗费发票、护理费发票、伙食补助费发票、营养费发票、亲属处理交通事故产生的食宿费、交通费发票和鉴定费发票等，作为调解或诉讼的依据。\n");
        textView5.setText("\t\t\t\t\t\t4.当事人在发生交通事故后，应要求交警部门及时出具交通事故认定书；当事人对交通事故认定书有异议的，应及时向交警部门的主管部门予以变更或撤销。\n");
        textView6.setText("\t\t\t\t\t\t5.如果交警部门的主管部门对交通事故认定书不予变更或撤销的，当事人也可以在向法院提起诉讼的同时，要求法院对交通事故认定书予以变更或撤销。\n");
        textView7.setText("\t\t\t\t\t\t6.发生交通事故后，当事人可以要求交警部门调解结案，如果能调解结案的话，则省去了不必要的诉累。\n");
    }
}
