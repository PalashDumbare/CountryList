// Generated by Dagger (https://dagger.dev).
package com.example.cities.di;

import com.example.cities.data.network.CityService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCityServiceFactory implements Factory<CityService> {
  private final AppModule module;

  public AppModule_ProvideCityServiceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CityService get() {
    return provideCityService(module);
  }

  public static AppModule_ProvideCityServiceFactory create(AppModule module) {
    return new AppModule_ProvideCityServiceFactory(module);
  }

  public static CityService provideCityService(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideCityService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
