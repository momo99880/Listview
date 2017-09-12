package com.example.administrator.listview.Content2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.administrator.listview.R;

public class Content2_4Activity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content2_4);
        webView = (WebView)findViewById(R.id.webView2_4);
    }
    @Override
    protected void onStart() {
        super.onStart();
        String url = getIntent().getStringExtra("url");
        webView.loadUrl("http://www.jiakaobaodian.com/news/detail/469536.html");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
