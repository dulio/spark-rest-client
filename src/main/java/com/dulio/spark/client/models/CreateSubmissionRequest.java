package com.dulio.spark.client.models;

import java.util.List;
import java.util.Map;

/**
 * sample:
 * {
     "action" : "CreateSubmissionRequest",
     "appArgs" : [ "192.168.33.10", "9999" ],
     "appResource" : "file:/root/jobs/spark-demo-1.0-SNAPSHOT.jar",
     "clientSparkVersion" : "2.0.2",
     "environmentVariables" : {
         "SPARK_ENV_LOADED" : "1"
     },
     "mainClass" : "com.dulio.demo.NetworkWordCount",
    "sparkProperties" : {
         "spark.jars" : "file:/root/jobs/spark-demo-1.0-SNAPSHOT.jar",
         "spark.driver.supervise" : "false",
         "spark.app.name" : "NetworkWordCount",
         "spark.eventLog.enabled": "false",
         "spark.submit.deployMode" : "cluster",
         "spark.total.executor.cores" : "1",
         "spark.executor.memory" : "512M",
         "spark.driver.memory" : "512M",
         "spark.master" : "spark://V192-168-33-10:6066"
     }
    }
 *
 * Created by shenhd on 2017/3/14.
 */
public class CreateSubmissionRequest extends Request {

    private String action;
    private List<String> appArgs;
    private String appResource;
    private String clientSparkVersion;
    private Map<String, String> environmentVariables;
    private String mainClass;

    /**
     * sparkProperties
     * @link http://spark.apache.org/docs/latest/configuration.html
     */
    private Map<String, String> sparkProperties;

    public CreateSubmissionRequest() {

    }

    public CreateSubmissionRequest(List<String> appArgs, String appResource, String clientSparkVersion, Map<String, String> environmentVariables, String mainClass, Map<String, String> sparkProperties) {
        this.appArgs = appArgs;
        this.appResource = appResource;
        this.clientSparkVersion = clientSparkVersion;
        this.environmentVariables = environmentVariables;
        this.mainClass = mainClass;
        this.sparkProperties = sparkProperties;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getAppArgs() {
        return appArgs;
    }

    public void setAppArgs(List<String> appArgs) {
        this.appArgs = appArgs;
    }

    public String getAppResource() {
        return appResource;
    }

    public void setAppResource(String appResource) {
        this.appResource = appResource;
    }

    public String getClientSparkVersion() {
        return clientSparkVersion;
    }

    public void setClientSparkVersion(String clientSparkVersion) {
        this.clientSparkVersion = clientSparkVersion;
    }

    public Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public Map<String, String> getSparkProperties() {
        return sparkProperties;
    }

    public void setSparkProperties(Map<String, String> sparkProperties) {
        this.sparkProperties = sparkProperties;
    }
}
