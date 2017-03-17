package com.dulio.spark.client.request;

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
    private List<String> appArgs;
    private String appResource;
    private String clientSparkVersion;
    private Map<String, String> environmentVariables;
    private String mainClass;
    /**
     * http://spark.apache.org/docs/latest/configuration.html
     */
    private Map<String, String> sparkProperties;
}
