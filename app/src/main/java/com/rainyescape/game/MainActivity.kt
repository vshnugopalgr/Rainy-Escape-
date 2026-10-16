
package com.rainyescape.game

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()
        setContentView(webView)

        webView.loadUrl("file:///android_asset/index.html")
    }
}
