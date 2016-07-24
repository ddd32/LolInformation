package com.huyuit.lolinformation.data.local;

import android.app.Application;
import android.content.Context;
import com.huyuit.lolinformation.dragger.component.Injector;
import com.huyuit.lolinformation.util.App;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import java.util.List;
import javax.inject.Inject;

/**
 * Created by huyuit on 7/24/2016.
 */
public class Database {

  @Inject Context mContext;
  RealmConfiguration realmConfiguration;

  public Database() {
    Injector.getApplicationComponent().inject(this);
  }

  public void setup() {
    if (realmConfiguration == null) {
      realmConfiguration =
          new RealmConfiguration.Builder(mContext).deleteRealmIfMigrationNeeded().build();
      Realm.setDefaultConfiguration(realmConfiguration);
    } else {
      throw new IllegalStateException("database already configured");
    }
  }

  public Realm getRealmInstance() {
    return Realm.getDefaultInstance();
  }

  public <T extends RealmObject> T add(T model) {
    Realm realm = getRealmInstance();
    realm.beginTransaction();
    realm.copyToRealm(model);
    realm.commitTransaction();
    return model;
  }

  public <T extends RealmObject> List<T> findAll(Class<T> clazz) {
    return getRealmInstance().where(clazz).findAll();
  }

  public void close() {
    getRealmInstance().close();
  }
}
