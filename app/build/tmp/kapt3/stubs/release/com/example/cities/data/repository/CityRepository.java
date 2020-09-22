package com.example.cities.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/cities/data/repository/CityRepository;", "", "cityService", "Lcom/example/cities/data/network/CityService;", "sharedPreferences", "Lcom/example/cities/data/sharedPref/Prefferences;", "(Lcom/example/cities/data/network/CityService;Lcom/example/cities/data/sharedPref/Prefferences;)V", "getSharedPreferences", "()Lcom/example/cities/data/sharedPref/Prefferences;", "getCities", "", "Lcom/example/cities/model/Cities;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOfflineData", "app_release"})
public final class CityRepository {
    private final com.example.cities.data.network.CityService cityService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.cities.data.sharedPref.Prefferences sharedPreferences = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cities.model.Cities>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.cities.model.Cities> getOfflineData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cities.data.sharedPref.Prefferences getSharedPreferences() {
        return null;
    }
    
    @javax.inject.Inject()
    public CityRepository(@org.jetbrains.annotations.NotNull()
    com.example.cities.data.network.CityService cityService, @org.jetbrains.annotations.NotNull()
    com.example.cities.data.sharedPref.Prefferences sharedPreferences) {
        super();
    }
}