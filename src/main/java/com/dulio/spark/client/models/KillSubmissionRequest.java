package com.dulio.spark.client.models;

/**
 * sample:
 * {
     "submissionId" : "driver-20151008145126-0000"
   }
 *
 * Created by shenhd on 2017/3/14.
 */
public class KillSubmissionRequest extends Request {
    private String submissionId;

    public KillSubmissionRequest() {
    }

    public KillSubmissionRequest(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }
}
