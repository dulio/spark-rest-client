package com.dulio.spark.client.processor;

import com.dulio.spark.client.request.CreateSubmissionRequest;
import com.dulio.spark.client.response.CreateSubmissionResponse;

/**
 * Created by shenhd on 2017/3/15.
 */
public class RestProcessor implements IProcesser {
    public CreateSubmissionResponse CreateSubmission(CreateSubmissionRequest request) {
        return new CreateSubmissionResponse();
    }
}