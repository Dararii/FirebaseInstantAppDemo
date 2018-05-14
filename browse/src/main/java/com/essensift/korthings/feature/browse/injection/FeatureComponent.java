package com.essensift.korthings.feature.browse.injection;

import android.content.Context;

import com.essensift.korthings.feature.browse.ui.BrowseActivity;
import com.essensift.korthings.feature.browse.ui.CatalogRecyclerAdapter;
import com.essensift.korthings.feature.browse.ui.CatalogViewModel;
import com.essensift.korthings.injection.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ApplicationModule.class)
@Singleton
public interface FeatureComponent {

    void inject(BrowseActivity browseActivity);

    void inject(CatalogRecyclerAdapter catalogRecyclerAdapter);

    void inject(CatalogViewModel catalogViewModel);

    @Component.Builder
    interface Builder {
        FeatureComponent build();

        @BindsInstance
        Builder bindContext(Context context);
    }
}
