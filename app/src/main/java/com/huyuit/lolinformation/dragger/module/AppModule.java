package com.huyuit.lolinformation.dragger.module;

import android.app.Application;

import android.content.Context;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by huyuit on 7/20/2016.
 */

@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mApplication.getApplicationContext();
    }

}
