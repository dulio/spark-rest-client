package com.dulio.spark.client;

import com.dulio.spark.client.config.ServerConfig;
import com.dulio.spark.client.models.*;
import com.dulio.spark.client.processor.RestProcessor;
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
        //config.setSparkMaster("spark://V192-168-33-10:7077");
        //config.setSparkMasterRest("http://V192-168-33-10:6066");

        config.setSparkMaster("spark://10.2.223.223:7077");
        config.setSparkMasterRest("http://10.2.223.223:6066");

        processor = new RestProcessor();
        processor.setServerConfig(config);
    }

    @Test
    public void test_JobSchedule() {

        try {
            System.out.println("job submit start...");
            String jobId = test_JobSubmit();
            System.out.println("job submit end...");

            Thread.sleep(20000);

            System.out.println("job status start...");
            test_JobStatus(jobId);
            System.out.println("job status end...");

            Thread.sleep(30000);

            System.out.println("job kill start...");
            test_KillJob(jobId);
            System.out.println("job kill end...");
        } catch (Exception e) {

        }
    }

    public String test_JobSubmit() {
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
        //sparkProperties.put("spark.master"				, "spark://V192-168-33-10:6066");
        req.setSparkProperties(sparkProperties);

        CreateSubmissionResponse resp = new CreateSubmissionResponse();
        try {
            resp = processor.createSubmission(req);
            System.out.println("submit resp:\n" + resp.getSuccess());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return resp.getSubmissionId();
    }

    public void test_JobStatus(String submissionId) {
        SubmissionStatusRequest req = new SubmissionStatusRequest();
        req.setSubmissionId(submissionId);

        try {
            SubmissionStatusResponse resp = processor.submissionStatus(req);
            System.out.println("driver state:\n" + resp.getDriverState());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void test_KillJob(String submissionId) {
        KillSubmissionRequest req = new KillSubmissionRequest();
        req.setSubmissionId(submissionId);

        try {
            KillSubmissionResponse resp = processor.killSubmission(req);
            System.out.println("kill resp:\n" + resp.getSuccess());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
