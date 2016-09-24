package com.example.siva.chefmate;

import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Siva on 9/24/2016.
 */

public class MyInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyInstanceIDService";

    @Override
    public void onTokenRefresh() {

        Log.d(TAG, "Refreshing GCM Registration Token");

        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }

}
