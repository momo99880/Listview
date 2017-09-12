package com.example.administrator.listview.Content4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content4_1Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4_1);
        init();
        content();
    }
    public void init(){
        textView1 =(TextView)findViewById(R.id.text4_1_1);
        textView2=(TextView)findViewById(R.id.text4_1_2);
        textView3=(TextView)findViewById(R.id.text4_1_3);
        textView4=(TextView)findViewById(R.id.text4_1_4);
        textView5 =(TextView)findViewById(R.id.text4_1_5);
        textView6=(TextView)findViewById(R.id.text4_1_6);
        textView7=(TextView)findViewById(R.id.text4_1_7);
        textView8=(TextView)findViewById(R.id.text4_1_8);
        textView9 =(TextView)findViewById(R.id.text4_1_9);
        textView10=(TextView)findViewById(R.id.text4_1_10);
        textView11=(TextView)findViewById(R.id.text4_1_11);
        textView12=(TextView)findViewById(R.id.text4_1_12);
        textView13 =(TextView)findViewById(R.id.text4_1_13);
        textView14=(TextView)findViewById(R.id.text4_1_14);
        textView15=(TextView)findViewById(R.id.text4_1_15);
        textView17=(TextView)findViewById(R.id.text4_1_17);
        textView18 =(TextView)findViewById(R.id.text4_1_18);
        textView19=(TextView)findViewById(R.id.text4_1_19);
        textView16=(TextView)findViewById(R.id.text4_1_16);
    }
    public void content(){
        textView1.setText("\n1.开车时胸部不宜挂饰\n");
        textView2.setText("\t\t\t\t\t\t急刹车时，人的身体会在惯性作用下猛地往前冲，安全带对人体会产生巨大压力，如果胸口有大的硬物挂件，便会造成胸骨骨折等严重伤害。\n");
        textView3.setText("\n2.不穿不合适的鞋开车\n");
        textView4.setText("\t\t\t\t\t\t不宜穿高跟鞋、厚底鞋、凉鞋和拖鞋等鞋子开车，建议上车换球鞋开车。即便是换鞋开车也要切记，换下的鞋不能放在前座下或前座旁，避免鞋子滚至刹车板下。\n");
        textView5.setText("\n3.车上不宜乱放、挂物\n");
        textView6.setText("\t\t\t\t\t\t后视镜不宜挂硬物挂件，后座上方、挡风玻璃前不宜放背包、手包、抱枕及其他玩具等物品，它们除了会挡视线，还会在紧急刹车时有飞向前方伤及司机的可能。\n");
        textView7.setText("\n4.座位不宜离方向盘过近\n");
        textView8.setText("\t\t\t\t\t\t许多初学者开车上路时座位调得离方向盘过近，身体几乎要接触到方向盘，这会使全身都变得很紧张，手臂和腿过分弯曲对于操纵的灵活性影响很大，而身体越近，视线和视角也会变得越短窄，影响开车安全。\n");
        textView9.setText("\n5.行车时车载音响声音不宜过大\n");
        textView10.setText("\t\t\t\t\t\t汽车上音响音量过大，声音作用于听觉器官时，通过神经系统，容易使视力发生变化。汽车内过高的音乐声会使人兴奋，注意力分散，而出现听觉疲劳，心烦意乱，难以正确判断情况，由于注意力不集中，很容易发生交通事故。\n");
        textView11.setText("\n6.车行时不可吸烟\n");
        textView12.setText("\t\t\t\t\t\t司机驾车要“眼观六路，耳听八方”，而吸烟不仅影响人的听力，还影响驾驶员视觉。吸烟一系列动作，都会分散司机注意力，且吸烟时驾驶员的制动反应时间因增加了吸烟的一系列动作而有所延长，有时会因措手不及而发生车祸。吸烟时所产生的烟雾不仅遮挡视线，同时又大大降低驾驶员眼睛的适应能力，从而妨碍驾车安全。\n");
        textView13.setText("\n7.车行时不可打手机\n");
        textView14.setText("\t\t\t\t\t\t开车打手机会导致驾车者注意力下降，开车时使用手机者遇上交通意外的机会高出未使用手机者4至5倍；开车时使用手机，人脑的反应速度比酒后驾车时还要慢。驾车者对路况的反应比正常情况下慢。且打电话时，驾车不稳定，难以与前方车辆保持安全距离，极易引发车祸。\n");
        textView15.setText("\n8.喝酒不开车，开车不喝酒。\n");
        textView16.setText("\n9.垫厚坐垫开车\n");
        textView17.setText("\t\t\t\t\t\t很多女性车主由于身材比较娇小，为了避免被人误认为是“无人驾驶”，习惯在驾驶席座位上垫一个坐垫。因坐垫未固定，当遇到情况紧急制动时，身体往前的惯性很容易使人从座椅上滑落，后果难以想象。\n");
        textView18.setText("\n10.戴普通手套开车\n");
        textView19.setText("\t\t\t\t\t\t很多女性车主开车时总喜欢戴一副手套，以防止双手握方向盘磨出“茧子”。这也是不可取的，因为戴手套很容易在操作方向盘转向时打滑，要戴也应该戴专用驾驶手套。\n\n");
    }
}
