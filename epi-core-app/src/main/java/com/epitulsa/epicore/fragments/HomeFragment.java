package com.epitulsa.epicore.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.epitulsa.epicore.R;
import com.epitulsa.epicore.interfaces.JavaScriptInterfaces;

public class HomeFragment extends Fragment {

    final JavaScriptInterfaces jsInterfaces = new JavaScriptInterfaces(this.getActivity());

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_epicore_home, container, false);
        WebView wv = rootView.findViewById(R.id.homeWebView);
        wv.loadUrl(getString(R.string.web_url));
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.addJavascriptInterface(jsInterfaces, "AndroidFunction");
        return rootView;
    }
}
