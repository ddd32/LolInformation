package com.huyuit.lolinformation.dragger.component;

import android.os.Build;
import com.huyuit.lolinformation.dragger.module.AppModule;
import com.huyuit.lolinformation.dragger.module.DatabaseModule;
import com.huyuit.lolinformation.dragger.module.NetModule;
import com.huyuit.lolinformation.util.App;
import java.util.Objects;

/**
 * Created by huyuit on 7/24/2016.
 */
public class Injector {
  private static ApplicationComponent applicationComponent;

  private Injector() {
  }

  public static void initializeApplicationComponent(App customApplication) {
    applicationComponent = DaggerApplicationComponent.builder()
        .appModule(new AppModule(customApplication))
        .databaseModule(new DatabaseModule())
        .netModule(new NetModule("http://global.api.riot.com"))
        .build();
  }

  public static ApplicationComponent getApplicationComponent() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      Objects.requireNonNull(applicationComponent, "applicationComponent is null");
    }
    return applicationComponent;
  }
}
