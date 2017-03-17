package com.dulio.spark.client.processor;

import com.dulio.spark.client.request.CreateSubmissionRequest;
import com.dulio.spark.client.response.CreateSubmissionResponse;

/**
 * Created by shenhd on 2017/3/14.
 */
public interface RequestProcesser {
    public CreateSubmissionResponse CreateSubmission(CreateSubmissionRequest request) throws Exception;
}
