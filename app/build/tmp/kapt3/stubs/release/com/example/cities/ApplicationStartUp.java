package com.example.cities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/cities/ApplicationStartUp;", "Ldagger/android/DaggerApplication;", "()V", "applicationComponent", "Lcom/example/cities/di/AppComponent;", "getApplicationComponent", "()Lcom/example/cities/di/AppComponent;", "setApplicationComponent", "(Lcom/example/cities/di/AppComponent;)V", "applicationInjector", "Ldagger/android/AndroidInjector;", "app_release"})
public final class ApplicationStartUp extends dagger.android.DaggerApplication {
    @org.jetbrains.annotations.Nullable()
    private com.example.cities.di.AppComponent applicationComponent;
    
    @org.jetbrains.annotations.Nullable()
    protected final com.example.cities.di.AppComponent getApplicationComponent() {
        return null;
    }
    
    protected final void setApplicationComponent(@org.jetbrains.annotations.Nullable()
    com.example.cities.di.AppComponent p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public ApplicationStartUp() {
        super();
    }
}