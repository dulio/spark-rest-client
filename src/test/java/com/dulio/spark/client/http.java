package com.dulio.spark.client;

import com.dulio.spark.client.util.HTTPClient;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by shenhd on 2017/3/16.
 */
public class http {
    @Test
    public void test_Get() {
        String resp = HTTPClient.sendGet("http://www.mosrv.com/", new HashMap<String, Object>());
        System.out.println(resp);
    }

    @Test
    public void test_Post_Data() {
        String resp = HTTPClient.sendJsonPost("https://echo.getpostman.com/post", "test");
        System.out.println(resp);
    }
}
