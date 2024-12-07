package com.uin.rocketmq.guide;

import cn.hutool.core.util.ObjectUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.apache.rocketmq.common.message.MessageExt;

public class BaseMquUtil {

  private static final String class_key = "CLASS_NAME";

  public static HashMap<String, String> getMqHeader(Object o) {
    HashMap<String, String> header = new HashMap<>();
    if (ObjectUtil.isNotEmpty(o)) {
      String className = o.getClass().getName();
      header.put(class_key, className);
    }
    return header;
  }

  public static Object getMsg(MessageExt msg, ObjectMapper objectMapper)
      throws ClassNotFoundException, JsonProcessingException {
    String messageBody = new String(msg.getBody(), StandardCharsets.UTF_8);
    Map<String, String> properties = msg.getProperties();
    Object o = null;
    if (properties.containsKey(class_key)) {
      String className = properties.get(class_key);
      Class<?> aClass = Class.forName(className);
      o = objectMapper.readValue(messageBody, aClass);
    }
    return o;
  }
}
