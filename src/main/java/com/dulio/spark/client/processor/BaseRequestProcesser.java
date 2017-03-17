package com.dulio.spark.client.processor;

import com.dulio.spark.client.config.ServerConfig;
import com.dulio.spark.client.request.CreateSubmissionRequest;
import com.dulio.spark.client.response.CreateSubmissionResponse;
import com.dulio.spark.client.util.HTTPClient;
import com.dulio.spark.client.util.JSONUtil;

/**
 * Created by shenhd on 2017/3/15.
 * @see http://spark.apache.org/docs/latest/configuration.html
 */
public abstract class BaseRequestProcesser implements RequestProcesser {
    protected ServerConfig serverConfig;
}
