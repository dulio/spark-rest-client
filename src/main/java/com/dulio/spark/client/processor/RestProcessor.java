package com.dulio.spark.client.processor;

import com.dulio.spark.client.request.CreateSubmissionRequest;
import com.dulio.spark.client.response.CreateSubmissionResponse;
import com.dulio.spark.client.util.HTTPClient;
import com.dulio.spark.client.util.JSONUtil;
import com.dulio.spark.client.util.LogUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by shenhd on 2017/3/15.
 */
public class RestProcessor extends BaseRequestProcesser {
    public CreateSubmissionResponse CreateSubmission(CreateSubmissionRequest request) throws Exception {
        String httpRequest = JSONUtil.serialize(request);

        if (null == serverConfig || StringUtils.isEmpty(serverConfig.getSparkMasterRest())) {
            throw new Exception("server config is empty");
        }

        CreateSubmissionResponse resp = null;
        try {
            String respStr = HTTPClient.sendJsonPost(serverConfig.getSparkMasterRest(), httpRequest);
            resp = JSONUtil.deserialize(respStr);
        } catch (Exception e) {
            LogUtil.log(e.getMessage());
        }

        return resp;
    }
}
