package com.epitulsa.epicore.interfaces;

import android.content.Context;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptInterfaces {

    public Context mContext;
    public final Handler myHandler = new Handler();


    public JavaScriptInterfaces(Context c) {
        mContext = c;
    }

    @JavascriptInterface
    public void showMessage(String webMessage){
        final String msgeToast = webMessage;
        myHandler.post(new Runnable() {
            @Override
            public void run() {
               // do something here with method from javascript
            }
        });
        Toast.makeText(mContext, "Message from JavaScript Interface", Toast.LENGTH_SHORT).show();
    }
}

