package com.dulio.spark.client;

import com.dulio.spark.client.response.CreateSubmissionResponse;
import com.dulio.spark.client.util.JSONUtil;
import org.junit.Test;

/**
 * Created by shenhd on 2017/3/16.
 */
public class json {
    @Test
    public void test_deserialize() {
        String resp = "{\"action\":\"CreateSubmissionResponse\",\"message\":\"Driver successfully submitted as driver-20170319230704-0007\",\"serverSparkVersion\":\"2.0.2\",\"submissionId\":\"driver-20170319230704-0007\",\"success\":true}";

        CreateSubmissionResponse respObj = JSONUtil.deserialize(resp, CreateSubmissionResponse.class);
        System.out.println(respObj);
    }
}
