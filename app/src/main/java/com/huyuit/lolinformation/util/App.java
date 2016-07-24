package com.huyuit.lolinformation.util;

import android.app.Application;

import com.huyuit.lolinformation.data.local.Database;
import com.huyuit.lolinformation.dragger.component.Injector;
import javax.inject.Inject;

/**
 * Created by huyuit on 7/20/2016.
 */
public class App extends Application {

  @Inject Database database;

  @Override public void onCreate() {
    super.onCreate();
    initDagger();
    initDatabase();
  }

  protected void initDatabase() {
    database.setup();
  }

  protected void initDagger() {
    Injector.initializeApplicationComponent(this);
    Injector.getApplicationComponent().inject(this);
  }
}
