// Generated by Dagger (https://dagger.dev).
package com.example.cities.di;

import com.example.cities.data.network.CountryService;
import com.example.cities.data.repository.CountryRepository;
import com.example.cities.data.sharedPref.Prefferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCityRepositoryFactory implements Factory<CountryRepository> {
  private final AppModule module;

  private final Provider<CountryService> serviceProvider;

  private final Provider<Prefferences> prefProvider;

  public AppModule_ProvideCityRepositoryFactory(AppModule module,
      Provider<CountryService> serviceProvider, Provider<Prefferences> prefProvider) {
    this.module = module;
    this.serviceProvider = serviceProvider;
    this.prefProvider = prefProvider;
  }

  @Override
  public CountryRepository get() {
    return provideCityRepository(module, serviceProvider.get(), prefProvider.get());
  }

  public static AppModule_ProvideCityRepositoryFactory create(AppModule module,
      Provider<CountryService> serviceProvider, Provider<Prefferences> prefProvider) {
    return new AppModule_ProvideCityRepositoryFactory(module, serviceProvider, prefProvider);
  }

  public static CountryRepository provideCityRepository(AppModule instance, CountryService service,
      Prefferences pref) {
    return Preconditions.checkNotNull(instance.provideCityRepository(service, pref), "Cannot return null from a non-@Nullable @Provides method");
  }
}