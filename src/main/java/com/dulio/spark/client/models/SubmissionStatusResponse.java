package com.dulio.spark.client.models;

/**
 * example:
 *  {
         "action": "CreateSubmissionResponse",
         "message": "Driver successfully submitted as driver-20170314030742-0000",
         "serverSparkVersion": "2.0.2",
         "submissionId": "driver-20170314030742-0000",
         "success": true
     }
 * Created by shenhd on 2017/3/14.
 */
public class SubmissionStatusResponse extends Response {

    private String message;
    private String serverSparkVersion;
    private String submissionId;
    private String success;
}
