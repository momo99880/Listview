package com.example.administrator.listview.Content3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.administrator.listview.R;

public class Content3_2Activity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content3_2);
        webView = (WebView)findViewById(R.id.webView3_2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        String url = getIntent().getStringExtra("url");
        webView.loadUrl("http://www.jiakaobaodian.com/news/detail/469561.html\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
