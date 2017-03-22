package com.dulio.spark.client.processor;

import com.dulio.spark.client.models.*;
import com.dulio.spark.client.util.HTTPClient;
import com.dulio.spark.client.util.JSONUtil;
import com.dulio.spark.client.util.LogUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

/**
 * Created by shenhd on 2017/3/15.
 */
public class RestProcessor extends BaseRequestProcesser {
    public CreateSubmissionResponse createSubmission(CreateSubmissionRequest request) throws Exception {
        String httpRequest = JSONUtil.serialize(request);

        if (null == serverConfig || StringUtils.isEmpty(serverConfig.getSparkMasterRest())) {
            throw new Exception("server config is empty");
        }

        String reqUrl = serverConfig.getSparkMasterRest() + "/v1/submissions/create";
        CreateSubmissionResponse resp = null;
        try {
            String respStr = HTTPClient.sendPost(reqUrl, httpRequest);
            resp = JSONUtil.deserialize(respStr, CreateSubmissionResponse.class);
        } catch (Exception e) {
            LogUtil.log(e.getMessage());
        }

        return resp;
    }

    public SubmissionStatusResponse submissionStatus(SubmissionStatusRequest request) throws Exception {
        if (null == serverConfig || StringUtils.isEmpty(serverConfig.getSparkMasterRest())) {
            throw new Exception("server config is empty");
        }

        String reqUrl = serverConfig.getSparkMasterRest() + "/v1/submissions/status/" + request.getSubmissionId();
        SubmissionStatusResponse resp = null;
        try {
            String respStr = HTTPClient.sendGet(reqUrl, new HashMap<String,Object>());
            resp = JSONUtil.deserialize(respStr, SubmissionStatusResponse.class);
        } catch (Exception e) {
            LogUtil.log(e.getMessage());
        }

        return resp;
    }

    public KillSubmissionResponse killSubmission(KillSubmissionRequest request) throws Exception {
        if (null == serverConfig || StringUtils.isEmpty(serverConfig.getSparkMasterRest())) {
            throw new Exception("server config is empty");
        }

        String reqUrl = serverConfig.getSparkMasterRest() + "/v1/submissions/kill/" + request.getSubmissionId();
        KillSubmissionResponse resp = null;
        try {
            String respStr = HTTPClient.sendPost(reqUrl, "");
            resp = JSONUtil.deserialize(respStr, KillSubmissionResponse.class);
        } catch (Exception e) {
            LogUtil.log(e.getMessage());
        }

        return resp;
    }
}
