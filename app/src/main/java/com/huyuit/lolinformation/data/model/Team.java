package com.huyuit.lolinformation.data.model;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by huyuit on 7/23/2016.
 */
public class Team extends RealmObject {

  private String key;
  private String name;
  private String region;
  private RealmList<Summoner> summoners;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public RealmList<Summoner> getSummoners() {
    return summoners;
  }

  public void setSummoners(RealmList<Summoner> summoners) {
    this.summoners = summoners;
  }
}
