package com.huyuit.lolinformation.dragger.module;

import android.content.Context;
import android.provider.ContactsContract;
import com.huyuit.lolinformation.data.local.Database;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by huyuit on 7/24/2016.
 */
@Module
public class DatabaseModule {

  @Provides @Singleton Database provideDatabase() {
    return new Database();
  }
}
