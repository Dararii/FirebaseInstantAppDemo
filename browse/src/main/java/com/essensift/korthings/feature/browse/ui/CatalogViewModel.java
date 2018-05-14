package com.essensift.korthings.feature.browse.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.essensift.korthings.data.model.Catalog;
import com.essensift.korthings.data.service.Repository;
import com.essensift.korthings.feature.browse.injection.DaggerProvider;
import com.essensift.korthings.feature.browse.injection.FeatureComponent;

import javax.inject.Inject;

public class CatalogViewModel extends AndroidViewModel {

    @Inject Repository repository;

    private long itemId;

    public CatalogViewModel(Application application) {
        this(DaggerProvider.getFeatureComponent(application), application);
    }

    public CatalogViewModel(FeatureComponent featureComponent, Application application) {
        super(application);
        featureComponent.inject(this);
    }

    public LiveData<Catalog> getCatalog() {
        return repository.getCatalog();
    }


}
