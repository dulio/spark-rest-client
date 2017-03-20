package com.dulio.spark.client.processor;

import com.dulio.spark.client.models.CreateSubmissionRequest;
import com.dulio.spark.client.models.CreateSubmissionResponse;
import com.dulio.spark.client.util.HTTPClient;
import com.dulio.spark.client.util.JSONUtil;
import com.dulio.spark.client.util.LogUtil;
import org.apache.commons.lang3.StringUtils;

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
            String respStr = HTTPClient.sendJsonPost(reqUrl, httpRequest);
            resp = JSONUtil.deserialize(respStr);
        } catch (Exception e) {
            LogUtil.log(e.getMessage());
        }

        return resp;
    }
}
