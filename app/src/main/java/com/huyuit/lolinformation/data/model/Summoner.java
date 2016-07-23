package com.huyuit.lolinformation.data.model;

import io.realm.RealmObject;

/**
 * Created by huyuit on 7/23/2016.
 */
public class Summoner extends RealmObject {
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  private String key;
}
