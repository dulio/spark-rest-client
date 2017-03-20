package com.dulio.spark.client;

import com.dulio.spark.client.config.ServerConfig;
import com.dulio.spark.client.processor.RestProcessor;
import com.dulio.spark.client.models.CreateSubmissionRequest;
import com.dulio.spark.client.models.CreateSubmissionResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by shenhd on 2017/3/18.
 */
public class rest {
    RestProcessor processor= null;

    @Before
    public void init() {
        ServerConfig config = new ServerConfig();
        config.setServerSparkVersion("2.0.2");
        config.setSparkMaster("spark://V192-168-33-10:7077");
        config.setSparkMasterRest("http://V192-168-33-10:6066");

        processor = new RestProcessor();
        processor.setServerConfig(config);
    }

    @Test
    public void test_SubmitJob() {
        CreateSubmissionRequest req = new CreateSubmissionRequest();

        req.setAction("CreateSubmissionRequest");
        req.setAppResource("file:/root/jobs/spark-demo-1.0-SNAPSHOT.jar");
        req.setClientSparkVersion("2.0.2");
        req.setMainClass("com.dulio.demo.NetworkWordCount");

        ArrayList<String> appArgs = new ArrayList<String>();
        appArgs.add(0, "192.168.33.10");
        appArgs.add(1, "9999");
        req.setAppArgs(appArgs);

        HashMap<String, String> vars = new HashMap<String, String>();
        vars.put("SPARK_ENV_LOADED", "1");
        req.setEnvironmentVariables(vars);

        HashMap<String,String> sparkProperties = new HashMap<String, String>();
        sparkProperties.put("spark.jars"				, "file:/root/jobs/spark-demo-1.0-SNAPSHOT.jar");
        sparkProperties.put("spark.driver.supervise"	, "false");
        sparkProperties.put("spark.app.name"			, "NetworkWordCount");
        sparkProperties.put("spark.eventLog.enabled"	, "false");
        sparkProperties.put("spark.submit.deployMode"	, "cluster");
        sparkProperties.put("spark.cores.max"			, "5");
        sparkProperties.put("spark.executor.memory"		, "512M");
        sparkProperties.put("spark.driver.memory"		, "512M");
        sparkProperties.put("spark.master"				, "spark://V192-168-33-10:6066");
        req.setSparkProperties(sparkProperties);

        try {
            CreateSubmissionResponse resp = processor.createSubmission(req);
            System.out.println("REST response:\n" + resp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
