package com.essensift.korthings.feature.itemdetail.injection;

import android.content.Context;

import com.essensift.korthings.injection.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ApplicationModule.class)
@Singleton
public interface FeatureComponent {

    @Component.Builder
    interface Builder {
        FeatureComponent build();

        @BindsInstance
        Builder bindContext(Context context);
    }
}
