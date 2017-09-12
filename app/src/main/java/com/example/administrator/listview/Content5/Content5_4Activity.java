package com.example.administrator.listview.Content5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.listview.R;

public class Content5_4Activity extends AppCompatActivity {
    private TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content5_4);
        init();
        content();
    }
    public void init() {
        textView1 = (TextView) findViewById(R.id.text5_4_1);
        textView2 = (TextView) findViewById(R.id.text5_4_2);
    }
    public void content() {
        textView1.setText("\n\t\t\t\t\t\t驾照挂失是指驾照丢失或被盗后到相关的部门挂失，防止被其他人不法利用。\n");
        textView2.setText("\t\t\t\t\t\t驾照丢失不需要办理挂失，可就近到户口所在地辖区交巡警大队办理补证。法定的挂失必须在省级公开发行的报纸上刊登，声明公告。因为按法律规定在公开发行的报纸上挂失后，即推定社会上不特定的所有人都应当知道该证无效，即解除了你的社会责任。\n");
    }
}
