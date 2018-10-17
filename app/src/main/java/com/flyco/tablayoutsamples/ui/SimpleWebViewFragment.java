package com.flyco.tablayoutsamples.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.flyco.tablayoutsamples.R;

@SuppressLint("ValidFragment")
public class SimpleWebViewFragment extends Fragment {
    private String str;

    public static SimpleWebViewFragment getInstance(String title) {
        SimpleWebViewFragment sf = new SimpleWebViewFragment();
        sf.str = title;
        return sf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_simple_webview, null);
        WebView webView = (WebView) v.findViewById(R.id.wv);
        webView.loadUrl("https://m.baidu.com/s?wd="+str);

        return v;
    }
}