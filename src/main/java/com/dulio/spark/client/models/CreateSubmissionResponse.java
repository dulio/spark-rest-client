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
public class CreateSubmissionResponse extends Response {
    private String action;
    private String message;
    private String serverSparkVersion;
    private String submissionId;
    private Boolean success;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServerSparkVersion() {
        return serverSparkVersion;
    }

    public void setServerSparkVersion(String serverSparkVersion) {
        this.serverSparkVersion = serverSparkVersion;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
