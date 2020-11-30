package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editar;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editar = (EditText)findViewById(R.id.url);
    }

    public void buscar(View view) {
        String liga = editar.getText().toString();
        w1 = (WebView)findViewById(R.id.buscar);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl(liga);
    }

}