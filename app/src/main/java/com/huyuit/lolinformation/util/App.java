package com.huyuit.lolinformation.util;

import android.app.Application;

import android.content.Context;
import com.huyuit.lolinformation.dragger.component.DaggerNetComponent;
import com.huyuit.lolinformation.dragger.component.NetComponent;
import com.huyuit.lolinformation.dragger.module.AppModule;
import com.huyuit.lolinformation.dragger.module.NetModule;

/**
 * Created by huyuit on 7/20/2016.
 */
public class App extends Application {

  private NetComponent mNetComponent;

  @Override public void onCreate() {
    super.onCreate();
    mNetComponent = DaggerNetComponent.builder()
        .appModule(new AppModule(this))
        .netModule(new NetModule("https://global.api.pvp.net/"))
        .build();
  }

  public static NetComponent getNetComponent(Context context) {
    return ((App) context.getApplicationContext()).mNetComponent;
  }
}
