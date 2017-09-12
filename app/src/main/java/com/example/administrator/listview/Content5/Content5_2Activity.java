package com.example.administrator.listview.Content5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content5_2Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content5_2);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text5_2_1);
        textView2=(TextView)findViewById(R.id.text5_2_2);
        textView3=(TextView)findViewById(R.id.text5_2_3);
        textView4=(TextView)findViewById(R.id.text5_2_4);
        textView5 =(TextView)findViewById(R.id.text5_2_5);
        textView6=(TextView)findViewById(R.id.text5_2_6);
        textView7=(TextView)findViewById(R.id.text5_2_7);
        textView8=(TextView)findViewById(R.id.text5_2_8);
    }
    public void content(){
        textView1.setText("\n驾照过期换证\n");
        textView2.setText("\t\t\t\t\t\t机动车驾驶人在机动车驾驶证的六年有效期内，每个记分周期均未记满12分的，换发十年有效期的机动车驾驶证；在机动车驾驶证的十年有效期内，每个记分周期均未记满12分的，换发长期有效的机动车驾驶证。\n" +
                "\n" + "\t\t\t\t\t\t机动车驾驶人应当于机动车驾驶证有效期满前九十日内，向机动车驾驶证核发地车辆管理所申请换证；超过机动车驾驶证有效期一年以上未换证的，注销机动车驾驶证。被注销未超过两年的，通过科目一的考试后可恢复驾驶证的正常使用；如果被注销超过两年的，则需要重新申领。\n");
        textView3.setText("\n户籍更换换证\n");
        textView4.setText("\t\t\t\t\t\t机动车驾驶人户籍迁出原车辆管理所管辖区的，应当向迁入地车辆管理所申请换证。机动车驾驶人在核发地车辆管理所管辖区以外居住的，可以向居住地车辆管理所申请换证。\n");
        textView5.setText("\n年龄增长换证\n");
        textView6.setText("\t\t\t\t\t\t年龄在60周岁以上的，不得驾驶大型客车、牵引车、城市公交车、中型客车、大型货车、无轨电车和有轨电车；持有大型客车、牵引车、城市公交车、中型客车、大型货车驾驶证的，应当到机动车驾驶证核发地车辆管理所换领准驾车型为小型汽车或者小型自动挡汽车的机动车驾驶证。\n" +
                "\n" + "\t\t\t\t\t\t年龄在70周岁以上的，不得驾驶低速载货汽车、三轮汽车、普通三轮摩托车、普通二轮摩托车和轮式自行机械车；持有普通三轮摩托车、普通二轮摩托车驾驶证的，应当到机动车驾驶证核发地车辆管理所换领准驾车型为轻便摩托车的机动车驾驶证。\n");
        textView7.setText("\n其他情况换证\n");
        textView8.setText("\t\t\t\t\t\t1.具有下列情形之一的，机动车驾驶人应当在三十日内到机动车驾驶证核发地车辆管理所申请换证：在车辆管理所管辖区域内，机动车驾驶证记载的机动车驾驶人信息发生变化的；机动车驾驶证损毁无法辨认的。\n" +
                "\n" +
                "\t\t\t\t\t\t2.机动车驾驶人身体条件发生变化，不符合所持机动车驾驶证准驾车型的条件，但符合准予驾驶的其他准驾车型条件的，应当在三十日内到机动车驾驶证核发地车辆管理所申请降低准驾车型。机动车驾驶人身体条件不适合驾驶机动车的，不得驾驶机动车。\n");
    }


}
