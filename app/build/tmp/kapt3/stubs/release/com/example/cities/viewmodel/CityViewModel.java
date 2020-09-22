package com.example.cities.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/cities/viewmodel/CityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cities/data/repository/CityRepository;", "(Lcom/example/cities/data/repository/CityRepository;)V", "getCities", "Landroidx/lifecycle/LiveData;", "Lcom/example/cities/supporting/Resource;", "", "Lcom/example/cities/model/Cities;", "app_release"})
public final class CityViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cities.data.repository.CityRepository repository = null;
    
    /**
     * **
     * if internet not connected it will fetch data from shared prefference
     * if data in shared pref is empty and the exception in for connectivity it
     * will throw "Please check network connection" error
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cities.supporting.Resource<java.util.List<com.example.cities.model.Cities>>> getCities() {
        return null;
    }
    
    public CityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cities.data.repository.CityRepository repository) {
        super();
    }
}