// Generated by Dagger (https://dagger.dev).
package com.example.cities.supporting;

import com.example.cities.data.repository.CityRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<CityRepository> repositoryProvider;

  public ViewModelFactory_Factory(Provider<CityRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ViewModelFactory get() {
    return newInstance(repositoryProvider.get());
  }

  public static ViewModelFactory_Factory create(Provider<CityRepository> repositoryProvider) {
    return new ViewModelFactory_Factory(repositoryProvider);
  }

  public static ViewModelFactory newInstance(CityRepository repository) {
    return new ViewModelFactory(repository);
  }
}
