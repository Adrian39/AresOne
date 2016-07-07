package com.lopez.aresone;

import android.app.Application;

import com.lopez.aresone.DestinyAPI.URLEndPoint;

/**
 * Created by JacoboAdrian on 6/29/2016.
 */
public class MyApplication extends Application {

    private static MyApplication sInstance;
    @Override
    public void onCreate(){
        super.onCreate();
        sInstance = this;

        String mAccountType = "1";
        String mAccountID = "4611686018434957014";
        String mCharacterID = "2305843009220086123";
        URLEndPoint.getInstance().setAccountInformation(mAccountType, mAccountID, mCharacterID);

    }

    public static MyApplication getAppContext() {
        return sInstance;
    }

}
