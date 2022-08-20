 package com.protech.loginapplication;

 import androidx.appcompat.app.AppCompatActivity;

 import android.os.Bundle;
 import android.view.Window;
 import android.view.WindowManager;
 import android.webkit.WebSettings;
 import android.webkit.WebView;
 import android.webkit.WebViewClient;

 public class HomePageActivity extends AppCompatActivity {
     private WebView webView;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

         getSupportActionBar().hide();
         setContentView(R.layout.activity_home_page);

         webView = (WebView) findViewById(R.id.webview);
         webView.setWebViewClient(new WebViewClient());
         webView.loadUrl("http://www.google.com/");

         WebSettings webSettings = webView.getSettings();
         webSettings.setJavaScriptEnabled(true);
     }

     @Override
     public void onBackPressed() {
         if (webView.canGoBack()){
             webView.goBack();
         } else {
         super.onBackPressed();
         }
     }
 }