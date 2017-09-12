package com.example.administrator.listview.Content3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.administrator.listview.R;

public class Content3_6Activity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content3_6);
        webView = (WebView)findViewById(R.id.webView3_6);
    }
    @Override
    protected void onStart() {
        super.onStart();
        String url = getIntent().getStringExtra("url");
        webView.loadUrl("http://www.jiakaobaodian.com/news/detail/497831.html\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
