package com.example.csr.spongycastlecsr;

import android.app.Application;

import java.security.Security;

/**
 * Created by yewen on 19/11/15.
 */
public class MyApplication extends Application {

    static {
        Security.insertProviderAt(new org.spongycastle.jce.provider.BouncyCastleProvider(), 1);
    }

}
