package com.lopez.aresone.DestinyAPI;

/**
 * Created by JacoboAdrian on 6/29/2016.
 */
public class URLEndPoint {
    private static URLEndPoint sInstance = null;
    private static final String API_URL_ADDRESS = "http://bungie.net/Platform/Destiny";
    private static String mAccountSummaryURL;
    private static String mCharacterStatsURL;
    private static String mAccountAdvisorsURL;
    private static String mAccountType, mAccountID, mCharacter;

    private URLEndPoint(){
    }

    public static URLEndPoint getInstance(){
        if (sInstance == null){
            sInstance = new URLEndPoint();
        }
        return sInstance;
    }

    public void setAccountInformation(String accountType, String accountID, String character){
        mAccountType = accountType;
        mAccountID = accountID;
        mCharacter = character;
    }

    public static String getAccountSummary() {
        mAccountSummaryURL = API_URL_ADDRESS + "/" + mAccountType + "/Account/" + mAccountID + "/Summary/";
        return mAccountSummaryURL;
    }

    public static String getCharacterStats() {
        mCharacterStatsURL = API_URL_ADDRESS + "/Stats/ActivityHistory/" + mAccountType + "/" + mAccountID+ "/" + mCharacter+ "/";
        return mCharacterStatsURL;
    }

    public static String getAccountAdvisors(){
        mAccountAdvisorsURL = API_URL_ADDRESS + "/" + mAccountType + "/Account/" + mAccountID + "/Advisors/";
        return mAccountAdvisorsURL;
    }
}
