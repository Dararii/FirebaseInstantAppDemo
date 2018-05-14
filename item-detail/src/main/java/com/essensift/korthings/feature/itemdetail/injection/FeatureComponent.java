package com.essensift.korthings.feature.itemdetail.injection;

import android.content.Context;

import com.essensift.korthings.feature.itemdetail.ui.ItemDetailActivityFragment;
import com.essensift.korthings.feature.itemdetail.ui.ItemDetailViewModel;
import com.essensift.korthings.injection.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ApplicationModule.class)
@Singleton
public interface FeatureComponent {

    void inject(ItemDetailActivityFragment itemDetailActivityFragment);

    void inject(ItemDetailViewModel itemDetailViewModel);

    @Component.Builder
    interface Builder {
        FeatureComponent build();

        @BindsInstance
        Builder bindContext(Context context);
    }
}
