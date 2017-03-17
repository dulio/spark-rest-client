package com.dulio.spark.client.config;

/**
 * Created by shenhd on 2017/3/18.
 */
public class ServerConfig {
    private String serverSparkVersion = "";
    private String sparkMaster = "";
    private String sparkMasterRest = "";

    public String getServerSparkVersion() {
        return serverSparkVersion;
    }

    public void setServerSparkVersion(String serverSparkVersion) {
        this.serverSparkVersion = serverSparkVersion;
    }

    public String getSparkMaster() {
        return sparkMaster;
    }

    public void setSparkMaster(String sparkMaster) {
        this.sparkMaster = sparkMaster;
    }

    public String getSparkMasterRest() {
        return sparkMasterRest;
    }

    public void setSparkMasterRest(String sparkMasterRest) {
        this.sparkMasterRest = sparkMasterRest;
    }
}
