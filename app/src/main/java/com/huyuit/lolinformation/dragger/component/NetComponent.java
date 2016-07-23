package com.huyuit.lolinformation.dragger.component;

import com.huyuit.lolinformation.dragger.module.AppModule;
import com.huyuit.lolinformation.dragger.module.NetModule;
import com.huyuit.lolinformation.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by huyuit on 7/20/2016.
 */
@Singleton @Component(modules = { AppModule.class, NetModule.class })
public interface NetComponent {
  void inject(MainActivity activity);
}
