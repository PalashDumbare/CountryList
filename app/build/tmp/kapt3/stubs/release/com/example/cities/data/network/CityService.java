package com.example.cities.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/cities/data/network/CityService;", "", "getAllCities", "", "Lcom/example/cities/model/Cities;", "host", "", "key", "useQueryString", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface CityService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "all")
    public abstract java.lang.Object getAllCities(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-rapidapi-host")
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-rapidapi-key")
    java.lang.String key, @retrofit2.http.Header(value = "useQueryString")
    boolean useQueryString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.cities.model.Cities>> p3);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}