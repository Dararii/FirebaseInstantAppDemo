package com.essensift.korthings.feature.browse.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.essensift.korthings.feature.browse.R;
import com.essensift.korthings.feature.browse.injection.DaggerProvider;

public class BrowseActivity extends AppCompatActivity {

    private static final String TAG = BrowseActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        DaggerProvider.getFeatureComponent(getApplicationContext()).inject(this);

    }

}
