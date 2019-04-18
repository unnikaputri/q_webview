package com.latihan.hajiakhmad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*

class MainActivity : AppCompatActivity() {


    private val urlToLoad = "http://qc.hajiakhmad.id:1313/ "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.WebView)

        myWebView.settings.javaScriptEnabled = true
        myWebView.webChromeClient = object : WebChromeClient(){
        }

        myWebView.webViewClient =  object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        myWebView.loadUrl(urlToLoad)

    }


}