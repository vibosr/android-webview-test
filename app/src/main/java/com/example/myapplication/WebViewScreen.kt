import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewScreen(url: String) {
        AndroidView(
            factory = { WebView(it) },
            update = { webView ->
                webView.webViewClient = WebViewClient()
                webView.settings.javaScriptEnabled = true
                webView.settings.allowContentAccess = true
                webView.settings.allowFileAccess = true
                webView.loadUrl(url)
            }
        )
}
