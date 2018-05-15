package com.essensift.korthings.feature.cart.injection;

import android.content.Context;

import com.essensift.korthings.injection.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by willowtree on 5/12/17.
 */
@Component(modules = ApplicationModule.class)
@Singleton
public interface FeatureComponent {

    //void inject(CartViewModel cartViewModel);

    @Component.Builder
    interface Builder {
        FeatureComponent build();

        @BindsInstance
        Builder bindContext(Context context);
    }
}
