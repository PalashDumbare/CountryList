// Generated by Dagger (https://dagger.dev).
package com.example.cities.di;

import android.app.Application;
import android.content.SharedPreferences;
import com.example.cities.data.network.CountryService;
import com.example.cities.data.repository.CountryRepository;
import com.example.cities.data.sharedPref.Prefferences;
import com.example.cities.supporting.ViewModelFactory;
import com.example.cities.view.CountryListActivity;
import com.example.cities.view.CountryListActivity_MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilder_BindCountryList.CountryListActivitySubcomponent.Factory> countryListActivitySubcomponentFactoryProvider;

  private Provider<CountryService> provideCityServiceProvider;

  private Provider<Application> applicationProvider;

  private Provider<SharedPreferences> provideSharedPrefsProvider;

  private Provider<Prefferences> providePrefferenceProvider;

  private Provider<CountryRepository> provideCityRepositoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, Application applicationParam) {

    initialize(appModuleParam, applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(CountryListActivity.class, (Provider) countryListActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final Application applicationParam) {
    this.countryListActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindCountryList.CountryListActivitySubcomponent.Factory>() {
      @Override
      public ActivityBuilder_BindCountryList.CountryListActivitySubcomponent.Factory get() {
        return new CountryListActivitySubcomponentFactory();}
    };
    this.provideCityServiceProvider = AppModule_ProvideCityServiceFactory.create(appModuleParam);
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideSharedPrefsProvider = DoubleCheck.provider(AppModule_ProvideSharedPrefsFactory.create(appModuleParam, applicationProvider));
    this.providePrefferenceProvider = DoubleCheck.provider(AppModule_ProvidePrefferenceFactory.create(appModuleParam, provideSharedPrefsProvider));
    this.provideCityRepositoryProvider = DoubleCheck.provider(AppModule_ProvideCityRepositoryFactory.create(appModuleParam, provideCityServiceProvider, providePrefferenceProvider));
  }

  @Override
  public void inject(DaggerApplication instance) {
    injectDaggerApplication(instance);}

  private DaggerApplication injectDaggerApplication(DaggerApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(new AppModule(), application);
    }
  }

  private final class CountryListActivitySubcomponentFactory implements ActivityBuilder_BindCountryList.CountryListActivitySubcomponent.Factory {
    @Override
    public ActivityBuilder_BindCountryList.CountryListActivitySubcomponent create(
        CountryListActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new CountryListActivitySubcomponentImpl(arg0);
    }
  }

  private final class CountryListActivitySubcomponentImpl implements ActivityBuilder_BindCountryList.CountryListActivitySubcomponent {
    private CountryListActivitySubcomponentImpl(CountryListActivity arg0) {

    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(DaggerAppComponent.this.provideCityRepositoryProvider.get());}

    @Override
    public void inject(CountryListActivity arg0) {
      injectCountryListActivity(arg0);}

    private CountryListActivity injectCountryListActivity(CountryListActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      CountryListActivity_MembersInjector.injectViewModelFactory(instance, getViewModelFactory());
      return instance;
    }
  }
}
