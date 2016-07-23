package com.huyuit.lolinformation.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by Huy on 5/21/2016.
 */

public class ChampionResponse {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("data")
    @Expose
    private Map<String, Champion> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Champion> getData() {
        return data;
    }

    public void setData(Map<String, Champion> data) {
        this.data = data;
    }
}
