package com.essensift.korthings.ui;

import android.app.Application;
import android.util.Log;

import com.google.firebase.FirebaseApp;

public class BaseApplication extends Application{


        static final String TAG = BaseApplication.class.getSimpleName();

        @Override
        public void onCreate() {
            super.onCreate();
            FirebaseApp.initializeApp(this);
            Log.e(TAG, FirebaseApp.getInstance().getPersistenceKey());
        }

    }
