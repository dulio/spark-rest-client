package com.dulio.spark.client.models;

import java.util.List;
import java.util.Map;

/**
 * sample:
 * {
     "submissionId" : "driver-20151008145126-0000"
   }
 *
 * Created by shenhd on 2017/3/14.
 */
public class SubmissionStatusRequest extends Request {
    private String submissionId;

    public SubmissionStatusRequest() {
    }

    public SubmissionStatusRequest(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }
}
