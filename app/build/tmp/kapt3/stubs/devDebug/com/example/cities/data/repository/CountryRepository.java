package com.example.cities.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/cities/data/repository/CountryRepository;", "", "countryService", "Lcom/example/cities/data/network/CountryService;", "sharedPreferences", "Lcom/example/cities/data/sharedPref/Prefferences;", "(Lcom/example/cities/data/network/CountryService;Lcom/example/cities/data/sharedPref/Prefferences;)V", "getSharedPreferences", "()Lcom/example/cities/data/sharedPref/Prefferences;", "cacheData", "", "data", "", "Lcom/example/cities/model/Country;", "getCountries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOfflineData", "app_devDebug"})
public final class CountryRepository {
    private final com.example.cities.data.network.CountryService countryService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.cities.data.sharedPref.Prefferences sharedPreferences = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCountries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cities.model.Country>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.cities.model.Country> getOfflineData() {
        return null;
    }
    
    public final void cacheData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.cities.model.Country> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cities.data.sharedPref.Prefferences getSharedPreferences() {
        return null;
    }
    
    @javax.inject.Inject()
    public CountryRepository(@org.jetbrains.annotations.NotNull()
    com.example.cities.data.network.CountryService countryService, @org.jetbrains.annotations.NotNull()
    com.example.cities.data.sharedPref.Prefferences sharedPreferences) {
        super();
    }
}