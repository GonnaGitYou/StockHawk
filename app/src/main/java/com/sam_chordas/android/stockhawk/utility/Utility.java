package com.sam_chordas.android.stockhawk.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @author Dr. Ken
 */
public final class Utility {

    /**
     * Determine state of network connection.
     * @param context Application context.
     * @return Boolean indicating whether network is connected or not.
     */
    public static boolean isIsNetworkConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }


}
