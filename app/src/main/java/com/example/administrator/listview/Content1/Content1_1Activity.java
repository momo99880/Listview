package com.example.administrator.listview.Content1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content1_1Activity extends AppCompatActivity {
   private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12;
    private ImageView fanhui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1_1);
        init();
        content();
    }
    public void init(){

        textView1 =(TextView)findViewById(R.id.text1_1_1);
        textView2=(TextView)findViewById(R.id.text1_1_2);
        textView3=(TextView)findViewById(R.id.text1_1_3);
        textView4=(TextView)findViewById(R.id.text1_1_4);
        textView5 =(TextView)findViewById(R.id.text1_1_5);
        textView6=(TextView)findViewById(R.id.text1_1_6);
        textView7=(TextView)findViewById(R.id.text1_1_7);
        textView8=(TextView)findViewById(R.id.text1_1_8);
        textView9 =(TextView)findViewById(R.id.text1_1_9);
        textView10=(TextView)findViewById(R.id.text1_1_10);
        textView11=(TextView)findViewById(R.id.text1_1_11);
        textView12=(TextView)findViewById(R.id.text1_1_12);
    }
    public void content(){
        textView1.setText("\n一、年龄条件\n");
        textView2.setText("\t\t\t\t\t\t1.小型汽车、小型自动挡汽车、残疾人专用小型自动挡载客汽车、轻便摩托车准驾车型，18-70周岁；\n" +
                "\n" +
                "\t\t\t\t\t\t2.低速载货汽车、三轮汽车、普通三轮摩托车、普通二轮摩托车或者轮式自行机械车准驾车型，18-60周岁；\n" +
                "\n" +
                "\t\t\t\t\t\t3.城市公交车、大型货车、无轨电车或者有轨电车准驾车型，20-50周岁；\n" +
                "\n" +
                "\t\t\t\t\t\t4.中型客车准驾车型，21-50周岁；\n" +
                "\n" +
                "\t\t\t\t\t\t5.牵引车准驾车型，24-50周岁；\n" +
                "\n" +
                "\t\t\t\t\t\t6.大型客车准驾车型，26-50周岁。\n");
        textView3.setText("\n二、身体条件\n");
        textView4.setText("\t\t\t\t\t\t1.身高：大型客车、牵引车、城市公交车、大型货车、无轨电车准驾车型，身高为155厘米以上。中型客车准驾车型，身高为150厘米以上；\n" +
                "\n" +
                "\t\t\t\t\t\t2.视力：大型客车、牵引车、城市公交车、中型客车、大型货车、无轨电车或者有轨电车准驾车型，两眼裸视力或者矫正视力5.0以上。其他准驾车型，两眼裸视力或者矫正视力4.9以上；\n" +
                "\n" +
                "\t\t\t\t\t\t3.辨色力：无红绿色盲；\n" +
                "\n" +
                "\t\t\t\t\t\t4.听力：两耳分别距音叉50厘米能辨别声源方向。有听力障碍但佩戴助听设备能够达到以上条件的，可以申请小型汽车、小型自动挡汽车准驾车型的机动车驾驶证；\n" +
                "\n" +
                "\t\t\t\t\t\t5.上肢：双手拇指健全，每只手其他手指必须有三指健全，肢体和手指运动功能正常。但手指末节残缺或者右手拇指缺失的，可以申请小型汽车、小型自动挡汽车、低速载货汽车、三轮汽车准驾车型的机动车驾驶证；\n" +
                "\n" +
                "\t\t\t\t\t\t6.下肢：双下肢健全且运动功能正常，不等长度不得大于5厘米。但左下肢缺失或者丧失运动功能的，可以申请小型自动挡汽车准驾车型的机动车驾驶证。右下肢、双下肢缺失或者丧失运动功能但能够自主坐立的，可以申请残疾人专用小型自动挡载客汽车准驾车型的机动车驾驶证；\n" +
                "\n" +
                "\t\t\t\t\t\t7.躯干、颈部：无运动功能障碍。\n");
        textView5.setText("\n三、哪些情况不得申请机动车驾驶证?\n");
        textView6.setText("\t\t\t\t\t\t1.有器质性心脏病、癫痫病、美尼尔氏症、眩晕症、癔病、震颤麻痹、精神病、痴呆以及影响肢体活动的神经系统疾病等妨碍安全驾驶疾病的；\n" +
                "\n" +
                "\t\t\t\t\t\t2.三年内有吸食、注射毒品行为或者解除强制隔离戒毒措施未满三年，或者长期服用依赖性精神药品成瘾尚未戒除的；\n" +
                "\n" +
                "\t\t\t\t\t\t3.造成交通事故后逃逸构成犯罪的；\n" +
                "\n" +
                "\t\t\t\t\t\t4.饮酒后或者醉酒驾驶机动车发生重大交通事故构成犯罪的；\n" +
                "\n" +
                "\t\t\t\t\t\t5.醉酒驾驶机动车或者饮酒后驾驶营运机动车依法被吊销机动车驾驶证未满五年的；\n" +
                "\n" +
                "\t\t\t\t\t\t6.醉酒驾驶营运机动车依法被吊销机动车驾驶证未满十年的；\n" +
                "\n" +
                "\t\t\t\t\t\t7.因其他情形依法被吊销机动车驾驶证未满二年的；\n" +
                "\n" +
                "\t\t\t\t\t\t8.驾驶许可依法被撤销未满三年的；\n" +
                "\n" +
                "\t\t\t\t\t\t9.法律、行政法规规定的其他情形；\n" +
                "\n" +
                "\t\t\t\t\t\t10.未取得机动车驾驶证驾驶机动车，有第一款第五项至第七项行为之一的，在规定期限内不得申请机动车驾驶证。\n");
        textView7.setText("\n四、报名材料\n");
        textView8.setText("\t\t\t\t\t\t1.身份证复印件；\n" +
                "\n" +
                "\t\t\t\t\t\t2.居住证复印件；\n" +
                "\n" +
                "\t\t\t\t\t\t3.相片和数码回执；\n" +
                "\n" +
                "\t\t\t\t\t\t4.体检表一份。\n");
        textView9.setText("\n五、报名流程\n");
        textView10.setText("\t\t\t\t\t\t选驾校 > 体检 > 拍照 > 缴费，由驾校代为报名。\n");
        textView11.setText("\n六、注意事项\n");
        textView12.setText("\t\t\t\t\t\t1.费用：问清学车费用组成；\n" +
                "\n" +
                "\t\t\t\t\t\t2.时间：了解教学进度，自己规划好学车时间；\n" +
                "\n" +
                "\t\t\t\t\t\t3.接送及班车：是否提供接送服务；\n" +
                "\n" +
                "\t\t\t\t\t\t4.教练：教练的能力及时间安排；\n" +
                "\n" +
                "\t\t\t\t\t\t5.退学与转学：问清是否可以退学或者转学，及需要承担的相应费用。\n");
    }

}
