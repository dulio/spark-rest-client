package com.dulio.spark.client.models;

/**
 * example:
 * {
     "action" : "SubmissionStatusResponse",
     "driverState" : "FINISHED",
     "serverSparkVersion" : "1.5.0",
     "submissionId" : "driver-20151008145126-0000",
     "success" : true,
     "workerHostPort" : "192.168.3.153:46894",
     "workerId" : "worker-20151007093409-192.168.3.153-46894"
  }
 * Created by shenhd on 2017/3/14.
 */
public class SubmissionStatusResponse extends Response {
    private String action;
    private String driverState;
    private String serverSparkVersion;
    private String submissionId;
    private Boolean success;
    private String workerHostPort;
    private String workerId;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDriverState() {
        return driverState;
    }

    public void setDriverState(String driverState) {
        this.driverState = driverState;
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

    public String getWorkerHostPort() {
        return workerHostPort;
    }

    public void setWorkerHostPort(String workerHostPort) {
        this.workerHostPort = workerHostPort;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }
}
