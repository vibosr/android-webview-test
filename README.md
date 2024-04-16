# Android Studio Webview Test

Test för att få igång webviews i Android.

## How to

- Uppdatera URL:en i [följande fil](https://github.com/vibosr/android-webview-test/blob/main/app/src/main/java/com/example/myapplication/MainActivity.kt#L13) och dra igång appen. 
- Latja med [följande rad](https://github.com/vibosr/android-webview-test/blob/main/app/src/main/java/com/example/myapplication/WebViewScreen.kt#L9) som kan ersättas med nedanstående för att se hur siten beter sig vid olika layoutkrav.

```kotlin
factory = { webView(it).apply { layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT) }

```

*Nuvarande config verkar stödja Android API 30 och framåt (motsvarande Android 11)*
