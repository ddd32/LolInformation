package com.huyuit.lolinformation.data.local;

/**
 * Created by huyuit on 7/23/2016.
 */
public enum Region {

  br("Brazil"),
  eune("EU Nordic & East"),
  euw("EU West"),
  jp("Japan"),
  kr("Korea"),
  lan("Latin America North"),
  las("Latin America South"),
  na("North America"),
  oce("Oceania"),
  ru("Russia"),
  tr("Turkey"),
  pbe("Public Beta Environment");

  private final String text;

  /**
   * @param text
   */
  private Region(final String text) {
    this.text = text;
  }

  @Override public String toString() {
    return text;
  }

}
