package com.huyuit.lolinformation.dragger.component;

import com.huyuit.lolinformation.data.local.Database;
import com.huyuit.lolinformation.dragger.module.AppModule;
import com.huyuit.lolinformation.dragger.module.DatabaseModule;
import com.huyuit.lolinformation.dragger.module.NetModule;
import com.huyuit.lolinformation.ui.activity.MainActivity;

import com.huyuit.lolinformation.util.App;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by huyuit on 7/20/2016.
 */
@Singleton @Component(modules = { AppModule.class, NetModule.class, DatabaseModule.class })
public interface ApplicationComponent {

  void inject(App app);

  void inject(Database database);

  void inject(MainActivity activity);
}
