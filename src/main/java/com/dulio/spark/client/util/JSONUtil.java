package com.dulio.spark.client.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.lang.reflect.Type;

/**
 * Created by shenhd on 2017/3/17.
 */
public class JSONUtil {
    public static String serialize(Object model) {
        return JSON.toJSONString(model);
    }

    public static <T> T deserialize(String jsonStr, Class<T> clazz) {
        try {
            return JSON.parseObject(jsonStr, clazz);
        } catch (Exception e) {
            LogUtil.log(e.getMessage());
            return null;
        }
    }
}
