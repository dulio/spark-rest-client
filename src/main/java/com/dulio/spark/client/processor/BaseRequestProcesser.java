package com.dulio.spark.client.processor;

import com.dulio.spark.client.config.ServerConfig;

/**
 * Created by shenhd on 2017/3/15.
 * @see http://spark.apache.org/docs/latest/configuration.html
 */
public abstract class BaseRequestProcesser implements RequestProcesser {
    protected ServerConfig serverConfig;

    public void setServerConfig(ServerConfig serverConfig) {
        this.serverConfig = serverConfig;
    }
}
