package com.dulio.spark.client.processor;

import com.dulio.spark.client.models.CreateSubmissionRequest;
import com.dulio.spark.client.models.CreateSubmissionResponse;
import com.dulio.spark.client.models.SubmissionStatusRequest;
import com.dulio.spark.client.models.SubmissionStatusResponse;

/**
 * Created by shenhd on 2017/3/14.
 */
public interface RequestProcesser {
    public CreateSubmissionResponse createSubmission(CreateSubmissionRequest request) throws Exception;

    public SubmissionStatusResponse submissionStatus(SubmissionStatusRequest request) throws Exception;
}
