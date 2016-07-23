package com.huyuit.lolinformation.data.remote;

import com.huyuit.lolinformation.data.model.ChampionResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by huyuit on 7/20/2016.
 */
public interface RestApiRiot {
  @GET("api/lol/static-data/pbe/v1.2/champion") Call<ChampionResponse> getChampion(
      @Query("locale") String locale, @Query("dataById") boolean dataById,
      @Query("champData") String strTag, @Query("api_key") String strApiKey);
}
