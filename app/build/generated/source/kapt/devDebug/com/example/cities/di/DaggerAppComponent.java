// Generated by Dagger (https://dagger.dev).
package com.example.cities.di;

import android.app.Application;
import android.content.SharedPreferences;
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
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final AppModule appModule;

  private final Application application;

  private Provider<ActivityBuilder_BindCityList.CountryListActivitySubcomponent.Factory> countryListActivitySubcomponentFactoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, Application applicationParam) {
    this.appModule = appModuleParam;
    this.application = applicationParam;
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

  private SharedPreferences getSharedPreferences() {
    return AppModule_ProvideSharedPrefsFactory.provideSharedPrefs(appModule, application);}

  private Prefferences getPrefferences() {
    return AppModule_ProvidePrefferenceFactory.providePrefference(appModule, getSharedPreferences());}

  private CountryRepository getCountryRepository() {
    return AppModule_ProvideCityRepositoryFactory.provideCityRepository(appModule, AppModule_ProvideCityServiceFactory.provideCityService(appModule), getPrefferences());}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final Application applicationParam) {
    this.countryListActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindCityList.CountryListActivitySubcomponent.Factory>() {
      @Override
      public ActivityBuilder_BindCityList.CountryListActivitySubcomponent.Factory get() {
        return new CountryListActivitySubcomponentFactory();}
    };
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

  private final class CountryListActivitySubcomponentFactory implements ActivityBuilder_BindCityList.CountryListActivitySubcomponent.Factory {
    @Override
    public ActivityBuilder_BindCityList.CountryListActivitySubcomponent create(
        CountryListActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new CountryListActivitySubcomponentImpl(arg0);
    }
  }

  private final class CountryListActivitySubcomponentImpl implements ActivityBuilder_BindCityList.CountryListActivitySubcomponent {
    private CountryListActivitySubcomponentImpl(CountryListActivity arg0) {

    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(DaggerAppComponent.this.getCountryRepository());}

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
