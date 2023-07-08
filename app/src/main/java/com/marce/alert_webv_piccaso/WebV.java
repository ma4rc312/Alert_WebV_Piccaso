package com.marce.alert_webv_piccaso;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebV extends AppCompatActivity {
    WebView webV1;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_v);

        webV1 = findViewById(R.id.webV1);

        /*webV1.loadUrl("http://legionanime.net/anime/one-piece.html");*/

        String rutaHtml = "app/src/main/assets/index.html";
        WebSettings webSettings = webV1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webV1.setWebChromeClient(new WebChromeClient());
        webV1.loadUrl(rutaHtml);
    }
}