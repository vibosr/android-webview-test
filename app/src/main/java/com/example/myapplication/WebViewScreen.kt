import android.view.ViewGroup.LayoutParams
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewScreen(url: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        AndroidView(
            factory = { WebView(it).apply {
                layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
            } },
            update = { webView ->
                webView.webViewClient = WebViewClient()
                webView.settings.javaScriptEnabled = true
                webView.settings.allowContentAccess = true
                webView.settings.allowFileAccess = true
                webView.loadUrl(url)
            }
        )
    }
}
