package com.example.cities.di;

import com.example.cities.view.CountryListActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindCountryList.CountryListActivitySubcomponent.class)
public abstract class ActivityBuilder_BindCountryList {
  private ActivityBuilder_BindCountryList() {}

  @Binds
  @IntoMap
  @ClassKey(CountryListActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CountryListActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface CountryListActivitySubcomponent extends AndroidInjector<CountryListActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CountryListActivity> {}
  }
}
