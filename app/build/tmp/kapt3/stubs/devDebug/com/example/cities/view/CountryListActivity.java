package com.example.cities.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/cities/view/CountryListActivity;", "Lcom/example/cities/view/BaseActivity;", "Lcom/example/cities/interfaces/ItemClickListener;", "Lcom/example/cities/model/Country;", "()V", "TAG", "", "cityViewModel", "Lcom/example/cities/viewmodel/CountryViewModel;", "countryAdapter", "Lcom/example/cities/view/CountryListAdapter;", "viewModelFactory", "Lcom/example/cities/supporting/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/cities/supporting/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/cities/supporting/ViewModelFactory;)V", "getCities", "", "hideLoading", "initialiazations", "onClick", "country", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "swipeToRefresh", "app_devDebug"})
public final class CountryListActivity extends com.example.cities.view.BaseActivity implements com.example.cities.interfaces.ItemClickListener<com.example.cities.model.Country> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.cities.supporting.ViewModelFactory viewModelFactory;
    private com.example.cities.viewmodel.CountryViewModel cityViewModel;
    private com.example.cities.view.CountryListAdapter countryAdapter;
    private final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cities.supporting.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.cities.supporting.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initialiazations() {
    }
    
    public final void swipeToRefresh() {
    }
    
    public final void getCities() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.example.cities.model.Country country) {
    }
    
    public CountryListActivity() {
        super();
    }
}